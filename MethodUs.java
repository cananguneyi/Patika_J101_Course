public class MethodUs {


    public void run () {
        System.out.println("Sonuç: "+power(3,5));
    }

    public int power(int base, int exp){
        int result = base;
        if(exp==0){
            return 1;
        }
        if(exp==1){
            return result;
        }
        return result * power(base,exp-1);
    }
}

