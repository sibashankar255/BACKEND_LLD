package LLD3.TicTacToe.model;

public class Move {
    Cell cell;
    Player player;

    public Move(Cell cell, Player player) {
        this.cell=cell;
        this.player=player;
    }


    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }
    public Player getPlayer() {
        return player;
    }
}
