class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        // input [1, 2, 4, 6]
        // output [48, 24, 12, 8]
        val result = IntArray(nums.size)
         // i = 0
        // [1, 2, 4, 6], left = 1
        // i = 1
        // [1, 1, 4, 6], left =  2
        // i = 2
        // [1, 1, 2, 8], left =  8
        // i = 3
        // [1, 1, 2, 8], left =  48
        var left =1 
        for(i in nums.indices) { 
            result[i] = left
            left *= nums[i]
        }
        var right = 1
        // 3 to 0
        for(j in nums.indices.reversed()) {
            result[j] *= right
            right *= nums[j]
        }
        // [1, 1, 2, 8]
        // i=3, [1, 1, 2, 8], right = 6

        // i=2, [1, 1, 12, 8], right = 24
        // i=1, [1, 24, 12, 8], right = 48
        // i=0, [48, 24, 12, 8], rith = 48

        return result 
       
    }
}
