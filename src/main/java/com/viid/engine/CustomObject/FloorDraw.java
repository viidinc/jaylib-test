package com.viid.engine.CustomObject;

import com.raylib.Colors;
import com.raylib.Raylib;
import com.viid.engine.AdditiveObject.Object2D;
import com.raylib.Helpers;

import static com.raylib.Raylib.EndShaderMode;
import static com.raylib.Raylib.TextFormat;

public class FloorDraw extends Object2D {

    private int floorSizeX = 16;
    private int floorSizeY = 16;

    private float tileSize = 128.0f;

    @Override
    public void draw(){
        for (int x = 0; x<floorSizeX; x++){
            for (int y = 0; y<floorSizeY;y++){
                Raylib.Color color = (x%2 != y%2) ? Colors.WHITE : Colors.GRAY;
                drawRectPos(Helpers.newRectangle(x*tileSize,y*tileSize,tileSize,tileSize), color);
            }
        }

    }
}
