import javax.swing.*;
import java.awt.*;
public class TheFrame
{
    public static void main (String[] args)
    {
        Dimension d = new Dimension (1600, 950);
        ThePanel p = new ThePanel(d);

        JFrame frame = new JFrame();
        frame.setSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(p);
        frame.setName("Graphics");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setMinimumSize(d);

    }
}
