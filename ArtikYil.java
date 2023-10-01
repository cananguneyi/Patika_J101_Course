import java.util.Scanner;

public class ArtikYil {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        int tarih;
        System.out.print("yılı girin :");
        tarih = input.nextInt();
        if((tarih%4==0) && (tarih%100!=0) ) {
            System.out.print(+tarih+ " artık bir yıldır");
        }
        else if(tarih%100==0) {
            if(tarih%400==0){System.out.print(+tarih+ " artık bir yıldır");}
            else System.out.print(+tarih+ " artık bir yıldır");
        }
        else System.out.print(+tarih+ " artık bir yıl değildir");
    }}

/*
*  daha güzel ifadeli hali:  if((tarih%4==0) && ((tarih%100!=0) || (tarih%400==0) ) ) {
            System.out.print(+tarih+ " artık bir yıldır");
        }
        else System.out.print(+tarih+ " artık bir yıl değildir");
        }*/