package evilcorp.content;

import mindustry.type.Planet;
import arc.graphics.Color;

public class ModPlanets {
    public static Planet tantar;
    public static Planet alla, creo, ferros, nadir, apex;
    public static Planet allaMoon, creoMoon, ferrosMoon, nadirGangos, apexMoon;

    public static void load() {
        tantar = new Planet("tantar", null, 4f, 5) {{
            accessible = false;
            hasAtmosphere = true;
            iconColor = Color.valueOf("ffb840");
            lightColor = Color.valueOf("ffb840");
        }};

        alla = new Planet("alla", tantar, 1.0f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("7ec850");
        }};

        creo = new Planet("creo", tantar, 1.1f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("a0d8ff");
        }};

        ferros = new Planet("ferros", tantar, 1.0f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("8b6b4a");
        }};

        nadir = new Planet("nadir", tantar, 1.4f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("2a2a3a");
        }};

        apex = new Planet("apex", tantar, 1.2f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("ff5533");
        }};

        allaMoon = new Planet("alla-moon", alla, 0.35f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("b0b0b0");
        }};

        creoMoon = new Planet("creo-moon", creo, 0.35f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("88bbee");
        }};

        ferrosMoon = new Planet("ferros-moon", ferros, 0.35f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("a08b6b");
        }};

        nadirGangos = new Planet("gangos", nadir, 0.4f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("555566");
        }};

        apexMoon = new Planet("apex-moon", apex, 0.35f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("cc8866");
        }};
    }
}