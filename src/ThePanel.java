import javax.swing.*;
import java.awt.*;

public class ThePanel extends JPanel
{
    public ThePanel(Dimension D)
    {
        this.setLayout(null);
    }

    public void paintComponent(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, 1600, 900);
        g.setColor(Color.black);
        g.fillRect(200, 200, 300, 300);

    }
}
