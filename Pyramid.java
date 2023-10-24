import java.util.Scanner;
public class Pyramid{
    public static void main(String [] args){
    System.out.println("ENTER THE ROWS");
    Scanner sc=new Scanner(System.in);
    int i,j,n,k;
    n=sc.nextInt();
    for(i=1;i<=n;i++){
		for(k=n;k>=i;k--){
			System.out.print(" ");
		}
		for(j=1;j<=i;j++){
			System.out.print("* ");
		}
		System.out.println(); 
	}
    sc.close();
    }
}