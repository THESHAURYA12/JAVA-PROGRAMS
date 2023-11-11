import java.util.Scanner;
public class TriangleType{
    static void FindType(int side1,int side2,int side3){
            if(side1==side2 && side2==side3)
            {
                System.out.print("TRIANGLE IS EQUILATERAL");
            }
            else if(side1==side2 || side2==side3 || side1==side3)
            {
                System.out.print("TRIANGLE IS ISOSCELES");
            }
            else{
                System.out.print("TRIANGLE IS SCALENE");
            }
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TRIANGLE SIDES :");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        FindType(side1,side2,side3);
        sc.close();
    }
}