package com.viid.engine.AdditiveObject.Object3D;

import com.raylib.Helpers;
import com.raylib.Raylib;
import com.viid.engine.GameObject.GameObject;

public class Object3D extends GameObject {

    public Raylib.Vector3 position = Helpers.newVector3(0,0,0);

    public void move(Raylib.Vector3 by){
        position.x(position.x()+by.x());
        position.y(position.y()+by.y());
        position.z(position.z()+by.z());
    }


}
