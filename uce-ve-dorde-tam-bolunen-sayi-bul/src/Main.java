import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n, toplam = 0, BölünenAdet = 0;
        System.out.print("Bu uygulama kullanıcı tarafından girilen\n" +
                "Tam sayının 3'e ve 4'e tam bölünme durumunu kontrol eder.\n" +
                "Bir tamsayı giriniz: ");
        n = inp.nextInt();

        for (int i = 0; i <= n; i++) {

            if (i % 3 == 0 || i % 4 == 0) {

                toplam += i;
                BölünenAdet++;
                System.out.println("3'e ve 4'e tam bölünebilen sayılar : " + i);

            }

        }
        System.out.println("Sayıların toplamı : " + toplam  );
        System.out.println("Toplam bölünen sayısı : " + BölünenAdet );
        System.out.println("Aritmatik ortalaması : " + toplam/BölünenAdet );


    }
}