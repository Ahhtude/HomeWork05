package part3;

import java.util.Random;

public class IntUtils {

   private IntUtils(){

   }

    static int plus(int a, int b){
       int result = a + b;
       return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        return result;

    }
    //возведение в степень
    static int pow(int number, int pow){
        int result = number ^ pow;
        return result;

    }
    static int getRandomInt(int minBound, int maxBount){
        Random random = new Random();
        int result = random.nextInt(maxBount-minBound)+minBound;
        return result;
    }
    static void part4OfHomeWork(int value){
        int counter = 0;

        for (int i = value; i>0; i--){
            if (value % i ==0){
                counter++;
            }
            else continue;
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
    part4OfHomeWork(12);
    }

}
