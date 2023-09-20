import java.util.Scanner;

public class KullaniciGirisi {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        int password = Integer.MIN_VALUE;
        int oldpass = password;
        int newpass;
        int newpass2;
        System.out.print("İlk girişinizi yaptınız o yüzden şifreniz mevcut değil. Sadece tam sayılardan oluşan bir şifre oluşturun\n");
        password = input.nextInt();
        oldpass =password;
        System.out.print("Tebrikler! Şifreniz oluşturuldu.\n Bundan sonraki girişlerde bu şifrenizi kullanın.\n");
        boolean x=true;
        while (x) {
            System.out.println("Hoşgeldiniz \n Lütfen seçim yapın 1-Giriş yap 2- Şifremi unuttum.");
            int Menu_secim = input.nextInt();
            switch (Menu_secim) {
                case 1:
                    System.out.println("Şifrenizi giriniz");
                    newpass = input.nextInt();
                    if(newpass==oldpass){
                        System.out.println("Şifreniz doğru. Giriş yapıyorsunuz...");
                        x=false;
                        }
                    else{
                            boolean subLoop3 = true;
                            while (subLoop3) {
                                System.out.println("Yanlış şifre girdiniz! \n 1. Tekrar dene \n 2. Yeni şifre gir \n 3.Menuye dön");
                                int SubMenu_secim = input.nextInt();
                                switch (SubMenu_secim) {
                                    case 1:
                                        System.out.println("şifrenizi tekrar girin: ");
                                        newpass2 = input.nextInt();
                                        if (newpass2 == password) {
                                            System.out.println("Şifreniz doğru. Giriş yapıyorsunuz");
                                            subLoop3 = false;
                                            x=false;
                                        }
                                        else{
                                        subLoop3=true;
                                        }
                                     break;
                                    case 2:
                                        System.out.println("yeni şifre belirleyiniz: ");
                                        newpass = input.nextInt();
                                        if (newpass == oldpass) {
                                            System.out.println("Yeni şifreniz eskisi ile aynı olamaz!");}
                                        else {
                                            System.out.print("Tebrikler! Şifreniz oluşturuldu.\n Bundan sonraki girişlerde bu şifrenizi kullanın.\n");
                                            password=newpass;
                                            subLoop3=false;
                                        }
                                        break;

                                    case 3:
                                        subLoop3=false;

                                }
                            }
                    }
                    break;
                case 2:
                    boolean subLoop = true;
                    while (subLoop) {
                        System.out.println("yeni şifre belirleyiniz: ");
                        newpass = input.nextInt();
                        if (newpass == oldpass) {
                            System.out.println("Yeni şifreniz eskisi ile aynı olamaz!");}
                        else {
                            System.out.println("şifre tekrar: ");
                            newpass2 = input.nextInt();
                            if (newpass == newpass2) {
                                System.out.println("Şifreniz Oluşturuldu...");
                                password = newpass;
                                oldpass = password;
                                subLoop = false;}
                            else {
                                boolean subLoop2 = true;
                                while (subLoop2) {
                                    System.out.println("Yanlış şifre girdiniz! \n 1. Tekrar dene \n 2. Yeni şifre gir \n 3.Menuye dön");
                                    int SubMenu_secim = input.nextInt();
                                    switch (SubMenu_secim) {
                                        case 1:
                                            System.out.println("şifre tekrar: ");
                                            newpass2 = input.nextInt();
                                            if (newpass == newpass2) {
                                                System.out.println("Şifreniz Oluşturuldu...");
                                                password = newpass;
                                                oldpass = password;
                                                subLoop = false;
                                                subLoop2 = false;}
                                            break;
                                        case 3: // menuye donmek icin
                                            subLoop = false;
                                            subLoop2 = false;
                                            break;
                                        case 2:
                                            subLoop2 = false;
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                default:System.out.println("Seçeneklerden Birini Seçin");  break;
            }
        }
    }

}
/*
 * Hoşgeldiniz..
 * 1.Giriş yap.
 * 2. Şifremi unuttum (yeni şifre).
 *
 * 1-> 1.Şifreniz mevcut değil yeni oluşturun.. yeni şifre
 *     2.şifre -> 1. şifre doğru -> Menu ye dön
 *             -> 2. şifre yanlış -> 1. yeni şifre oluştur
 *                                 -> 2. tekrar dene -> şifre yanlış
 * 2-> yeni şifre -> şifre tekrar -> 1. yanlış -> yeni şifre
 *                                   2. tekrar dene
 * */

