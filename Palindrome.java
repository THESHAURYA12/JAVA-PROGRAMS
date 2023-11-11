import java.util.Scanner;
public class Palindrome {
  public static void main(String [] args){
    Scanner sc= new Scanner (System.in);
    System.out.print("ENTER NUMBER : ");
    int num =sc.nextInt();
    int result=0;
    int copy=num;
    while(num>0){
      int   digit=num%10;
      result=result*10+digit;
        num=num/10;
    }
        if(result==copy){
        	System.out.print("YES, IT'S PALINDROME :"+result);
      }
     else{
     	System.out.print("NO, IT'S PALINDROME :"+result);
     }
      sc.close();
  }
  }