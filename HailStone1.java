public class HailStone1{
    public static void main(String[]args){
        boolean reachTheCycle = true;
        for (int i=1; i<=200; i++){
            int num = i;
            while (num != 4){
                if (num%2 == 0){
                    num = num/2;
                }
                else{
                    num = 3*num +1;
                }
            }
            reachTheCycle = true;
        }
        if (reachTheCycle){
            System.out.println("yes");
        }
    }
}