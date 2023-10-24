import java.util.Scanner;
   public class Tringle2{ 
    public static void main(String [] args){
        System.out.println("ENTER ANY NUMBER : ");
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=n;i>0;i--){
            for(j=0;j<i;j++){
                System.out.print("*" );
            }
          System.out.println( );
        }
        sc.close();
    }
    }
        