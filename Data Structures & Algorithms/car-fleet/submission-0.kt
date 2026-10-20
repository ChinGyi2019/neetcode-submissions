class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        var result = 0
        // for sortedPosition = positions.sorted()
        var stack = ArrayDeque<Float>()
        val pair = position.zip(speed).toMutableList()
        pair.sortByDescending { it.first }
        for(pS in pair) {
            val (p,s ) = pS
            val time:Float = ((target - p) / s.toFloat())
           
            if(stack.isNotEmpty() && stack.peekLast() < time) {
            stack.addLast(time)
            }

            if(stack.isEmpty()) {
                stack.addLast(time)
            }
        }
        return stack.size

    }
}
