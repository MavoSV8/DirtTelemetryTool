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
        frame.setSize(width, height);
        frame.setVisible(true);
        velocity.setFont(new Font("Serif", Font.PLAIN, 30));
        RPMs.setFont(new Font("Serif", Font.PLAIN, 30));
        gear.setFont(new Font("Serif", Font.PLAIN, 30));
        frame.getContentPane().add(BorderLayout.WEST, velocity);
        frame.getContentPane().add(BorderLayout.CENTER, RPMs);
        frame.getContentPane().add(BorderLayout.EAST, gear);
    }
    public void setVelocity(int v){
        velocity.setText(Integer.toString(v));
        JComponent parent = (JComponent) velocity.getParent();
        if(parent !=null) parent.revalidate();
    }

    public void setRPMs(int RPM) {
        RPMs.setText(" " + RPM);
        JComponent parent = (JComponent) RPMs.getParent();
        if(parent !=null) parent.revalidate();
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
