class Solution {
    public void sortColors(int[] nums) {
    //    [2,0,2,1,1,0]
    //     m         l
    //    [0,0,1,1,2,2]
//         int low = 0;
//         int mid = 0;
//          int high = nums.length - 1;

//         while (mid <= high) {
//             if (nums[mid] == 0) {
//                 int temp = nums[low];
//                 nums[low] = nums[mid];
//                 nums[mid] = temp;
//                 low++;
//                 mid++;
//             } 
//             else if (nums[mid] == 1) {
//                 mid++;
//             } 
//             else { // nums[mid] == 2
//                 int temp = nums[mid];
//                 nums[mid] = nums[high];
//                 nums[high] = temp;
//                 high--;
//             }
//         }
//     }
// }
Arrays.sort(nums);
    }
}