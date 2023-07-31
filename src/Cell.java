package src;

import java.awt.*;
import javax.swing.*;

public class Cell extends JPanel{
    int x;
    int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //draws a single cell at the given x and y coordinates with dimesions 35x35.
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 35, 35);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 35, 35);
    }
}