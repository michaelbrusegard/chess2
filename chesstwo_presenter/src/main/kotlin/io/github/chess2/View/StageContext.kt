package io.github.chess2.View

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.utils.viewport.ScreenViewport
import io.github.chess2.ScreenState
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.assets.disposeSafely

class StageContext : KtxScreen {
    private val batch = SpriteBatch()
    private var currentState: ScreenState = SplashState(batch, this)
    val stage = Stage(ScreenViewport())

    fun setState(newState: ScreenState) {
        currentState.dispose()
        currentState = newState
    }

    override fun render(delta: Float) {
        clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)
        currentState.render(delta)
        currentState.update(delta)

        stage.act(delta)
        stage.draw()
    }

    override fun dispose() {
        currentState.dispose()
        batch.disposeSafely()
        stage.dispose()
    }

    override fun resize(width: Int, height: Int) {
        stage.viewport.update(width, height, true)
    }

    override fun show() {
        Gdx.input.inputProcessor = stage
    }

    override fun hide() {
        Gdx.input.inputProcessor = null
    }
}
