class Solution {
    fun trap(height: IntArray): Int {
        val sufix = IntArray(height.size)
        val prefix = IntArray(height.size)

        prefix[0] = height[0]
        sufix[height.lastIndex] = height[height.lastIndex]
        for(i in 1 until height.size) {
            prefix[i] = max(prefix[i-1], height[i])
        }
        for(i in height.lastIndex-1 downTo 0) {
            sufix[i] = max(sufix[i+1], height[i])
        }
        var totalWater = 0 
        for(i in height.indices){
            totalWater += min(prefix[i], sufix[i]) - height[i]
        }
        return totalWater

    }
}
