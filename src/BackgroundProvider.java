import processing.core.PGraphics;

// this class is hidden from MySketch and only used through MyApplet

public class BackgroundProvider {
    MyApplet m;
    PGraphics pg;

    BackgroundProvider(MyApplet m){
        this.m = m;
        pg = m.createGraphics(m.width, m.height);
        pg.beginDraw();
        pg.background(100, 0, 100);
        pg.endDraw();
    }

    PGraphics getBackground(){
        return pg;
    }
}
