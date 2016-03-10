package net.dschinghiskahn.eveapi.character.standings;

import net.dschinghiskahn.eveapi.character.standings.characterNPCStandings;
import net.dschinghiskahn.eveapi.util.AbstractApiResponse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class Standings extends AbstractApiResponse {

    @Path("result")
    @Element(required = false)
    private characterNPCStandings characterNPCStandings;

    public characterNPCStandings getCharacterNPCStandings(){
        return characterNPCStandings;
    }

    @Override
    public String toString(){
        return "Standings [" +
            "characterNPCStandings = " + characterNPCStandings + ", " +
            "]";
    }

}
