package LLD3.TicTacToe;

import LLD3.TicTacToe.controller.GameController;
import LLD3.TicTacToe.model.Game;
import LLD3.TicTacToe.model.Player;
import LLD3.TicTacToe.model.Symbol;
import LLD3.TicTacToe.model.type.GameState;
import LLD3.TicTacToe.model.type.PlayerType;
import LLD3.TicTacToe.strategy.ColumnWinningRule;
import LLD3.TicTacToe.strategy.GameWinningRule;
import LLD3.TicTacToe.strategy.RowWinningRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //user's perspective
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);

        List<Player> players = new ArrayList<>();
        players.add(new Player(1,"abc",new Symbol('x'), PlayerType.HUMAN,scanner));
        players.add(new Player(2, "xyz", new Symbol('0'), PlayerType.HUMAN,scanner));

        List<GameWinningRule> rules = new ArrayList<>();
        rules.add(new RowWinningRule());
        rules.add(new ColumnWinningRule());

        Game game = gameController.startGame(players, rules, 3);

        while (game.getGameState().equals(GameState.IN_PROGRESS)){
            //display board
            //find out player with nextTurn
            //ask player to make a move
            gameController.printBoard(game);

            System.out.println("Does someone want to undo?");
            String undoStr = scanner.next();
            if (undoStr.equals("y")){
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);
        }

        if (game.getGameState().equals(GameState.DRAW)){
            System.out.println("game is draw");
        }
        if (game.getGameState().equals(GameState.END)){
            System.out.println("Game is won by player: "+gameController.getWinner(game).getName());
        }


    }
}
