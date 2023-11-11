import java.util.Scanner;
public class SqurePattern{
    static void printStarRow(int starCount){
        if(starCount==0){
            return;
        }
        System.out.print("*");
        printStarRow(starCount-1);
    }
    static void printPattern(int row,int col){
        if(row==0){
            return;
        }
        printStarRow(col);
        System.out.println();
        printPattern(row-1,col);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ROW AND COLUMN :");
        int row=sc.nextInt();
        int col=sc.nextInt();
        printPattern(row,col);
        sc.close();
    }
}