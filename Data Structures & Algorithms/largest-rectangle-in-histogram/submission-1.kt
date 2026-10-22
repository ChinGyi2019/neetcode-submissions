class Solution {
    fun largestRectangleArea(heights: IntArray): Int {

        var maxArea = 0
        val stack = ArrayDeque<Int>()
        for(i in 0..heights.size){
            while(
                stack.isNotEmpty() && 
                ( i == heights.size ||     heights[stack.last()] >= heights[i] 
               )
             ) {
                val height = heights[stack.removeLast()]
                val width = if(stack.isEmpty()) i else 
                            i - stack.last() -1
                maxArea = max(maxArea, width * height)
             }
            if(i < heights.size) stack.addLast(i)
        }
        return maxArea
    }
}
