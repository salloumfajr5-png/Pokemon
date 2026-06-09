package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.moves.*;

public final class Eelektross extends Eelektrik {
    public Eelektross(String name, int level) {
        super(name, level);
        setStats(85, 115, 80, 105, 80, 50);
        addMove(new Swagger());
    }
}
