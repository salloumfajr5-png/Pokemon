package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public final class ShadowClaw extends PhysicalMove {
    private static final double HIGH_CRIT_CHANCE = 1.0 / 8.0;

    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < HIGH_CRIT_CHANCE) {
            System.out.println("Критический удар!");
            return 2.0;
        }
        return 1.0;
    }

    @Override
    protected String describe() {
        return "использует Shadow Claw";
    }
}
