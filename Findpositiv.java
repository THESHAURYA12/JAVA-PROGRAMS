import java.util.Scanner;
class Findpositiv {
    public static void main(String args[]){
        System.out.print("ENTER ANY NUMBER : ");
        Scanner sc = new Scanner (System.in);
        float number = sc.nextFloat();
        if (number > 0 ){
            System.out.println(number+" : IS A POSITIVE NUMBER");
        }
        else if (number == 0){
            System.out.println(number+" : IS NOT A POSITIVE NUMBER");

        }
        else{
            System.out.println(number+" : IS A NEGETIVE NUMBER");
        }
        sc.close();
    }
    
}
