import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class picywicy extends JPanel {


    public void paintComponent(Graphics g) {
        BufferedImage Michael = null;
        try{
            Michael = ImageIO.read(new File("scottdaddy.png"));
        }
        catch(IOException e) {}
        g.drawImage(Michael, 0, 0, 500, 500, getBackground(), getFocusCycleRootAncestor());
        
        g.setColor(Color.BLACK);
        g.fillRect(60, 200, 300, 60);
        g.fillArc(60, 160, 120, 30, 0,  180);
        g.fillArc(240, 175, 120, 30, 0,  180);
    }
    public static void main(String[] args) {

        var panel = new picywicy();

        var frame = new JFrame("A simple graphics program");
        frame.setSize(1400, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}