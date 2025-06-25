package com.viid.engine.GameObject;

import java.util.ArrayList;
import java.util.Objects;

public class ObjectContainer {

    private ArrayList<GameObject> Objects = new ArrayList<GameObject>();

    //Need to instantiate object between frames
    private ArrayList<GameObject> DeferredAdd = new ArrayList<GameObject>();

    public void addObject(GameObject obj){
        DeferredAdd.add(obj);
    }

    public void spawnObjectsFromDeferred(){
        //Add objects from deferred add to Objects and call create
        if (DeferredAdd.isEmpty()){
            return;
        }

        for (GameObject obj : DeferredAdd){
            Objects.add(obj);
            obj.create();
        }

        DeferredAdd.clear();
    }

    public void tick(){
        //Instantiate deferred objects
        spawnObjectsFromDeferred();
        Objects.removeIf(GameObject::shouldDestroy);
        for (GameObject obj : Objects){
            obj.tick();
        }
    }

    public void physTick(){
    for (GameObject obj : Objects){
            obj.physTick();
        }
    }

    public void draw(){
        for (GameObject obj : Objects){
            obj.draw();
        }
    }

}
