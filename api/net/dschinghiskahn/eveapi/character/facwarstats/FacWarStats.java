package net.dschinghiskahn.eveapi.character.facwarstats;

import java.util.Date;

import net.dschinghiskahn.eveapi.util.ApiResponse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class FacWarStats extends ApiResponse {

    @Path("result")
    @Element(required = false)
    private Long currentRank;

    @Path("result")
    @Element(required = false)
    private Date enlisted;

    @Path("result")
    @Element(name = "factionID", required = false)
    private Long factionId;

    @Path("result")
    @Element(required = false)
    private String factionName;

    @Path("result")
    @Element(required = false)
    private Long highestRank;

    @Path("result")
    @Element(required = false)
    private Long killsLastWeek;

    @Path("result")
    @Element(required = false)
    private Long killsTotal;

    @Path("result")
    @Element(required = false)
    private Long killsYesterday;

    @Path("result")
    @Element(required = false)
    private Long victoryPointsLastWeek;

    @Path("result")
    @Element(required = false)
    private Long victoryPointsTotal;

    @Path("result")
    @Element(required = false)
    private Long victoryPointsYesterday;

    public Long getCurrentRank(){
        return currentRank;
    }

    public Date getEnlisted(){
        return enlisted;
    }

    public Long getFactionId(){
        return factionId;
    }

    public String getFactionName(){
        return factionName;
    }

    public Long getHighestRank(){
        return highestRank;
    }

    public Long getKillsLastWeek(){
        return killsLastWeek;
    }

    public Long getKillsTotal(){
        return killsTotal;
    }

    public Long getKillsYesterday(){
        return killsYesterday;
    }

    public Long getVictoryPointsLastWeek(){
        return victoryPointsLastWeek;
    }

    public Long getVictoryPointsTotal(){
        return victoryPointsTotal;
    }

    public Long getVictoryPointsYesterday(){
        return victoryPointsYesterday;
    }

    @Override
    public String toString(){
        return "FacWarStats [" +
            "currentRank = " + currentRank + ", " +
            "enlisted = " + enlisted + ", " +
            "factionId = " + factionId + ", " +
            "factionName = " + factionName + ", " +
            "highestRank = " + highestRank + ", " +
            "killsLastWeek = " + killsLastWeek + ", " +
            "killsTotal = " + killsTotal + ", " +
            "killsYesterday = " + killsYesterday + ", " +
            "victoryPointsLastWeek = " + victoryPointsLastWeek + ", " +
            "victoryPointsTotal = " + victoryPointsTotal + ", " +
            "victoryPointsYesterday = " + victoryPointsYesterday + ", " +
            "]";
    }

}
