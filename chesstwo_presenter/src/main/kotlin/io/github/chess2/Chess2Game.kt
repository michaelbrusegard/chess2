package io.github.chess2

import io.github.chess2.View.StageContext
import ktx.app.KtxGame
import ktx.app.KtxScreen
import ktx.async.KtxAsync

class Chess2Game : KtxGame<KtxScreen>() {

    override fun create() {
        KtxAsync.initiate()

        val stageContext = StageContext()
        addScreen(stageContext)
        setScreen<StageContext>()
    }
}
