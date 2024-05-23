package Code.tictactoe.model;

import java.util.List;

public class Board {
    List<List<Cell>> cells;
    Integer size;

    public Board(int size) {
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
