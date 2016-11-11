package edu.calvin.cs262.lab06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/*
 * Player class - holds information for a monopoly player
 * CS 262 - Software Engineering
 * Professor: Keith Vanderlinden
 * Author: Zach Wibbenmeyer
 * Date: October 21, 2016
 */
public class Player {

    private int ID;
    private String email;
    private String name;

    public Player(int id, String Email, String Name) {
        this.ID = id;
        this.email = Email;
        this.name = Name;
    }

    public String getID() {
        return "" + ID;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

}
