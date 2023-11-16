package GoodPracticesLLD;

public class Overview {

    /*

    1.judge by code
    project structure
    at least something must run
    always code by functionality

    instead of models -> controllers -> services
    go with :-
    all models -> requirements
    classes in your class diagram


    Terminologies:-
    Models:- all classes in class diagram
    controller:- entry point for requests
    service:- does all hard work
    repo:- classes that query db



    Design TicTacToe:-

    1. Overview
    1.confirm with interviewer about your understanding

    2. what type of design
    entity design
    interactive system
    web-API system


    1.size of board can vary
    2.number of players
    3.every player has own symbols
    4.every player can select their symbol (unique)
    5.who play first
    -> randomize list & play in order
    e.g -> A,B,C,D -> random -> B,C,D,A
    6.can game have bots
    edge case -> can all players be bots
    7. bot difficulty level -> easy/med/hard
    8.how /when game would start
    9.how can game end?

    -> draw
    -> win

    multiple ways a user can win:-
    -> this is decided at game start

    10. blocked cells(not considered)
    11. player can UNDO
    any number of UNDO
    12. re-watch game(store all moves)

    Any game -> size of board/ number of players/ bots/ win criteria/ UNDO/ leaderboard/ game start/ game end



    4.class diagram



    implementing UNDO:-







     */
}
