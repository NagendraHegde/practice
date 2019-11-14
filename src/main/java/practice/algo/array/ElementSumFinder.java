package practice.algo.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ElementSumFinder {


    public static int[] getSubarrayEqualToSum(final int[] elements, final int sum) {

        int curr_sum = 0;
        int start = 0;
        int end = -1;
        while (end < elements.length) {

            if (curr_sum == sum) {
                break;
            }
            if (curr_sum < sum) {
                end++;
                curr_sum += elements[end];
                continue;
            }
            if (curr_sum > sum) {
                curr_sum -= elements[start];
                start++;
            }
        }

        if (end > elements.length) {
            return new int[0];
        }

        return Arrays.copyOfRange(elements, start, end - 1);

    }


}
