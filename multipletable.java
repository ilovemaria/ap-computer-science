import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class multipletable extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        
        int x = 0;
        int y = 400;

        g.setColor(Color.BLUE);
        for (x=0; x<=500; x+=20)
        {
            g.drawLine(x, y, x, y-400);


        }
        x=0;
        for (y=0; y<=500; y+=20)
        {
            g.drawLine(x, y, x+500, y);
        }
        g.setColor(Color.YELLOW.darker());
        for (x=1; x<13; x++)
        {
            for (y=1; y<13; y++)
            {
                g.drawString(Integer.toString(x*y), x*20, y*20);
            }
        }
    }

    public static void main(String[] args) {

        var panel = new multipletable();

        var frame = new JFrame("A simple graphics program");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}