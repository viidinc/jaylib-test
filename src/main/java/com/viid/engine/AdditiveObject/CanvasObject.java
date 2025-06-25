package com.viid.engine.AdditiveObject;

import com.viid.engine.GameObject.GameObject;
import com.raylib.Helpers.*;

import static com.raylib.Raylib.*;

public abstract class CanvasObject extends GameObject {

    public static void drawCirclePos(Vector2 position,float radius,Color color){
        DrawCircleV(position,radius,color);
    }
    public static void drawRectPos(Rectangle rect,Color color){
        DrawRectangleRec(rect,color);
    }




}
