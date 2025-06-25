package com.viid.engine.CustomObject;

import com.raylib.Colors;
import com.raylib.Helpers;
import com.raylib.Raylib;
import com.viid.engine.AdditiveObject.Object2D;
import com.viid.engine.AdditiveObject.Rand;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

public class Particle extends Object2D {

    public static final float gravity = -9.8f;

    public Raylib.Vector2 Velocity = Helpers.newVector2(0.0f,0.0f);

    public Particle(Raylib.Vector2 pos){
        super();
        this.position = pos;
        Velocity.x(Rand.f(-80.0f,80.0f));
        Velocity.y(Rand.f(-80.0f,80.0f));
    }

    @Override
    public void create() {
        super.create();

    }

    @Override
    public void tick(){
        Velocity.y(Velocity.y()-gravity);
        move(Velocity);
    }

    @Override
    public void draw() {
        //super.draw();
        drawCircle(5.0f, Colors.RED);
    }
}
