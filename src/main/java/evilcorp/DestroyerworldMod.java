package evilcorp;

import mindustry.mod.Mod;
import evilcorp.content.ModPlanets;
import evilcorp.content.ModSectors;

public class DestroyerworldMod extends Mod {
    @Override
    public void loadContent() {
        ModPlanets.load();
        ModSectors.load();
    }
}