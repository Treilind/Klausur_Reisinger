package org.campus02.recursion;

public class RecursiveMultiplication {

    public static int multiplicate(int a, int b){
        int result = 0;
        int counter = 0;

        if (counter == b){
            return result;
        }

        result = a + counter;
        counter++;


        return multiplicate(a , counter);
    }
}
