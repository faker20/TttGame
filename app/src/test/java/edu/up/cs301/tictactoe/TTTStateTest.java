package edu.up.cs301.tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

public class TTTStateTest {

    @Test
    public void getPiece() {
        TTTState s = new TTTState();
        char c = s.getPiece(0,0);
        assertEquals(' ',c);
    }

    @Test
    public void setPiece() {
        TTTState s = new TTTState();
        s.setPiece(0,1, 'X');
        char c = s.getPiece(0,1);
        assertEquals('X',c);
    }

    @Test
    public void getWhoseMove() {
        TTTState s = new TTTState();
        int curPlayer = s.getWhoseMove();
        assertEquals(0,curPlayer);
    }

    @Test
    public void setWhoseMove() {
        TTTState s = new TTTState();
        s.setWhoseMove(1);
        int curPlayer = s.getWhoseMove();
        assertEquals(1,curPlayer);
    }
}