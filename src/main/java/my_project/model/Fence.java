package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Fence extends InteractiveGraphicalObject {

   private double b = 206;

   public Fence(int x, int y){
       this.x = x ;
       this.y = y ;
   }

    public void draw(DrawTool drawTool) {
       drawTool.setCurrentColor(new Color(32, 165, 23));
       drawTool.drawFilledRectangle(0, 400, 1000, 1000);

       drawTool.setCurrentColor(new Color(14, 183, (int)b, 255));
       drawTool.drawFilledRectangle(0, 0, 1000, 600);

       drawTool.setCurrentColor(new Color(123, 62, 19));
       drawTool.drawFilledRectangle(x, y + 20, 1000, 10);
       drawTool.drawFilledRectangle(x, y + 45, 1000, 10);
       drawTool.drawFilledRectangle(x, y + 70, 1000, 10);
       drawTool.drawFilledRectangle(x, y + 95, 1000, 10);

       for (int i = 1; i <= 30; i++) {
            drawTool.setCurrentColor(new Color(139, 69, 19));
            drawTool.drawFilledRectangle(x + (i - 1) * 65, y, 20, 120);
       }
    }

    public void update(double dt){
       b += 10*dt;
       if(b >= 255){
           b = 0;
       }
    }
}
