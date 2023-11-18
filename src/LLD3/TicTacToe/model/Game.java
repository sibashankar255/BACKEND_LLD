package LLD3.TicTacToe.model;

import LLD3.TicTacToe.model.type.CellState;
import LLD3.TicTacToe.model.type.GameState;
import LLD3.TicTacToe.model.type.PlayerType;
import LLD3.TicTacToe.strategy.GameWinningRule;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> players; //yes
    Board board; //no
    List<Move> playerMoves; //no
    Player winnerPlayer; //no
    GameState gameState; //no
    Integer nextPlayerIndex; //no
    List<GameWinningRule> winningRules; //yes

    private Game(List<Player> players, int dimensions, List<GameWinningRule> winningStrategies) {
        this.players=players;
        this.board = new Board(dimensions);
        this.playerMoves=new ArrayList<>();
        this.gameState=GameState.IN_PROGRESS;
        this.nextPlayerIndex=0;
        this.winningRules=winningStrategies;
    }

    public List<Player> getPlayers() {return players;}
    public Board getBoard() {
        return board;
    }
    public List<Move> getPlayerMoves() {
        return playerMoves;
    }
    public Player getWinnerPlayer() {
        return winnerPlayer;
    }
    public GameState getGameState() {
        return gameState;
    }
    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public static Builder getGameBuilder(){
        return new Builder();
    }

    public void makeMove() throws Exception {
        //s1: I need the index for player for which move has to be done
        //s2: ask player to make a move
        //s3: validate the move
        //s4: update the cell on board
        //s5: update nextPlayerTurn Index
        //s6: check winner
        //

        Player currPlayer = players.get(nextPlayerIndex);
        Move currMove = currPlayer.makeMove();

        if (!validateMove(currMove)){
            throw new Exception();
        }

        int row = currMove.getCell().getRow();
        int col = currMove.getCell().getCol();

        Cell cellToBeUpdated = getBoard().getCells().get(row).get(col);
        cellToBeUpdated.setCellState(CellState.FILLED);
        cellToBeUpdated.setPlayer(currMove.getPlayer());

        currMove.setCell(cellToBeUpdated);
        playerMoves.add(currMove);

        nextPlayerIndex++; //1
        nextPlayerIndex %= players.size(); // 1%2 =1 ; 2%2=0; 3%2=1


        if (checkWinner(board,currMove)){
            gameState = GameState.END;
            winnerPlayer = currPlayer;
        } else if (playerMoves.size() == board.getSize()* board.getSize()) {
            //when all the cells are filled
            gameState = GameState.DRAW;
        }

    }

    private boolean checkWinner(Board board,Move currMove) {
        for (GameWinningRule rule : winningRules){
            if (rule.checkWinner(board,currMove)){
                return true;
            }
        }
        return false;
    }

    private boolean validateMove(Move currMove) {
        if (currMove.getCell().getCellState().equals(CellState.FILLED)){
            return false;
        }

        int row = currMove.getCell().getRow();
        int col = currMove.getCell().getCol();

        if (row>=board.getSize()){
            return false;
        }
        if (col>=board.getSize()){
            return false;
        }
        return true;
    }

    public void printBoard() {
        board.printBoard();
    }

    public void undo() {
        //s1: get the last move
        //s2: remove last move from the last
        //s3: update the cell
        //s4: update the hashmap
        //s5: update the turn

        Move lastMove = playerMoves.get(playerMoves.size()-1);
        playerMoves.remove(lastMove);
        Cell cellToBeUpdated = lastMove.getCell();
        cellToBeUpdated.setPlayer(null);
        cellToBeUpdated.setCellState(CellState.EMPTY);



    }

    //players: n-1
    //bots: all players should not be bots

    public static class Builder{
        private List<Player> players;
        private List<GameWinningRule> winningRules;
        private int dimensions;

        private Builder() {
            this.players = new ArrayList<>();
            this.winningRules = new ArrayList<>();
            this.dimensions = 0;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningRules(List<GameWinningRule> winningRules) {
            this.winningRules = winningRules;
            return this;
        }

        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Game build() throws Exception {
            //validate
            //create new object
            validate();

            return new Game(players,dimensions,winningRules);
        }

        private void validate() throws Exception {
            //number of bots
            validateForBotCount();

            //number of players
            validateForNumberPlayers();
        }

        private void validateForNumberPlayers() throws Exception {
            if (players.size() == dimensions){
                throw  new Exception();
            }
        }

        private void validateForBotCount() throws Exception {
            int botCount=0;

            for (Player p : players){
                if (p.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if (botCount ==players.size()-1){
                throw new Exception();
            }
        }
    }
}
