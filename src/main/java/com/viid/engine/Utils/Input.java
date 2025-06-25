package com.viid.engine.Utils;

import com.raylib.Raylib;

public class Input {

    public static class Action{
        public int key;

        public Action(int actionButton){
            this.key = actionButton;
        }

        public boolean Pressed(){
            return Raylib.IsKeyDown(key);
        }
        public boolean JustPressed(){
            return Raylib.IsKeyPressed(key);
        }
    }

    public static Action MoveUp = new Action(Raylib.KEY_W);
    public static Action MoveDown = new Action(Raylib.KEY_S);
    public static Action MoveLeft = new Action(Raylib.KEY_A);
    public static Action MoveRight = new Action(Raylib.KEY_D);
    public static Action MB_Left = new Action(Raylib.MOUSE_BUTTON_LEFT);

    public static Raylib.Vector2 getInputVector(Action yPositive,Action yNegative,Action xPositive,Action xNegative){
        Raylib.Vector2 ret = new Raylib.Vector2();
        if (yPositive.Pressed() != yNegative.Pressed()){
            ret.y((yPositive.Pressed()) ? -1 : 1);
        }
        if (xPositive.Pressed() != xNegative.Pressed()){
            ret.x((xPositive.Pressed()) ? -1 : 1);
        }
        return ret;
    }

    public static Raylib.Vector2 getMouseCoords(){

        return Raylib.GetMousePosition();

    }

}
