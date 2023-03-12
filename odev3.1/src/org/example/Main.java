package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomSayi, girilenSayi,kullaniciSayisi;
        int sayac = 0;
        boolean exit = true;
        Random r = new Random();
        randomSayi = r.nextInt(101);
        System.out.println(randomSayi);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Oyunu kaç kişi oynayacak ? Lütfen giriniz");
        kullaniciSayisi = scanner1.nextInt();
        int skorTablosu[] = new int[kullaniciSayisi];

        for(int i = 0 ; i < kullaniciSayisi ; i++) {

            System.out.println("Oyun sırası " + (i+1) + ". oyuncuda");

            while (exit) {
                System.out.print("1 ile 100 arasında bir sayı giriniz : ");
                girilenSayi = scanner.nextInt();

                if (girilenSayi > 100 || girilenSayi < 1) {
                    System.out.println("Girilen sayı 1 ile 100 arasında olmalıdır.");
                } else if (girilenSayi > randomSayi) {
                    System.out.println("Too high, try again");
                    sayac++;

                } else if (girilenSayi < randomSayi) {
                    System.out.println("Too low, try again");
                    sayac++;
                } else {
                    sayac++;
                    System.out.println("Correct ! you found correct number on ur " + sayac + ". step ");

                    skorTablosu[i] = sayac;
                    exit = false;
                }


            }
            exit = true;
            sayac = 0;
        }

        for (int i = 0; i < skorTablosu.length; i++) {

            System.out.println((i+1) + ". oyuncunun skoru = " + skorTablosu[i]);
        }

    }
}