import java.util.Scanner;
public class EvenOddRange{
    static void even(int low,int high)
    {
        System.out.println("EVEN NUMBER :");
        for(int i=low;i<=high;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    static void odd(int low,int high)
    {
        System.out.println("ODD NUMBER :");
        for(int i=low;i<=high;i++)
       {
            if(i%2!=0)
            {
                  System.out.print(i+" ");
            }
        }
    }       
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER LOW AND HIGH NUMBER :");
    int low=sc.nextInt();
    int high=sc.nextInt();
    even(low,high);
    odd(low,high);
    sc.close();
    }
}