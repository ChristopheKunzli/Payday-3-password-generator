import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Case 1 : The password uses 4 digits, all must be used exactly once
        int[] fourDgits = {1, 2, 3, 4};
        List<List<Integer>> possiblePasswordsFourDigits = PasswordGenerator.generatePossiblePasswords(fourDgits);

        //Case 2 : The password uses 3 digits, which means exactly one digit will be used twice
        int[] threeDigits = {4, 5, 6};
        List<List<Integer>> possiblePasswordsThreeDigits = PasswordGenerator.generatePossiblePasswords(threeDigits);


        // Print the possible passwords for both cases
        System.out.println("Possible passwords for four digits:");
        PasswordGenerator.printPasswords(possiblePasswordsFourDigits);

        System.out.println("\nPossible passwords for three digits:");
        PasswordGenerator.printPasswords(possiblePasswordsThreeDigits);
    }


}
