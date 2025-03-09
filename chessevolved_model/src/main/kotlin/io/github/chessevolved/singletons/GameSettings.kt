package io.github.chessevolved.singletons

object GameSettings {
    var fogOfWar: Boolean = false
    var boardSize: Int = 8

    /**
     * Toggles Fog of War for the game
     *
     * @param enabled Boolean for enabeling/disabeling FOW
     */
    fun setFOW(enabled: Boolean) {
        fogOfWar = enabled
    }

    /**
     * The current setting of FOW
     *
     * @return Current FOW setting as Boolean
     */
    fun isFOWEnabled(): Boolean {
        return fogOfWar
    }

    /**
     * Sets a new size for the chessboard
     *
     * @param newSize Int for chessboard size
     */
    fun setBoardSize(newSize: Int) {
        boardSize = newSize
    }

    /**
     * The current chessboard size
     *
     * @return Size of the chessboard as Int
     */
    fun getBoardSize(): Int {
        return boardSize
    }
}
