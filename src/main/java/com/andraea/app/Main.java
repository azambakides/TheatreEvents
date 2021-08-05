package com.andraea.app;

import com.andraea.app.model.Show;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Show showOne = new Show();
        showOne.setNameOfTheShow("The Nutcracker");
        showOne.setLocalDateTime(LocalDateTime.now());

        Show showTwo = new Show();
        showTwo.setNameOfTheShow("An Inspector Calls");
        showTwo.setLocalDateTime(LocalDateTime.now());

        Show showThree = new Show();
        showThree.setNameOfTheShow("Joseph and the Amazing Technicolor Dreamcoat");
        showThree.setLocalDateTime(LocalDateTime.now());

        System.out.println(showOne.getNameOfTheShow() + " " + showOne.getLocalDateTime());
        System.out.println(showTwo.getNameOfTheShow() + " " + showTwo.getLocalDateTime());
        System.out.println(showThree.getNameOfTheShow() + " " + showThree.getLocalDateTime());

    }
}
