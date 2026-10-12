class Solution {
    fun trap(height: IntArray): Int {
        // [1, 5, 2, 3, 4]
        if(height.size <= 1) { return 0 }
        val output = mutableListOf<Int>()
        var prefix = IntArray(height.size)
        var sufix = IntArray(height.size)
        prefix[0] = height[0]
        sufix[height.size-1] = height[height.size-1]
        for(i in 1 .. height.lastIndex) {
            prefix[i] = max(prefix[i-1], height[i])
        }
        for(i in height.lastIndex-1 downTo 0) {
            sufix[i] = max(sufix[i+1], height[i])
        }
        for(i in height.indices) {
            output.add(
                min(prefix[i], sufix[i]) - height[i]
             )
        }
        return output.sum()

    }
}
