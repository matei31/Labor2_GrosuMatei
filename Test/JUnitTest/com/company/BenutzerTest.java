package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        ArrayList<Sport> sports = new ArrayList<Sport>();
        sports.add(fussball);
        sports.add(basketball);
        sports.add(hindernislauf);
        sports.add(hochsprung);
        Benutzer benutzer = new Benutzer("John", "Ion", sports);

        assertEquals(benutzer.kalkuliereZeit(), 170);
    }

    @Test
    void testKalkuliereZeit() {
        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        ArrayList<Sport> sports = new ArrayList<Sport>();
        sports.add(fussball);
        sports.add(basketball);
        sports.add(hindernislauf);
        sports.add(hochsprung);
        Benutzer benutzer = new Benutzer("John", "Ion", sports);
        assertEquals(benutzer.kalkuliereZeit(fussball), 65);
        assertEquals(benutzer.kalkuliereZeit(basketball), 55);
        assertEquals(benutzer.kalkuliereZeit(hindernislauf), 30);
        assertEquals(benutzer.kalkuliereZeit(hochsprung), 20);
    }



    @Test
    void kalkuliereDurchschnittszeit() {
        Fussball fussball = new Fussball();
        Basketball basketball = new Basketball();
        Hindernislauf hindernislauf = new Hindernislauf();
        Hochsprung hochsprung = new Hochsprung();
        ArrayList<Sport> sports = new ArrayList<Sport>();
        sports.add(fussball);
        sports.add(basketball);
        sports.add(hindernislauf);
        sports.add(hochsprung);
        Benutzer benutzer = new Benutzer("John", "Ion", sports);
        assertEquals((double) 170/4, benutzer.kalkuliereDurchschnittszeit());
    }
}