package LLD3.TicTacToe.model;

import LLD3.TicTacToe.model.type.BotDifficultyLevel;
import LLD3.TicTacToe.model.type.PlayerType;

import java.util.Objects;
import java.util.Scanner;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;

    public Bot(Integer id, String name, Symbol symbol, PlayerType playerType, Scanner scanner,
               BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, playerType,scanner);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bot bot = (Bot) o;
        return botDifficultyLevel == bot.botDifficultyLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(botDifficultyLevel);
    }
}
