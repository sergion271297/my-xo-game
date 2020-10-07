package com.sergion.controllers;

import com.sergion.model.*;

public class CurrentMoveController {

    public Figure currentMove(Field field) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < field.getSize(); i++) {
            for (int i2 = 0; i2 < field.getSize(); i2++) {
                final Figure figure = field.getFigure(new Point(i, i2));
                if (figure == null) continue;
                if (Figure.X.equals(figure)) countX++;
                if (Figure.O.equals(figure)) countO++;
            }
        }
        if (countX == countO) return Figure.X;
        else return Figure.O;
    }
}
