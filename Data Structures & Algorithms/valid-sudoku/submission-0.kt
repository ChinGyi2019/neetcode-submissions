class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // val rSet = hashSetOf<Int>()
        // val cSet = hashSetOf<Int>()
        // val sSet = hashSetOf<Int>()
        val rSet = hashMapOf<Int, MutableSet<Char>>()
        val cSet = hashMapOf<Int, MutableSet<Char>>()
        val sSet = hashMapOf<Int, MutableSet<Char>>()
        for(r in board.indices) {
            for(c in board[r].indices) {
                if(board[r][c] == '.') continue
                val sIndex = (r / 3) * 3 + (c / 3)


                if(rSet[r]?.contains(board[r][c]) == true) {
                    return false
                } else {
                    rSet.getOrPut(r){
                         mutableSetOf()
                    }.add(board[r][c])
                }
               
                if(cSet[c]?.contains(board[r][c]) == true) {
                    return false
                } else {
                   
                     cSet.getOrPut(c){
                         mutableSetOf()
                    }.add(board[r][c])
                }

                if(sSet[sIndex]?.contains(board[r][c]) == true) {
                    return false
                } else {
                     sSet.getOrPut(sIndex){
                     mutableSetOf()
                    }.add(board[r][c])
                }
            }
        }

        return true
    }
}
