class Solution {
    fun maxProfit(prices: IntArray): Int {
        // [7,1,5,3,6,4]
        var l = 0
        var r = l + 1
        var output = 0 
        while(r < prices.size) {
            if(prices[l] > prices[r]) {
                l = r
                r = l+1
            }else {
                output = max(output, prices[r] - prices[l])
                r ++
            }
        }
        return output
    }
}
