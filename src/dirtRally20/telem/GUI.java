package dirtRally20.telem;

import javax.swing.*;
import javax.swing.plaf.ProgressBarUI;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class GUI {

    ProgressBarUI ui = new BasicProgressBarUI() {
        /**
         * The "selectionForeground" is the color of the text when it is painted
         * over a filled area of the progress bar.
         */
        @Override
        protected Color getSelectionForeground() {
            return Color.BLACK;
        }

        /**
         * The "selectionBackground" is the color of the text when it is painted
         * over an unfilled area of the progress bar.
         */
        @Override
        protected Color getSelectionBackground() {
            return Color.BLACK;
        }
    };

    ProgressBarUI ui1 = new BasicProgressBarUI() {
        /**
         * The "selectionForeground" is the color of the text when it is painted
         * over a filled area of the progress bar.
         */
        @Override
        protected Color getSelectionForeground() {
            return Color.BLACK;
        }

        /**
         * The "selectionBackground" is the color of the text when it is painted
         * over an unfilled area of the progress bar.
         */
        @Override
        protected Color getSelectionBackground() {
            return Color.BLACK;
        }
    };


    ProgressBarUI ui2 = new BasicProgressBarUI() {
        /**
         * The "selectionForeground" is the color of the text when it is painted
         * over a filled area of the progress bar.
         */
        @Override
        protected Color getSelectionForeground() {
            return Color.BLACK;
        }

        /**
         * The "selectionBackground" is the color of the text when it is painted
         * over an unfilled area of the progress bar.
         */
        @Override
        protected Color getSelectionBackground() {
            return Color.BLACK;
        }
    };
    ProgressBarUI ui3 = new BasicProgressBarUI() {
        /**
         * The "selectionForeground" is the color of the text when it is painted
         * over a filled area of the progress bar.
         */
        @Override
        protected Color getSelectionForeground() {
            return Color.BLACK;
        }

        /**
         * The "selectionBackground" is the color of the text when it is painted
         * over an unfilled area of the progress bar.
         */
        @Override
        protected Color getSelectionBackground() {
            return Color.BLACK;
        }
    };

    private JFrame frame = new JFrame();
    private JLabel velocity = new JLabel();
    private JLabel RPMs = new JLabel();
    private JLabel gear = new JLabel();
    private JLabel stageTime = new JLabel();
    private JPanel pedals = new JPanel();
    private int minute = 0;
    private float seconds = 0;
    private JProgressBar RPMsBar = new JProgressBar();
    private JProgressBar clutchBar = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar brakeBar = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar acceleratorBar = new JProgressBar(SwingConstants.VERTICAL);


    public void setRedBG(int maxRPM, int RPM) {
        if (RPM > (maxRPM - 300)) {
            //RPMs.setBackground(Color.RED);
            //bar.setBackground(Color.RED);
            //RPMs.setForeground(Color.WHITE);
            RPMsBar.setForeground(Color.red);
        } else if ((RPM > maxRPM - 2500) && (RPM < maxRPM - 300)) {
            RPMsBar.setForeground(new Color(188, 181, 0));
        } else {
            //RPMs.setBackground(new Color(216,216,216));
            //RPMs.setForeground(Color.BLACK);
            RPMsBar.setForeground(Color.green);
        }
    }

    public void createWindow(String title, int width, int height) {
        RPMsBar.setUI(ui);
        RPMsBar.setStringPainted(true);
        RPMsBar.setBackground(new Color(216, 216, 216));
        RPMsBar.setForeground(Color.green);
        RPMsBar.setPreferredSize(new Dimension(500, 50));
        RPMsBar.setFont(new Font("Calibri", Font.PLAIN, 40));

        clutchBar.setUI(ui1);
        clutchBar.setStringPainted(true);
        clutchBar.setForeground(Color.cyan);

        brakeBar.setUI(ui2);
        brakeBar.setStringPainted(true);
        brakeBar.setForeground(Color.YELLOW);

        acceleratorBar.setUI(ui3);
        acceleratorBar.setStringPainted(true);
        acceleratorBar.setForeground(Color.ORANGE);


        pedals.setLayout(new FlowLayout());
        pedals.add(clutchBar);
        pedals.add(brakeBar);
        pedals.add(acceleratorBar);
        pedals.setPreferredSize(new Dimension(100, 100));

        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setAlwaysOnTop(true);

        velocity.setFont(new Font("Calibri", Font.PLAIN, 60));
        RPMs.setFont(new Font("Calibri", Font.PLAIN, 60));
        gear.setFont(new Font("Calibri", Font.PLAIN, 80));
        stageTime.setFont(new Font("Calibri", Font.PLAIN, 60));

        velocity.setHorizontalAlignment(JLabel.CENTER);
        velocity.setVerticalAlignment(JLabel.CENTER);
        velocity.setBackground(Color.GRAY);
        velocity.setOpaque(true);
        velocity.setPreferredSize(new Dimension(100, 100));

        RPMs.setHorizontalAlignment(JLabel.CENTER);
        RPMs.setVerticalAlignment(JLabel.CENTER);
        RPMs.setBackground(new Color(216, 216, 216));
        RPMs.setOpaque(true);

        gear.setHorizontalAlignment(JLabel.CENTER);
        gear.setVerticalAlignment(JLabel.CENTER);
        gear.setBackground(Color.WHITE);
        gear.setOpaque(true);
        gear.setPreferredSize(new Dimension(100, 100));

        stageTime.setHorizontalAlignment(JLabel.CENTER);
        stageTime.setVerticalAlignment(JLabel.CENTER);
        stageTime.setBackground(new Color(216, 216, 216));
        stageTime.setOpaque(true);

        //frame.getContentPane().add(RPMs,BorderLayout.NORTH);
        frame.getContentPane().add(RPMsBar, BorderLayout.NORTH);
        frame.getContentPane().add(gear, BorderLayout.WEST);
        frame.getContentPane().add(stageTime, BorderLayout.SOUTH);
        frame.getContentPane().add(velocity, BorderLayout.CENTER);
        frame.getContentPane().add(pedals, BorderLayout.EAST);

    }
    public void setClutchBar(float c){
        int position = (int)(c * 100);
        clutchBar.setMinimum(0);
        clutchBar.setMaximum(100);
        clutchBar.setValue(position);
        clutchBar.setString(Integer.toString(position));
    }
    public void setBrakeBar(float b){
        int position = (int)(b * 100);
        brakeBar.setMinimum(0);
        brakeBar.setMaximum(100);
        brakeBar.setValue(position);
        brakeBar.setString(Integer.toString(position));
    }
    public void setAcceleratorBar(float a){
        int position = (int)(a * 100);
        acceleratorBar.setMinimum(0);
        acceleratorBar.setMaximum(100);
        acceleratorBar.setValue(position);
        acceleratorBar.setString(Integer.toString(position));
    }

    public void setStageTime(float T) {
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.000");
        df.setDecimalFormatSymbols(symbol);
        minute = (int) T / 60;
        seconds = T % 60;
        /*if(T%60 == 0){
            minute++;
            seconds = 0;
        }
        if(T == 0)
        {
            minute = 0;
        }*/
        if (seconds < 10) {
            stageTime.setText(minute + ":0" + df.format(seconds));
        } else {
            stageTime.setText(minute + ":" + df.format(seconds));
        }

        JComponent parent = (JComponent) stageTime.getParent();
        if (parent != null) parent.revalidate();

    }

    public void setVelocity(int v) {
        velocity.setText(Integer.toString(v));
        JComponent parent = (JComponent) velocity.getParent();
        if (parent != null) parent.revalidate();
    }

    public void setRPMs(int maxRpm, int RPM) {
        RPMsBar.setMinimum(0);
        RPMsBar.setMaximum(maxRpm);
        RPMsBar.setValue(RPM);
        RPMsBar.setString(Integer.toString(RPM));
        //RPMs.setText(Integer.toString(RPM));
        setRedBG(maxRpm, RPM);
        //JComponent parent = (JComponent) RPMs.getParent();
        JComponent parent = (JComponent) RPMsBar.getParent();
        if (parent != null) parent.revalidate();
    }

    public void setGear(int g) {
        if (g == -1) {
            //System.out.print("R ");
            gear.setText("R");
            gear.setForeground(new Color(188, 181, 0));
        } else if (g == 0) {
            //System.out.print("N ");
            gear.setText("N");
            gear.setForeground(Color.RED);
        } else {
            //System.out.print((int) (car.getGear()) + " ");
            gear.setText(Integer.toString(g));
            gear.setForeground(Color.BLACK);
        }
        JComponent parent = (JComponent) gear.getParent();
        if (parent != null) parent.revalidate();

    }

    public void setDefaults(){
        setClutchBar(0);
        setBrakeBar(0);
        setAcceleratorBar(0);
        setStageTime(0);
        setVelocity(0);
        setRPMs(0,0);
        setGear(0);
    }

}
