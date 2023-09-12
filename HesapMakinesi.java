import java.util.Scanner;

public class HesapMakinesi {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı gir :" );
        int n1 = input.nextInt();
        System.out.println("İlk sayıyı gir :" );
        int n2 = input.nextInt();
        System.out.println("1.Toplama\n 2:Çıkarma\n 3:Çarpma\n 4:Bölme\n" );
        int select = input.nextInt();
        switch (select) {
            case 1:
                int x=n1+n2;
                System.out.println("Sonuç :"+x);
                break;
            case 2:
                int y=n1-n2;
                System.out.println("Sonuç :"+y);
                break;
            case 3:
                int z=n1*n2;
                System.out.println("Sonuç :"+z);
                break;
            case 4:
                if (n2==0) {
                    System.out.println("sayı 0 a bölünmez");
                }
                else {int t=n1/n2;
                    System.out.println("Sonuç :"+t);
                }
                break;

        }
    }


}
