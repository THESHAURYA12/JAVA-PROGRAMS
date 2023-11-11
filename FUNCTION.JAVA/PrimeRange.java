import java.util.Scanner;
public class PrimeRange{
    static void PrimeRange(int low,int high){
        int i,j;
                        System.out.print("PRIME RANGE IS :");
        for( i=low;i<=high;i++){
           for( j=2;j<=i;j++){
                if(i%j==0 ){
                     break;
                    }
                }
            if(i==j){
                System.out.print(j+" ");
            }
        }  
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER LOWER AND HIGHER RANGE :");
           int low=sc.nextInt();
           int high=sc.nextInt();
        PrimeRange(low,high);
        sc.close();
    }
}