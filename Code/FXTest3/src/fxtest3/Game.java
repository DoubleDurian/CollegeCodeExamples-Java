/*
 * Program:
 * This:
 * Author:
 * Date:
 * Purpose:
 */
package fxtest3;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.nio.IntBuffer;
import javafx.animation.AnimationTimer;
//import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelReader;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.WritableImage;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.PixelFormat;
import javafx.scene.image.WritablePixelFormat;
        


public class Game 
{
    public boolean running = true;//informs the game that it is running
    public int tickCount = 0;//tells the number of logic updates since start
    public int width = 1370;//gives width of screen
    public int height = 768;//gives height of screen
    
    WritableImage myWritableImage;
    PixelWriter myPixelWriter;
    PixelReader myPixelReader;
    PixelFormat myFormat;
    int[] pixel;
    
    Player player = new Player();
    Ball ball = new Ball();
    BrickArray brickArray = new BrickArray();
    Brick tempBrick;
    Input input;
    
    int killed = 0;
    int score = 0;
    int mistakes =0;
    
    public void run(Stage primaryStage)
    {
        //=============================================================
        //Staging Block and Initialization
        //=============================================================
        primaryStage.setTitle("Rendering testing, Nicholas Johnston");       
        Group root = new Group();
        Scene scene = new Scene(root);
        input = new Input(scene);
        primaryStage.setScene(scene);
        Canvas canvas = new Canvas(width,height);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        
        
        
        primaryStage.setFullScreen(true);
        primaryStage.setResizable(false);
        primaryStage.show();
        //==============================================================
        //rendering and logic Block
        //==============================================================
        final long startNanoTime = System.nanoTime();
        new AnimationTimer()
        {
        public void handle(long currentNanoTime)
        {
            double t = (currentNanoTime - startNanoTime) / 1000000000.0; 
            //System.out.println("Out");
            tick();
            render(gc);
        }
        }.start();
    }
    public void tick()
    {
        tickCount++;
        //randImage();
        //===========================
        //control block
        //===========================
        //paddle control
        if(input.isLeft)
        {
            player.decreaseXVec();
        }
        if(input.isRight)
        {
            player.increaseXVec();
        }
        //
        //==========================
        //motion block
        //==========================
        player.xDelta();
        player.yDelta();
        ball.Delta(player);
        killed +=brickArray.checkAll(ball);
           score = killed - (mistakes*10);
        //=========================
        //friction block
        //=========================
        
        
    }
    public void render(GraphicsContext gc)
    {
        //black background
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, width, height);
        //===============================
        //Entity Block
        //===============================
        //paddle
        gc.setFill(Color.YELLOW);
        gc.fillRect(player.xPos, player.yPos, player.xSize, player.ySize);
        //ball
        gc.setFill(Color.CHARTREUSE);
        gc.fillOval(ball.xPos, ball.yPos, 20, 20);
        //bricks
        for(int i =0; i < brickArray.down;i++)
        {
           for(int j = 0; j<brickArray.cross;j++)
            {
               tempBrick =brickArray.bricks[i][j];
               gc.setFill(tempBrick.getShade());
               if(tempBrick.notBroke)
                {
                   gc.fillRect(tempBrick.xPos, tempBrick.yPos, tempBrick.sizeX, tempBrick.sizeY);
                } 
            }
        } 
    }
    

    
}
