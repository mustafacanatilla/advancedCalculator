import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("İşlemin Sonucu : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("İşlemin Sonucu : " + result);
        return result;
    }

    static double divied(double a, double b) {
        if (b == 0) {
            System.out.println("İkinci Sayı 0'dan Farklı Olmalıdır!");
            return 0;
        }


        double result = a / b;
        System.out.println("Bölme İşleminin Sonucu : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + (a * b));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1-Toplama İşlemi\n"
                + "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                + "4-Bölme İşlemi\n"
                + "5-Üslü Sayı Hesaplama İşlemi\n"
                + "6-Mod Alma İşlemi\n"
                + "7-Dikdörtgen Alan ve Çevre Hesaplama İşlemi\n"
                + "0-Çıkış Yap\n";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz : ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("1. Sayıyı Giriniz : ");
            int a = scan.nextInt();
            System.out.print("2. Sayıyı Giriniz :");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divied(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi : " + mod(a, b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz!");
            }
        }
        System.out.println("Tekrar Görüşmek Üzere Hoşçakalın.");


    }
}