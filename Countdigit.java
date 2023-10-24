import java.util.Scanner;
public class Countdigit{
    public static void main(String [] args){
        System.out.println("ENTER THE DIGIT : ");
        Scanner sc=new Scanner(System.in);
        int digit,count=0;
        digit=sc.nextInt();
        while(digit>0){
            digit=digit/10;
            count=count+1;
        }
        System.out.println("THE COUNT OF THIS NUMBER IS : "+count);
        sc.close(); 
    }
}