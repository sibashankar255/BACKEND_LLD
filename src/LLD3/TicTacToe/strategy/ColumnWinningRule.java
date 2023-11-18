package LLD3.TicTacToe.strategy;

import LLD3.TicTacToe.model.Board;
import LLD3.TicTacToe.model.Move;
import LLD3.TicTacToe.model.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningRule implements GameWinningRule{

    private final Map<Integer, HashMap<Symbol,Integer>> colCount = new HashMap<>();
    /**
     * Map<ColumnNo, Map<Symbol,Int>>
     *
     * {
     *     <C1,<Symbol,Count>>
     *     <C2,<Symbol,Count>>
     *     <C3,<Symbol,Count>>
     *
     * }
     * @param board
     * @param move
     * @return
     */
    @Override
    public boolean checkWinner(Board board, Move move) {
        //s1: get the col cell
        //s2:
        int col = move.getCell().getCol();

        if (!colCount.containsKey(col)){
            colCount.put(col,new HashMap<>());
        }

        Map<Symbol, Integer> symbolIntegerMap = colCount.get(col);
        Symbol playerSymbol = move.getPlayer().getSymbol();

        if (!symbolIntegerMap.containsKey(playerSymbol)){
            symbolIntegerMap.put(playerSymbol,0);
        }

        if (symbolIntegerMap.get(playerSymbol).equals(board.getSize())){
            return true;
        }

        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
