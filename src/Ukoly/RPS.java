package Ukoly;

import java.lang.Math;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Čau šéfe, Vítej ve hře kámen nůžky papír.");
        System.out.println("Vyber co dáš - Kámen 0 - Nůžky 1 - Papír 2");

        int oScore = 0;
        int mScore = 0;

        while (true) {
            int mMove = Integer.parseInt(sc.nextLine());
            if (mMove < 3) {
                System.out.println(mMove);
            } else {
                System.out.println("Zadal jsi možnost, která není navýběr!");
                System.exit(0);
            }

            int oMove = (int) (Math.random() * 3);
            switch (oMove) {
                case 0 -> System.out.println("On má kámen!");
                case 1 -> System.out.println("On má nůžky!");
                case 2 -> System.out.println("On má papír!");
            }

            if (oMove == mMove) {
                System.out.println("Dali jste remízu!");
            } else if (oMove == 0 && mMove == 1 || oMove == 1 && mMove == 2 || oMove == 2 && mMove == 0) {
                System.out.println("Prohrál jsi!");
                oScore++;
            } else if (oMove == 1 && mMove == 0 || oMove == 0 && mMove == 2 || oMove == 2 && mMove == 1) {
                System.out.println("Vyhrál jsi!");
                mScore++;
            }

            if (mScore == 3) {
                System.out.println("Vyhrál jsi celý souboj v kámen nůžky papír!");
                System.out.println("Souboj skončil : " + mScore + " " + oScore);
                break;
            }
            if (oScore == 3) {
                System.out.println("Prohrál jsi celý souboj v kámen nůžky papír!");
                System.out.println("Souboj skončil : " + mScore + " " + oScore);
                break;
            } else {
                System.out.println("Skóre je : " + mScore + " " + oScore);
            }
        }
    }
}
