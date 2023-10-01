import java.util.Scanner;

public class UcakBileti {
    public void calistir() {
        Scanner input = new Scanner(System.in);
        int yas,tip;
        double yasindirimi, indirimorani,normaltutar,indirimlitutar,gidisdonusindirimi, total,mesafe;
        System.out.println("Mesafe km cinsinden girin: ");
        mesafe= input.nextInt();

        System.out.println("Yaşınızı girin: ");
        yas = input.nextInt();

         if(yas<12){
            indirimorani=0.50;
        }
        else if(yas>=12 && yas<=24){
            indirimorani=0.10;
        }
        else if(yas>65){
            indirimorani=0.30;
        }
        else{
            indirimorani=0;
        }
        System.out.println("Yolculuk tipinizi seçin: \n" +
                "1-Tek yÖn  \n"+
                "2-Gidiş-Dönüş :");
        tip = input.nextInt();
        if(yas<=0||mesafe<=0 || (tip!=1 && tip!=2)){
            System.out.println("Hatalı Veri Girdiniz ! ");
            return;
        }
        switch (tip) {
            case 1:
                normaltutar= mesafe*0.10;
                yasindirimi=normaltutar * indirimorani;
                normaltutar= mesafe*0.10;
                indirimlitutar=normaltutar-yasindirimi;
                gidisdonusindirimi=0;
                total=indirimlitutar-gidisdonusindirimi;
                System.out.println("Toplam Tutar: "+total);

                break;
            case 2:
                normaltutar= mesafe*0.10;
                yasindirimi=normaltutar * indirimorani;
                indirimlitutar=normaltutar-yasindirimi;
                gidisdonusindirimi=indirimlitutar * 0.20;
                total=(indirimlitutar-gidisdonusindirimi)*2;
                System.out.println("Toplam Tutar: "+total);

                break;

            default:System.out.println("Seçeneklerden Birini Seçin");  break;
        }






    }
}
