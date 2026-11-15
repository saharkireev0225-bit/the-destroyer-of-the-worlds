package evilcorp.content;

import mindustry.type.Planet;
import mindustry.content.Planets;
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
            generator = Planets.serpulo.generator;
        }};

        alla = new Planet("alla", tantar, 1.0f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("7ec850");
            generator = Planets.serpulo.generator;
        }};

        creo = new Planet("creo", tantar, 1.1f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("a0d8ff");
            generator = Planets.serpulo.generator;
        }};

        ferros = new Planet("ferros", tantar, 1.0f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("8b6b4a");
            generator = Planets.serpulo.generator;
        }};

        nadir = new Planet("nadir", tantar, 1.4f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("2a2a3a");
            generator = Planets.serpulo.generator;
        }};

        apex = new Planet("apex", tantar, 1.2f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("ff5533");
            generator = Planets.serpulo.generator;
        }};

        allaMoon = new Planet("alla-moon", alla, 0.35f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("b0b0b0");
            generator = Planets.serpulo.generator;
        }};

        creoMoon = new Planet("creo-moon", creo, 0.35f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("88bbee");
            generator = Planets.serpulo.generator;
        }};

        ferrosMoon = new Planet("ferros-moon", ferros, 0.35f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("a08b6b");
            generator = Planets.serpulo.generator;
        }};

        nadirGangos = new Planet("gangos", nadir, 0.4f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("555566");
            generator = Planets.serpulo.generator;
        }};

        apexMoon = new Planet("apex-moon", apex, 0.35f, 2) {{
            accessible = true;
            iconColor = Color.valueOf("cc8866");
            generator = Planets.serpulo.generator;
        }};
    }
}