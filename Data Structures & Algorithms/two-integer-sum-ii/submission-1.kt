class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        // Input: numbers = [1,2,3,4], target = 3
        // Output: [1,2]
        var l = 0
        var r = numbers.lastIndex
        while(l <= r) {
           val complement = target - numbers[l]
           // 2 
           if(numbers[r] == complement) return intArrayOf(l+1,r+1)
           if(complement < numbers[r]){
             r--
           } else {
             l++
           }
        }
        return intArrayOf()
    }
}
