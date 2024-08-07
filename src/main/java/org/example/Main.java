package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length;
        }

        public static void main(String[] args) {

            // Initial array to test the average calculation
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Average: " + calculateAverage(numbers)); // Expected output: 3.0

            // Testing after fixing the Array Index Out of Bounds Exception
            int[] anotherNumbers = {1, 2, 3, 4, 5};
            System.out.println("Average: " + calculateAverageFixed(anotherNumbers)); // Expected output: 3.0

            // Testing after fixing the logic error
            int[] moreNumbers = {1, 2, 3, 4, 5};
            System.out.println("Average: " + calculateAverageFixed(moreNumbers)); // Expected output: 3.0
        }

        public static double calculateAverageFixed(int[] numbers) {
            if (numbers == null || numbers.length == 0) { // Introduces a NullPointerException
                throw new IllegalArgumentException("Array cannot be null or empty"); // This will throw NullPointerException
            }
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return (double) sum / numbers.length;
        }

        // Corrected method without logic error
        public static double calculateAverageWithLogicError(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return (double) sum / numbers.length; // Corrected division
        }
    }
