package evilcorp.content;

import mindustry.type.SectorPreset;

public class ModSectors {
    public static SectorPreset allaLanding, creoLanding, nadirLanding, gangosOrbit;

    public static void load() {
        allaLanding = new SectorPreset("alla-landing", ModPlanets.alla, 0) {{
            difficulty = 1;
            addStartingItems = true;
        }};

        creoLanding = new SectorPreset("creo-landing", ModPlanets.creo, 0) {{
            difficulty = 2;
            addStartingItems = true;
        }};

        nadirLanding = new SectorPreset("nadir-landing", ModPlanets.nadir, 0) {{
            difficulty = 5;
            addStartingItems = true;
        }};

        gangosOrbit = new SectorPreset("gangos-orbit", ModPlanets.nadirGangos, 0) {{
            difficulty = 3;
            addStartingItems = true;
        }};
    }
}