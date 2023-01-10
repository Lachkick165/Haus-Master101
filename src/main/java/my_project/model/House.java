package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends InteractiveGraphicalObject {

    public House(int x, int y){
        this.x = x ;
        this.y = y ;
    }

    public void draw(DrawTool drawTool){
        //Schornstein
        drawTool.setCurrentColor(new Color(69, 68, 68, 255));
        drawTool.drawFilledRectangle(x + 400, y +150, 50, 100);
        //Block
        drawTool.setCurrentColor(new Color(111, 20, 20));
        drawTool.drawFilledRectangle(x +200, y + 300, 300, 300);
        //Dach
        drawTool.setCurrentColor(new Color(201, 15, 15));
        drawTool.drawFilledTriangle(x +200, y +300, x +350, y +150, x +500, y +300);
        drawTool.setCurrentColor(new Color(1, 1, 1));
        drawTool.drawTriangle(x +200, y +300, x +350, y +150, x +500, y +300);
        //Tür
        drawTool.setCurrentColor(new Color(73, 24, 24));
        drawTool.drawFilledRectangle(x +315, y +465, 70, 135);
        drawTool.setCurrentColor(new Color(255, 176, 12));
        drawTool.drawFilledCircle(x +375, y +530, 5);
        //Fenster
        drawTool.setCurrentColor(new Color(128, 143, 147));
        drawTool.drawFilledRectangle(x +220, y +330, 80,100);
        drawTool.drawFilledRectangle(x +400, y +330, 80,100);
        drawTool.setCurrentColor(new Color(1,1,1));
        drawTool.drawRectangle(x +220, y +330, 80,100);
        drawTool.drawRectangle(x +400, y +330, 80,100);
        drawTool.drawLine(x +260, y +330, x +260, y +430);
        drawTool.drawLine(x +220, y +380, x +300, y +380);
        drawTool.drawLine(x +260, y +330, x +260, y +430);
        drawTool.drawLine(x +440, y +330, x +440, y +430);
        drawTool.drawLine(x +400, y +380, x +480, y +380);

    }
}
