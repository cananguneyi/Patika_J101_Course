import java.util.Scanner;
/*
* Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart */
public class BurcBul {
    public void calistir(){
        Scanner input = new Scanner(System.in);
        int month,day;
        String burc="";
        boolean isError= false;
        boolean x=true;
        while(x) {
            System.out.println("Kaçıncı Ay da doğdun?");
            month = input.nextInt();
            System.out.println("Kaçıncı Gün da doğdun?");
            day = input.nextInt();


            if (month == 1) {
                if (1 <= day && day <= 28) {
                    if (day <= 21) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 2) {
                if (1 <= day && day <= 31) {
                    if (day <= 19) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 3) {
                if (1 <= day && day <= 31) {
                    if (day <= 20) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 4) {
                if (1 <= day && day <= 30) {
                    if (day <= 20) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 5) {
                if (1 <= day && day <= 31) {
                    if (day <= 21) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 6) {
                if (1 <= day && day <= 30) {
                    if (day <= 22) {
                        burc = "ikizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 7) {
                if (1 <= day && day <= 31) { //temmuz
                    if (day <= 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 8) {
                if (1 <= day && day <= 31) { //ağustos
                    if (day <= 22) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 9) {
                if (1 <= day && day <= 30) { //eylül
                    if (day <= 22) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 10) {
                if (1 <= day && day <= 31) { //ekim
                    if (day <= 21) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 11) {
                if (1 <= day && day <= 30) { //kasım
                    if (day <= 21) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 12) {
                if (1 <= day && day <= 31) { //aralık
                    if (day <= 21) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
            if (month <= 0 || 12 <= month || day <= 0 || day > 31) {
                isError = true;
            }


            if (isError) {
                System.out.println("Hatalı Giriş Yaptın");
                x=false;

            } else {
                System.out.println("Burcunuz: " + burc);
            }
        }
     }
    }

