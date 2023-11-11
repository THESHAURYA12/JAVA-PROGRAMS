public class prime_numberbyrecursion{
    static boolean checkprime(int num,int div){
        if(div<2){
            return false;
        }
        if(Num%div=0){
            return false;
        }
        else if(div *div>num){
            return true;
        }
        return checkprime(num,div+1);
    }
    
    public static void main(String[]args){
        

    }
}