package com.viid.engine;

import com.raylib.Helpers;
import com.viid.engine.AdditiveObject.Camera;
import com.viid.engine.AdditiveObject.Object3D.Camera3D;
import com.viid.engine.GameObject.GameObject;
import com.viid.engine.GameObject.ObjectContainer;
import com.viid.engine.Utils.CameraSetCurrent;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;
import static com.raylib.Helpers.*;

public class Engine {

    public static ObjectContainer container = new ObjectContainer();

    private static Vector2 ScreenSize = newVector2(1920,1080);

    public static Vector2 getScreenSize() {
        return ScreenSize;
    }

    public static Vector2 getScreenCenter(){
        return newVector2((float) (ScreenSize.x()*0.5), (float) (ScreenSize.y()*0.5));
    }

    public static void setScreenSize(Vector2 screenSize) {
        ScreenSize = screenSize;
        SetWindowSize((int) screenSize.x(),(int) screenSize.y());
    }

    public void StartGame(){
        SetTargetFPS(60);
        SetConfigFlags(FLAG_VSYNC_HINT);
        makeWindow((int) ScreenSize.x(), (int) ScreenSize.y(),"viid engine");
        //PreStart
        SetWindowState(2);
        //Loop
        gameLoop();
        //PreExit

        //Exit
        Exit();
    }

    public static CameraSetCurrent currentCamera = null;

    public void gameEnd(){
        shouldGameEnd = true;
    }

    private void Exit(){
        closeWindow();
    }

    private boolean shouldGameEnd = false;

    private void makeWindow(int HeightPx, int WidthPx, String Title){
        InitWindow(HeightPx,WidthPx,Title);
    }

    private void closeWindow(){
        CloseWindow();
    }

    private void gameLoop() {
        while (!shouldGameEnd && !WindowShouldClose()) {

            container.tick();
            container.physTick();

            BeginDrawing();
            if (currentCamera != null){
                if (currentCamera instanceof Camera){
                    BeginMode2D(((Camera) currentCamera).camera);
                }
                else{
                    BeginMode3D(((Camera3D) currentCamera).camera);
                }
            }

            ClearBackground(BLACK);
            container.draw();
            DrawCube(Helpers.newVector3(0,0,0),10,10,10,RED);
            EndMode3D();
            EndDrawing();

        }
    }
}
