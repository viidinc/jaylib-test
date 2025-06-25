package com.viid.engine.CustomObject;

import com.viid.engine.Engine;
import com.viid.engine.GameObject.GameObject;
import com.viid.engine.Utils.Input;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ParticleSpawner extends GameObject {

    public static final int SpawnCount = 500;

    private ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    @Override public void tick(){
        if (Input.MoveUp.Pressed()){
            for (int i = 0; i < SpawnCount; i++) {
                Particle part = new Particle(Input.getMouseCoords());
                Engine.container.addObject(part);

                executorService.schedule(part::destroy,1000, TimeUnit.MILLISECONDS);
            }
        }

    }

}
