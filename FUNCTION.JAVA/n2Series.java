import java.util.Scanner;
public class n2Series{
    static void findSum(int num){
        int series,i,sum=0;
        for(i=1;i<=num;i++){
            series=i;
            series=(10*series)+2;
            sum+=series;
        }
        //12+22+32+42+52+62+72+.........+n2
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