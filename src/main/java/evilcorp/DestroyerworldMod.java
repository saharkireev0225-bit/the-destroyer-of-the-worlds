package evilcorp;

import mindustry.mod.Mod;
import evilcorp.content.*;

public class DestroyerworldMod extends Mod {

    @Override
    public void loadContent() {
        // Порядок важен: сначала сырье (предметы, жидкости), потом блоки.
        ModPlanets.load();
    }

    @Override
    public void init() {
        // init() вызывается ПОСЛЕ того, как весь контент (ваш и ванильный) создан.
        // Здесь строим дерево технологий и инициализируем глобальные

    }
}