import java.awt.*;
import javax.swing.*;

public class GameLogic {
    //String used to display mouse x and y coordinates
    String text ="";

    // 2nd create a ball one the canvus
    Ball ball ;

  
  
    public GameLogic() {
      ball = new Ball(50,50,0,1,30,Color.green);
    }
    public void gameLoop(){
      //Display the the mouse coordinates
    


      ball.move();
      if(ball.collidedWithMouse()){
        ball.stop=true;
      }
      else{
        ball.stop=false;
      }
         
    }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}
