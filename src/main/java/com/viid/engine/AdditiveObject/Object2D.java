package com.viid.engine.AdditiveObject;

import com.raylib.Raylib;
import com.raylib.*;
import com.viid.engine.Utils.Utility;

public class Object2D extends CanvasObject{

    public Raylib.Vector2 position = Helpers.newVector2(0,0);

    public void drawCircle(float radius,Raylib.Color color){
        drawCirclePos(position,radius,color);
    }

    public void move(Raylib.Vector2 by){
        position.x(position.x()+by.x());
        position.y(position.y()+by.y());

    }    public void move(Raylib.Vector2 by,float speed){
        position.x(position.x()+by.x()*speed);
        position.y(position.y()+by.y()*speed);

    }
    public Raylib.Vector2 getLocalMouseCoord(){
        return Utility.substractVector(position,Raylib.GetMousePosition());

    }
}
