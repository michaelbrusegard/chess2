package io.github.chess2.View

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import io.github.chess2.ScreenState
import ktx.assets.disposeSafely
import ktx.assets.toInternalFile
import ktx.graphics.use

class SplashState(private val batch: SpriteBatch, private val context: StageContext) : ScreenState {
    private val splashImage = Texture("logo.png".toInternalFile())
    private var elapsedTime = 0f

    override fun render(delta: Float) {
        batch.use {
            it.draw(splashImage, 100f, 160f)
        }
    }

    override fun update(delta: Float) {
        elapsedTime += delta
        if (elapsedTime > 2f) {
            context.setState(MenuState(batch, context))
        }

        /// TODO midlertidig, vil heller vente på at ting rendrer, noe ala dette:
        /*
        private var loading = true
        init {
            KtxAsync.launch {
                assets.load.....
                assets.finishLoading()
                loading = false
            }
        }
        override fun render(delta: Float) {
            if (loading) {}
            } else {}
        }*/
    }

    override fun dispose() {
        splashImage.disposeSafely()
    }
}
