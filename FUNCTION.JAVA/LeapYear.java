import java.util.Scanner;
public class LeapYear{
    static void FindLeap(int num){
            if(num%4==0 || num%400==0){
                System.out.print("YES, "+num+ " IS A LEAP YEAR");
            }
            else{
                System.out.print("NO, "+num+ " IS N0T A LEAP YEAR");
            }
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY YEAR :");
        int num=sc.nextInt();
        FindLeap(num);
        sc.close();
    }
}