package io.github.chessevolved.views

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.utils.viewport.FitViewport

interface IView {
    /**
     * Updates the Viewport and Camera before starting a Sprite batch.
     */
    fun beginBatch()

    /**
     * Ends the batch sprite.
     */
    fun endBatch()

//    /**
//     * Sets the world size. Aka how big the viewports world is.
//     * @param width .
//     * @param height .
//     */
//    fun setViewportWorldSize(width: Float, height: Float)
//
//    /**
//     * Sets the screen bounds. From a given position (x,y) with the width and height.
//     * @param x .
//     * @param y .
//     * @param width .
//     * @param height .
//     */
//    fun setViewportScreenBounds(x: Int, y: Int, width: Int, height: Int)
//
//    /**
//     * Sets the cameras position inside the viewport given a position (x,y)
//     * @param x .
//     * @param y .
//     */
//    fun setCameraPosition(x: Float, y: Float)
//
//    /**
//     * Sets the cameras orthogonal size.
//     * @param width .
//     * @param height .
//     */
//    fun setCameraSize(width: Float, height: Float)

    /**
     * Render a specific sprite.
     * Position and other render data should be determined in the Sprite class.
     * @param sprite The sprite to be rendered.
     */
    fun render(sprite: Sprite)
}
