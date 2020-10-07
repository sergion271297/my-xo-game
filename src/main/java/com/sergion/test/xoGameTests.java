package com.sergion.test;

import com.sergion.controllers.*;
import com.sergion.model.*;
import com.sergion.view.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class xoGameTests {


    @Test
    public void WinnerControllerTestHorizontal(){
        Field field = new Field();
        ConsoleView consoleView = new ConsoleView();
        WinnerController wc = new WinnerController();
        testHelper th = new testHelper();

        th.setField(field, null, null, null, null, null, null, null, null, null);
        Assertions.assertNull(wc.getWinner(field));
        System.out.println("x\\y ➝\n" + "↓ ");
        System.out.println(consoleView.show(field) + "Winner: "+wc.getWinner(field));

        th.setField(field, "O", "O", "O", null, null, null, "X", "O", "X");
        Assertions.assertEquals(Figure.O, wc.getWinner(field));
        System.out.println(consoleView.show(field) + "Winner: "+wc.getWinner(field));

        th.setField(field, null, null, null, null, null, null, "X", "X", "X");
        Assertions.assertEquals(Figure.X, wc.getWinner(field));
        System.out.println(consoleView.show(field) + "Winner: "+wc.getWinner(field));

        th.setField(field, null, null, null, "X", "X", "X", "O", "O", "X");
        Assertions.assertEquals(Figure.X, wc.getWinner(field));
        System.out.println(consoleView.show(field) + "Winner: "+wc.getWinner(field));

        th.setField(field, null, "O", "O", null, null, null, null, null, null);
        Assertions.assertNull(wc.getWinner(field));
        System.out.println(consoleView.show(field) + "Winner: "+wc.getWinner(field));
    }

    @Test
    public void WinnerControllerTestVertical(){
        Field field = new Field();
        ConsoleView consoleView = new ConsoleView();
        WinnerController wc = new WinnerController();
        testHelper th = new testHelper();

        th.setField(field, null, "X", null, null, "X", null, null, "X", null);
        System.out.println("Winner: "+wc.getWinner(field));
        System.out.println(consoleView.show(field));

        th.setField(field, null, null, "O", null, null, "O", "X", "X", "O");
        System.out.println("Winner: "+wc.getWinner(field));
        System.out.println(consoleView.show(field));

        th.setField(field, "X", "O", null, "X", "O", null, "X", null, "X");
        System.out.println("Winner: "+wc.getWinner(field));
        System.out.println(consoleView.show(field));

        th.setField(field, null, "X", null, null, "X", null, null, null, null);
        System.out.println("Winner: "+wc.getWinner(field));
        System.out.println(consoleView.show(field));

    }

    @Test
    public void WinnerControllerTestDiagonal(){
        Field field = new Field();
        ConsoleView consoleView = new ConsoleView();
        WinnerController wc = new WinnerController();
        testHelper th = new testHelper();

        th.setField(field, "X", null, null, null, "X", null, null, null, "X");
        System.out.println("Winner: "+wc.getWinner(field));
        System.out.println(consoleView.show(field));

        th.setField(field, "O", null, null, null, "O", null, null, null, "O");
        System.out.println("Winner: "+wc.getWinner(field));
        System.out.println(consoleView.show(field));

        th.setField(field, "X", null, null, null, null, null, null, null, "X");
        System.out.println("Winner: "+wc.getWinner(field));
        System.out.println(consoleView.show(field));

        th.setField(field, null, null, "X", null, "X", null, "X", null, null);
        System.out.println("Winner: "+wc.getWinner(field));
        System.out.println(consoleView.show(field));

    }
}
