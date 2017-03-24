/*
 * Program:FXTesting3
 * This:Input.java
 * Author:Nicholas Johsnton
 * Date:6/4/2016
 * Purpose:This handles and records user input
 */
package fxtest3;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Input 
{
    //variables
    boolean isLeft = false;
    boolean isRight = false;
    boolean isUp = false;
    boolean isDown = false;
    Scene scene;
    //constructors
    public Input(Scene scene)
    {
        this.scene = scene;
        init();
    }
    //methods
    void init()
    {
       scene.setOnKeyPressed(new EventHandler<KeyEvent>() 
       {//determines when keys are depressed
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:    isUp = true; break;
                    case DOWN:  isDown = true; break;
                    case LEFT:  isLeft  = true; break;
                    case RIGHT: isRight  = true; break;
                }
            }
        });
       scene.setOnKeyReleased(new EventHandler<KeyEvent>() 
       {//determines when keys are not depressed
          
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:    isUp = false; break;
                    case DOWN:  isDown = false; break;
                    case LEFT:  isLeft  = false; break;
                    case RIGHT: isRight  = false; break;
                }
            }
        });
        
    }
}
