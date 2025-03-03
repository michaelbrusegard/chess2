package io.github.chess2

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.Texture.TextureFilter.Linear
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import io.github.chess2.View.GameScreen
import io.github.chess2.View.LobbyScreen
import io.github.chess2.View.MenuScreen
import io.github.chess2.View.PauseScreen
import io.github.chess2.View.SettingsScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.assets.disposeSafely
import ktx.assets.toInternalFile
import ktx.async.KtxAsync
import ktx.graphics.use
import io.github.chess2.View.SplashScreen
import ktx.scene2d.Scene2DSkin
import ktx.style.skin

class Chess2Game : KtxGame<KtxScreen>() {
    lateinit var skin: Skin
    lateinit var font: BitmapFont

    override fun create() {
        KtxAsync.initiate()

        val inputMultiplexer = InputMultiplexer()
        Gdx.input.inputProcessor = inputMultiplexer

        makeButton();

        //addScreen(FirstScreen())
        //setScreen<FirstScreen>()

        addScreen(MenuScreen(this))
        addScreen(LobbyScreen(this))
        addScreen(GameScreen(this))
        addScreen(PauseScreen(this))
        addScreen(SettingsScreen(this))
        addScreen(SplashScreen(this))


        setScreen<SplashScreen>()
    }

    override fun dispose() {
        super.dispose()
        skin.dispose()
        font.dispose()
    }

    fun makeButton(){
        skin = Skin()
        font = BitmapFont()
        skin.add("default", font)

        val pixmap = Pixmap(1, 1, Pixmap.Format.RGBA8888)
        pixmap.setColor(Color.WHITE)
        pixmap.fill()
        skin.add("white", Texture(pixmap))

        val buttonStyle = TextButton.TextButtonStyle()
        buttonStyle.up = TextureRegionDrawable(skin.getRegion("white"))
        buttonStyle.font = font
        buttonStyle.fontColor = Color.BLACK
        skin.add("default", buttonStyle)

        Scene2DSkin.defaultSkin = skin
    }
}

class FirstScreen : KtxScreen {
    private val image = Texture("logo.png".toInternalFile(), true).apply { setFilter(Linear, Linear) }
    private val batch = SpriteBatch()
    private var rText: ExampleFile = ExampleFile();

    override fun render(delta: Float) {
        clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)
        batch.use {
            it.draw(image, 100f, 160f)
        }
        println(rText.randomText)
    }

    override fun dispose() {
        image.disposeSafely()
        batch.disposeSafely()
    }
}
