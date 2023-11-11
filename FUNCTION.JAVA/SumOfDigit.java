import java.util.Scanner;
public class SumOfDigit{
    static void findSum(int num){
        int sum=0,flag=0,store;
        while(num>0){ 
        store=num%10;
        sum=sum+store;     
        num=num/10;
    }
    System.out.print("SUM OF DIGIT IS : "+sum);
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER :");
        int num=sc.nextInt();
        findSum(num);
        sc.close();
    }
}