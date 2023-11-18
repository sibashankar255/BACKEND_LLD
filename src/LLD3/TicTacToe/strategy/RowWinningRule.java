package LLD3.TicTacToe.strategy;

import LLD3.TicTacToe.model.Board;
import LLD3.TicTacToe.model.Move;
import LLD3.TicTacToe.model.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningRule implements GameWinningRule{

    private final Map<Integer, HashMap<Symbol,Integer>> rowCount = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();

        if (!rowCount.containsKey(row)){
            rowCount.put(row,new HashMap<>());
        }

        Map<Symbol, Integer> symbolIntegerMap = rowCount.get(row);
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
