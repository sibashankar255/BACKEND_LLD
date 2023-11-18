package LLD3.TicTacToe.model;

import LLD3.TicTacToe.model.type.CellState;

public class Cell {
    Integer row;
    Integer col;
    CellState cellState;
    Player player;

    public Cell(int row, int col) {
        this.row=row;
        this.col=col;
        this.cellState = CellState.EMPTY;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public Integer getRow() {return row;}
    public Integer getCol() {return col;}
    public CellState getCellState() {return cellState;}
    public Player getPlayer() {return player;}

    public void display() {
        if (getPlayer() ==null){
            System.out.print("| - |");
        }else {
            System.out.println("| "+ getPlayer().getSymbol().playerSymbol +" |");
        }
    }
}
