package step4.ui

import step4.domain.Game

object GameController {
    fun play() {
        val input = InputController.input()

        val game = Game(nameOfCars = input.nameOfCars, numberOfTrials = input.numberOfTrials)
        game.process()

        OutputController.output(
            gameLogs = game.getGameLogs(),
            winners = game.getWinners(),
        )
    }
}
