/*
 * Program:effectsTesting
 * This:EffectsTesting.java
 * Author:Nicholas Johnston
 * Date:5/26/2016
 * Purpose:To test out and learn from the javaFX library
 */
package effectstesting;
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

public class EffectsTesting extends Application
{
    

    @Override
    public void start(Stage primaryStage)
    {
        /*
        Scene scene = new Scene(new Button("OK"),200,250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Stage stage = new Stage();
        stage.setTitle("Second stage");
        stage.setScene(new Scene(new Button("New Stage"),200,100));
        stage.show();
        */
        /*
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        Scene scene = new Scene(pane,200,50);
        primaryStage.setTitle("Button in a pane");
        primaryStage.setScene(scene);
        primaryStage.show();
        */
        /*
        =============================================
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        ==================================================
        
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        Scene scene = new Scene(pane,200,200);
        primaryStage.setTitle("Show Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
        */
        /*
        Pane pane = new Pane();
        
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        
        Scene scene = new Scene(pane,200,200);
        primaryStage.setTitle("Show Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
        */
        /*
        primaryStage.setTitle("Rendering practice");
        
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        Canvas canvas = new Canvas(400,200);
        root.getChildren().add(canvas);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        //here comes the render part
        
        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
        gc.setFont( theFont );
        gc.fillText( "Hello, World!", 60, 50 );
        gc.strokeText( "Hello, World!", 60, 50 );
                
        primaryStage.show();
        */
        primaryStage.setTitle("Rendering testing, Nicholas Johnston");
        
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        Canvas canvas = new Canvas(512,512);
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
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
}
