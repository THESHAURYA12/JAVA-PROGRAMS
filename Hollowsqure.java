import java.util.Scanner;
   public class Hollowsqure{ 
    public static void main(String [] args){
        System.out.println("ENTER ANY NUMBER : ");
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i== 1|| i==n || j==1 || j==n)
                {
                System.out.print("*" );
                }
                else{
                System.out.print(" " );
                }
            }
          System.out.println( );
        }
        sc.close();
    }
    }