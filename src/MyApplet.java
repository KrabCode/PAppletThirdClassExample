import processing.core.PApplet;
import processing.core.PGraphics;

// do not run this, it has no main method, it needs no main method

public class MyApplet extends PApplet {
    PGraphics pg;
    BackgroundProvider backgroundProvider;

    PGraphics getBackground(){
        if(backgroundProvider == null){
            backgroundProvider = new BackgroundProvider(this);
        }
        return backgroundProvider.getBackground();
    }
}
