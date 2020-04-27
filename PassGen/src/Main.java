/**
 * This program generates passwords.
 * Created by https://github.com/cr0k0Hub
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Symbols to be used.
        String symbols = "!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        Scanner in = new Scanner(System.in);
        //The choice of the number of passwords and their length.
        System.out.print("Input a number of passwords: ");
        int numberOfPasswords = in.nextInt();;
        System.out.print("Input a length of password: ");
        int passwordLen = in.nextInt();

        Random r = new Random();
        for(int n = 0; n < numberOfPasswords; n++) {
            String password = "";
            for(int i = 0; i < passwordLen; i++) {
                // Generate random number and get symbol by this number.
                int rand = r.nextInt(symbols.length());
                password += symbols.charAt(rand);
            }

            // Print password
            System.out.println(password);
        }
    }
}
