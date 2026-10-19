class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val result = IntArray(temperatures.size)

        for(i in temperatures.indices){
            while(stack.isNotEmpty() && 
            temperatures[i] > temperatures[stack.peekLast()]
            ) {
                val prevIndex = stack.removeLast()
                val diff = i - prevIndex
                result[prevIndex] = diff

            }
            stack.addLast(i)
        }
        return result

    }
}
