package MethotOlusturma;

import java.util.Scanner;

public class C04_HazırMethot {
    public static void main(String[] args) {
        System.out.println("Bir numara giriniz");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;

        }
        System.out.println("Pozitif bölen sayısı:  " + count);
    }
}




