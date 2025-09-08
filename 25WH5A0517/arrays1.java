public class arrays1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 1, 3, 6};
        
        System.out.println("Duplicate values:");
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(nums[i]);
                    break; 
                }
            }
        }
    }
}

