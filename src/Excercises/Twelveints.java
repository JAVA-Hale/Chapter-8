package Excercises;

public class Twelveints {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = 0; i < 11; i++) {
            System.out.println(firstArray[i]);

        }
        System.out.println("___________");
        for (int i = 11; i > 0; i--) {
            System.out.println(firstArray[i]);


        }
    }
}