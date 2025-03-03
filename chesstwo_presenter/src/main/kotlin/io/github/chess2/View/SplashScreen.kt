package io.github.chess2.View

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import io.github.chess2.Chess2Game
import io.github.chess2.ExampleFile
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.assets.disposeSafely
import ktx.assets.toInternalFile
import ktx.graphics.use


class SplashScreen(private val game: Chess2Game) : KtxScreen {
    private val image = Texture("logo.png".toInternalFile(), true).apply { setFilter(Linear, Linear) }
    private val batch = SpriteBatch()
    private var rText: ExampleFile = ExampleFile();

    private var timer = 0f /// TODO midlertidig, vil heller vente på at ting rendrer, noe ala dette:
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

    override fun render(delta: Float) {
        clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)
        batch.use {
            it.draw(image, 100f, 160f)
        }
        println(rText.randomText)

        timer += delta
        if (timer > 2f) {
            game.setScreen<MenuScreen>()
        }
    }

    override fun dispose() {
        image.disposeSafely()
        batch.disposeSafely()
    }
}
