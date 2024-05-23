package Code.tictactoe.controller;

import Code.tictactoe.model.Game;
import Code.tictactoe.model.Player;
import Code.tictactoe.model.types.GameState;
import Code.tictactoe.strategy.GameWinningRule;

import java.util.List;

public class GameController {

    /**
     * 1.start game()
     * 2.Players
     * 3.undo()
     * 4.
     */

    public void makeMove(Game game){
        game.makeMove();
    }
    public void undo(){

    }

    //when user wants to start the game
    public Game startGame(List<Player> players, List<GameWinningRule> gameWinningRules, Integer dimension){
        //create and return new object of Game and return.
        return null;
    }
    public void printBoard(){

    }
    public Player getWinner(){
        return null;
    }
    public GameState getGameState(){
        return null;
    }

    public Game startGame() {
        return null;
    }
}
