package practice.util.io;

import java.util.Scanner;
import java.util.function.Function;

public class InputOutputForGFG<T> {


    /**
     * first scan is number of tests
     * second scan is the integer arrays each line
     */
    public void driveArrayIo(final Function<T, String> func, T t){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int i = 1; i <= tc; i++){
            int[] inputArray = new int[sc.nextInt()];
            String input = sc.next();
            for(int j = 0; j < inputArray.length; j++){
                inputArray[j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
            System.out.println((func.apply(t)));
        }
    }

}
