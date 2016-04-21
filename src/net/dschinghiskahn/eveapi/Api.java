package net.dschinghiskahn.eveapi;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.transform.RegistryMatcher;

import android.util.Log;
import net.dschinghiskahn.eveapi.account.accountstatus.AccountStatus;
import net.dschinghiskahn.eveapi.account.apikeyinfo.ApiKeyInfo;
import net.dschinghiskahn.eveapi.account.characters.Characters;
import net.dschinghiskahn.eveapi.api.calllist.CallList;
import net.dschinghiskahn.eveapi.character.accountbalance.AccountBalance;
import net.dschinghiskahn.eveapi.character.assetlist.AssetList;
import net.dschinghiskahn.eveapi.character.blueprints.Blueprints;
import net.dschinghiskahn.eveapi.character.bookmarks.Bookmarks;
import net.dschinghiskahn.eveapi.character.calendareventattendees.CalendarEventAttendees;
import net.dschinghiskahn.eveapi.character.charactersheet.CharacterSheet;
import net.dschinghiskahn.eveapi.character.chatchannels.ChatChannels;
import net.dschinghiskahn.eveapi.character.contactlist.ContactList;
import net.dschinghiskahn.eveapi.character.contactnotifications.ContactNotifications;
import net.dschinghiskahn.eveapi.character.contractbids.ContractBids;
import net.dschinghiskahn.eveapi.character.contractitems.ContractItems;
import net.dschinghiskahn.eveapi.character.contracts.Contracts;
import net.dschinghiskahn.eveapi.character.facwarstats.FacWarStats;
import net.dschinghiskahn.eveapi.character.industryjobs.IndustryJobs;
import net.dschinghiskahn.eveapi.character.industryjobshistory.IndustryJobsHistory;
import net.dschinghiskahn.eveapi.character.killlog.KillLog;
import net.dschinghiskahn.eveapi.character.locations.Locations;
import net.dschinghiskahn.eveapi.character.mailbodies.MailBodies;
import net.dschinghiskahn.eveapi.character.mailinglists.MailingLists;
import net.dschinghiskahn.eveapi.character.mailmessages.MailMessages;
import net.dschinghiskahn.eveapi.character.marketorders.MarketOrders;
import net.dschinghiskahn.eveapi.character.medals.Medals;
import net.dschinghiskahn.eveapi.character.notifications.Notifications;
import net.dschinghiskahn.eveapi.character.notificationtexts.NotificationTexts;
import net.dschinghiskahn.eveapi.character.planetarycolonies.PlanetaryColonies;
import net.dschinghiskahn.eveapi.character.planetarylinks.PlanetaryLinks;
import net.dschinghiskahn.eveapi.character.planetarypins.PlanetaryPins;
import net.dschinghiskahn.eveapi.character.planetaryroutes.PlanetaryRoutes;
import net.dschinghiskahn.eveapi.character.research.Research;
import net.dschinghiskahn.eveapi.character.skillintraining.SkillInTraining;
import net.dschinghiskahn.eveapi.character.skillqueue.SkillQueue;
import net.dschinghiskahn.eveapi.character.standings.Standings;
import net.dschinghiskahn.eveapi.character.upcomingcalendarevents.UpcomingCalendarEvents;
import net.dschinghiskahn.eveapi.character.walletjournal.WalletJournal;
import net.dschinghiskahn.eveapi.character.wallettransactions.WalletTransactions;
import net.dschinghiskahn.eveapi.eve.characterinfo.CharacterInfo;
import net.dschinghiskahn.eveapi.eve.typename.TypeName;
import net.dschinghiskahn.eveapi.util.DateValueTransformer;
import net.dschinghiskahn.eveapi.util.DoubleValueTransformer;
import net.dschinghiskahn.eveapi.util.ErrorResponse;
import net.dschinghiskahn.eveapi.util.LongValueTransformer;
import net.dschinghiskahn.eveapi.util.StringValueTransformer;

public final class Api {

    private static final String BASE_URL = "https://api.eveonline.com";

    private Api() {}

