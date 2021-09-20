import processing.core.PApplet;

// run this class to run the program, it has the only copy of the main function

public class MySketch extends MyApplet {

    public static void main(String... args) {
        PApplet.main("MySketch");
    }

    public void settings() {
        size(200, 200);
    }

    public void setup() {

    }

    public void draw() {
        image(getBackground(), 0, 0);
        ellipse(mouseX, mouseY, 20, 20);
    }

}
