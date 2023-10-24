import java.util.Scanner;
public class Primenumber{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n,i,flag=0;
        System.out.print("ENTER THE DIGIT : ");
        n=sc.nextInt();
        while(n>1){
        for(i=2;i<=n/2;i++){
            if(n%i==0 ){
               flag=1;
               break;
            }
        }
        if(flag==1){
            System.out.print("NUMBER IS NOT PRIME : "+n);
        }
        else{
            System.out.print("NUMBER IS PRIME : "+n);
        }
        }
        sc.close();
    }
}

