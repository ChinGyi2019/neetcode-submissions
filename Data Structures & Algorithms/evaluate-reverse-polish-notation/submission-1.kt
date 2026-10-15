class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<String>()

        for(i in tokens) {
            if(isOperator(i)) {
                
                if(stack.size >= 2){
                   val y = stack.removeLast().toInt()
                   val x = stack.removeLast().toInt()

                   val result =  when (i) {
                    "+" -> {
                        x + y  
                    }
                    "-" -> {
                       x - y 
                    }
                    "*" -> {
                        x * y
                    }
                    "/" -> {
                        (x / y).toInt()
                    }
                    else -> {
                        0
                    }
                }
                
                stack.addLast(result.toString())
                
            }
            } else {
                stack.addLast(i)
            }
        }
        return if(stack.isEmpty()) 0 else stack.peekLast().toInt()
    }

     fun isOperator(s: String): Boolean {
      return  s == "+" || s == "-" || s == "*" || s == "/"
    } 

}
    
