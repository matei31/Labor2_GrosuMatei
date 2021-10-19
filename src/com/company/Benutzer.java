package com.company;

import java.util.List;

/**
 * Classname: Benutzer
 * Date: 19.10.2021
 * @author Grosu Matei
 */
public class Benutzer {
    private String vorName;
    private String nachName;
    private final List<Sport> sport;

    /**
     * Constructor
     * @param vorName first name
     * @param nachName surname
     * @param sport the list of sports
     */
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    //getters
    public String getVorName() {
        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    //setters
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     *
     * @return the total time for all sports in the list
     */
    public double kalkuliereZeit() {
        double sum = 0;
        for (Sport x : sport)
            sum += x.kalkuliereZeit();
        return sum;
    }

    /**
     *
     * @param s the sport for which we want to calculate time
     * @return the time required for a sport s
     */
    public double kalkuliereZeit(Sport s) {
        for (Sport x : sport) {
            if (x == s)
                return x.kalkuliereZeit();
        }
        return -1;
    }

    /**
     *
     * @return the average time required for all sports in the list
     */
    public double kalkuliereDurchschnittszeit() {
        return kalkuliereZeit() / sport.size();
    }
}
