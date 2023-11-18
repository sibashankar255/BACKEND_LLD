package LLD3.TicTacToe.controller;

import LLD3.TicTacToe.model.Game;
import LLD3.TicTacToe.model.Player;
import LLD3.TicTacToe.model.type.GameState;
import LLD3.TicTacToe.strategy.GameWinningRule;

import java.util.List;

public class GameController {
    /**
     * 1.startGame()
     * 2.move()
     * 3.undo()
     * 4.displayBoard()
     * 5.getWinnerName()
     * 6.
     *
     * @return
     */


    //when user wants to start game
    public Game startGame(List<Player> players,
                          List<GameWinningRule> winningRules,
                          Integer dimension) throws Exception {

        //create and return new object of Game and return
        return Game.getGameBuilder().
                setPlayers(players).
                setDimensions(dimension).
                setWinningRules(winningRules).
                build();
    }

    public void makeMove(Game game) throws Exception {
        game.makeMove();
    }

    public void undo(Game game){
        game.undo();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public Player getWinner(Game game){
        return game.getWinnerPlayer();
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

}
