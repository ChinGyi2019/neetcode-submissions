class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var record = HashSet<Int>()
        for(num in nums) {
            if(record.contains(num)) {
               return true
            
            }
            record.add(num)
        }
        return false
    }
}
