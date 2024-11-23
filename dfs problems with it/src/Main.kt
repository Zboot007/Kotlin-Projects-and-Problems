fun main() {

}
fun exist(board: Array<CharArray>, word: String): Boolean {
    var ROWS = board.size
    var COLS = board[0].size
    var path = mutableSetOf<Any>()
    fun dfs(r: Int, c: Int, i: Int): Boolean {
        if(word.length == i)
            return true
        if( r < 0  || c < 0 ||
            r >= ROWS || c >= COLS ||
            word[i] != board[r][c] ||
            (r in path && c in path)
        )
            return false
        path.add(r)
        path.add(c)
        val res = (
                dfs(r + 1, c, i + 1) ||
                dfs(r - 1, c, i + 1) ||
                dfs(r, c + 1, i + 1) ||
                dfs(r, c - 1, i + 1)
                )
        path.remove(r)
        path.remove(c)
        return res
    }
    for(r in 0..ROWS) {
        for(c in 0..COLS) {
            if(dfs(r, c, 0)) return true
        }
    }
    return false
}
// O(n * m * 4^n)