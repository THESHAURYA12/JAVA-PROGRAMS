import java.util.Scanner;
public class Factorial{
    static void FindFact(int num){
        int fact=1;
            while(num>0)
            {
                fact=fact*num;
                num--;
            }
            System.out.print(fact);
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER :");
        int num=sc.nextInt();
        System.out.print("FACTORIAL IS : ");
        FindFact(num);
        sc.close();
    }
}