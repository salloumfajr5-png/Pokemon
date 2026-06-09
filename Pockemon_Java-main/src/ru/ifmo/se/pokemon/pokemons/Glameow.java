package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.moves.*;

public class Glameow extends Pokemon {
    public Glameow(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(49, 55, 42, 42, 37, 85);
        setMove(new Slash(), new Swagger(), new ShadowClaw());
    }
}
