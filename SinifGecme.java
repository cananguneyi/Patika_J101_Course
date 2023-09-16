import java.util.Scanner;

public class SinifGecme {
    public void calistir() {
    int mat, turkce, fzk,kmy,mzk, dersSayisi=5;
    Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu girin");
        mat=input.nextInt();
        if(mat<0 || mat>100 ){
            mat=0;
            dersSayisi--;
        }

        System.out.println("Türkçe notunuzu girin");
        turkce=input.nextInt();
        if(turkce<0 || turkce>100 ){
            turkce=0;
            dersSayisi--;
        }
        System.out.println("Fizik notunuzu girin");
        fzk=input.nextInt();
        if(fzk<0 || fzk>100 ){
            fzk=0;
            dersSayisi--;
        }
        System.out.println("Müzik notunuzu girin");
        mzk=input.nextInt();
        if(mzk<0 || mzk>100 ){
            mzk=0;
            dersSayisi--;
        }
        System.out.println("Kimya notunuzu girin");
        kmy=input.nextInt();
        if(kmy<0 || kmy>100 ){
            kmy=0;
            dersSayisi--;
        }
        double avarage;
        if(dersSayisi!=0){
            avarage= (double) (mat + turkce + kmy + mzk+ fzk) /dersSayisi;
        }else  {
            avarage=0;
        }

        if(avarage>55){
            System.out.println("Tebrikler sınıfı geçtiniz");
        }
        else{
            System.out.println("Sınıfta kaldınız");
        }
        System.out.println("Ortalamanız: "+avarage);

}}
