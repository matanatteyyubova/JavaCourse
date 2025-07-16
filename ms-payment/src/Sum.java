
import java.util.Arrays;

public class Sum {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i=0;i<nums.length;i++){
//            for(int k=i+1;k<nums.length;k++){
//                if(nums[i]+nums[k]==target){
//                    return new int[]{i,k};
//
//                }
//            }
//        }
//        return new int[0];
//    }


    public static void main(String[] args) {
        int number = 121;
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number = number / 10;
        }

        if (original == reversed) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom deyil");
        }
    }
}
