package com.sergion.controllers;

import com.sergion.model.*;

import java.util.Random;

public class BotMoveController {
    private Point p1 = new Point(0,0);  private Point p2 = new Point(0,1);  private Point p3 = new Point(0,2);
    private Point p4 = new Point(1,0);  private Point p5 = new Point(1,1);  private Point p6 = new Point(1,2);
    private Point p7 = new Point(2,0);  private Point p8 = new Point(2,1);  private Point p9 = new Point(2,2);

    public Point getBotMove(Field field){

        Random random = new Random();
        Point[] points = {p1, p2, p3, p4, p5, p6, p7, p8, p9};
        while (true){
            Point p = points[random.nextInt(9)];
            if (field.getFigure(p) == null) return p;
        }
    }

}
