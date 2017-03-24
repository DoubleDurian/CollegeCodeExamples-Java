/*
 * Program:
 * This:
 * Author:
 * Date:
 * Purpose:
 */
package fxtest2;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
public class FXTest2 extends Application{

  
    public static void main(String[] args) 
    {
       Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) 
    {
        //bootup stage
        primaryStage.setTitle("BrickBreaker FX Testing");
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        Canvas canvas = new Canvas(1366,700);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        final long startNanoTime = System.nanoTime();
        new AnimationTimer()
        {
        public void handle(long currentNanoTime)
        {
            double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
 
            double x = 232 + 128 * Math.cos(t);
            double y = 232 + 128 * Math.sin(t);
            // background image clears canvas
            //gc.drawImage( space, 0, 0 );
            gc.setFill(Color.BLACK);
            gc.fillRect(0, 0, 512, 512);
            gc.setFill(Color.BLUE);
            gc.fillOval(x, y, 50, 50);
            gc.setFill(Color.YELLOW);
            gc.fillOval(canvas.getWidth()/2, canvas.getHeight()/2, 50, 50);
            //gc.drawImage( sun, 196, 196 );
        }
        }.start();
        primaryStage.show();
    }
    
}
