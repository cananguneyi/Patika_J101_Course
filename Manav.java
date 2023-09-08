import java.util.Scanner;

public class Manav {
    public void calistir(){
        System.out.println("Armut kaç kilo? :/n" );
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();

        System.out.println("Elma kaç kilo? :/n" );
        double e = input.nextInt();

        System.out.println("Domates kaç kilo? :/n" );
        double d = input.nextInt();

        System.out.println("Muz kaç kilo? :/n" );
        double m = input.nextInt();

        System.out.println("Patlıcan kaç kilo? :/n" );
        double p = input.nextInt();

        double x= (a*2.14 + e*3.67 + d * 1.11 + m * 0.95 + p * 5);
        System.out.println("Toplam Tutar: " + x +"TL'dir");
    }
}
