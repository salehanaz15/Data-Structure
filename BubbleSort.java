public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {95, 86, 65, 59, 47, 35, 27, 19, 8};
        sort(nums);
        System.out.println("Original data: " + Arrays.toString(nums));
        System.out.println("Sorted data: " + Arrays.toString(nums));
    }
    public static void sort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }