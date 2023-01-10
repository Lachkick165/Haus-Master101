package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends InteractiveGraphicalObject {

    public Tree(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(47, 21, 21));
        drawTool.drawFilledRectangle(x , y, 50,135);
        drawTool.setCurrentColor(new Color(43, 127, 19));
        drawTool.drawFilledCircle(x + 25 , y - 55, 70);
    }
}
