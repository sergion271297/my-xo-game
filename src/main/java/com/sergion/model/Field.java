package com.sergion.model;

public class Field {

    private final Figure[][] figures = new Figure[3][3];


    public int getSize() {
        return figures.length;
    }

    public Figure getFigure(final Point point) {
        return figures[point.getX()][point.getY()];
    }

    public void setFigure(final Point point, final Figure figure) {
        figures[point.getX()][point.getY()] = figure;
    }

    public void delFigure(final Point point){
        figures[point.getX()][point.getY()] = null;
    }

}