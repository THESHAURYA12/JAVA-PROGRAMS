import java.util.Scanner;
public class Sumofdigit{
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE DIGITE : ");
        int a,b,sum=0;
        a=sc.nextInt();
        while(a>0)
        {
             
             b=a%10;  //fint last number 
             sum=sum+b;
             a=a/10;   //remove  last number
        }
        System.out.println("SUM OF DIGIT IS : "+sum);
        sc.close();
        
     }
}