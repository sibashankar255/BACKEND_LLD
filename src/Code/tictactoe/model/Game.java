package Code.tictactoe.model;

import Code.tictactoe.model.types.GameState;
import Code.tictactoe.model.types.PlayerType;
import Code.tictactoe.strategy.GameWinningRule;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> players;
    Board board;
    List<Move> playerMoves;
    Player winnerPlayer;
    GameState gameState;
    Integer nextPlayerIndex;
    List<GameWinningRule> winningRules;

    private Game(List<Player> players, int dimensions,
                 List<GameWinningRule> winningStrategies) {
        this.players = players;
        this.board=new Board(dimensions);
        this.playerMoves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerIndex=0;
        this.winningRules=winningStrategies;

    }

    public List<Player> getPlayerList() { return players; }
    public Board getBoard() { return board; }
    public List<Move> getMoveList() { return playerMoves; }
    public Player getWinnerPlayer() { return winnerPlayer; }
    public GameState getGameState() { return gameState; }
    public Integer getNextPlayerIndex() { return nextPlayerIndex; }
    public void makeMove() {}


    //players: n-1
    //bots: all player should not be bots
    public static class Builder{
        private List<Player> players;
        private List<GameWinningRule> winningRules;
        private int dimensions;

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

        public void validate() throws Exception{
            //number of bots
            validateForBots();
            //number of players
            validateForNumberOfPlayers();
        }

        private void validateForBots() throws Exception{
            if (players.size()-1 != dimensions){
                throw new Exception();
            }
        }

        public void validateForNumberOfPlayers() throws Exception{
            //number of bots
            int botCount=0;
            for (Player p : players){
                if (p.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if (botCount==players.size()){
                throw new Exception();
            }
        }
    }


}
