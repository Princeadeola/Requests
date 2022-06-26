package Nikita;

import java.util.Scanner;

public class NumberAverage {
    private static int[] inputArray;
    double  average;

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();

//        new NumberAverage().findAverage();
    }

    //get the values of the array from the user
    public void getArrayValues() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        // create an array
        int[] inputArray = new int[size];

        // reading values from user keyboard
        System.out.println("Enter array values :  ");
        for (int i = 0; i < size; i++) {
            int value = scan.nextInt();
            inputArray[i] = value;

        }


    }

    //write here logic to calculate the average an array
    public String  findAverage(int[] inputArray) {

        int sum = 0;
        int length = inputArray.length;
        // sum of all values in array using for loop
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }

        average = sum / length;

        System.out.println("Average of array : " + average);

        return null;
    }
}

