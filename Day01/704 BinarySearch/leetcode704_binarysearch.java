public class leetcode704_binarysearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int check = (right - left) / 2;
        int index = -1;
        while (left < right) {
            if (nums[check] < target) {
                right = check;
            } else if (nums[check] > target) {
                left = check;

            } else if (nums[check] == target) {
                index = nums[check];
            }
        }

        return index;
    }

}



