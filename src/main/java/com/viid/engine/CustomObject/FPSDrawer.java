package com.viid.engine.CustomObject;

import com.viid.engine.AdditiveObject.Object2D;

import static com.raylib.Raylib.DrawFPS;

public class FPSDrawer extends Object2D {

    public void draw(){

        DrawFPS(20,20);

    }

}
