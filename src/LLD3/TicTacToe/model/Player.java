package LLD3.TicTacToe.model;

import LLD3.TicTacToe.model.type.PlayerType;

import java.util.Scanner;

public class Player {
    Integer id;
    String name;
    Symbol symbol;
    PlayerType playerType;
    private Scanner scanner;

    public Player(Integer id, String name, Symbol symbol, PlayerType playerType, Scanner scanner) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        this.scanner = scanner;
    }

    public Integer getId() {return id;}
    public String getName() {return name;}
    public Symbol getSymbol() {return symbol;}
    public PlayerType getPlayerType() {return playerType;}

    public Move makeMove() {
        System.out.println("please specify the row where you want to make move");
        int row = scanner.nextInt();

        System.out.println("please specify the col where you want to make move");
        int col = scanner.nextInt();

        return new Move(new Cell(row,col),this);
    }
}
