package com.andraea.app;

import com.andraea.app.model.Show;
import com.andraea.app.model.TheatreTemplates;

public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to The Zamba Theatre" );
        System.out.println( "Which of these shows would you like to see?");
        System.out.println(Show.TheNutcracker.getShowName() + " " + Show.TheNutcracker.getShowDate() + " " + Show.TheNutcracker.getShowTime1());

//        ShowTemplates showTemplatesOne = new ShowTemplates();
//        showTemplatesOne.setNameOfTheShow("The Nutcracker");
//        showTemplatesOne.setLocalDateTime(LocalDateTime.now());
//
//        ShowTemplates showTemplatesTwo = new ShowTemplates();
//        showTemplatesTwo.setNameOfTheShow("An Inspector Calls");
//        showTemplatesTwo.setLocalDateTime(LocalDateTime.now());
//
//        ShowTemplates showTemplatesThree = new ShowTemplates();
//        showTemplatesThree.setNameOfTheShow("Joseph and the Amazing Technicolor Dreamcoat");
//        showTemplatesThree.setLocalDateTime(LocalDateTime.now());
//
//        System.out.println(showTemplatesOne.getNameOfTheShow() + " " + showTemplatesOne.getLocalDateTime());
//        System.out.println(showTemplatesTwo.getNameOfTheShow() + " " + showTemplatesTwo.getLocalDateTime());
//        System.out.println(showTemplatesThree.getNameOfTheShow() + " " + showTemplatesThree.getLocalDateTime());

    }
}
