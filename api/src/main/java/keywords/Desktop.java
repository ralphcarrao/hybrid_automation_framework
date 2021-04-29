package keywords;

import org.sikuli.script.Screen;

public class Desktop {
    private Screen screen;

    public Desktop() {
        Screen screen = new Screen();
    }


    public void click(String img) {
        screen.click();
    }

    public void capture(String img) {
        screen.capture();
    }

    public void asScreen(String img) {
        screen.setAsScreen();
    }
}
