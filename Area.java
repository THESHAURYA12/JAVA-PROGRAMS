import java.util.Scanner;
class Area{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER LENGTH  : ");
        int len = sc.nextInt();
        System.out.print("ENTER WIDTH  : ");
        int wid = sc.nextInt();
        int area = len*wid;
        System.out.println("AREA OF RECTANGLE : " +area);
    }
}