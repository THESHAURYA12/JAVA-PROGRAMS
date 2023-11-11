import java.util.Scanner;
public class Primefun{
    static void PrimeNum(int num){
        int flag=0;
           for(int i=2;i<=num/2;i++){
                if(num%i==0 ){
                     flag=1;
                     break;
                    }
                }
            if(flag==1){
                System.out.print("NUMBER IS NOT PRIME : "+num);
            }
            else{
                System.out.print("NUMBER IS PRIME : "+num);
            }
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER :");
        int num=sc.nextInt();
        PrimeNum(num);
        sc.close();
    }
}