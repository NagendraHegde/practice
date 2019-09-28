package practice.algo.dp;

public class FibonacciGenerator {


    public static void generateFibonacciSeries(final int n){

        int num1 = 0;
        int num2 = 1;
        boolean paramSwitch = true;

        if(n == 0){
            System.out.println("0");
            return;
        }

        if(n == 1){
            System.out.println("1");
            return;
        }

        for(int i = 2; i <= n; i++){

            int sum = num1 + num2;
            System.out.println(sum);

            if(paramSwitch){
                num1 = sum;
            }else{
                num2 = sum;
            }

            paramSwitch = !paramSwitch;

        }

    }

    public static void main(String[] args) {
        generateFibonacciSeries(5);
    }
}
