package com.viid.engine.Utils;

import com.raylib.Raylib;
import com.raylib.Helpers;
import com.viid.engine.Engine;

public class Utility {

    public static float getDist(Raylib.Vector2 vec1, Raylib.Vector2 vec2){
        return (float) Math.sqrt(getDistSqr(vec1,vec2));
    }

    public static float getDistSqr(Raylib.Vector2 vec1, Raylib.Vector2 vec2){
        if (vec1 == null || vec2 == null){
            return -1.0f;
        }
        return (float) Math.abs(Math.pow(vec2.x()-vec1.x(),2.0f)+Math.pow(vec2.y()-vec1.y(),2.0f));
    }
    public static Raylib.Vector2 lerpVector(Raylib.Vector2 vec1, Raylib.Vector2 vec2,float t){
        return Helpers.newVector2(vec1.x() + (vec2.x() - vec1.x()) * t,vec1.y() + (vec2.y() - vec1.y()) * t);
    }
    public static Raylib.Vector2 substractVector(Raylib.Vector2 vec1, Raylib.Vector2 vec2){
        return Helpers.newVector2(vec1.x()-vec2.x(),vec1.y()-vec2.y());
    }
    public static Raylib.Vector2 getMouseFormCenter(){
        return substractVector(Engine.getScreenCenter(),Raylib.GetMousePosition());
    }
}
