import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    public static void main(String[] args) {
        try {
            File f = new File("Numbers.txt");
            Scanner s = new Scanner(f);

            // Variables for statistics
            int odds = 0, evens = 0, twoDigit = 0, greaterThan500 = 0, sum = 0;
            int smallest = Integer.MAX_VALUE, biggest = Integer.MIN_VALUE;
            int[] frequency = new int[1001]; // Array for mode, assuming numbers in range 0 to 1000
            int count = 0;

            // Process file
            while (s.hasNextInt()) {
                int num = s.nextInt();
                count++;
                sum += num;

                // Odd or even
                if (num % 2 == 0) evens++;
                else odds++;

                // Two-digit check
                if (num >= 10 && num <= 99) twoDigit++;

                // Greater than 500
                if (num > 500) greaterThan500++;

                // Smallest and biggest
                if (num < smallest) smallest = num;
                if (num > biggest) biggest = num;

                // Increment frequency for mode
                if (num >= 0 && num < frequency.length) {
                    frequency[num]++;
                }
            }
            s.close();

            // Calculate mode
            int mode = 0, maxFrequency = 0;
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > maxFrequency) {
                    maxFrequency = frequency[i];
                    mode = i;
                }
            }

            // Calculate average
            double average = (double) sum / count;

            // Print results
            System.out.println("Odd numbers: " + odds);
            System.out.println("Even numbers: " + evens);
            System.out.println("Two-digit numbers: " + twoDigit);
            System.out.println("Numbers > 500: " + greaterThan500);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Greatest number: " + biggest);
            System.out.println("Sum of numbers: " + sum);
            System.out.printf("Arithmetic mean: %.3f%n", average);
            System.out.println("Mode of numbers: " + mode);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
