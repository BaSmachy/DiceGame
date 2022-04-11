package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

import static java.lang.Math.abs;

public class BBOnes {
    static Random randnum = new Random();


    public static void sal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("- - - Start Game - - - ");
        System.out.print("Predict amount of points (2...12): ");
        int vod = scanner.nextInt();
        int comp = randnum.nextInt(11)+1;
        int compran1 = randnum.nextInt(5)+1;
        int compran2 = randnum.nextInt(5)+1;
        int ran = randnum.nextInt(5) + 1;
        int ran1 = randnum.nextInt(5) + 1;
        if (vod >= 2 && 12 >= vod) {

            Bones.printDice(ran);
            Bones.printDice(ran1);
            int twonums = ran + ran1;
            int allnums = Math.abs(twonums - vod) * 2;
            System.out.println("On the dice fell " + twonums + " points!.");
            System.out.println("Result is " + twonums + " - abs( " + twonums + " - " + vod + " ) * 2 : " + allnums);


            System.out.println("\nComputer predictade " + comp + " points");
            System.out.println("Computer rolls the dices");
            Bones.printDice(compran1);
            Bones.printDice(compran2);
            int allcomp = compran1 + compran2;
            int compnums = Math.abs(allcomp - vod) * 2;
            System.out.println("On the dice fell " + allcomp + " points!.");
            System.out.println("Result is " + allcomp + " - abs( " + allcomp + " - " + comp + " ) * 2 : " + compnums);

            if (compnums > allnums) {
                System.out.println("Computer win " + (compnums - allnums) + " points more!");
            } else {
                System.out.println("User win " + (allnums - compnums) + " points more!");
            }
            System.out.println();
            System.out.println("- - - - - Current score - - - - -");
            System.out.println("User: " + (allnums) + "\n" + "Computer: " + (compnums));
//                             "\nComputer is ahead by " +(compnums-allnums +allnums + compnums));

            int user = 0;
            int computer = 0;
            if (allnums > compnums) {
                int user1 = allnums - compnums;
                System.out.println("User is ahead " + (user1));
            } else {
               int computer1 = compnums - allnums;
                System.out.println("Computer is ahead " + (computer1));
            }
            System.out.println("- - - - - - - - - - - - - - - -");
            System.out.println("- - - - - FINISH GAME - - - - -");

            System.out.println("Round |              User|                Computer\n" +
                    "------+------------------+------------------------\n" +

                    "      |Predictade:     " + vod + " |       \tPredictade: " + allcomp + "\n" +
                    "- 1 - |Dice:           " + twonums + " |        \tDice: " + allcomp + "\n" +
                    "      |Result:         " + allnums+ " |        \tResult: " + compnums  + "\n" +

                    "------+-------------+------------\n" +
                    "- 2 - +-------------+------------\n" +
                    "------+-------------+------------\n" +

                    "------+-------------+------------\n" +
                    "- 3 - +-------------+------------\n" +
                    "------+-------------+------------\n" +

                    "------+-------------+------------");






        }else {
            System.err.println("WRONG");
        }













        }
    }




//    public static void suma(int randomNumbers, int randomNumbers1, int a) {
//        int summaInDar = randomNumbers + randomNumbers1;
//        int allsuma = Math.abs(summaInDar - a) * 2;
//        if (allsuma > 0) {
//            System.out.println("you're wins \nyour scope: " + allsuma + "\n//////////////////////");
//        } else if (allsuma < 0) {
//            System.err.println("you lost because your point is less than 0 \nyour score: " + allsuma + "\n//////////////////////");
//        }