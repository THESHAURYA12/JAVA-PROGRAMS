import java.util.Scanner;
public class Fibonacci {
  public static void main(String [] args){
    Scanner sc= new Scanner (System.in);
    int n1=0;
    int n2=1;
    int next=0;
    System.out.print("ENTER RANGE : ");
    int num =sc.nextInt();
   System.out.print("FIBONACCI SERIES : ");
   if(num==1){
   	System.out.print(0);
   }
   else if(num==2){
      System.out.print(0+" "+1);
   }
   else{
     while(num!=0){
        System.out.print(+n1+" ");
            next=n1+n2;
            n1=n2;
            n2=next;
      num--;       
      }
   }
      sc.close();
    }
  }