package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Lapras("Несси", 45));
        b.addAlly(new Glameow("Мурка", 37));
        b.addAlly(new Eelektross("Вольт", 39));

        b.addFoe(new Purugly("Толстяк", 38));
        b.addFoe(new Tynamo("Искра", 1));
        b.addFoe(new Eelektrik("Угорь", 39));

        b.go();
    }
}
