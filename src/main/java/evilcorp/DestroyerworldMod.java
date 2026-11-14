package evilcorp;

import mindustry.mod.Mod;
import evilcorp.content.*;

public class DestroyerworldMod extends Mod {

    @Override
    public void loadContent() {
        // Порядок важен: сначала сырье (предметы, жидкости), потом блоки.
        ModItems.load();
        ModLiquids.load();
        ModBlocks.load();

        // Планеты и сектора — после блоков, так как сектора ссылаются на блоки.
        ModPlanets.load();
        ModSectors.load();
    }

    @Override
    public void init() {
        // init() вызывается ПОСЛЕ того, как весь контент (ваш и ванильный) создан.
        // Здесь строим дерево технологий и инициализируем глобальные системы.
        ModTechTree.load();
        evilcorp.util.RailgunNetwork.init();
        evilcorp.util.UniverseState.init();
    }
}