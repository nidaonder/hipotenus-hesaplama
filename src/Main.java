import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int taban, yukseklik ;
        double hipotenus, alan ;
        Scanner giris = new Scanner(System.in) ;

        System.out.print(" Üçgenin dik kenarının uzunluğunu giriniz. : ");
        yukseklik = giris.nextInt();
        System.out.print(" Üçgenin taban uzunluğunu giriniz. : ");
        taban = giris.nextInt();

        hipotenus = Math.sqrt((taban * taban) + (yukseklik * yukseklik)) ;
        System.out.println(" Hipotenüs = " + hipotenus);

        alan = (taban * yukseklik) / 2 ;
        System.out.print(" Üçgenin alanı = " + alan);

    }
}
