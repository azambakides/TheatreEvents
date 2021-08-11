package com.andraea.app;

import com.andraea.app.model.Show;
import com.andraea.app.model.TheatreTemplates;

import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        // Welcome message
        System.out.println("Welcome to The Zamba Theatre!");
        Scanner selectShow = new Scanner(System.in);
        System.out.println("Please enter the name of the show you want to see: ");

        // If/else statement to see if show is found or not with user input
        String inputByUser = selectShow.nextLine();

        // If the show is not found or mistyped
        boolean foundSelectedShow = foundSelectedShow(inputByUser);
        if(!foundSelectedShow){
            System.out.println("Oops! Sorry - this show cannot be found! However, these are the shows we have available: ");
            for (TheatreTemplates showIteration : Show.getAllShows()) {
                showIteration.printShow();
            }
        } else {
            System.out.println("Enjoy the show!");
        }
    }
    // If the show is found
    public static boolean foundSelectedShow(String inputByUser) {
        boolean foundSelectedShow = false;
        for (TheatreTemplates showIteration : Show.getAllShows()) {
            if(inputByUser.trim().equalsIgnoreCase(showIteration.getShowName())) {
                showIteration.printShow();
                foundSelectedShow = true;
            }
        }
        return foundSelectedShow;
    }
}
