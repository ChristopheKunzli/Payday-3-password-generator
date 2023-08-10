import java.util.ArrayList;
import java.util.List;

public class PasswordGenerator {
    static void printPasswords(List<List<Integer>> passwords) {
        for (List<Integer> password : passwords) {
            System.out.println(password);
        }
    }

    /**
     * Generates a list of possible passwords from a list of digits.
     * Every password generated must have a length of 4 digits
     * @param digits digits used in the password
     * @return The full list of possible passwords
     */
    public static List<List<Integer>> generatePossiblePasswords(int[] digits) {
        List<List<Integer>> possiblePasswords = new ArrayList<>();

        if (digits.length == 4) {
            generatePermutations(new ArrayList<>(), digits, new boolean[digits.length], possiblePasswords);
        } else if (digits.length == 3) {
            int d1 = digits[0];
            int d2 = digits[1];
            int d3 = digits[2];

            int[] arr1 = {d1, d1, d2, d3};
            int[] arr2 = {d1, d2, d2, d3};
            int[] arr3 = {d1, d2, d3, d3};

            generatePermutations(new ArrayList<>(), arr1, new boolean[arr1.length], possiblePasswords);
            generatePermutations(new ArrayList<>(), arr2, new boolean[arr2.length], possiblePasswords);
            generatePermutations(new ArrayList<>(), arr3, new boolean[arr3.length], possiblePasswords);
        } else {
            throw new RuntimeException("number of digits must be 3 or 4");
        }

        return possiblePasswords;
    }

    private static void generatePermutations(List<Integer> currentPassword, int[] digits, boolean[] used, List<List<Integer>> possiblePasswords) {
        if (currentPassword.size() == 4) {
            possiblePasswords.add(new ArrayList<>(currentPassword));
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (!used[i]) {
                used[i] = true;
                currentPassword.add(digits[i]);

                generatePermutations(currentPassword, digits, used, possiblePasswords);

                used[i] = false;
                currentPassword.remove(currentPassword.size() - 1);
            }
        }
    }
}
