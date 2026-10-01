class Solution {
    fun isPalindrome(s: String): Boolean {
       // Input: s = "tab a cat"
       // Output: false
       // s="No lemon, no melon"
        var l = 0
        var r = s.lastIndex
        while(l < r) {
            if(s[l] == ' ' || !s[l].isLetterOrDigit()) {
                l++
                continue
            }
            if(s[r]== ' ' || !s[r].isLetterOrDigit()) {
                r--
                continue
            }

            if(s[l].lowercaseChar() != s[r].lowercaseChar()) {
                return false 
            }
            l++ 
            r--
        }
        return true
    }
}
