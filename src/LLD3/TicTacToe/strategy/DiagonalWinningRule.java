package LLD3.TicTacToe.strategy;

import LLD3.TicTacToe.model.Board;
import LLD3.TicTacToe.model.Move;

public class DiagonalWinningRule implements GameWinningRule{

    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
