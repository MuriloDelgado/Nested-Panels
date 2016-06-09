import java.awt.*;
import javax.swing.*;

public class Nested
{
    public static void main(String[] args)
    {
        // Setting up frame
        JFrame frame = new JFrame("Label Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Setting up image
        ImageIcon icon = new ImageIcon("devil.gif");

        // Setting up leftmost panel
        JPanel left = new JPanel(); 
        left.setPreferredSize(new Dimension(150, 100)); // Setting panel size
        left.setBackground(Color.cyan); // Setting panel color
        JLabel leftLabel; // Declaring label
        leftLabel = new JLabel("Devil Left", icon, SwingConstants.CENTER); // Making label
        left.add(leftLabel); // Adding label to panel

        // Setting up center panel
        JPanel center = new JPanel();
        center.setPreferredSize(new Dimension(150, 100)); // Setting up panel size
        center.setBackground(Color.red); // Setting panel color
        JLabel centerLabel; // Declaring label
        centerLabel = new JLabel("Devil Right", icon, SwingConstants.CENTER); // Making label
        centerLabel.setHorizontalTextPosition(SwingConstants.LEFT); // Setting horizontal text position
        centerLabel.setVerticalTextPosition(SwingConstants.CENTER); // Setting vertical text position
        center.add(centerLabel); // Adding label to panel
        
        // Setting up right panel
        JPanel right = new JPanel();
        right.setPreferredSize(new Dimension(150, 100)); // Setting up panel size
        right.setBackground(Color.blue); // Setting up panel color
        JLabel rightLabel; // Declaring label
        rightLabel = new JLabel("Devil Above", icon, SwingConstants.CENTER); // Making label
        rightLabel.setHorizontalTextPosition(SwingConstants.RIGHT); // Setting horizontal text position
        rightLabel.setVerticalTextPosition(SwingConstants.BOTTOM); // Setting vertical text position
        right.add(rightLabel); // Adding label to panel

        // Setting up main background
        JPanel background = new JPanel();
        background.setBackground(Color.yellow); // Setting up background color  
        background.add(left); // Adding left panel
        background.add(center); // Adding center panel
        background.add(right); // Adding right panel
        
        // Packing frame together
        frame.getContentPane().add(background); // Adding entire scene onto frame
        frame.pack();
        frame.setVisible(true);
    }
}