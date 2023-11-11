import java.util.Scanner;
public class PositivOrNegative{
    static void FindNum(int num){
            if(num>0){
                System.out.print("ENTERED NUMBER "+num+ " IS POSITIV");
            }
            else if(num==0){
                System.out.print("ENTERED NUMBER "+num+" IS NEITHER POSITIVE NOR NEGATIVE ");
            }
            else{
                System.out.print("ENTERED NUMBER "+num+ " IS NEGATIVE");
            }
    }    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER :");
        int num=sc.nextInt();
        FindNum(num);
        sc.close();
    }
}