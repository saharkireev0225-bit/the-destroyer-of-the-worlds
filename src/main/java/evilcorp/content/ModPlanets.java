package evilcorp.content;

import mindustry.type.Planet;
import arc.graphics.Color;

public class ModPlanets {
    // Звезда в центре системы
    public static Planet tantar;

    // Пять планет
    public static Planet alla, creo, ferros, nadir, apex;

    // Спутники (луны)
    public static Planet allaMoon, creoMoon, ferrosMoon, nadirGangos, apexMoon;

    public static void load() {
        // 1. Создаём звезду Тантар (у неё нет родителя, поэтому null)
        tantar = new Planet("tantar", null, 4f, 5) {{
            accessible = false; // На звезду нельзя высадиться
            hasAtmosphere = true;
            color = Color.valueOf("ffb840"); // Оранжево-жёлтый цвет
            iconColor = Color.valueOf("ffb840");
        }};

        // 2. Создаём планеты, вращающиеся вокруг Тантара
        alla = new Planet("alla", tantar, 1.0f, 3) {{
            color = Color.valueOf("7ec850"); // Зелёный
            iconColor = Color.valueOf("7ec850");
            accessible = true;
        }};

        creo = new Planet("creo", tantar, 1.1f, 3) {{
            color = Color.valueOf("a0d8ff"); // Ледяной голубой
            iconColor = Color.valueOf("a0d8ff");
            accessible = true;
        }};

        ferros = new Planet("ferros", tantar, 1.0f, 3) {{
            color = Color.valueOf("8b6b4a"); // Коричневый
            iconColor = Color.valueOf("8b6b4a");
            accessible = true;
        }};

        nadir = new Planet("nadir", tantar, 1.4f, 3) {{
            color = Color.valueOf("2a2a3a"); // Тёмно-серый
            iconColor = Color.valueOf("2a2a3a");
            accessible = true;
        }};

        apex = new Planet("apex", tantar, 1.2f, 3) {{
            color = Color.valueOf("ff5533"); // Огненно-красный
            iconColor = Color.valueOf("ff5533");
            accessible = true;
        }};

        // 3. Создаём спутники для каждой планеты
        allaMoon = new Planet("alla-moon", alla, 0.35f, 2) {{
            color = Color.valueOf("b0b0b0");
            accessible = true;
        }};

        creoMoon = new Planet("creo-moon", creo, 0.35f, 2) {{
            color = Color.valueOf("88bbee");
            accessible = true;
        }};

        ferrosMoon = new Planet("ferros-moon", ferros, 0.35f, 2) {{
            color = Color.valueOf("a08b6b");
            accessible = true;
        }};

        // Это тот самый спутник Гангос, который будет кружить над Надиром
        nadirGangos = new Planet("gangos", nadir, 0.4f, 2) {{
            color = Color.valueOf("555566");
            accessible = true;
        }};

        apexMoon = new Planet("apex-moon", apex, 0.35f, 2) {{
            color = Color.valueOf("cc8866");
            accessible = true;
        }};

        // 4. Привязываем эксклюзивные ресурсы к планетам (пример для Аллы и Крео)
        // Раскомментируй, когда создашь эти предметы в HJSON
        // ModItems.allanBiofiber.shownPlanets.add(alla);
        // ModItems.creoShard.shownPlanets.add(creo);
    }
}