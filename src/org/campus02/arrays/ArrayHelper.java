package org.campus02.arrays;

import java.util.Random;

public class ArrayHelper {

    public static void main(String[] args) {
        int[] IntArray = createIntArray(7, 70);

        for (int i = 0; i < IntArray.length; i++) {
            System.out.println("Die Glückszahl an der Stelle " + (i+1) + " lautet: " + IntArray[i]);
        }

        System.out.println(validateTipp(IntArray));
    }

    public static int[] createIntArray(int sizeOfArray, int maxValue){
        int[] IntArray = new int[sizeOfArray];

        for (int i = 0; i < IntArray.length; i++) {
            IntArray[i] = new Random().nextInt(maxValue+1);
        }

        return IntArray;
    }

    public static boolean validateTipp(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
