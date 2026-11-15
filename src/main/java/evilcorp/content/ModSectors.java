package evilcorp.content;

import mindustry.type.SectorPreset;

public class ModSectors {
    public static SectorPreset allaLanding;

    public static void load() {
        allaLanding = new SectorPreset("alla-landing", ModPlanets.alla, 0) {{
            difficulty = 1;
            addStartingItems = true;
        }};
    }
}