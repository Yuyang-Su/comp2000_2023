import java.awt.*;
import javax.swing.*;

class Canvas extends JPanel {
    public Canvas() {
        setPreferredSize(new Dimension(720, 720));
    }

    public void paint(Graphics g) {
        for (int i = 10; i < 710; i += 35) {
            for (int j = 10; j < 710; j += 35) {
                Cell cell = new Cell(i, j);
                cell.paint(g);
            }
        }
    }
}
