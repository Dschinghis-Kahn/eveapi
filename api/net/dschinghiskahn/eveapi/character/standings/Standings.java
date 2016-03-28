package net.dschinghiskahn.eveapi.character.standings;

import net.dschinghiskahn.eveapi.util.AbstractApiResponse;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

@Root(name = "eveapi")
public class Standings extends AbstractApiResponse {

    @Path("result")
    @Element(name = "characterNPCStandings", required = false)
    private CharacterNpcStandings characterNpcStandings;

    public CharacterNpcStandings getCharacterNpcStandings(){
        return characterNpcStandings;
    }

    @Override
    public String toString(){
        return "Standings [" +
            "characterNpcStandings = " + characterNpcStandings + ", " +
            "]";
    }

}
