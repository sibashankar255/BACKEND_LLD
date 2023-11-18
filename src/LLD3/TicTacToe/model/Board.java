package LLD3.TicTacToe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> cells;
    Integer size;

    public Board(int dimensions) {
        cells = new ArrayList<>();
        size=dimensions;
        for (int i=0; i<dimensions; i++){
            cells.add(new ArrayList<>());  // Row-1, Row 2, Row 3
            for (int j=0; j<dimensions; j++){
                cells.get(i).add(new Cell(i,j));
            }
        }

    }

    public List<List<Cell>> getCells() {return cells;}
    public Integer getSize() {return size;}

    public void printBoard() {
        for (List<Cell> row : cells){
            for (Cell cell : row){
                //print the cell
                cell.display();
            }
            System.out.println("\n");
        }
    }
}
