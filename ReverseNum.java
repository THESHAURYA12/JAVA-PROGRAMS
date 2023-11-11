import java.util.Scanner;
public class ReverseNum {
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
     System.out.print("REVERSE :"+result);
      sc.close();
  }
  }