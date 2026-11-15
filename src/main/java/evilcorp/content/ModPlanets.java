package evilcorp.content;

import mindustry.type.Planet;
import mindustry.content.Planets;
import mindustry.maps.planet.SerpuloPlanetGenerator;
import arc.graphics.Color;

public class ModPlanets {
    public static Planet tantar;
    public static Planet alla;

    public static void load() {
        // Создаем звезду (родитель - стандартное солнце игры)
        tantar = new Planet("tantar", Planets.sun, 4f, 5) {{
            accessible = false;
            hasAtmosphere = true;
            iconColor = Color.valueOf("ffb840");
            generator = new SerpuloPlanetGenerator();
        }};

        // Создаем одну планету
        alla = new Planet("alla", tantar, 1.0f, 3) {{
            accessible = true;
            iconColor = Color.valueOf("7ec850");
            generator = new SerpuloPlanetGenerator();
        }};
    }
}