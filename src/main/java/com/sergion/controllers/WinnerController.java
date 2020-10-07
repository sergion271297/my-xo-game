package com.sergion.controllers;

import com.sergion.model.*;

public class WinnerController {

    private Figure winner = null;

    public Figure getWinner(final Field field) {
        winner = null; //reset
        isRow(field);
        if (winner == null) isCollum(field);
        if (winner == null) isDiagonal(field);
        return winner;
    }

    private void isDiagonal(final Field field){
        if (field.getFigure(new Point(1,1)) != null) {
            if ((field.getFigure(new Point(1,1)).equals(field.getFigure(new Point(0,0))))
                    && (field.getFigure(new Point(1,1)).equals(field.getFigure(new Point(2,2))))) {
                winner = field.getFigure(new Point(1, 1));
                return;
            }
        }
        if (field.getFigure(new Point(1,1)) != null) {
            if ((field.getFigure(new Point(1,1)).equals(field.getFigure(new Point(2,0))))
                    && (field.getFigure(new Point(1,1)).equals(field.getFigure(new Point(0,2))))) {
                winner = field.getFigure(new Point(1, 1));
            }
        }
    }

    private void isRow(final Field field){
        for (int x=0; x < field.getSize(); x++) {
            if (field.getFigure(new Point(x,0)) != null) {
                if ((field.getFigure(new Point(x,0)).equals(field.getFigure(new Point(x,1))))
                        && (field.getFigure(new Point(x,0)).equals(field.getFigure(new Point(x,2))))) {
                    winner = field.getFigure(new Point(x, 0));
                }
            }
        }
    }

    private void isCollum(final Field field){
        for (int y=0; y < field.getSize(); y++) {
            if (field.getFigure(new Point(0,y)) != null) {
                if ((field.getFigure(new Point(0,y)).equals(field.getFigure(new Point(1,y))))
                        && (field.getFigure(new Point(0,y)).equals(field.getFigure(new Point(2,y))))) {
                    winner = field.getFigure(new Point(0, y));
                }
            }
        }
    }
}
