import java.util.Scanner;
public class SumOfNaturalNo{
    static void findSum(int num){
        int i,sum=0;
         for(i=1;i<=num;i++){
            sum+=i;
        }
        //1+2+3+4+5+6+7+.........+n
        System.out.print("SUM OF "+num+" NATURAL NUMBER :"+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER :");
        int num=sc.nextInt();
        findSum(num);
        sc.close();
    }
}