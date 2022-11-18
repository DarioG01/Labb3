package com.example.labb3;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class ShapeViewController {
    public Canvas canvas;

    public GraphicsContext Context;

    public void initialize(){
        Context = canvas.getGraphicsContext2D();
    }

    public void onCanvasClicked(MouseEvent mouseEvent) {
        GraphicsContext Context = canvas.getGraphicsContext2D();

        Context.setFill(Color.BLUE);
        Context.fillRect(mouseEvent.getX()-50, mouseEvent.getY()-50, 100,100);
    }
}
