package app;

import model.Actor;
import model.Film;
import model.Serial;

public class Filmueb {
    public static String VERSION = "0.1";

    public static void main(String[] args) {
        System.out.println("Wersja aplikacji " + VERSION);

        Film film = new Film("Titanic", "James Cameron", 1997, "melodramat", "Film o Titanic", 7.3);
        System.out.println(film.toString());

        Serial serial = new Serial("Friends", 10, "USA", "komedia", "Film o przyjaciołach", 8.2);
        System.out.println(serial.toString());

        Actor actor = new Actor("Jennifer", "Aniston", "USA");
        System.out.println(actor.toString());
    }
}
