package com.viid.engine.CustomObject;

import com.raylib.Colors;
import com.raylib.Raylib;
import com.viid.engine.AdditiveObject.Object2D;
import com.viid.engine.Utils.Input;
import com.viid.engine.Utils.Utility;

import static com.raylib.Raylib.GetMousePosition;

public class CursorFollower extends Object2D {

    private float rad = 32;
    public float Speed = 10;
    @Override
    public void tick() {
        super.tick();
        move(Input.getInputVector(Input.MoveUp,Input.MoveDown,Input.MoveLeft,Input.MoveRight),Speed);
    }

    public void draw(){

        drawCircle(rad, Colors.RED);

    }

}
