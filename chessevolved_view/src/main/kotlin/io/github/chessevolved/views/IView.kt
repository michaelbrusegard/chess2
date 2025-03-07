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

    /**
     * Getter for the camera.
     */
    fun getCamera(): OrthographicCamera

    /**
     * Getter for the viewport.
     */
    fun getViewport(): FitViewport

    /**
     * Render a specific sprite.
     * Position and other render data should be determined in the Sprite class.
     * @param sprite The sprite to be rendered.
     */
    fun render(sprite: Sprite)
}
