package com.sergion;

import java.io.IOException;

import com.sergion.controllers.*;
import com.sergion.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class fieldController {
    @FXML
    Pane paneFinal;
    @FXML
    Text textFinal;
    @FXML
    Button btn00, btn01, btn02;
    @FXML
    Button btn10, btn11, btn12;
    @FXML
    Button btn20, btn21, btn22;

    private int figureCounter = 0;

    Field field = new Field();
    CurrentMoveController cmc = new CurrentMoveController();
    MoveController mc= new MoveController();
    WinnerController wc = new WinnerController();
    BotMoveController bmc = new BotMoveController();

    private void stopGame(){
        btn00.setDisable(true);
        btn01.setDisable(true);
        btn02.setDisable(true);
        btn10.setDisable(true);
        btn11.setDisable(true);
        btn12.setDisable(true);
        btn20.setDisable(true);
        btn21.setDisable(true);
        btn22.setDisable(true);
        paneFinal.setDisable(false);
        textFinal.setText("Click or press any key");
    }

    private void botButtonClick(Point point){
        Figure botFigure = cmc.currentMove(field);
        //System.out.println("BOT coordinate: "+point.getX()+" "+ point.getY());
        mc.applyFigure(field, point, botFigure);
        figureCounter++;
        System.out.println(figureCounter);
        getBtnByPoint(point).setDisable(true);
        getBtnByPoint(point).setText(botFigure.toString());
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
        }
    }

    private Button getBtnByPoint(Point p){
        if (p.getX()==0 && p.getY()==0) return btn00;
        if (p.getX()==0 && p.getY()==1) return btn01;
        if (p.getX()==0 && p.getY()==2) return btn02;
        if (p.getX()==1 && p.getY()==0) return btn10;
        if (p.getX()==1 && p.getY()==1) return btn11;
        if (p.getX()==1 && p.getY()==2) return btn12;
        if (p.getX()==2 && p.getY()==0) return btn20;
        if (p.getX()==2 && p.getY()==1) return btn21;
        if (p.getX()==2 && p.getY()==2) return btn22;
        else return null;
    }

    @FXML
    private void switchToMenu() throws IOException {
            Game.setRoot("menu");
    }

    @FXML
    private void btn00() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(0,0), currentFigure);
        btn00.setText(currentFigure.toString());
        btn00.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }

    @FXML
    private void btn01() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(0,1), currentFigure);
        btn01.setText(currentFigure.toString());
        btn01.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }

    @FXML
    private void btn02() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(0,2), currentFigure);
        btn02.setText(currentFigure.toString());
        btn02.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }

    @FXML
    private void btn10() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(1,0), currentFigure);
        btn10.setText(currentFigure.toString());
        btn10.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }

    @FXML
    private void btn11() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(1,1), currentFigure);
        btn11.setText(currentFigure.toString());
        btn11.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }

    @FXML
    private void btn12() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(1,2), currentFigure);
        btn12.setText(currentFigure.toString());
        btn12.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }

    @FXML
    private void btn20() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(2,0), currentFigure);
        btn20.setText(currentFigure.toString());
        btn20.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }

    @FXML
    private void btn21() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(2,1), currentFigure);
        btn21.setText(currentFigure.toString());
        btn21.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }
    @FXML
    private void btn22() {
        figureCounter++;
        Figure currentFigure = cmc.currentMove(field);
        mc.applyFigure(field, new Point(2,2), currentFigure);
        btn22.setText(currentFigure.toString());
        btn22.setDisable(true);
        if (wc.getWinner(field) != null || figureCounter == 9){
            stopGame();
            return;
        }
        if (Game.singlePlayer) botButtonClick(bmc.getBotMove(field));
    }
}