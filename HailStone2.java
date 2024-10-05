public class HailStone2 {
    public static void main(String[]args){
        int max = 0;
        int maxNum = 0;
        for (int i=1; i<=200; i++){
            int counter = 0;
            int num = i;
            while (num != 4){
                if (num%2 == 0){
                    num = num/2;
                    counter += 1;
                }
                else{
                    num = 3*num +1;
                    counter += 1;
                }
            }
            if (counter > max){
                max = counter;
                maxNum = i;
            } 
        }
        System.out.println("For the starting number " + max + ", there were " + maxNum + " iterations before the cycle was reached.");
    }
}
