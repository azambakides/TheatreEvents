package com.andraea.app;

import com.andraea.app.model.Show;
import com.andraea.app.model.TheatreTemplates;

import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        System.out.println("Welcome to The Zamba Theatre!");
        System.out.println("What show would you like to look for?");

//        Scanner select = new Scanner(System.in);
//        Scanner choice = new Scanner(System.in);
//
//        System.out.println("Please enter the name of the show:");

        for (TheatreTemplates theatreTemplates : Show.getAllShows()) {
            theatreTemplates.printShow();
        }

    }

}
