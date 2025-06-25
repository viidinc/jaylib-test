package com.viid.engine.CustomObject;

import com.raylib.Colors;
import com.raylib.Raylib;
import com.viid.engine.AdditiveObject.Object3D.Object3D;

public class CubeDrawer extends Object3D {

    @Override
    public void draw(){
        Raylib.DrawCube(position,16,16,16, Colors.RED);
    }

}
