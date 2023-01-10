package my_project.model;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Clouds extends InteractiveGraphicalObject {

    double speed;

    public Clouds(double x, double y){
        this.x = x;
        this.y = y;
        speed = Math.random()*20+10;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(239, 235, 235));
        drawTool.drawFilledCircle(x, y, 55);
        drawTool.drawFilledCircle(x+55, y, 55);
    }

    public void update(double dt){
        x += dt * speed;

        if (x >= 1120){
            x = -120;
        }
    }
}