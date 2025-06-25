package com.viid.engine;

import com.raylib.Helpers;
import com.raylib.Raylib;
import com.viid.engine.AdditiveObject.Camera;
import com.viid.engine.AdditiveObject.Object3D.Camera3D;
import com.viid.engine.CustomObject.*;

import static com.raylib.Raylib.TextFormat;

public class Main {
    public static Engine engine = new Engine();

    public static void main(String[] args){

        Engine.container.addObject(new Camera());
        Engine.container.addObject(new FPSDrawer());
        Engine.container.addObject(new ParticleSpawner());

        // Перед инициализацией окна
        Raylib.SetTraceLogLevel(Raylib.LOG_ERROR | Raylib.LOG_WARNING);
        //!!! Добавлять первичные объекты только до вызова StartGame() !!!
        engine.StartGame();

    }


}
