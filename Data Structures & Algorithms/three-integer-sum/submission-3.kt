class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val sorted = nums.sorted()
        val result = hashSetOf<List<Int>>()
        for(i in sorted.indices) {
           var l = 0
           var r = sorted.lastIndex 
           val target = -sorted[i]
           while(l < r){
            if(i == l ) {
                l++
                continue
            }
            if(i == r){
                r--
                continue
            }
             val complement = sorted[l] + sorted[r]
             if(target == complement) {
                result.add(arrayListOf(sorted[i], sorted[l] , sorted[r]).sorted())
             }
             if(complement < target) {
                l ++
             }else {
                r--
             }
           }
            
        }
        return result.toList()
    }
}
