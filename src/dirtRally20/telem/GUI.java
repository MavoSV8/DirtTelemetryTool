package dirtRally20.telem;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame = new JFrame();
    private JLabel velocity = new JLabel();
    private JLabel RPMs = new JLabel();
    private JLabel gear = new JLabel();

    public void createWindow(String title,int width,int height) {
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLUE);
        velocity.setFont(new Font("Calibri", Font.PLAIN, 60));
        RPMs.setFont(new Font("Calibri", Font.PLAIN, 60));
        gear.setFont(new Font("Calibri", Font.PLAIN, 60));

        velocity.setHorizontalAlignment(JLabel.CENTER);
        velocity.setVerticalAlignment(JLabel.CENTER);
        velocity.setBackground(Color.GRAY);
        velocity.setOpaque(true);
        velocity.setPreferredSize(new Dimension(100,100));

        RPMs.setHorizontalAlignment(JLabel.CENTER);
        RPMs.setVerticalAlignment(JLabel.CENTER);
        RPMs.setBackground(new Color(216,216,216));
        RPMs.setOpaque(true);

        gear.setHorizontalAlignment(JLabel.CENTER);
        gear.setVerticalAlignment(JLabel.CENTER);
        gear.setBackground(Color.WHITE);
        gear.setOpaque(true);
        gear.setPreferredSize(new Dimension(100,100));

        frame.getContentPane().add(RPMs,BorderLayout.NORTH);
        frame.getContentPane().add(gear,BorderLayout.WEST);
        frame.getContentPane().add(velocity,BorderLayout.CENTER);

    }
    public void setVelocity(int v){
        velocity.setText(Integer.toString(v));
        JComponent parent = (JComponent) velocity.getParent();
        if(parent !=null) parent.revalidate();
    }

    public void setRPMs(int RPM) {
        RPMs.setText(Integer.toString(RPM));
        JComponent parent = (JComponent) RPMs.getParent();
        if(parent != null) parent.revalidate();
    }

    public void setGear(int g) {
        if(g == -1){
            //System.out.print("R ");
            gear.setText("R");
        }
        else if(g == 0){
            //System.out.print("N ");
            gear.setText("N");
        }
        else {
            //System.out.print((int) (car.getGear()) + " ");
            gear.setText(Integer.toString(g));
        }
        JComponent parent = (JComponent) gear.getParent();
        if(parent !=null) parent.revalidate();

    }
}
