package LLDPROBLEMS.CHESS;

import java.util.List;

public class Chess{
    ChessBoard board;
    Player[] players;
    Player currentPlayer;
    List<Move> movesList;
    GameStatus gameStatus;

    public boolean playerMove(CellPosition from , CellPosition to , Piece piece);
    public boolean endGame();
    private void changeTurn(); //cuz it will be called from playerMove only.

}

public class Player{
    Color color;
    Account account;
    Time timeleft;
}

public class Account {
    String username;
    String password;

    String emailID;
    String name;
    String phone;
}

public enum Color {
    BLACK , WHITE;
}

public class Time {
    int mins;
    int seconds;
}

public enum GameStatus {
    ACTIVE , PAUSED , FORTFEIGHT , BLACK_WIN , WHITE_WIN;
}

public class ChessBoard {
    List<List<Cell>> board; //gives us more flexibility , going forward we can change the shape as well , instead of matrix.

    public void resetBoard();
    public void updateBoard(Move move); //will be called from PlayerMove api in chess class. thats y we have included board in chess class.

}

public class Cell {
    Color color;
    CellPosition position;
    Piece piece;
}

public class CellPosition {
    char row;
    int col; //d4 //e5 are few examples.
}

public class Move {
    Player whoPlayed;
    Piece moved;
    Piece killed;
    CellPosition from;
    CellPosition to;
}

public abstract class Piece {
    Color color;

    public abstract boolean move(CellPosition from , CellPosition to); //can be called from Chess Class.
    public abstract List<Move> allPossibleMoves(CellPosition from); //to see all possible moves from current position.
    public abstract boolean validate(CellPosition from , CellPosition to); //to validate if the move is possible?
}

//pieces can be of many types.
public class Rook extends Piece {
    @Override
    public boolean move(CellPosition from, CellPosition to) {
        return false;
    }

    @Override
    public List<Move> allPossibleMoves(CellPosition from) {
        return null;
    }

    @Override
    public boolean validate(CellPosition from, CellPosition to) {
        return false;
    }
}

public class Pawn extends Piece {
    @Override
    public boolean move(CellPosition from, CellPosition to) {
        return false;
    }

    @Override
    public List<Move> allPossibleMoves(CellPosition from) {
        return null;
    }

    @Override
    public boolean validate(CellPosition from, CellPosition to) {
        return false;
    }
}

public class King extends Piece {
    @Override
    public boolean move(CellPosition from, CellPosition to) {
        return false;
    }

    @Override
    public List<Move> allPossibleMoves(CellPosition from) {
        return null;
    }

    @Override
    public boolean validate(CellPosition from, CellPosition to) {
        return false;
    }
}

public class Bishop extends Piece {
    @Override
    public boolean move(CellPosition from, CellPosition to) {
        return false;
    }

    @Override
    public List<Move> allPossibleMoves(CellPosition from) {
        return null;
    }

    @Override
    public boolean validate(CellPosition from, CellPosition to) {
        return false;
    }
}

public class Queen extends Piece {
    @Override
    public boolean move(CellPosition from, CellPosition to) {
        return false;
    }

    @Override
    public List<Move> allPossibleMoves(CellPosition from) {
        return null;
    }

    @Override
    public boolean validate(CellPosition from, CellPosition to) {
        return false;
    }
}

public class Horse extends Piece {
    @Override
    public boolean move(CellPosition from, CellPosition to) {
        return false;
    }

    @Override
    public List<Move> allPossibleMoves(CellPosition from) {
        return null;
    }

    @Override
    public boolean validate(CellPosition from, CellPosition to) {
        return false;
    }
}













