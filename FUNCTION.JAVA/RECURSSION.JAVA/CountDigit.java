import java.util.Scanner;
public class CountDigit{
    static void countDigit(int num,int count){
        if(num==0){
            System.out.print("NUMBER OF DIGIT IS : "+count);
            return;
        }
        
         countDigit((num/10),count=count+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY DIGIT :");
        int num=sc.nextInt();
        countDigit(num,0);
        sc.close();
    }
}