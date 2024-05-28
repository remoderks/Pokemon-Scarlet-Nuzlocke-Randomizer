package core;
import java.util.*;

public class PokemonDataScarlet {


    public static Map<String, List<Pokemon>> getData() {
        // Creates a map of routes to lists of Pokémon
        Map<String, List<Pokemon>> routePokemonMap = new HashMap<>();

        // Data about which pokemons can be found per location. Including levels and rarity.
        List<Pokemon> southProvinceAreaOnePokemon = new ArrayList<>();
        southProvinceAreaOnePokemon.add(new Pokemon("Lechonk", 2, 5));
        southProvinceAreaOnePokemon.add(new Pokemon("Fletchling", 2, 5));
        southProvinceAreaOnePokemon.add(new Pokemon("Hoppip", 2, 5));
        southProvinceAreaOnePokemon.add(new Pokemon("Tarountula", 2, 5));
        routePokemonMap.put("South Province - Area One", southProvinceAreaOnePokemon);

        List<Pokemon> southProvinceAreaTwoPokemon = new ArrayList<>();
        southProvinceAreaTwoPokemon.add(new Pokemon("Shroodle", 5, 10));
        southProvinceAreaTwoPokemon.add(new Pokemon("Nacli", 5, 10));
        southProvinceAreaTwoPokemon.add(new Pokemon("Smoliv", 5, 10));
        routePokemonMap.put("South Province - Area Two", southProvinceAreaTwoPokemon);

        List<Pokemon> southProvinceAreaThreePokemon = new ArrayList<>();
        southProvinceAreaThreePokemon.add(new Pokemon("Rookidee", 8, 12));
        southProvinceAreaThreePokemon.add(new Pokemon("Eevee (rare)", 8, 12));
        southProvinceAreaThreePokemon.add(new Pokemon("Pawmi", 8, 12));
        routePokemonMap.put("South Province - Area Three", southProvinceAreaThreePokemon);

        List<Pokemon> southProvinceAreaFourPokemon = new ArrayList<>();
        southProvinceAreaFourPokemon.add(new Pokemon("Riolu (rare)", 12, 16));
        southProvinceAreaFourPokemon.add(new Pokemon("Teddiursa", 12, 16));
        southProvinceAreaFourPokemon.add(new Pokemon("Flamigo", 12, 16));
        routePokemonMap.put("South Province - Area Four", southProvinceAreaFourPokemon);

        List<Pokemon> southProvinceAreaFivePokemon = new ArrayList<>();
        southProvinceAreaFivePokemon.add(new Pokemon("Skwovet", 14, 18));
        southProvinceAreaFivePokemon.add(new Pokemon("Wingull", 14, 18));
        southProvinceAreaFivePokemon.add(new Pokemon("Tandemaus", 14, 18));
        routePokemonMap.put("South Province - Area Five", southProvinceAreaFivePokemon);

        List<Pokemon> southProvinceAreaSixPokemon = new ArrayList<>();
        southProvinceAreaSixPokemon.add(new Pokemon("Larvesta (rare)", 18, 22));
        southProvinceAreaSixPokemon.add(new Pokemon("Dunsparce", 18, 22));
        southProvinceAreaSixPokemon.add(new Pokemon("Fomantis", 18, 22));
        routePokemonMap.put("South Province - Area Six", southProvinceAreaSixPokemon);

        List<Pokemon> losPlatosPokemon = new ArrayList<>();
        losPlatosPokemon.add(new Pokemon("Lechonk", 5, 8));
        losPlatosPokemon.add(new Pokemon("Scatterbug", 5, 8));
        losPlatosPokemon.add(new Pokemon("Hoppip", 5, 8));
        routePokemonMap.put("Los Platos", losPlatosPokemon);

        List<Pokemon> pocoPathPokemon = new ArrayList<>();
        pocoPathPokemon.add(new Pokemon("Fletchling", 2, 4));
        pocoPathPokemon.add(new Pokemon("Lechonk", 2, 4));
        pocoPathPokemon.add(new Pokemon("Pawmi (rare)", 2, 4));
        routePokemonMap.put("Poco Path", pocoPathPokemon);

        List<Pokemon> westProvinceAreaOnePokemon = new ArrayList<>();
        westProvinceAreaOnePokemon.add(new Pokemon("Mareep", 9, 12));
        westProvinceAreaOnePokemon.add(new Pokemon("Sunkern", 9, 12));
        westProvinceAreaOnePokemon.add(new Pokemon("Ralts (rare)", 9, 12));
        routePokemonMap.put("West Province - Area One", westProvinceAreaOnePokemon);

        List<Pokemon> westProvinceAreaTwoPokemon = new ArrayList<>();
        westProvinceAreaTwoPokemon.add(new Pokemon("Growlithe", 14, 18));
        westProvinceAreaTwoPokemon.add(new Pokemon("Litleo", 14, 18));
        westProvinceAreaTwoPokemon.add(new Pokemon("Mudbray", 14, 18));
        routePokemonMap.put("West Province - Area Two", westProvinceAreaTwoPokemon);

        List<Pokemon> westProvinceAreaThreePokemon = new ArrayList<>();
        westProvinceAreaThreePokemon.add(new Pokemon("Oricorio", 20, 24));
        westProvinceAreaThreePokemon.add(new Pokemon("Salandit (rare)", 20, 24));
        westProvinceAreaThreePokemon.add(new Pokemon("Cufant", 20, 24));
        routePokemonMap.put("West Province - Area Three", westProvinceAreaThreePokemon);

        List<Pokemon> caboPocoPokemon = new ArrayList<>();
        caboPocoPokemon.add(new Pokemon("Youngoos", 2, 4));
        caboPocoPokemon.add(new Pokemon("Scatterbug", 2, 4));
        caboPocoPokemon.add(new Pokemon("Houndour (rare)", 2, 4));
        routePokemonMap.put("Cabo Poco", caboPocoPokemon);

        List<Pokemon> eastProvinceAreaOnePokemon = new ArrayList<>();
        eastProvinceAreaOnePokemon.add(new Pokemon("Shinx", 10, 14));
        eastProvinceAreaOnePokemon.add(new Pokemon("Electrike", 10, 14));
        eastProvinceAreaOnePokemon.add(new Pokemon("Luxio (rare)", 10, 14));
        routePokemonMap.put("East Province - Area One", eastProvinceAreaOnePokemon);

        List<Pokemon> eastProvinceAreaTwoPokemon = new ArrayList<>();
        eastProvinceAreaTwoPokemon.add(new Pokemon("Mankey", 16, 20));
        eastProvinceAreaTwoPokemon.add(new Pokemon("Buizel", 16, 20));
        eastProvinceAreaTwoPokemon.add(new Pokemon("Tynamo (rare)", 16, 20));
        routePokemonMap.put("East Province - Area Two", eastProvinceAreaTwoPokemon);

        List<Pokemon> eastProvinceAreaThreePokemon = new ArrayList<>();
        eastProvinceAreaThreePokemon.add(new Pokemon("Hippopotas", 22, 26));
        eastProvinceAreaThreePokemon.add(new Pokemon("Sandile", 22, 26));
        eastProvinceAreaThreePokemon.add(new Pokemon("Toxel", 22, 26));
        routePokemonMap.put("East Province - Area Three", eastProvinceAreaThreePokemon);

        List<Pokemon> northProvinceAreaOnePokemon = new ArrayList<>();
        northProvinceAreaOnePokemon.add(new Pokemon("Zorua (rare)", 26, 30));
        northProvinceAreaOnePokemon.add(new Pokemon("Houndoom", 26, 30));
        northProvinceAreaOnePokemon.add(new Pokemon("Skarmory", 26, 30));
        routePokemonMap.put("North Province - Area One", northProvinceAreaOnePokemon);

        List<Pokemon> northProvinceAreaTwoPokemon = new ArrayList<>();
        northProvinceAreaTwoPokemon.add(new Pokemon("Axew (rare)", 30, 34));
        northProvinceAreaTwoPokemon.add(new Pokemon("Gible", 30, 34));
        northProvinceAreaTwoPokemon.add(new Pokemon("Gothita", 30, 34));
        routePokemonMap.put("North Province - Area Two", northProvinceAreaTwoPokemon);

        List<Pokemon> northProvinceAreaThreePokemon = new ArrayList<>();
        northProvinceAreaThreePokemon.add(new Pokemon("Dragapult (rare)", 38, 42));
        northProvinceAreaThreePokemon.add(new Pokemon("Dreepy", 38, 42));
        northProvinceAreaThreePokemon.add(new Pokemon("Snom", 38, 42));
        routePokemonMap.put("North Province - Area Three", northProvinceAreaThreePokemon);

        List<Pokemon> tagtreeThicketPokemon = new ArrayList<>();
        tagtreeThicketPokemon.add(new Pokemon("Shroodle", 32, 35));
        tagtreeThicketPokemon.add(new Pokemon("Toedscool", 32, 35));
        tagtreeThicketPokemon.add(new Pokemon("Scyther (rare)", 32, 35));
        routePokemonMap.put("Tagtree Thicket", tagtreeThicketPokemon);

        List<Pokemon> casseroyaLakePokemon = new ArrayList<>();
        casseroyaLakePokemon.add(new Pokemon("Dondozo", 40, 45));
        casseroyaLakePokemon.add(new Pokemon("Tatsugiri", 40, 45));
        casseroyaLakePokemon.add(new Pokemon("Veluza", 40, 45));
        routePokemonMap.put("Casseroya Lake", casseroyaLakePokemon);

        List<Pokemon> artazonPokemon = new ArrayList<>();
        artazonPokemon.add(new Pokemon("Sunflora", 18, 22));
        artazonPokemon.add(new Pokemon("Petilil", 18, 22));
        artazonPokemon.add(new Pokemon("Bounsweet", 18, 22));
        routePokemonMap.put("Artazon", artazonPokemon);

        List<Pokemon> cascarrafaPokemon = new ArrayList<>();
        cascarrafaPokemon.add(new Pokemon("Wingull", 20, 24));
        cascarrafaPokemon.add(new Pokemon("Finizen", 20, 24));
        cascarrafaPokemon.add(new Pokemon("Wiglett (near water)", 20, 24));
        routePokemonMap.put("Cascarrafa", cascarrafaPokemon);

        List<Pokemon> medaliPokemon = new ArrayList<>();
        medaliPokemon.add(new Pokemon("Komala", 24, 28));
        medaliPokemon.add(new Pokemon("Tandemaus", 24, 28));
        medaliPokemon.add(new Pokemon("Ursaring (rare)", 24, 28));
        routePokemonMap.put("Medali", medaliPokemon);

        List<Pokemon> portoMarinadaPokemon = new ArrayList<>();
        portoMarinadaPokemon.add(new Pokemon("Finneon", 28, 32));
        portoMarinadaPokemon.add(new Pokemon("Shellder", 28, 32));
        portoMarinadaPokemon.add(new Pokemon("Dewpider", 28, 32));
        routePokemonMap.put("Porto Marinada", portoMarinadaPokemon);

        List<Pokemon> zapapicoPokemon = new ArrayList<>();
        zapapicoPokemon.add(new Pokemon("Gible", 30, 34));
        zapapicoPokemon.add(new Pokemon("Larvitar", 30, 34));
        zapapicoPokemon.add(new Pokemon("Sableye (rare)", 30, 34));
        routePokemonMap.put("Zapapico", zapapicoPokemon);

        List<Pokemon> alfornadaPokemon = new ArrayList<>();
        alfornadaPokemon.add(new Pokemon("Meditite", 35, 40));
        alfornadaPokemon.add(new Pokemon("Gardevoir (rare)", 35, 40));
        alfornadaPokemon.add(new Pokemon("Indeedee", 35, 40));
        routePokemonMap.put("Alfornada", alfornadaPokemon);

        List<Pokemon> areaZeroPokemon = new ArrayList<>();
        areaZeroPokemon.add(new Pokemon("Koraidon", 72, 72));
        routePokemonMap.put("Area Zero", areaZeroPokemon);

        List<Pokemon> glaseadoMountainPokemon = new ArrayList<>();
        glaseadoMountainPokemon.add(new Pokemon("Snom", 42, 48));
        glaseadoMountainPokemon.add(new Pokemon("Cubchoo", 42, 48));
        glaseadoMountainPokemon.add(new Pokemon("Cetoddle", 42, 48));
        routePokemonMap.put("Glaseado Mountain", glaseadoMountainPokemon);

        List<Pokemon> socarratTrailPokemon = new ArrayList<>();
        socarratTrailPokemon.add(new Pokemon("Salandit", 45, 50));
        socarratTrailPokemon.add(new Pokemon("Sneasel", 45, 50));
        socarratTrailPokemon.add(new Pokemon("Drampa (rare)", 45, 50));
        routePokemonMap.put("Socarrat Trail", socarratTrailPokemon);

        List<Pokemon> dalizapaPassagePokemon = new ArrayList<>();
        dalizapaPassagePokemon.add(new Pokemon("Corviknight", 50, 55));
        dalizapaPassagePokemon.add(new Pokemon("Rufflet", 50, 55));
        dalizapaPassagePokemon.add(new Pokemon("Dratini (rare)", 50, 55));
        routePokemonMap.put("Dalizapa Passage", dalizapaPassagePokemon);

        List<Pokemon> southPaldeanSeaPokemon = new ArrayList<>();
        southPaldeanSeaPokemon.add(new Pokemon("Mareanie", 30, 35));
        southPaldeanSeaPokemon.add(new Pokemon("Qwilfish", 30, 35));
        southPaldeanSeaPokemon.add(new Pokemon("Clauncher", 30, 35));
        routePokemonMap.put("South Paldean Sea", southPaldeanSeaPokemon);

        List<Pokemon> eastPaldeanSeaPokemon = new ArrayList<>();
        eastPaldeanSeaPokemon.add(new Pokemon("Skrelp", 35, 40));
        eastPaldeanSeaPokemon.add(new Pokemon("Mantine", 35, 40));
        eastPaldeanSeaPokemon.add(new Pokemon("Dhelmise (rare)", 35, 40));
        routePokemonMap.put("East Paldean Sea", eastPaldeanSeaPokemon);

        List<Pokemon> westPaldeanSeaPokemon = new ArrayList<>();
        westPaldeanSeaPokemon.add(new Pokemon("Frillish", 40, 45));
        westPaldeanSeaPokemon.add(new Pokemon("Wailmer", 40, 45));
        westPaldeanSeaPokemon.add(new Pokemon("Dragalge (rare)", 40, 45));
        routePokemonMap.put("West Paldean Sea", westPaldeanSeaPokemon);

        List<Pokemon> northPaldeanSeaPokemon = new ArrayList<>();
        northPaldeanSeaPokemon.add(new Pokemon("Lapras (rare)", 45, 50));
        northPaldeanSeaPokemon.add(new Pokemon("Pyukumuku", 45, 50));
        northPaldeanSeaPokemon.add(new Pokemon("Crabominable", 45, 50));
        routePokemonMap.put("North Paldean Sea", northPaldeanSeaPokemon);
        return routePokemonMap;
        }
    }