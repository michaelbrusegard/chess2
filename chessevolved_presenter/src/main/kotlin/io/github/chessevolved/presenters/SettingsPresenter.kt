package io.github.chessevolved.presenters

import io.github.chessevolved.singletons.GameSettings

class SettingsPresenter : IPresenter {

    //TODO: wait for implementation of ScenePresenterStateManager
    val gameSettings = GameSettings
    //val presenterManager = ScenePresenterStateManager

    /**
     * Applies the chosen game settings
     *
     * @param fowSetting Boolean for Fog of War
     * @param sizeSetting Int for size of chessboard
     */
    fun onApply(fowSetting: Boolean, sizeSetting: Int) {
        //TODO: Consider if game settings should be applied manually or automatically
        gameSettings.setFOW(fowSetting)

        //TODO: validate max/min boardsize here?
        gameSettings.setBoardSize(sizeSetting)
    }

    /**
     * Retrieves the current game settings
     *
     * @return Current settings as a Map
     */
    fun getCurrentSettings(): Map<String, Any> {
        return mapOf(
            "FogOfWar" to gameSettings.isFOWEnabled(),
            "BoardSize" to gameSettings.getBoardSize()
        )
    }

    /**
     *  Switch to LobbyPresenter
     */
    fun onBack() {
        //TODO: wait for implementation of ScenePresenterStateManager
    }
}
