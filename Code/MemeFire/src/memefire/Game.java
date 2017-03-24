/*
 * Program:MemeFire
 * This:Game.java
 * Author:Nicholas Johnston
 * Date:4/4/2016
 * Purpose:This is the render object for writing to a screen object
 */
package memefire;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;
public class Game extends Canvas implements Runnable
{//=======class variables====================
   //=============dimensions of the screen
   public static final int Height = 768;
   public static final int Width = 1366;
   public static final String NAME = "Dank Memes";
   //=============JFrame==================
   private JFrame frame;
   //=============frame rate variables====
   public boolean running = false;
   public int tickCount = 0;
   public int tickMultiplier = 1;
   private BufferedImage image = new BufferedImage(Width,Height,BufferedImage.TYPE_INT_RGB);
   private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
   //=============class constructor=======
   public Game()
   {
       setMinimumSize(new Dimension(Width,Height));
       setMaximumSize(new Dimension(Width,Height));
       setPreferredSize(new Dimension(Width,Height));
       
       frame = new JFrame(NAME);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(new BorderLayout());
       frame.add(this,BorderLayout.CENTER);
       frame.pack();
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
   }
   public synchronized void start()
   {
       running = true;
       new Thread(this).start();
   }
   public synchronized void stop()
   {
       running = false;
   }
   @Override
   public void run()
   {
       long lastTime = System.nanoTime();
       double nsPerTick =1000000000D/60D;
       
       int frames = 0;
       int ticks = 0;
       
       long lastTimer = System.currentTimeMillis();
       double delta = 0;
       while(running)
       {
           long now = System.nanoTime();
           delta += (now - lastTime)/nsPerTick;
           lastTime = now;
           boolean shouldRender = false;
           while(delta>=1)
           {
               ticks++;
               tick();
               delta = delta - 1;
               shouldRender = true;
           }
           if(shouldRender)
           {
               frames++;
               render();
           }
           //System.out.println("The game is running now");
           
           
           
           if(System.currentTimeMillis() - lastTimer >=1000)
           {
               lastTimer +=1000;
               System.out.println("Frames:" + frames + "  Ticks:" + ticks);
               frames =0;
               ticks = 0;
           }
           
       }
   }
   public void tick()
   {
       tickCount = tickCount + tickMultiplier;
       randImage();
       
       
   }
   public void render()
   {
       BufferStrategy bs = getBufferStrategy();
       if(bs==null)
       {
           createBufferStrategy(3);
           
           return;
       }
       Graphics g = bs.getDrawGraphics();
       g.setColor(Color.BLACK);
       g.fillRect(0, 0, getWidth(), getHeight());
       
       g.drawImage(image,0,0,getWidth(),getHeight(),null);
       
       g.dispose();
       bs.show();
   }
   public void randImage()
   {
       for(int i = 0;i<pixels.length;i++)
       {
           pixels[i] = i %tickCount ;
       }
   }
}