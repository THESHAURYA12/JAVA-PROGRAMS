import java.util.Scanner;
public class TrianglePattern{
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
        int col1=(col-(row-1));
        printStarRow(col1);
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