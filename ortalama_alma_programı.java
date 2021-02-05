import.java.util.Scanner;

public class IkiSayininOrtalamasi {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Girin: ");         
        int sayi1 = reader.nextInt();
        // 1. Sayı Girişi 

        System.out.print("İkinci Sayıyı Girin: ");   
        int sayi2 = reader.nextInt();
        // 2.Sayı Girişi

        System.out.println("----------------------------- ");

        int toplam = sayi1 + sayi2;
        int ortalama = toplam / 2;

        System.out.println("Sayıların Ortalaması: " + ortalama);
        // Sonuç
    }
    
}

