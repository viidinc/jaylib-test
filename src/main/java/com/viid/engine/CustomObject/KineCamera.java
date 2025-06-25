package com.viid.engine.CustomObject;

import com.raylib.Helpers;
import com.raylib.Raylib;
import com.viid.engine.AdditiveObject.Camera;
import com.viid.engine.AdditiveObject.Object2D;
import com.viid.engine.Engine;
import com.viid.engine.Utils.Utility;

public class KineCamera extends Camera {

    public KineCamera(Object2D target) {
        super(target);
        follow = false;
    }

    @Override
    public void tick(){
        super.tick();
        //camera.offset(Helpers.newVector2(0,0));
        position = Utility.lerpVector(followTarget.position,Utility.getMouseFormCenter(),-0.2f);

    }
}
