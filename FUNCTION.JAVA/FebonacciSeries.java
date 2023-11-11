import java.util.Scanner;
public class FebonacciSeries{
    static void FindFebo(int num){
        int first=0,second=1;
        int next;
            while(num>2)
            {
                next=first+second;
                first=second;
                second=next;
                System.out.print(next+" ");
                num--;
            }
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER :");
        int num=sc.nextInt();
        int first=0,second=1;
        System.out.print("FEBONACCIE SERIES IS : "+first+" "+second+" ");
        FindFebo(num);
        sc.close();
    }
}