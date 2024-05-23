package Code.tictactoe;

import Code.tictactoe.controller.GameController;
import Code.tictactoe.model.Game;
import Code.tictactoe.model.Symbol;
import Code.tictactoe.model.types.GameState;

public class Client {
    public static void main(String[] args) {

        //user's perspective
        GameController gameController = new GameController();
        Game game = gameController.startGame();

        while (!game.getGameState().equals(GameState.IN_PROGRESS)){
            //display board
            //find out player with next turn
            //ask player to make a move
            gameController.printBoard();
            gameController.makeMove(game);
        }
        if (game.getGameState().equals(GameState.DRAW)){
            System.out.println("Game is draw");
        }
        if (game.getGameState().equals(GameState.END)){
            System.out.println("game is won by player: "+ gameController.getWinner().getName());
        }
    }

    // Undo:-
    /**
     * 1. every move is stored in List<Move>
     *     upon undo:-
     *     1.remove last element from the list
     *     2.update board/cell
     *     3.update turn
     *
     * 2.better approach for undo
     *    undo:- redo all moves from 1st to n-1
     *    1.create a new board
     *    2.Redo all moves except last one
     *
     * 3. another better approach
     *    instead of generating the board again and again .
     *    i will generate a board and save it in a list every board
     *
     *    List<Board>
     *
     *    move(4) -> undo -> Map.get(3)
     *    Map<int,Board>
     *
     *    store Board as well as , after every move
     *
     *    Advantage:- you know game board at every state
     *    Disadvantage:- Bad space complexity
     *
     *
     *
     *
     *
     **/


    /**
     * class Diagram:-
     * player
     * Board
     * cell
     * game
     * symbol
     *
     *
     *
     * Game:-
     * Board
     * List<Player>
     *
     * Player:-
     * id
     * name
     * symbol
     * playedType
     *
     * playerType:-
     * human
     * bot
     *
     * Bot(child class of player):-
     * difficultLevel
     *
     * BotDifficultLevel:-
     * Easy
     * Medium
     * Hard
     *
     * Board:-
     * List<List<Cell>>
     * size
     *
     * Cell:-
     * symbol
     * row
     * col
     * cellState
     *
     * cellState:-
     * Filled
     * Empty
     *
     * Symbol:-
     *
     * Move:-
     * Cell
     * Player
     *
     * GameState:-
     * END
     * DRAW
     * IN_PROGRESS
     *
     *
     * next player index
     * game state
     * Bot strategy
     *
     *
     * Design Pattern:-
     * 1.strategy
     * -finding Bot difficulty
     * -rule winning strategy
     * -player strategy
     *
     * 2.Game Strategy
     * validation pass
     * many attributes
     *
     *
     * Finding Winner in O(1) time:
     *
     * 1 full row same symbol
     * 1 full col same symbol
     * 1 full diagonal same symbol
     *
     * Goal find the winner:-
     * 1.Brute force way:-O(n^3)
     *
     * checkWinner(Board board){
     *     for every player:
     *       for every row:
     *          for every col:
     *             if(all symbols in a row || all symbols in a col || all symbols in diagonal){
     *                 return true;
     *             }
     *     return false;
     * }
     *
     * 2.Better approach:- O(n^2)
     *
     *      * checkWinner(Board board, Player lastMovePlayer){
     *      *       for every row:
     *      *          for every col:
     *      *             if(all symbols in a row || all symbols in a col || all symbols in diagonal){
     *      *                 return true;
     *      *             }
     *      *     return false;
     *
     * 3.More better approach:-O(n)
     *
     * checkWinner(Board board, Player lastMovePlayer){
     *     1.for loop -> row
     *     2.for loop -> col
     *     if(diagonal){
     *         for loop for diagonal
     *     }
     * }
     *
     * 4.Best approach:- O(1)
     *
     * crete hashmap and store
     * for all rows -> R1, R2,R3
     *         cols -> C1, C2, C3
     *         diagonal -> D1, D2
     * after every move, insert/update into map
     *
     *
     */
}
