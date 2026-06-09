package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public final class WaterGun extends SpecialMove {
    public WaterGun() {
        super(Type.WATER, 40, 100);
    }

    @Override
    protected String describe() {
        return "использует Water Gun";
    }
}
