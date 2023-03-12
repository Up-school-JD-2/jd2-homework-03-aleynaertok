
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kelime;
        String ters = "" ;
        Scanner kelimeler = new Scanner (System.in);
        System.out.println("Kelime giriniz: " );
        kelime=kelimeler.next();

        System.out.println("Ters çevrilecek kelime : " + kelime);

        for (int i = kelime.length() - 1; i >= 0; i--){
            ters = ters + kelime.charAt(i);
        }
        System.out.println("Ters çevrilmiş hali : "+ ters);
        if (kelime.equals(ters))
            System.out.println("Kelime palindrom.");
        else
            System.out.println("Kelime palindrom değil.");
    }
}