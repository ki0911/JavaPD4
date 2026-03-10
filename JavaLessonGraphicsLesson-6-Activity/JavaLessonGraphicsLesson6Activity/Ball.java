import java.awt.*;
import javax.swing.*;

class Ball{
  int x,y;
  int dx,dy;
  int diameter;
  Color color;
  boolean stop;
  
  Ball(int x, int y,
       int dx, int dy,
       int diameter, Color color){
    
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;    
    this.diameter = diameter;
    this.color = color;
    this.stop = false;

    
    
  }
    void move(){
      //Move the ball down
      if(!this.stop){
        this.y+=this.dy;
      }
      
      if(this.y > Game.height){
        this.y = 0;
      }

        draw();
    }
  
  void draw(){
      // circle   
    
      Game.canvas.setColor(this.color);
      Game.canvas.fillOval(this.x-this.diameter/2,
                           this.y-this.diameter/2,
                           this.diameter,
                           this.diameter);
      Game.canvas.setColor(Color.black);
      Game.canvas.drawOval(this.x-this.diameter/2,
                           this.y-this.diameter/2,
                           this.diameter,
                           this.diameter);
    
         
      
  }

  boolean collidedWithMouse(){
    double dist = Math.sqrt( 
            Math.pow(this.x-Mouse.x,2 ) +
            Math.pow(this.y-Mouse.y,2 ) );
    
    return dist < this.diameter/2;
  }

  
}