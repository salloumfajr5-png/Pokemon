package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public final class Spark extends PhysicalMove {
    public Spark() {
        super(Type.ELECTRIC, 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Spark";
    }
}
