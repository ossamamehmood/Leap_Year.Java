package com.company;

import java.util.*;

public class Main

{

    public static void main(String[] args)

    {

        // write your code here

        // Leap Year

        // - Project Using JAVA

        // - Based on Decision Structure & InputOutput

        // - Compiler : JetBrains - IntelliJ IDEA

        // - Developed by Ossama Mehmood

        // - Open Source (Github.com/ossamamehmood)

        int year;

        Scanner ly = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------\n" +

                                          "\t\t\t\t\t L E A P   Y E A R \n" +

                          "-------------------------------------------------------------");

        System.out.print("\n\t\t\t   Provide a year to check : ");

        year = ly.nextInt();

        if

        (year % 4 == 0)

        {

            System.out.println("\n\t\t\t      " +

                    year + " is a Leap Year" +

                    "\n");

        }

        else

            {

            System.out.println("\n\t\t\t      " +

                    year + " isn't a Leap Year" +

                    "\n");

            System.out.println("-------------------------------------------------------------");

        }

    }

}