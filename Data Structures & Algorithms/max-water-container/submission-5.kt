class Solution {
    fun maxArea(heights: IntArray): Int {

        var l = 0

        var r = heights.lastIndex

        var output = 0

        while (l < r) {

            val w = r - l

            val h = min(heights[l], heights[r])

            output = max(output, w * h)

            // TODO: Which pointer should you move?
            if(heights[l] < heights[r] ) {
                l ++
            } else {
                r--
            }

        }

        return output

    }
}
