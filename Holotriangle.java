import java.util.Scanner;
   public class Holotriangle{ 
    public static void main(String [] args){
        System.out.println("ENTER ANY NUMBER : ");
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<=i;j++){
                if(i==n || j==i || j==0){
                System.out.print("*" );
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
        