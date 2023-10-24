import java.util.Scanner;
   public class Squrepattern{ 
    public static void main(String [] args){
        System.out.println("ENTER THE NUMBER : ");
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("*" );
            }
          System.out.println( );
        }
        sc.close();
    }
    }
        