package com.company;

public class CreateArray {
    public static void main(String[] args) {

        int[] number = new int[4];
        // assign value to array
        number[0] = 10;
        number[1] = 25;
        number[2] = -8;
        number[3] = -10;

        // Get array size
        System.out.println("Array size is " + number.length);
        // Read values
         System.out.println("number[0] = " + number[0]);
        System.out.println("number[1] = " + number[1]);
        System.out.println("number[2] + number[3] = " + (number[2] + number[3]));

        String[] names = new String[] { "Mateo", "Danny", "Janifer","a","b","c","d"};

        // Using for loop reading from array
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]);
        }

    }
}
