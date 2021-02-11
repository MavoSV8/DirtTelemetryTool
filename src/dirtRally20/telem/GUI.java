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

    private JLabel clutch = new JLabel();
    private JLabel brake = new JLabel();
    private JLabel throttle = new JLabel();

    private JPanel EASTpanel = new JPanel();
    private JPanel CENTERpanel = new JPanel();
    //private JPanel NORTHpanel = new JPanel();
    private JPanel WESTpanel = new JPanel();
    private JPanel SOUTHpanel = new JPanel();

    private JProgressBar RPMsBar = new JProgressBar();
    private JProgressBar clutchBar = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar brakeBar = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar throttleBar = new JProgressBar(SwingConstants.VERTICAL);

    private int minute = 0;
    private float seconds = 0;

    public void setEAST() {
        setupClutch();
        setupBrake();
        setupThrottle();
        EASTpanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        EASTpanel.add(clutchBar, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        EASTpanel.add(brakeBar, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        EASTpanel.add(throttleBar, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        EASTpanel.add(clutch, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        EASTpanel.add(brake, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        EASTpanel.add(throttle, gbc);
        EASTpanel.setPreferredSize(new Dimension(100, 100));
    }

    public void setWEST() {
        setupGear();
    }

    public void setNORTH() {
        setupRPMsBar();
        //setupRPMs();
    }

    public void setSOUTH() {
        setupStageTime();
    }

    public void setCENTER() {
        setupVelocity();
    }


    public void setRedBG(int maxRPM, int RPM) {
        if (RPM > (maxRPM - 300)) {
            //RPMs.setBackground(Color.RED);
            //RPMs.setForeground(Color.WHITE);
            RPMsBar.setForeground(Color.red);
        } else if ((RPM > maxRPM - 2500) && (RPM < maxRPM - 300)) {
            RPMsBar.setForeground(new Color(188, 123, 0));
        } else {
            //RPMs.setBackground(new Color(216,216,216));
            //RPMs.setForeground(Color.BLACK);
            RPMsBar.setForeground(Color.green);
        }
    }

    public void createWindow(String title, int width, int height) {
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setAlwaysOnTop(true);
        setWEST();
        setCENTER();
        setSOUTH();
        setNORTH();
        setEAST();
        //frame.getContentPane().add(RPMs,BorderLayout.NORTH);
        frame.getContentPane().add(RPMsBar, BorderLayout.NORTH);
        frame.getContentPane().add(gear, BorderLayout.WEST);
        frame.getContentPane().add(stageTime, BorderLayout.SOUTH);
        frame.getContentPane().add(velocity, BorderLayout.CENTER);
        frame.getContentPane().add(EASTpanel, BorderLayout.EAST);

    }

    public void setupClutch() {
        clutchBar.setUI(ui1);
        clutchBar.setStringPainted(true);
        clutchBar.setForeground(Color.cyan);
        clutchBar.setMinimum(0);
        clutchBar.setMaximum(100);
        clutch.setFont(new Font("Calibri", Font.BOLD, 20));
        clutch.setVerticalAlignment(JLabel.CENTER);
        clutch.setHorizontalAlignment(JLabel.CENTER);
        clutch.setText("C");
    }

    public void setupVelocity() {
        velocity.setHorizontalAlignment(JLabel.CENTER);
        velocity.setVerticalAlignment(JLabel.CENTER);
        velocity.setBackground(Color.GRAY);
        velocity.setOpaque(true);
        velocity.setPreferredSize(new Dimension(100, 100));
        velocity.setFont(new Font("Calibri", Font.PLAIN, 60));
    }

    public void setupGear() {
        gear.setHorizontalAlignment(JLabel.CENTER);
        gear.setVerticalAlignment(JLabel.CENTER);
        gear.setBackground(Color.WHITE);
        gear.setOpaque(true);
        gear.setPreferredSize(new Dimension(100, 100));
        gear.setFont(new Font("Calibri", Font.PLAIN, 80));
    }

    public void setupStageTime() {
        stageTime.setHorizontalAlignment(JLabel.CENTER);
        stageTime.setVerticalAlignment(JLabel.CENTER);
        stageTime.setBackground(new Color(216, 216, 216));
        stageTime.setOpaque(true);
        stageTime.setFont(new Font("Calibri", Font.PLAIN, 60));
    }

    public void setupTirePressure() {

    }

    public void setupBrakeTemperature() {

    }

    public void setupGForce() {

    }

    public void setupRPMs() {
        RPMs.setHorizontalAlignment(JLabel.CENTER);
        RPMs.setVerticalAlignment(JLabel.CENTER);
        RPMs.setBackground(new Color(216, 216, 216));
        RPMs.setOpaque(true);
        RPMs.setFont(new Font("Calibri", Font.PLAIN, 60));
    }

    public void setupRPMsBar(){
        RPMsBar.setUI(ui);
        RPMsBar.setStringPainted(true);
        RPMsBar.setBackground(new Color(216, 216, 216));
        RPMsBar.setForeground(Color.green);
        RPMsBar.setPreferredSize(new Dimension(500, 50));
        RPMsBar.setFont(new Font("Calibri", Font.PLAIN, 40));
    }

    public void setupBrake() {
        brakeBar.setUI(ui2);
        brakeBar.setStringPainted(true);
        brakeBar.setForeground(Color.YELLOW);
        brakeBar.setMinimum(0);
        brakeBar.setMaximum(100);
        brake.setFont(new Font("Calibri", Font.BOLD, 20));
        brake.setVerticalAlignment(JLabel.CENTER);
        brake.setHorizontalAlignment(JLabel.CENTER);
        brake.setText("B");
    }

    public void setupThrottle() {
        throttleBar.setUI(ui3);
        throttleBar.setStringPainted(true);
        throttleBar.setForeground(Color.ORANGE);
        throttleBar.setMinimum(0);
        throttleBar.setMaximum(100);
        throttle.setFont(new Font("Calibri", Font.BOLD, 20));
        throttle.setVerticalAlignment(JLabel.CENTER);
        throttle.setHorizontalAlignment(JLabel.CENTER);
        throttle.setText("T");
    }

    public void setClutchBar(float c) {
        int position = (int) (c * 100);

        clutchBar.setValue(position);
        clutchBar.setString(Integer.toString(position));
    }

    public void setBrakeBar(float b) {
        int position = (int) (b * 100);
        brakeBar.setValue(position);
        brakeBar.setString(Integer.toString(position));
    }

    public void setThrottleBar(float a) {
        int position = (int) (a * 100);
        throttleBar.setValue(position);
        throttleBar.setString(Integer.toString(position));
    }

    public void setStageTime(float T) {
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.000");
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

    public void setDefaults() {
        setClutchBar(0);
        setBrakeBar(0);
        setThrottleBar(0);
        setStageTime(0);
        setVelocity(0);
        setRPMs(0, 0);
        setGear(0);
    }

}
