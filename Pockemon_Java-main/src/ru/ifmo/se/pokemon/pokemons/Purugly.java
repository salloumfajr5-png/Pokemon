package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.moves.*;

public final class Purugly extends Glameow {
    public Purugly(String name, int level) {
        super(name, level);
        setStats(71, 82, 64, 64, 59, 112);
        addMove(new BodySlam());
    }
}
