class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val sMap = hashMapOf<Char, Int>()
        val tMap = hashMapOf<Char, Int>()
        
        for (i in 0 .. s.length-1) {
            sMap[s[i]] =  sMap.getOrDefault(s[i], 0)+ 1
            tMap[t[i]] = tMap.getOrDefault(t[i], 0) +1
        }
        for(j in 0 .. s.length-1) {
          if(sMap[s[j]] !=  tMap[s[j]]) return false
        }
        return true
    }
}
