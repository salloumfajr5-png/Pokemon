package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.moves.*;

public final class Lapras extends Pokemon {
    public Lapras(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ICE);
        setStats(130, 85, 80, 85, 95, 60);
        setMove(new IceBeam(), new WaterGun(), new Swagger(), new AncientPower());
    }
}
