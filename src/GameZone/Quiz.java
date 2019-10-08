package GameZone;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        String choice;
        int score = 0;


        while (score < 3) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is 2 + 2? \n A- for 22 " +
                    "\n B- for 8 \n C - for 4 \n choice >>>>");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("The correct answer is C");
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("The correct answer is C ");
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("Correct");
                score++;

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
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("Correct");
                score++;
            }

            System.out.println("What is 5 X 5? \n A- for 25 " +
                    "\n B- for 10 \n C - for 1 \n choice >>>>");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("Correct");
                score++;
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("The correct answer is A");
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("The correct answer is A");
            }

            System.out.println("What is 5 + 5? \n A- for 25 " +
                    "\n B- for 10 \n C - for 1 \n choice >>>>");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("The correct answer is B");
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("Correct");
                score++;
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("The correct answer is B");
            }

            System.out.println("What is 5 - 3? \n A- for 2 " +
                    "\n B- for 10 \n C - for 8 \n choice >>>>");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("Correct");
                score++;
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("The correct answer is A");
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("The correct answer is A");
            }

            System.out.println("What is 5 X 15? \n A- for 20 " +
                    "\n B- for 75 \n C - for 10 \n choice >>>>");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("The correct answer is B");
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("Correct");
                score++;
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("The correct answer is B");
            }

            System.out.println("What is 20 X 30? \n A- for 6000 " +
                    "\n B- for 60 \n C - for 600 \n choice >>>>");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("The correct answer is C");
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("The correct answer is C ");
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("Correct");
                score++;
            }

            System.out.println("What is 4000 / 2000? \n A- for 20 " +
                    "\n B- for 200 \n C - for 2 \n choice >>>>");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("The correct answer is C");
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("The correct answer is C ");
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("Correct");
                score++;
            }

            System.out.println("What is (2 X 3 X 4 X 0) + 1? \n A- for 24 " +
                    "\n B- for 1 \n C - for 6 \n choice >>>>");
            choice = input.next();
            if (choice.equalsIgnoreCase("A")) {
                System.out.println("The correct answer is B");
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("Correct");
                score++;
            } else if (choice.equalsIgnoreCase("C")) {
                System.out.println("The correct answer is B");
            }
            System.out.println("Your score is " + score + " out of 10");

            }
        }
    }
