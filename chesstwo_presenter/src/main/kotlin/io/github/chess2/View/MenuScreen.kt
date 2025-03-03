package io.github.chess2.View
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.scenes.scene2d.InputEvent
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener
import io.github.chess2.Chess2Game
import ktx.actors.stage
import ktx.app.KtxScreen
import ktx.app.clearScreen
import ktx.scene2d.Scene2DSkin
import ktx.scene2d.actors
import ktx.scene2d.table
import ktx.scene2d.textButton


class MenuScreen (private val game: Chess2Game) : KtxScreen {
    private val stage = stage()

    init {
        println("MenuScreen: Initialized!")
        val inputMultiplexer = Gdx.input.inputProcessor as InputMultiplexer
        inputMultiplexer.addProcessor(stage)

        stage.actors {
            table {
                setFillParent(true)
                textButton("Make Lobby", skin = Scene2DSkin.defaultSkin).apply {
                    addListener(object : ClickListener() {
                        override fun clicked(event: InputEvent?, x: Float, y: Float) {
                            println("Clicked A!")
                            game.setScreen<LobbyScreen>()
                        }
                    })
                }
                row()
                textButton("Join Lobby", skin = Scene2DSkin.defaultSkin).apply {
                    addListener(object : ClickListener() {
                        override fun clicked(event: InputEvent?, x: Float, y: Float) {
                            println("Clicked B!")
                            game.setScreen<LobbyScreen>()
                        }
                    })
                }
            }
        }
    }

    override fun render(delta: Float) {
        clearScreen(0.1f, 0.1f, 0.1f)  // Plain dark background
        stage.act()
        stage.draw()
    }

    override fun dispose() {
        stage.dispose()
    }
}
