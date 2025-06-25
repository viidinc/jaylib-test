package com.viid.engine.AdditiveObject.Object3D;

import com.raylib.Raylib;
import com.viid.engine.AdditiveObject.Object2D;
import com.viid.engine.Engine;
import com.viid.engine.Utils.CameraSetCurrent;

public class Camera3D extends Object3D implements CameraSetCurrent {

    public Raylib.Camera3D camera;

    @Override
    public void move(Raylib.Vector3 by){
        super.move(by);
        if (camera != null){
            camera._position(position);
        }
    }
    public void SetCurrent(){
        Engine.currentCamera = this;
    }

    public void create(){
        camera = new Raylib.Camera3D();
        //TODO: Delete after using
        //WARNING:
        //ALERT:
        //TEST:
        SetCurrent();
        camera.fovy(55);
        camera.projection(Raylib.CAMERA_PERSPECTIVE);
        camera.up(new Raylib.Vector3().x(0).y(1).z(0));
    }
    @Override
    public void draw(){
        Raylib.UpdateCamera(camera,Raylib.CAMERA_ORBITAL);

    }

}
