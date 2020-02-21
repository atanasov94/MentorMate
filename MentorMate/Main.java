package MentorMate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd number between 2 and 10000 (non-inclusive):");
        int n = Integer.parseInt(scanner.nextLine());

        try {
            LogoBuilder logoBuilder = new LogoBuilder(n);
            logoBuilder.printLogo();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //If at any time in the future the need arises to change the characters, forming the MM logo,
        //the only thing one needs to do is to set the static fields LOGO_EMPTY_SPACE and LOGO_FILLER
        //from the LogoBuilder object to different characters.
    }
}
