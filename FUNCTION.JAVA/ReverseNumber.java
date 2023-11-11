import java.util.Scanner;
public class ReverseNumber{
    static void FindReverse(int num){
        int reverse;
        System.out.print("REVERSE OF GIVEN NUMBER IS : ");
        while(num!=0){
        reverse=num%10;
        num=num/10;
        System.out.print(reverse);
        }
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER :");
        int num=sc.nextInt();
        FindReverse(num);
        sc.close();
    }
}