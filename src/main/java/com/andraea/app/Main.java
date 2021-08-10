package com.andraea.app;

import com.andraea.app.model.Show;
import com.andraea.app.model.TheatreTemplates;

import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        System.out.println("Welcome to The Zamba Theatre!");

        Scanner selectShow = new Scanner(System.in);
        System.out.println("Please enter the name of the show you want to see: ");

        String inputByUser = selectShow.nextLine();

        boolean foundSelectedShow = foundSelectedShow(inputByUser);
        if(!foundSelectedShow){
            System.out.println("Oops! Sorry - this show cannot be found! But, these are the shows we have these shows available: ");
            for (TheatreTemplates showIteration : Show.getAllShows()) {
                showIteration.printShow();
            }
        } else {
            System.out.println("Enjoy the show!");
        }
    }

    public static boolean foundSelectedShow(String inputByUser) {
        boolean foundSelectedShow = false;
        for (TheatreTemplates showIteration : Show.getAllShows()) {
            if(inputByUser.equalsIgnoreCase(showIteration.getShowName())) {
                showIteration.printShow();
                foundSelectedShow = true;
            }
        }
        return foundSelectedShow;
    }
}
