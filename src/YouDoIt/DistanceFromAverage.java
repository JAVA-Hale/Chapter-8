package YouDoIt;

import java.util.Scanner;

import static java.lang.Math.abs;

public class DistanceFromAverage {

    public static void main(String[] args) {

        double[] arryNums = new double[20];
        boolean quit = true;
        int count = 0;
        double userEntry= 0;
        double total = 0;
        double average = 0;
        double distance = 0;
        Scanner input = new Scanner(System.in);

        while(quit){
            System.out.println("Please enter a nember >>> ");
            userEntry = input.nextDouble();
            if(count == 20){
                quit = false;

            }
            else if(userEntry == 99999){
                quit = false;
            }
            else{
                arryNums[count] = userEntry;
                total = total + userEntry;
                count++;
            }


        }
        average = total/count;

        for(int i = 0; i < arryNums.length; i++){
            distance = arryNums[i] - average;
            System.out.println("The average was " + average + "\n First entry was "  + arryNums[i] +
            "\n The distance was " + abs(distance) + "\n Total count " + count);

        }
    }
}
