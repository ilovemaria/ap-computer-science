import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Draw2 extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g) {
        //g.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);
        //g.setColor(getBackground());
        //g.drawString(null, ALLBITS, ABORT);
        //g.drawRect(ALLBITS, ABORT, WIDTH, HEIGHT);
        //g.drawOval(ALLBITS, ABORT, WIDTH, HEIGHT);

        super.paintComponent(g);
        //g.setColor(Color.BLUE);
        //g.fillOval(40, 50, 70, 50);
        //g.setColor(Color.GREEN);
        //g.drawLine(50, 50, 150, 60);
        //g.setColor(Color.PINK);
        //g.drawString("black bean", 10, 100);
        //g.setColor(Color.BLUE);
        //g.fillOval(110, 50, 70, 50);
        //g.fillRect(85, 70, 50, 100);
        //g.fillOval(80, 160, 60, 40);
        g.setColor(Color.YELLOW);
        g.fillRect(500, 500, 800, 690);
        g.setColor(Color.CYAN);
        g.fillArc(500, 400, 800, 200, 0,  180);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(850, 800, 150, 300);
        g.setColor(Color.ORANGE);
        g.fillRect(100, 500, 150, 700);
        g.setColor(Color.BLUE);
        g.fillRect(600, 800, 150, 150);
        g.fillRect(1100, 800, 150, 150);
        g.setColor(Color.GREEN);
        g.fillOval(30, 400, 300, 300);
        g.setColor(Color.BLACK);
        g.drawLine(1800, 900, 1500, 900);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(1500, 700, 150, 150);
        int scott = 0; 
        

        while (scott < 20) {
            int banan = scott*100;
            g.setColor(Color.ORANGE);
            g.drawString("black bean", banan, 100);
            scott++;
            
        }
    }

    public static void main(String[] args) {

        var panel = new Draw2();

        var frame = new JFrame("A simple graphics program");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}