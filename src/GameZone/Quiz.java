package GameZone;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        String choice;
        int score = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("What is 2 + 2? \n A- for 22 " +
                "\n B- for 8 \n C - for 4 \n choice >>>>");
        choice = input.next();
        if (choice.equalsIgnoreCase("A")) {
            System.out.println("The correct answer is C");
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("The correct answer is C ");
            score++;
        } else if (choice.equalsIgnoreCase("C")) {
            System.out.println("Correct");

        }

        System.out.println("What is 4 - 2? \n A- for 42 " +
                    "\n B- for 2 \n C - for 6 \n choice >>>>");
        choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("The correct answer is B");
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("Correct");
                score++;
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("The correct answer is B");
            }
        System.out.println("What is 2 X 3? \n A- for 5 " +
                "\n B- for 2 \n C - for 6 \n choice >>>>");
        choice = input.next();
        if (choice.equalsIgnoreCase("A")) {
            System.out.println("The correct answer is C");
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("The correct answer is C ");
            score++;
        } else if (choice.equalsIgnoreCase("C")) {
            System.out.println("Correct");
        }



            }
        }
