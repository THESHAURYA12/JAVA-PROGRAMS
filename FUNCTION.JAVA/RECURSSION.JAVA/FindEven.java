import java.util.Scanner;
public class FindEven{
    static void printEven(int num){
        if(num==0){
            return;
        }
        
         printEven(num-1);
         if(num%2==0){
        System.out.println("EVEN IS :"+num);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER RANGE :");
        int num=sc.nextInt();
        printEven(num);
        sc.close();
    }
}