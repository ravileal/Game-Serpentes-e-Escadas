package br.com.ufc.pds.serpentesEscadas.viewe;

import JPlay.Sprite;
import JPlay.Mouse;

public class Button {
    private Sprite image;
    private Mouse mouse;

    public Button(String img, int x, int y, Mouse mouse) {
        image = new Sprite(img, 1);

        image.setPosition(x, y);

        this.mouse = mouse;
    }

    public void draw() {
        image.draw();
    }

    public boolean isMouseOn() {
        return mouse.isOverObject(image);
    }

    public Sprite getSprite() {
        return image;
    }
}
