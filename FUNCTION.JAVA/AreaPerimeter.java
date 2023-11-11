import java.util.Scanner;
public class AreaPerimeter{
    static void AreaPerimeter(int length,int width){
        int area=length*width;
        System.out.println("AREA OF RECTANGLE IS :"+area);
        int perimeter=2*(length+width);
        System.out.println("PERIMETER OF RECTANGLE IS :"+perimeter);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF RECTANGLE :");
        int length=sc.nextInt();
        System.out.print("ENTER THE WIDTH OF RECTANGLE :");
        int width=sc.nextInt();
        AreaPerimeter(length,width);
        sc.close();
    }
}