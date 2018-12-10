/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author LS181227
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();

        int amount = rand.nextInt(8) + 2; //Sets a random amount of numbers in the array

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            nums.add(rand.nextInt(20)); //this loop inputs all the numbers into the array
        }

        System.out.println(nums); //Prints the array before the sort
        amount = amount - 2; //This was needed so I don't get an out of bounds error
        
        
        //Sort-------------------------------------------------------------------
        for (int i = 0; i <= amount; i++) {

            int pos1 = nums.get(i); //Each iteration gets the first and seccond pos 
            int pos2 = nums.get(i + 1);

            if (pos1 > pos2) { //It then spwaps them
                nums.remove(i);
                nums.remove(i);
                nums.add(i, pos2);
                nums.add(i + 1, pos1);
                i = -1; //if the swap did happen it restarts the iterator on the for loop

            }
        }
        System.out.println(nums); //Prints the sorted array
    }

}
