# eveapi
An android library project to query the eve online REST API.

##Features
- Easy to use
- Responses are deserialized as java beans
- Errors are presented as java exceptions

##Example

```Java
try {
    // query the API
    CharacterSheet characterSheet = Api.getCharacterSheet(keyId, verificationCode, characterId);
    
    // default fields returned with every response. 
    Date currentTime = characterSheet.getCurrentTime();
    Date cachedUntil = characterSheet.getCachedUntil();

    // response of type string
    String name = characterSheet.getName();
    // response of type long
    Long characterId = characterSheet.getCharacterId();
    // response of type double
    Double balance = characterSheet.getBalance();
    // response of type date
    Date dateOfBirth = characterSheet.getDoB();
    // response of type list
    List<CorporationTitle> corporationTitles = characterSheet.getCorporationTitles();
    // response of type "special object"
    Attributes attributes = characterSheet.getAttributes();
    Long intelligence = attributes.getIntelligence();
} catch (EveApiException e) {
    // thrown if the API returned an error
    Long errorCode = e.getCode(); // e.g. 124
    String errorMessage = e.getMessage(); // e.g. Character not enlisted in Factional Warfare.
} catch (IOException e) {
    // thrown if a connection error occured.
}
```
