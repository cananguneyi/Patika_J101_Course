import java.util.Scanner;

public class GelismisHesapMakinesi {

    private int plus(int x, int y) {
        return x + y;
    }

    private int minus(int x, int y) {
        return x - y;
    }


    private int times(int x, int y) {
        return x * y;
    }

    private int divided(int x, int y) {
        if (y == 0) {
            System.out.println("brocan yanlış yapıyorsun, YAPMA! o yüzden ben 0 yaptırmam!");
            y = y + 1;
            return 0;
        }
        return x / y;
    }

    private int power(int x, int y) {
        return x ^ y;
    }

    private int factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }

    private int mod(int num1, int num2) {

        return (num1 % num2);
    }

    private int dikdorgenalan(int num1, int num2) {

        return (num1 * num2);
    }

    public void run() {

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        int select=0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();

            switch (select) {
                case 1:
                    int a,b,result;
                    System.out.println("Toplama için iki sayı giriniz :");
                    a=input.nextInt();
                    b=input.nextInt();
                    result = plus(a,b);
                    System.out.println("Sonuç :"+result);
                    break;
                case 2:
                    System.out.println("Çıkarma için iki sayı giriniz :");
                    a=input.nextInt();
                    b=input.nextInt();
                    result = minus(a,b);
                    System.out.println("Sonuç :"+result);
                    break;
                case 3:
                    System.out.println("Çarpma için iki sayı giriniz :");
                    a=input.nextInt();
                    b=input.nextInt();
                    result = times(a,b);
                    System.out.println("Sonuç :"+result);
                    break;
                case 4:
                    System.out.println("Bölme için iki sayı giriniz :");
                    a=input.nextInt();
                    b=input.nextInt();
                    result = divided(a,b);
                    if(b!=0){
                        System.out.println("Sonuç :"+result);                    }
                    else return;
                    break;
                case 5:
                    System.out.println("Üs almak için iki sayı giriniz :");
                    a=input.nextInt();
                    b=input.nextInt();
                    result = power(a,b);
                    System.out.println("Sonuç :"+result);
                    break;
                case 6:
                    System.out.println("Faktöriyel için sayı giriniz :");
                    a=input.nextInt();
                    result = factorial(a);
                    System.out.println("Sonuç :"+result);
                    break;
                case 7:
                    System.out.println("Mod için iki sayı giriniz :");
                    a=input.nextInt();
                    b=input.nextInt();
                    result = mod(a,b);
                    System.out.println("Sonuç :"+result);
                    break;
                case 8:
                    System.out.println("Dikdörgen alanı için iki kenarı giriniz :");
                    a=input.nextInt();
                    b=input.nextInt();
                    result = dikdorgenalan(a,b);
                    System.out.println("Sonuç :"+result);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
        while (select != 0);

    }
}
