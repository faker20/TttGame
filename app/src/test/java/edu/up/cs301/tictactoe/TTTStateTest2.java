package edu.up.cs301.tictactoe;

import org.junit.Test;

import static org.junit.Assert.*;

public class TTTStateTest2 {

    @Test
    public void getPiece() {
        TTTState s = new TTTState();
        char c = s.getPiece(-1,0);
        assertEquals('?',c);
        c = s.getPiece(3,0);
        assertEquals('?',c);
        c = s.getPiece(0,-1);
        assertEquals('?',c);
        c = s.getPiece(0,3);
        assertEquals('?',c);
    }

    @Test
    public void setPiece() {
        TTTState s = new TTTState();
        s.setPiece(1,2,'O');
        char c = s.getPiece(1,2);
        assertEquals('O',c);
    }
}