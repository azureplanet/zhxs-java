package uwu;

import arc.Core;
import arc.Events;
import arc.scene.style.Drawable;
import arc.util.Log;
import mindustry.game.EventType;
import mindustry.mod.Mod;
import uwu.content.*;
import uwu.util.interfaces.LoadContent;

public class UwuMod extends Mod {

    public LoadContent[] loadContents = new LoadContent[]{
            new ZHItems(),
    };

    public UwuMod(){
        Log.info("Loaded ZHXS constructor.");
    }
    
    @Override
    public void loadContent(){
        Log.info("Loading ZHXS content.");
        for (LoadContent loadContent : loadContents) loadContent.load();
        Log.info("ZHXS content load is ended");
    }

}
