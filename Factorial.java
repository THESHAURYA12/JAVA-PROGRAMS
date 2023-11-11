import java.util.Scanner;
public class Factorial {
  public static void main(String [] args){
    Scanner sc= new Scanner (System.in);
    System.out.print("ENTER NUMBER : ");
    int fact=1;
    int num =sc.nextInt();
    System.out.print("FECTIRIAL IS : ");
    while(num!=0){
        fact=fact*(num);
            num--;       
      }
      System.out.print(fact+" ");
      sc.close();
    }
  }