package com.sergion.controllers;

import com.sergion.model.*;

public class MoveController {

    public boolean applyFigure(final Field field, final Point point, final Figure figure){
        final int maxSize = field.getSize();
        if (checkCoordinate(point.getX(), maxSize) && checkCoordinate(point.getY(), maxSize) && field.getFigure(point) == null) {
            field.setFigure(point, figure);
            return true;
        }
        return false;
    }

    private  boolean checkCoordinate(final int coordinate, final int maxSize) {
        return coordinate >= 0 && coordinate < maxSize;
    }


}