    private static Object query(Class<?> resultClass, String urlPattern, String... parameters) throws IOException, EveApiException {
        Object result = null;
        String url = String.format(Locale.getDefault(), BASE_URL + urlPattern, (Object[]) parameters);
        try {
            if (Class.forName("android.util.Log") != null) { // used for
                                                             // eveapigenerator
                                                             // test cases
                Log.d(Api.class.getSimpleName(), "Querying: " + url);
            }
        } catch (ClassNotFoundException e) {
            // Intentionally left empty
        }

        HttpURLConnection connection = null;
        InputStream input = null;
        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestProperty("User-Agent", "EveApi, Author: Genghis Khane");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            if (connection.getResponseCode() == 200 || connection.getResponseCode() <= 0) {
                input = new BufferedInputStream(connection.getInputStream());
            } else {
                input = new BufferedInputStream(connection.getErrorStream());
            }

            RegistryMatcher matcher = new RegistryMatcher();
            matcher.bind(Long.class, new LongValueTransformer());
            matcher.bind(Double.class, new DoubleValueTransformer());
            matcher.bind(String.class, new StringValueTransformer());
            matcher.bind(Date.class, new DateValueTransformer());
            Serializer serializer = new Persister(matcher);
            if (connection.getResponseCode() == 200) {
                try {
                    result = serializer.read(resultClass, input);
                } catch (Exception e) {
                    throw new IOException(e);
                }
            } else {
                ErrorResponse error;
                try {
                    error = serializer.read(ErrorResponse.class, input);
                } catch (Exception e) {
                    throw new IOException(e);
                }
                throw new EveApiException(error.getCode(), error.getMessage());
            }
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    // Intentionally left empty
                }
            }
        }
        return result;
    }

    /**
     * EVE player account status.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static AccountStatus getAccountStatus(long keyId, String verificationCode) throws IOException, EveApiException {
        return (AccountStatus) Api.query(AccountStatus.class, "/account/AccountStatus.xml.aspx?keyID=%s&vCode=%s", "" + keyId, verificationCode);
    }

    /**
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static ApiKeyInfo getApiKeyInfo(long keyId, String verificationCode) throws IOException, EveApiException {
        return (ApiKeyInfo) Api.query(ApiKeyInfo.class, "/account/APIKeyInfo.xml.aspx?keyID=%s&vCode=%s", "" + keyId, verificationCode);
    }

    /**
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static Characters getCharacters(long keyId, String verificationCode) throws IOException, EveApiException {
        return (Characters) Api.query(Characters.class, "/account/Characters.xml.aspx?keyID=%s&vCode=%s", "" + keyId, verificationCode);
    }

    /**
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static CallList getCallList(long keyId, String verificationCode) throws IOException, EveApiException {
        return (CallList) Api.query(CallList.class, "/api/CallList.xml.aspx?keyID=%s&vCode=%s", "" + keyId, verificationCode);
    }

    /**
     * Current balance of characters wallet.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static AccountBalance getAccountBalance(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (AccountBalance) Api.query(AccountBalance.class, "/char/AccountBalance.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * Entire asset list of character.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static AssetList getAssetList(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return getAssetList(keyId, verificationCode, characterId, false);
    }

    public static AssetList getAssetList(long keyId, String verificationCode, long characterId, boolean flat) throws IOException, EveApiException {
        return (AssetList) Api.query(AssetList.class, "/char/AssetList.xml.aspx?keyID=%s&vCode=%s&characterID=%s&flat=%s", "" + keyId, verificationCode,
                "" + characterId, flat ? "1" : "0");
    }

    /**
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static Blueprints getBlueprints(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (Blueprints) Api.query(Blueprints.class, "/char/Blueprints.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * List of all personal bookmarks.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static Bookmarks getBookmarks(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (Bookmarks) Api.query(Bookmarks.class, "/char/Bookmarks.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    public static CalendarEventAttendees getCalendarEventAttendees(long keyId, String verificationCode, long characterId, long eventId)
            throws IOException, EveApiException {
        return (CalendarEventAttendees) Api.query(CalendarEventAttendees.class,
                "/char/CalendarEventAttendees.xml.aspx?keyID=%s&vCode=%s&characterID=%s&eventID=%s", "" + keyId, verificationCode, "" + characterId,
                "" + eventId);
    }

    /**
     * Character Sheet information. Contains basic 'Show Info' information along
     * with clones, account balance, implants, attributes, skills, certificates
     * and corporation roles.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static CharacterSheet getCharacterSheet(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (CharacterSheet) Api.query(CharacterSheet.class, "/char/CharacterSheet.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * List of all chat channels the character owns or is an operator of.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static ChatChannels getChatChannels(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (ChatChannels) Api.query(ChatChannels.class, "/char/ChatChannels.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * List of character contacts and relationship levels.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static ContactList getContactList(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (ContactList) Api.query(ContactList.class, "/char/ContactList.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * Most recent contact notifications for the character.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static ContactNotifications getContactNotifications(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (ContactNotifications) Api.query(ContactNotifications.class, "/char/ContactNotifications.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId,
                verificationCode, "" + characterId);
    }

    /**
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static ContractBids getContactBids(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (ContractBids) Api.query(ContractBids.class, "/char/ContractBids.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);

    }

    public static ContractItems getContractItems(long keyId, String verificationCode, long characterId, long contractId) throws IOException, EveApiException {
        return (ContractItems) Api.query(ContractItems.class, "/char/ContractItems.xml.aspx?keyID=%s&vCode=%s&characterID=%s&contractID=%s", "" + keyId,
                verificationCode, "" + characterId, "" + contractId);
    }

    /**
     * List of all Contracts the character is involved in.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static Contracts getContracts(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (Contracts) Api.query(Contracts.class, "/char/Contracts.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    public static Contracts getContracts(long keyId, String verificationCode, long characterId, long contractId) throws IOException, EveApiException {
        return (Contracts) Api.query(Contracts.class, "/char/Contracts.xml.aspx?keyID=%s&vCode=%s&characterID=%s&contractID=%s", "" + keyId, verificationCode,
                "" + characterId, "" + contractId);
    }

    /**
     * Characters Factional Warfare Statistics.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static FacWarStats getFacWarStats(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (FacWarStats) Api.query(FacWarStats.class, "/char/FacWarStats.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * Character jobs, completed and active.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static IndustryJobs getIndustryJobs(long keyId, String verificationCode) throws IOException, EveApiException {
        return (IndustryJobs) Api.query(IndustryJobs.class, "/char/IndustryJobs.xml.aspx?keyID=%s&vCode=%s&", "" + keyId, verificationCode);
    }

    /**
     * Character jobs, completed and active.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static IndustryJobs getIndustryJobs(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (IndustryJobs) Api.query(IndustryJobs.class, "/char/IndustryJobs.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static IndustryJobsHistory getIndustryJobsHistory(long keyId, String verificationCode) throws IOException, EveApiException {
        return (IndustryJobsHistory) Api.query(IndustryJobsHistory.class, "/char/IndustryJobsHistory.xml.aspx?keyID=%s&vCode=%s&", "" + keyId,
                verificationCode);
    }

    /**
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static IndustryJobsHistory getIndustryJobsHistory(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (IndustryJobsHistory) Api.query(IndustryJobsHistory.class, "/char/IndustryJobsHistory.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId,
                verificationCode, "" + characterId);
    }

    /**
     * Characters kill log.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static KillLog getKillLog(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (KillLog) Api.query(KillLog.class, "/char/KillLog.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode, "" + characterId);
    }

    public static Locations getLocations(long keyId, String verificationCode, long characterId, List<Long> itemIds) throws IOException, EveApiException {
        return getLocations(keyId, verificationCode, characterId, itemIds.toArray(new Long[0]));
    }

    public static Locations getLocations(long keyId, String verificationCode, long characterId, Long... itemIds) throws IOException, EveApiException {
        StringBuilder ids = new StringBuilder();
        for (long id : itemIds) {
            ids.append(id);
            ids.append(",");
        }
        return (Locations) Api.query(Locations.class, "/char/Locations.xml.aspx?keyID=%s&vCode=%s&characterID=%s&IDs=%s", "" + keyId, verificationCode,
                "" + characterId, ids.substring(0, ids.length() - 1));
    }

    public static MailBodies getMailBodies(long keyId, String verificationCode, long characterId, List<Long> messageIds) throws IOException, EveApiException {
        return getMailBodies(keyId, verificationCode, characterId, messageIds.toArray(new Long[0]));
    }

    public static MailBodies getMailBodies(long keyId, String verificationCode, long characterId, Set<Long> messageIds) throws IOException, EveApiException {
        return getMailBodies(keyId, verificationCode, characterId, messageIds.toArray(new Long[0]));
    }

    public static MailBodies getMailBodies(long keyId, String verificationCode, long characterId, Long... messageIds) throws IOException, EveApiException {
        StringBuilder ids = new StringBuilder();
        for (long id : messageIds) {
            ids.append(id);
            ids.append(",");
        }
        return (MailBodies) Api.query(MailBodies.class, "/char/MailBodies.xml.aspx?keyID=%s&vCode=%s&characterID=%s&IDs=%s", "" + keyId, verificationCode,
                "" + characterId, ids.substring(0, ids.length() - 1));
    }

    /**
     * List of all Mailing Lists the character subscribes to.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static MailingLists getMailingLists(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (MailingLists) Api.query(MailingLists.class, "/char/MailingLists.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * List of all messages in the characters EVE Mail Inbox.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static MailMessages getMailMessages(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (MailMessages) Api.query(MailMessages.class, "/char/MailMessages.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * List of all Market Orders the character has made.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static MarketOrders getMarketOrders(long keyId, String verificationCode) throws IOException, EveApiException {
        return (MarketOrders) Api.query(MarketOrders.class, "/char/MarketOrders.xml.aspx?keyID=%s&vCode=%s", "" + keyId, verificationCode);
    }

    /**
     * List of all Market Orders the character has made.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static MarketOrders getMarketOrders(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (MarketOrders) Api.query(MarketOrders.class, "/char/MarketOrders.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    public static MarketOrders getMarketOrders(long keyId, String verificationCode, long characterId, long orderId) throws IOException, EveApiException {
        return (MarketOrders) Api.query(MarketOrders.class, "/char/MarketOrders.xml.aspx?keyID=%s&vCode=%s&characterID=%s&orderID=%s", "" + keyId,
                verificationCode, "" + characterId, "" + orderId);
    }

    /**
     * Medals awarded to the character.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static Medals getMedals(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (Medals) Api.query(Medals.class, "/char/Medals.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode, "" + characterId);
    }

    /**
     * List of recent notifications sent to the character.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static Notifications getNotifications(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (Notifications) Api.query(Notifications.class, "/char/Notifications.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    public static NotificationTexts getNotificationTexts(long keyId, String verificationCode, long characterId, List<Long> notificationIds)
            throws IOException, EveApiException {
        return getNotificationTexts(keyId, verificationCode, characterId, notificationIds.toArray(new Long[0]));
    }

    public static NotificationTexts getNotificationTexts(long keyId, String verificationCode, long characterId, Set<Long> notificationIds)
            throws IOException, EveApiException {
        return getNotificationTexts(keyId, verificationCode, characterId, notificationIds.toArray(new Long[0]));
    }

    public static NotificationTexts getNotificationTexts(long keyId, String verificationCode, long characterId, Long... notificationIds)
            throws IOException, EveApiException {
        StringBuilder ids = new StringBuilder();
        for (long id : notificationIds) {
            ids.append(id);
            ids.append(",");
        }
        return (NotificationTexts) Api.query(NotificationTexts.class, "/char/NotificationTexts.xml.aspx?keyID=%s&vCode=%s&characterID=%s&IDs=%s", "" + keyId,
                verificationCode, "" + characterId, ids.substring(0, ids.length() - 1));
    }

    /**
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static PlanetaryColonies getPlanetaryColonies(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (PlanetaryColonies) Api.query(PlanetaryColonies.class, "/char/PlanetaryColonies.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId,
                verificationCode, "" + characterId);
    }

    public static PlanetaryLinks getPlanetaryLinks(long keyId, String verificationCode, long characterId, long planetId) throws IOException, EveApiException {
        return (PlanetaryLinks) Api.query(PlanetaryLinks.class, "/char/PlanetaryLinks.xml.aspx?keyID=%s&vCode=%s&characterID=%s&planetID=%s", "" + keyId,
                verificationCode, "" + characterId, "" + planetId);
    }

    public static PlanetaryPins getPlanetaryPins(long keyId, String verificationCode, long characterId, long planetId) throws IOException, EveApiException {
        return (PlanetaryPins) Api.query(PlanetaryPins.class, "/char/PlanetaryPins.xml.aspx?keyID=%s&vCode=%s&characterID=%s&planetID=%s", "" + keyId,
                verificationCode, "" + characterId, "" + planetId);
    }

    public static PlanetaryRoutes getPlanetaryRoutes(long keyId, String verificationCode, long characterId, long planetId) throws IOException, EveApiException {
        return (PlanetaryRoutes) Api.query(PlanetaryRoutes.class, "/char/PlanetaryRoutes.xml.aspx?keyID=%s&vCode=%s&characterID=%s&planetID=%s", "" + keyId,
                verificationCode, "" + characterId, "" + planetId);
    }

    /**
     * List of all Research agents working for the character and the progress of
     * the research.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static Research getResearch(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (Research) Api.query(Research.class, "/char/Research.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode, "" + characterId);

    }

    /**
     * Skill currently in training on the character. Subset of entire Skill
     * Queue.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static SkillInTraining getSkillInTraining(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (SkillInTraining) Api.query(SkillInTraining.class, "/char/SkillInTraining.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId,
                verificationCode, "" + characterId);
    }

    /**
     * Entire skill queue of character.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static SkillQueue getSkillQueue(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (SkillQueue) Api.query(SkillQueue.class, "/char/SkillQueue.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * NPC Standings towards the character.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static Standings getStandings(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (Standings) Api.query(Standings.class, "/char/Standings.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    /**
     * Upcoming events on characters calendar.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static UpcomingCalendarEvents getUpcomingCalendarEvents(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (UpcomingCalendarEvents) Api.query(UpcomingCalendarEvents.class, "/char/UpcomingCalendarEvents.xml.aspx?keyID=%s&vCode=%s&characterID=%s",
                "" + keyId, verificationCode, "" + characterId);
    }

    /**
     * Wallet journal of character.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static WalletJournal getWalletJournal(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return getWalletJournal(keyId, verificationCode, characterId, 1000);
    }

    public static WalletJournal getWalletJournal(long keyId, String verificationCode, long characterId, int accountKey) throws IOException, EveApiException {
        return (WalletJournal) Api.query(WalletJournal.class, "/char/WalletJournal.xml.aspx?keyID=%s&vCode=%s&characterID=%s&accountKey=%s", "" + keyId,
                verificationCode, "" + characterId, "" + accountKey);
    }

    public static WalletJournal getWalletJournal(long keyId, String verificationCode, long characterId, int accountKey, long fromId)
            throws IOException, EveApiException {
        return getWalletJournal(keyId, verificationCode, characterId, accountKey, fromId, 1000);
    }

    public static WalletJournal getWalletJournal(long keyId, String verificationCode, long characterId, int accountKey, long fromId, int rowCount)
            throws IOException, EveApiException {
        return (WalletJournal) Api.query(WalletJournal.class,
                "/char/WalletJournal.xml.aspx?keyID=%s&vCode=%s&characterID=%s&accountKey=%s&fromID=%s&rowCount=%s", "" + keyId, verificationCode,
                "" + characterId, "" + accountKey, "" + fromId, "" + rowCount);
    }

    /**
     * Market transaction journal of character.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static WalletTransactions getWalletTransactions(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return getWalletTransactions(keyId, verificationCode, characterId, 1000);
    }

    public static WalletTransactions getWalletTransactions(long keyId, String verificationCode, long characterId, int accountKey)
            throws IOException, EveApiException {
        return (WalletTransactions) Api.query(WalletTransactions.class, "/char/WalletTransactions.xml.aspx?keyID=%s&vCode=%s&characterID=%s&accountKey=%s",
                "" + keyId, verificationCode, "" + characterId, "" + accountKey);
    }

    public static WalletTransactions getWalletTransactions(long keyId, String verificationCode, long characterId, int accountKey, long fromId)
            throws IOException, EveApiException {
        return getWalletTransactions(keyId, verificationCode, characterId, accountKey, fromId, 1000);
    }

    public static WalletTransactions getWalletTransactions(long keyId, String verificationCode, long characterId, int accountKey, long fromId, int rowCount)
            throws IOException, EveApiException {
        return (WalletTransactions) Api.query(WalletTransactions.class,
                "/char/WalletTransactions.xml.aspx?keyID=%s&vCode=%s&characterID=%s&accountKey=%s&fromID=%s&rowCount=%s", "" + keyId, verificationCode,
                "" + characterId, "" + accountKey, "" + fromId, "" + rowCount);
    }

    /**
     * Character information, exposes skill points and current ship information
     * on top of 'Show Info' information. May also expose account balance and
     * last known location on top of the other Character Information call.
     * 
     * @param keyId
     *            The key id.
     * @param verificationCode
     *            The verification code.
     * @param characterId
     *            The character id.
     * @return An object holding the data.
     * @throws IOException
     *             Thrown on connection problems.
     * @throws EveApiException
     *             Thrown if the API returned an error.
     */
    public static CharacterInfo getCharacterInfo(long keyId, String verificationCode, long characterId) throws IOException, EveApiException {
        return (CharacterInfo) Api.query(CharacterInfo.class, "/eve/CharacterInfo.xml.aspx?keyID=%s&vCode=%s&characterID=%s", "" + keyId, verificationCode,
                "" + characterId);
    }

    public static TypeName getTypeName(List<Long> typeIds) throws IOException, EveApiException {
        return getTypeName(typeIds.toArray(new Long[0]));
    }

    public static TypeName getTypeName(Set<Long> typeIds) throws IOException, EveApiException {
        return getTypeName(typeIds.toArray(new Long[0]));
    }

    public static TypeName getTypeName(Long... typeIds) throws IOException, EveApiException {
        StringBuilder ids = new StringBuilder();
        for (long id : typeIds) {
            ids.append(id);
            ids.append(",");
        }
        return (TypeName) Api.query(TypeName.class, "/eve/TypeName.xml.aspx?IDs=%s", ids.substring(0, ids.length() - 1));
    }

}
