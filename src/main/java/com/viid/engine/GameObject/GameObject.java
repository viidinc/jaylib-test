package com.viid.engine.GameObject;
import static com.raylib.Helpers.*;

public class GameObject {

    //All objects with destroy request = true will be deleted from Objects array before tick()
    private boolean destroyRequest = false;
    public boolean shouldDestroy(){return destroyRequest;}
    public void destroy(){destroyRequest = true;}

    public void create() {};
    public void tick() {};
    public void physTick() {};
    public void draw() {};

}
