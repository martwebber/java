package org.example;

import java.util.Arrays;

public class ArraysAndArrayLists {

    public static void main(String args[]){
        /*
        Arrays
        An array is a data structure that stores a collection of values of the same type.
        Each individual value can be accessed through an integer index. For example, if myIntArray is
        an array of integers, then myIntArray[i] is the ith integer in the array.


Declare an array variable by specifying the array type—which is the element
type followed by []—and the array variable name. For example, here is the declaration of an array a of integers:
However, this statement only declares the variable a. It does not yet initialize a
with an actual array. Use the new operator to create the array.
C
         */
        int[] myIntArrayInit; // Array declaration

        int[] myIntArray1 = new int[5]; //Array declaration and initialization with array size
        System.out.println("Array declaration and initialization with initial values...");
        int[] myIntArray2 = {56,8,90,65,32};
         for (int i = 0; i < myIntArray2.length; i++){
             System.out.println(i + ":" + myIntArray2[i]);
         }
        System.out.println("Adding values to an array...");
        myIntArray1[0] = 76;
        myIntArray1[1] = 77;
        myIntArray1[2] = 78;
        myIntArray1[3] = 79;
        myIntArray1[4] = 80;
        System.out.println("Printing array values...");
        for(int i:myIntArray1) {
            System.out.println(i);
        }
        System.out.println("Multi dimensional array");
        int[][] multiArr = {{1,2,3},{4,5,6},{7,8,9},};

        for (int i[]: multiArr){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println(Arrays.toString(multiArr[2]));
        System.out.println(Arrays.toString(myIntArray1));

        System.out.println("Creating anonymous array");

        myIntArray1 = new int[] { 17, 19, 23, 29, 31, 37 };

        System.out.println(Arrays.toString(myIntArray1));

        String[] myStrArray = {"Mark","Ben","Carol"};
        System.out.println(Arrays.toString(myStrArray));
        String[] names = new String[9];
        System.out.println(Arrays.toString(names));
    }


}