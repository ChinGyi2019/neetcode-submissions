class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val result = IntArray(nums.size)
        // j = 0
       var left = 1
       for (i in nums.indices) {
           result[i] = left
           left *= nums[i]
       }
       
       var right = 1
       for (i in nums.indices.reversed()) {
           result[i] *= right
           right *= nums[i]
       }
       
    return result
    }
}
