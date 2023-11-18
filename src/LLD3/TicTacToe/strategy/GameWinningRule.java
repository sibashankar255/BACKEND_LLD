package LLD3.TicTacToe.strategy;

import LLD3.TicTacToe.model.Board;
import LLD3.TicTacToe.model.Move;

public interface GameWinningRule {
    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
