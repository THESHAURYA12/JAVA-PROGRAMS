import java.util.Scanner;
   public class Rombuspattern{ 
    public static void main(String [] args){
        System.out.println("ENTER ANY NUMBER : ");
        Scanner sc=new Scanner(System.in);
        int i,j,k,n;
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print(" " );
            }
            for(k=0;k<n;k++){
                System.out.print("*" );
            }
          System.out.println( );
        }
        sc.close();
    }
    }
        