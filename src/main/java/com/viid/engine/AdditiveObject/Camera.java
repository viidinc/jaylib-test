package com.viid.engine.AdditiveObject;

import com.raylib.Raylib;
import com.raylib.Helpers;
import com.viid.engine.Engine;
import com.viid.engine.Utils.CameraSetCurrent;

public class Camera extends Object2D implements CameraSetCurrent {

    public Object2D followTarget;
    public boolean follow = false;
    public Raylib.Camera2D camera;

    public Camera(Object2D target){
        this.followTarget = target;
        camera = new Raylib.Camera2D();
    }
    public Camera(){
        camera = new Raylib.Camera2D();
    }

    @Override
    public void SetCurrent() {
        Engine.currentCamera = this;
    }

    @Override
    public void create(){
        camera.offset(Helpers.newVector2(0,0));
        camera.zoom(1.0f);
    }

    @Override
    public void tick(){
        if (follow && followTarget != null) {
            position = followTarget.position;
        }
        camera.target(position);
        camera.offset(Engine.getScreenCenter());
    }

}
