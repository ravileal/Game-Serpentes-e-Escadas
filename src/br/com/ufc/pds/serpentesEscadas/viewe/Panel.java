package br.com.ufc.pds.serpentesEscadas.viewe;

import java.awt.Color;
import java.awt.Font;
import JPlay.*;

public class Panel {
    private Window window;
    private GameImage background;
    private Font font;
    private Color color;
    private String text;

    public double x, y;

    public Panel(String txt, String bgimg, Window window, double x, double y) {
        this(window, bgimg, x, y, new Font("Arial", Font.TRUETYPE_FONT, 20), Color.BLACK);
        text = txt;
    }
    
    public Panel(Window window, String bgimg, double x, double y) {
        this(window, bgimg, x, y, new Font("Arial", Font.TRUETYPE_FONT, 20), Color.BLACK);
    }

    public Panel(Window window, String bgimg, double x, double y, Font font, Color color) {
        this.window = window;
        this.background = new GameImage(bgimg);
        this.font = font;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getText() {
    	return text;
    }

    public void Draw() {
        background.setPosition(x, y);

        background.draw();

        window.drawText(text, (int)(x+15.0), (int)(y + (background.height/5.0)*4.0), color, font);
    }
}
