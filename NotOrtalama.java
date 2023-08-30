import java.util.Scanner;

    public class NotOrtalama {
        public void run () {

                int  mat, fzk, kmy, trk,trh, mzk;
                String durum;


                Scanner inp=new Scanner(System.in);

                System.out.print("mat notun:");
                mat=inp.nextInt();

                System.out.print("fzk notun:");
                fzk=inp.nextInt();

                System.out.print("kmy notun:");
                kmy=inp.nextInt();

                System.out.print("trk notun:");
                trk=inp.nextInt();

                System.out.print("trh notun:");
                trh=inp.nextInt();

                System.out.print("mzk notun:");
                mzk=inp.nextInt();

                int toplam= (mat+fzk+kmy+trk+trh+mzk);
                double sonuc= toplam/6.0;
                System.out.println("ortalaman:"+sonuc);

                durum = (sonuc>=60)? "Sinifi Gecti" : "Sinifta Kaldi";
                System.out.println(durum);


            }
        }



