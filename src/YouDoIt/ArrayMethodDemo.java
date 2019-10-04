package YouDoIt;

public class ArrayMethodDemo {

    public static void main(String[] args) {

        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

        displayHighLow(integerArray);
        displayLowHigh(integerArray);
        displaySum(integerArray);
        displayLessThan(integerArray);
        displayAverage(integerArray);

    }

    public static void displayHighLow(int[] integerArray) {
        for (int i = 0; i < 10; i++) {
            System.out.println(integerArray[i]);
        }

    }

    public static void displayLowHigh(int[] integerArray) {
        for (int i = 9; i >= 0; i--) {
            System.out.println(integerArray[i]);
        }
    }

    public static void displaySum(int[] integerArray) {
        int total = 0;
        for (int j = 0; j < integerArray.length; j++) {
            total = total + integerArray[j];

        }
        System.out.println("Total = " + total);
    }


    public static void displayLessThan(int[] integerArray) {
        for (int j = 0; j < integerArray.length; j++) {
            if (integerArray[j] < 10) {
                System.out.println(integerArray[j]);
            }
        }


    }
    public static void displayAverage(int[] integerArray)
    {
        int total = 55;
        int average = total/ integerArray.length;
        for (int j = 0; j < integerArray.length; j++) {
            if(integerArray[j] > average){
            }
        }
        System.out.println(average);

    }
    }



