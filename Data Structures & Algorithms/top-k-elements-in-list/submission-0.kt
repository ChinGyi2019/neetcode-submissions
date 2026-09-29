class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
            val freq = hashMapOf<Int, Int>()
            for(n in nums) {
                freq[n] = freq.getOrDefault(n, 0) + 1 
            }
            return freq
            .entries
            .sortedByDescending { it.value }
            .take(k)
            .map { it.key}.toIntArray()
    }
}
