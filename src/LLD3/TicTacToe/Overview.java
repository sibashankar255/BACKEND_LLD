package LLD3.TicTacToe;

public class Overview {
    /*
    class diagram:-
    player
    board
    cell
    game
    symbol


    Game:-
    List<Player>
    Board
    List<Move>
    GameState
    nextPlayer


    GameState(Enum):-
    END
    DRAW
    In-Progress


    Player:-
    id
    name
    age
    symbol


    Bot:-
    difficulty level


    BotDifficultyLevel
    EASY
    MEDIUM
    DIFFICULT



    PlayerType:-
    bot
    human


    Board:-
    List<List<cell>> board
    size


    Cell:-
    symbol
    row
    column
    isFilled
    cellState


    CellState:-
    Filled
    Empty


    Symbol(Enum):-


    Move:-
    cell
    player



    Design Patterns:-

    1.Strategy:-
    - finding Bot difficulty
    - rule wining strategy

    2.Builder:-
    Game Object

    Finding winner in O(1) time:-
    1 full row same symbol
    1 full col same symbol
    1 full diagonal same symbol


    1.Brute force way:-O(n^3)

    checkWinner(Board board, Player lastMovePlayer){
     for every player:
        for every Row:
            for every col:
               if(all same symbol in a row || all same symbol in col || all same symbol in col){
                  return true;
               }
    }

    2.Better approach:-O(n^2)
    checkWinner(Board board, Player lastMovePlayer){
    1.for loop -> row
    2.for loop -> col
       if(diagonal){
       for loop for diagonal;
       }
    }

    3.best approach:-O(1)
    after every move, insert/update into Map




     */
}
