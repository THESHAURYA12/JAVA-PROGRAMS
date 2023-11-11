import java.util.Scanner;
public class SquareRootFun{
    static int findSquareRoot(int num){
        int root;
        root=num*num;
        return root;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY DIGIT :");
        int num=sc.nextInt();
        System.out.print("SQUARE ROOT OF GIVEN NUMBER IS :"+findSquareRoot(num));
        sc.close();
    }
}