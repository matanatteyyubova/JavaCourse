
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


//    public static void main(String[] args) {
//        int number = 121;
//        int original = number;
//        int reversed = 0;
//
//        while (number > 0) {
//            int digit = number % 10;
//            reversed = (reversed * 10) + digit;
//            number = number / 10;
//        }
//
//        if (original == reversed) {
//            System.out.println("Palindromdur");
//        } else {
//            System.out.println("Palindrom deyil");
//        }
//    }


//    public static void main(String[] args) {
//        String s= "XIV";
//        int result =0;
//        int prev=0;
//        for(int i=s.length()-1;i>=0;i--){
//            char c=s.charAt(i);
//            int current =0;
//
//            if (c == 'I') current = 1;
//            else if (c == 'V') current = 5;
//            else if (c == 'X') current = 10;
//            else if (c == 'L') current = 50;
//            else if (c == 'C') current = 100;
//            else if (c== 'D') current = 500;
//            else if (c == 'M') current = 1000;
//
//            if(current <prev){
//                result-= current;
//            }else{
//                result+= current;
//            }
//
//
//            prev= current;
//
//
//        }
//
//        System.out.println(result);
//    }


    public static void main(String[] args) {

            String[] strs = new String[] {"flower", "flow", "flight"};
            for(int i=0;i< strs.length ;i++){

              String prefix = strs[0];
              while(strs[i].indexOf(prefix) != 0){
                  prefix =prefix.substring(0,prefix.length()-1);
              }
                System.out.println(prefix);
            }



    }

}
