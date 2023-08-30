import java.util.Scanner;

public class KDV {

    public void calistir() {

            float fiyat, kdv,toplam;

            Scanner inp=new Scanner(System.in);

            System.out.print("fiyat değerinizi girin");
            fiyat=inp.nextInt();
            if(fiyat>0 && fiyat<1000){
                kdv=fiyat*((float) 18 /100);
                toplam = fiyat+kdv;
                System.out.println("KDVli fiyat: "+toplam);
                System.out.println("KDV tutarı: "+kdv);

            }
            else if (fiyat>=1000){
                kdv=fiyat*((float) 8 /100);
                toplam = fiyat+kdv;
                System.out.println("KDVli fiyat: "+toplam);
                System.out.println("KDV tutarı: "+kdv);

            }


        }

    }


