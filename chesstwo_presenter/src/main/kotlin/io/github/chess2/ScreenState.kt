package io.github.chess2

interface ScreenState {
    fun render(delta: Float)
    fun update(delta: Float)
    fun dispose()
}
