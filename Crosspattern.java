import java.util.Scanner;
   public class Crosspattern{ 
    public static void main(String [] args){
        System.out.println("ENTER ANY NUMBER : ");
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<n;j++){
                if(i==n/2 || j==n/2){
                System.out.print("+" );
                }
                else{
                    System.out.print(" ");
                }
            }
          System.out.println( );
        }
        sc.close();
    }
    }
        