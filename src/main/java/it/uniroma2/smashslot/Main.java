package it.uniroma2.smashslot;

import java.util.logging.Logger;

public final class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private Main() {
        // classe di avvio: non va istanziata
    }

    public static void main(String[] args) {
        LOGGER.info("SmashSlot avviato");
    }
}