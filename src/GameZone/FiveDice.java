package GameZone;

import java.util.Random;

public class FiveDice {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] dieRolls = new int [5];
        int totalRolls = 0;


        for(int i=0; i <5; ++i){
            int die = rand.nextInt(6)+1;
            dieRolls[i] = die;
            System.out.println(die);

        }
        System.out.println("This one is " + dieRolls[0]);
        for(int j=0; j<dieRolls.length; ++j){
            totalRolls = totalRolls + dieRolls[j];
        }
        System.out.println("Total = " + totalRolls);
    }
}
