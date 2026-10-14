class MinStack() {
    var minIndex = 0
    var topIndex = 0

    val list = mutableListOf<Int>()
    fun push(`val`: Int) {
        list.add(`val`)
        if(list[minIndex] >= `val`){
            minIndex = list.lastIndex
        }
    }

    fun pop() {
        if(list.isNotEmpty()) {
            val last = list[list.lastIndex]
            val min = list[minIndex]
            list.removeLast() 
            if(last == min) {
                minIndex = 0
                for(i in list.indices){
                    if(list[minIndex] > list[i]){
                        minIndex =  i
                    }
                    // if(
                    //     list[minIndex] == list[i]
                    // )      {
                    //     minIndex = i 
                    // }             
                }  
            }
        }   
    }

    fun top(): Int {
       return if(list.isEmpty()) -1 else list[list.lastIndex] 
    }

    fun getMin(): Int {
        return if(list.isEmpty()) -1 else list[minIndex] 
    }
}
