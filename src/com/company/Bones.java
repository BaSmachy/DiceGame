package com.company;

import java.util.Random;

public class Bones {
    public static void printDice(int random) {
        switch (random){
            case 1 -> System.out.println("+------+\n" +
                    "|   #  |\n" +
                    "+------+");
            case 2 -> System.out.println("+------+\n" +
                    "|     #|\n" +
                    "|#     |\n" +
                    "+------+\n");
            case 3 -> System.out.println("+------+\n" +
                    "|     #|\n" +
                    "|   #  |\n" +
                    "|#     |\n" +
                    "+------+\n");
            case 4 -> System.out.println("+------+\n" +
                    "|#    #|\n" +
                    "|      |\n" +
                    "|#    #|\n" +
                    "+------+\n");
            case 5 -> System.out.println("+------+\n" +
                    "|#    #|\n" +
                    "|   #  |\n" +
                    "|#    #|\n" +
                    "+------+\n");
            case 6 -> System.out.println("+------+\n" +
                    "|#    #|\n" +
                    "|#    #|\n" +
                    "|#    #|\n" +
                    "+------+\n");

        }

    }
}

