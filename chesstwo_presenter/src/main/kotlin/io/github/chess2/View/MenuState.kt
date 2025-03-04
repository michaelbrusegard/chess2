package io.github.chess2.View

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.badlogic.gdx.scenes.scene2d.ui.TextButton
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable
import io.github.chess2.ScreenState
import ktx.app.clearScreen
import ktx.scene2d.Scene2DSkin
import ktx.style.add

class MenuState(private val batch: SpriteBatch, private val context: StageContext) : ScreenState {
    //private var skin = Skin(Gdx.files.internal("logo.png"))
   /* lateinit var skin: Skin
    //private val font = BitmapFont()


   // private lateinit var stage: Stage
    private lateinit var button: TextButton
    private lateinit var textButtonStyle: TextButton.TextButtonStyle
    private lateinit var font: BitmapFont
    //private lateinit var skin: Skin
    private lateinit var buttonAtlas: TextureAtlas*/


    init {
        createUI()
    }


    override fun render(delta: Float) {
       /* clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)
        context.stage.act(delta)
        context.stage.draw()*/
       // println("nei")
    }

    override fun update(delta: Float) {
    }

    override fun dispose() {
       // skin.dispose()
        //font.dispose()
    }

    private fun createUI() {

       clearScreen(red = 0.7f, green = 0.7f, blue = 0.7f)


        /*makeSkin()

        val createLobbyButton = TextButton("Create Lobby", skin).apply {
            setPosition(100f, 300f)
            addListener { event ->
                if (event.isHandled) {
                    context.setState(CreateGameState(batch, context))
                }
                true
            }
        }

        val joinLobbyButton = TextButton("Join Lobby", skin).apply {
            setPosition(100f, 200f)
            addListener { event ->
                if (event.isHandled) {
                    context.setState(JoinGameState(batch, context))
                }
                true
            }
        }

        context.stage.addActor(createLobbyButton)
        context.stage.addActor(joinLobbyButton)*/
    }

    fun makeSkin(){
        /*
        skin = Skin()
        val pixmap = Pixmap(1, 1, Pixmap.Format.RGBA8888)
        pixmap.setColor(Color.WHITE)
        pixmap.fill()
        skin.add("white", Texture(pixmap))
        val buttonStyle = TextButton.TextButtonStyle().apply {
            up = TextureRegionDrawable(skin.getRegion("white"))
            font = font
            fontColor = Color.BLACK
        }
        skin.add("default", buttonStyle)
        Scene2DSkin.defaultSkin = skin*/
    }
}

