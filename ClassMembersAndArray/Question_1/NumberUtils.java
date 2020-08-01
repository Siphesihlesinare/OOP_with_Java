import java.util.Scanner;

public class NumberUtils {

    private NumberUtils() { }
// A private, empty-bodied constructor prevents NumberUtil objects from being created.

    public static int[] toArray(int number) {
        // Given a number that is n digits in length, maps the digits to an array length n.
        // e.g. given the number 5678, the result is the array {5, 6, 7, 8}.


        String numString = Integer.toString(number);
        int[] myArray = new int[numString.length()];

        for (int i = 0; i < numString.length(); i++) {
            char c = numString.charAt(i);

            int cVal = Character.getNumericValue(c);

            myArray[i] = cVal;
        }
        return myArray;
    }


    public static int countMatches(int a, int b) { //Bulls
        // Given two numbers, count the quantity of matching digits – those with the same value and position. For example, given 39628 and 97324, there are 2 digits in common: x9xx2x.
        // It is assumed that the numbers are the same length and have no repeating digits.

        int count = 0;

        char[] arrayA = Integer.toString(a).toCharArray();
        char[] arrayB = Integer.toString(b).toCharArray();

        for (int i = 0; i < Math.min(arrayA.length,arrayB.length); i++) {
            if (arrayA[i] == arrayB[i])
                count += 1;
        }
        return count;
    }

    public static int countIntersect(int numA, int numB) { //Cows
        // Count the quantity of digits that two numbers have in common, regardless of position.
        // For example, given 39628 and 97324, there are 3 digits in common: 3, 7, 2.
        // It is assumed that the numbers are the same length and have no repeating digits.
        int count = 0;

        char[] arrayA = Integer.toString(numA).toCharArray();
        char[] arrayB = Integer.toString(numB).toCharArray();

        for (int i = 0; i < arrayA.length; i++) {
            for (int j = i; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    if(i != j) {
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
    }
    }
