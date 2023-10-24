import java.util.Scanner;
public class CalculatorFun{
   static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER FIRTS NUMBER : ");
         int a =sc.nextInt();
         System.out.print(" ENTER SECOND NUMBER : ");
         int b =sc.nextInt();
         int c=a+b;
         System.out.print(" ADDITION IS : "+c);
    }
    static void sub(){
         Scanner sc = new Scanner(System.in);
         System.out.print(" ENTER FIRTS NUMBER :  ");
         int a =sc.nextInt();
         System.out.print(" ENTER SECOND NUMBER : ");
         int b =sc.nextInt();
         int c=a-b;
         System.out.print(" SUBTRACTIN IS : "+c);
    }
    static void mul(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER FIRTS NUMBER :  ");
         int a =sc.nextInt();
        System.out.print(" ENTER SECOND NUMBER : ");
         int b =sc.nextInt();
         int c=a*b;
         System.out.print(" MULTIPLICATION IS : "+c);
    }
    static void div(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER FIRTS NUMBER :  ");
         int a =sc.nextInt();
        System.out.print(" ENTER SECOND NUMBER : ");
         int b =sc.nextInt(); 
         int c=a/b;
         System.out.print(" DIVISION IS  : "+c);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println(" THIS IS CALCULATOR ");
        System.out.println(" OPERATIONS ");
        System.out.println(" PRESS 1 ADD ");
        System.out.println(" PRESS 2 SUB ");
        System.out.println(" PRESS 3 MUL ");
        System.out.println(" PRESS 4 DIV ");
        System.out.print(" ENTER YOUR OPERATION CHOICE : ");
        int choice =sc.nextInt();
        switch(choice){
           case 1 :{
              add();
              break;
           }
           case 2 :{
              sub();
              break;
           }
           case 3:{
              mul();
              break;
           }
           case 4:{
              div();
                break;
           }
           default:{
              System.out.print("WRONG CHOICE");
           }   
        }
       sc.close();
    }
}