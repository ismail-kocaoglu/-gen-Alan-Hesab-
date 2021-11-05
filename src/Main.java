import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a,b,c;
        double u,alan;

        Scanner giris = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz: ");
        a=giris.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b=giris.nextInt();
        System.out.print("Üçüncü kenarı giriniz: ");
        c=giris.nextInt();
        u=(a+b+c)/2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin alanı: "+alan);





    }
}
