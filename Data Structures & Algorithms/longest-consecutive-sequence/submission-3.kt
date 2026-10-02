class Solution {
    fun longestConsecutive(nums: IntArray): Int {
       // sorted [2, 3, 4, 4, 5, 10, 20]
      if(nums.isEmpty()) return 0
       val s = nums.sorted()
       var longest = 1
       var current = 1
       for(i in 1 until s.size) {
            if(s[i] == s[i-1]) continue

            if(s[i] == s[i-1]+1) {
                current++
            } else {
                current = 1
            }
            longest = max(current, longest) 
       }
       return longest
    }
}
