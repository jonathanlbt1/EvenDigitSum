public class EvenDigitSum {
    public static int getEvenDigitSum(int number){

        if(number < 0){
            return -1;
        }
        int sum = 0;
        int moduloNumber = 0;
        while(number > 0){
            moduloNumber = number % 10;
            if (moduloNumber % 2 == 0){
                sum += moduloNumber;
            }
            number /= 10;
        }
        return sum;
    }
}
