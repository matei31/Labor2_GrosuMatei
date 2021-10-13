package com.company;

import com.company.Sport;

import java.util.ArrayList;
import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    //constructor
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    //getters
    public String getVorName(){return vorName;}
    public String getNachName(){return nachName;}
    public List<Sport> getSport(){return sport;}

    //setters
    public void setVorName(String vorName){this.vorName = vorName;}
    public void setNachName(String nachName){this.nachName = nachName;}


    public double kalkuliereZeit(){
        double sum=0;
        for(Sport x: sport)
            sum+=x.kalkuliereZeit();
        return sum;
    }
    public double kalkuliereZeit(Sport s){
        for(Sport x: sport)
            {
                if(x == s)
                    return x.kalkuliereZeit();
            }
        return -1;
    }
    public double kalkuliereDurchschnittszeit(){
        return kalkuliereZeit()/sport.size();
    }
}
