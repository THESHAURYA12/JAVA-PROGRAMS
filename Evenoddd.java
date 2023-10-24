import java.util.Scanner;
public class Evenoddd{
    public static void main(String [] args){
      System.out.println("enter the range");
      Scanner sc= new Scanner(System.in);
      int l,j;
      l=sc.nextInt();
      j=sc.nextInt();
      System.out.println(" EVEN RANGE IS :");
      for(int i=l;i<=j;i++){
        if(i%2==0){
          System.out.println(i+" ");
        }
      }
      System.out.println();
      System.out.println("odd ");
      for(int i=l;i<=j;i++){
       if(i%2!=0){
          System.out.println(i+" ");
        } 
      }
      sc.close();
    }
}