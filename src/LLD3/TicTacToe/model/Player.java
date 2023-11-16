package LLD3.TicTacToe.model;

import LLD3.TicTacToe.model.type.PlayerType;

public class Player {
    Integer id;
    String name;
    Symbol symbol;
    PlayerType playerType;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
}
