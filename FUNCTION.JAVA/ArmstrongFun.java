import java.util.Scanner;
public class ArmstrongFun{
        static int length(int Temp){
            int count=0;
            while(Temp!=0){
                count++;
                Temp=Temp/10;
            }
            return count;
       }
       static int power(int base,int exp){
            int power=1;
            for(int i=1;i<=exp;i++){
                power=power*base;
                }
                return power;
        }
        static int isarmstrong(int num){
            int temp=num;
            int arm=0;
            int count=length(num);
            while(temp!=0){
                int store=temp%10;
                arm+=power(store,count);
                temp=temp/10;
            }
            return arm;
        }
    public static void main (String[] args){
    System.out.print("ENTER ANY NUMBER :");
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int arm = isarmstrong(num);
    if(num==arm){
        System.out.println("NUMBER IS ARMSTONG : "+num);
    }
    else{
        System.out.println("NUMBER IS NOT ARMSTONG : "+num);
    }
        sc.close();
    }
}