package com.example.labb3;


import com.example.labb3.model.SnakeModel;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class GameViewController {

    public Canvas canvas;

    public GraphicsContext context;

    public SnakeModel snake = new SnakeModel();


    public void initialize(){
        context = canvas.getGraphicsContext2D();
        canvas.setFocusTraversable(true);
        gameAnimation.start();
    }

    float time;

        GameAnimation gameAnimation = new GameAnimation() {
            @Override
            public void tick(float secondSinceLastFrame) {
                time += secondSinceLastFrame;
                if (time < 0.2)
                    return;

                snake.update();
                render();
                time = 0.0f;
            }
        };


    public void render() {


        context.setFill(Color.BLUE);
        context.fillRect((snake.getPosition().x()*10), (snake.getPosition().y()*10), 10,10);
    }

    public void keyPressed(KeyEvent keyEvent) {

        switch (keyEvent.getCode()){
            case UP -> snake.setUp();
            case DOWN -> snake.setDown();
            case LEFT -> snake.setLeft();
            case RIGHT -> snake.setRight();

        }
    }
}
