/*
 * Program:
 * This:
 * Author:
 * Date:
 * Purpose:
 */
package fxtest3;

import javafx.application.Application;
import javafx.stage.Stage;

public class FXTest3 extends Application
{
    

    public static void main(String[] args) 
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Game game = new Game();
        game.run(primaryStage);
    }
    
}
