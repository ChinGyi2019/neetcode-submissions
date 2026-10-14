class Solution {
    fun isValid(s: String): Boolean {
        val openings = arrayListOf('(', '{', '[') 
        val closings = arrayListOf(')', '}', ']') 
        
        var stack = ArrayDeque<Char>()
        for(i in s){
            if(openings.contains(i)){
                stack.addLast(i)
            }
            if(closings.contains(i)){
                if(stack.isNotEmpty()){
                
                val top = stack.peekLast()
                if(openings.indexOf(top) == closings.indexOf(i)){
stack.removeLast()
                } else {
                   return false
                }
                
                } else {
                    return false
                }
            }                    
            }
             return stack.isEmpty()
    
        }
       
    
}
