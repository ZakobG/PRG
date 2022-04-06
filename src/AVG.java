import java.util.Scanner;

public class AVG {
    public static void main(String[] args) {
        System.out.println("Prosím zadejte počet čísel, které budete zadávat.");
        Scanner scan = new Scanner(System.in);
        int cisla = scan.nextInt();
        double[] arr = new double[cisla];
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Zadej čislo " + (i + 1) + ":");
            arr[i] = (int) scan.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        double average = total / arr.length;

        System.out.println("Everydž je: " + average);
    }
}