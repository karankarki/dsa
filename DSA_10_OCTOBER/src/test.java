
import java.util.*;

public class test {




    public static int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int flag = 0;

        for (int i = 0; i < nums.length; i++) {


            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] < nums[j] && nums[j] > nums[k]) {
                        flag = 1;
                        if (min > (nums[i] + nums[j] + nums[k])) {
                            min = nums[i] + nums[j] + nums[k];
                        }
                    }

                }


            }


        }

        if (flag == 1) {
            return min;
        }

        return -1;
    }
        public static void main(String[] args) {

            System.out.println(minimumSum(new int[] {8,6,1,5,3}));
    }
}


// "mississippi"
// "issip"
