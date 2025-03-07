package io.github.chessevolved.views

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.utils.viewport.FitViewport

class DesktopView : IView{
    private val camera: OrthographicCamera = OrthographicCamera()
    private val viewport: FitViewport = FitViewport(10f, 10f)
    private val batch: SpriteBatch = SpriteBatch()


    override fun beginBatch() {
        viewport.apply()
        batch.projectionMatrix = viewport.camera.combined
        batch.begin()
    }

    override fun endBatch() {
        batch.end()
    }

    override fun getCamera(): OrthographicCamera {
        return camera
    }

    override fun getViewport(): FitViewport {
        return viewport
    }

    override fun render(sprite: Sprite) {
        sprite.draw(batch)
    }
}
