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

    private JLabel tireFR = new JLabel();
    private JLabel tireFL = new JLabel();
    private JLabel tireRR = new JLabel();
    private JLabel tireRL = new JLabel();

    private JLabel brakeFR = new JLabel();
    private JLabel brakeFL = new JLabel();
    private JLabel brakeRR = new JLabel();
    private JLabel brakeRL = new JLabel();

    private JLabel suspensionFR = new JLabel();
    private JLabel suspensionFL = new JLabel();
    private JLabel suspensionRR = new JLabel();
    private JLabel suspensionRL = new JLabel();

    private JLabel lateralG = new JLabel();
    private JLabel longitudinalG = new JLabel();

    private JPanel EASTpanel = new JPanel();
    private JPanel CENTERpanel = new JPanel();
    //private JPanel NORTHpanel = new JPanel();
    private JPanel WESTpanel = new JPanel();
    private JPanel SOUTHpanel = new JPanel();
    private JPanel gearPanel = new JPanel();
    private JPanel gForce = new JPanel();
    private JPanel suspensionPosition = new JPanel();
    private JPanel tireVelo = new JPanel();
    private JPanel brakeTemperature = new JPanel();

    private JProgressBar RPMsBar = new JProgressBar();
    private JProgressBar clutchBar = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar brakeBar = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar throttleBar = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar suspFL = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar suspFR = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar suspRL = new JProgressBar(SwingConstants.VERTICAL);
    private JProgressBar suspRR = new JProgressBar(SwingConstants.VERTICAL);

    private int minute = 0;
    private float seconds = 0;

    public void setEAST() {
        setupClutch();
        setupBrake();
        setupThrottle();
        EASTpanel.setPreferredSize(new Dimension(101, 300));
        EASTpanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //add clutchbar to panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        EASTpanel.add(clutchBar, gbc);
        //add brakebar to panel
        gbc.gridx = 1;
        gbc.gridy = 0;
        EASTpanel.add(brakeBar, gbc);
        //add throttlebar to panel
        gbc.gridx = 2;
        gbc.gridy = 0;
        EASTpanel.add(throttleBar, gbc);
        //add clutch label to panel
        gbc.gridx = 0;
        gbc.gridy = 1;
        EASTpanel.add(clutch, gbc);
        //add brake label to panel
        gbc.gridx = 1;
        gbc.gridy = 1;
        EASTpanel.add(brake, gbc);
        //add throttle label to panel
        gbc.gridx = 2;
        gbc.gridy = 1;
        EASTpanel.add(throttle, gbc);
        EASTpanel.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void setWEST() {
        WESTpanel.setPreferredSize(new Dimension(100, 300));
        WESTpanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        WESTpanel.add(suspensionPosition, gbc);
        WESTpanel.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void setNORTH() {
        setupRPMsBar();
        //setupRPMs();
    }

    public void setSOUTH() {
        setupStageTime();
    }

    public void setCENTER() {
        setupGForce();
        setupTireVelo();
        setupBrakeTemperature();
        setupVelocity();
        setupGear();
        setupSuspension();
        CENTERpanel.setPreferredSize(new Dimension(400, 300));
        CENTERpanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        CENTERpanel.add(gForce, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        CENTERpanel.add(velocity, gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        //gbc.fill = GridBagConstraints.VERTICAL;
        CENTERpanel.add(gearPanel, gbc);
        gbc.gridheight = 1;
        gbc.gridx = 2;
        gbc.gridy = 0;
        CENTERpanel.add(tireVelo, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        CENTERpanel.add(brakeTemperature,gbc);

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
        frame.getContentPane().add(WESTpanel, BorderLayout.WEST);
        frame.getContentPane().add(stageTime, BorderLayout.SOUTH);
        frame.getContentPane().add(CENTERpanel, BorderLayout.CENTER);
        frame.getContentPane().add(EASTpanel, BorderLayout.EAST);
        //frame.pack();
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
        velocity.setBackground(new Color(138, 140, 136));
        velocity.setForeground(new Color(21, 132, 0));
        velocity.setOpaque(true);
        velocity.setPreferredSize(new Dimension(190, 100));
        velocity.setMaximumSize(new Dimension(190, 100));
        velocity.setMinimumSize(new Dimension(190, 100));
        velocity.setFont(new Font("Calibri", Font.PLAIN, 40));
        velocity.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void setupGear() {
        gear.setHorizontalAlignment(JLabel.CENTER);
        gear.setVerticalAlignment(JLabel.CENTER);
        gear.setBackground(new Color(138, 140, 136));
        gear.setOpaque(true);
        gearPanel.setPreferredSize(new Dimension(70, 300));
        gearPanel.setMaximumSize(new Dimension(70, 300));
        gearPanel.setMinimumSize(new Dimension(70, 300));
        gear.setFont(new Font("Calibri", Font.PLAIN, 120));
        gear.setBorder(BorderFactory.createLineBorder(Color.black));
        gearPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gearPanel.add(gear,gbc);
    }

    public void setupStageTime() {
        stageTime.setHorizontalAlignment(JLabel.CENTER);
        stageTime.setVerticalAlignment(JLabel.CENTER);
        stageTime.setBackground(new Color(116, 116, 116));
        stageTime.setOpaque(true);
        stageTime.setFont(new Font("Calibri", Font.PLAIN, 60));
        stageTime.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void setupTireVelo() {
        tireFR.setVerticalAlignment(JLabel.CENTER);
        tireFR.setHorizontalAlignment(JLabel.CENTER);
        tireFR.setFont(new Font("Calibri", Font.PLAIN, 20));

        tireFL.setVerticalAlignment(JLabel.CENTER);
        tireFL.setHorizontalAlignment(JLabel.CENTER);
        tireFL.setFont(new Font("Calibri", Font.PLAIN, 20));

        tireRR.setVerticalAlignment(JLabel.CENTER);
        tireRR.setHorizontalAlignment(JLabel.CENTER);
        tireRR.setFont(new Font("Calibri", Font.PLAIN, 20));

        tireRL.setVerticalAlignment(JLabel.CENTER);
        tireRL.setHorizontalAlignment(JLabel.CENTER);
        tireRL.setFont(new Font("Calibri", Font.PLAIN, 20));

        tireVelo.setLayout(new GridLayout(2, 2, 2, 2));
        tireVelo.add(tireFL);
        tireVelo.add(tireFR);
        tireVelo.add(tireRL);
        tireVelo.add(tireRR);
        tireVelo.setPreferredSize(new Dimension(140,150));
        tireVelo.setMaximumSize(new Dimension(140,150));
        tireVelo.setMinimumSize(new Dimension(140,150));
        tireVelo.setBorder(BorderFactory.createLineBorder(Color.black));

    }

    public void setupBrakeTemperature() {
        brakeFR.setVerticalAlignment(JLabel.CENTER);
        brakeFR.setHorizontalAlignment(JLabel.CENTER);
        brakeFR.setFont(new Font("Calibri", Font.PLAIN, 20));

        brakeFL.setVerticalAlignment(JLabel.CENTER);
        brakeFL.setHorizontalAlignment(JLabel.CENTER);
        brakeFL.setFont(new Font("Calibri", Font.PLAIN, 20));

        brakeRR.setVerticalAlignment(JLabel.CENTER);
        brakeRR.setHorizontalAlignment(JLabel.CENTER);
        brakeRR.setFont(new Font("Calibri", Font.PLAIN, 20));

        brakeRL.setVerticalAlignment(JLabel.CENTER);
        brakeRL.setHorizontalAlignment(JLabel.CENTER);
        brakeRL.setFont(new Font("Calibri", Font.PLAIN, 20));

        brakeTemperature.setLayout(new GridLayout(2, 2, 2, 2));
        brakeTemperature.add(brakeFL);
        brakeTemperature.add(brakeFR);
        brakeTemperature.add(brakeRL);
        brakeTemperature.add(brakeRR);
        brakeTemperature.setPreferredSize(new Dimension(160,150));
        brakeTemperature.setMaximumSize(new Dimension(160,150));
        brakeTemperature.setMinimumSize(new Dimension(160,150));
        brakeTemperature.setBorder(BorderFactory.createLineBorder(Color.black));

    }


    public void setupGForce() {
        lateralG.setHorizontalAlignment(JLabel.CENTER);
        lateralG.setVerticalAlignment(JLabel.CENTER);
        lateralG.setFont(new Font("Calibri", Font.PLAIN, 20));

        longitudinalG.setHorizontalAlignment(JLabel.CENTER);
        longitudinalG.setVerticalAlignment(JLabel.CENTER);
        longitudinalG.setFont(new Font("Calibri", Font.PLAIN, 20));

        gForce.setLayout(new GridLayout(1,2,2,2));
        gForce.add(lateralG);
        gForce.add(longitudinalG);
        gForce.setBackground(new Color(117, 117, 117));
        gForce.setBorder(BorderFactory.createLineBorder(Color.black));
        gForce.setPreferredSize(new Dimension(190, 200));
        gForce.setMaximumSize(new Dimension(190, 200));
        gForce.setMinimumSize(new Dimension(190, 200));
    }

    public void setupSuspension() {
        suspFL.setMinimum(-200);
        suspFL.setMaximum(200);
        suspFL.setPreferredSize(new Dimension(20, 90));

        suspFR.setMinimum(-200);
        suspFR.setMaximum(200);
        suspFR.setPreferredSize(new Dimension(20, 90));

        suspRL.setMinimum(-200);
        suspRL.setMaximum(200);
        suspRL.setPreferredSize(new Dimension(20, 90));

        suspRR.setMinimum(-200);
        suspRR.setMaximum(200);
        suspRR.setPreferredSize(new Dimension(20, 90));

        suspensionPosition.setLayout(new GridBagLayout());
        suspensionPosition.setBackground(Color.WHITE);
        //suspensionPosition.setBorder(BorderFactory.createLineBorder(Color.black));
        suspensionPosition.setAlignmentX(0);
        suspensionPosition.setAlignmentY(0);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        suspensionPosition.add(suspFL, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        suspensionPosition.add(suspFR, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        suspensionPosition.add(suspRL, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        suspensionPosition.add(suspRR, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        suspensionPosition.add(suspensionFL, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        suspensionPosition.add(suspensionFR, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        suspensionPosition.add(suspensionRL, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        suspensionPosition.add(suspensionRR, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        suspensionPosition.add(new JLabel("       "), gbc);
        gbc.gridy = 1;
        suspensionPosition.add(new JLabel("       "), gbc);
        gbc.gridy = 2;
        suspensionPosition.add(new JLabel("       "), gbc);
        gbc.gridy = 3;
        suspensionPosition.add(new JLabel("       "), gbc);
    }

    public void setupRPMs() {
        RPMs.setHorizontalAlignment(JLabel.CENTER);
        RPMs.setVerticalAlignment(JLabel.CENTER);
        RPMs.setBackground(new Color(216, 216, 216));
        RPMs.setOpaque(true);
        RPMs.setFont(new Font("Calibri", Font.PLAIN, 60));
    }

    public void setupRPMsBar() {
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
        velocity.setText(v + "\r\n KM/H");
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

    public void setSuspensionPosition(int FL, int FR, int RL, int RR) {
        suspFL.setValue(FL);
        suspFR.setValue(FR);
        suspRL.setValue(RL);
        suspRR.setValue(RR);

        suspensionFL.setText(Integer.toString(FL));
        suspensionFR.setText(Integer.toString(FR));
        suspensionRL.setText(Integer.toString(RL));
        suspensionRR.setText(Integer.toString(RR));

    }

    public void setTireVelo(int FL, int FR, int RL, int RR) {
        tireFL.setText(Integer.toString(FL));
        tireFR.setText(Integer.toString(FR));
        tireRL.setText(Integer.toString(RL));
        tireRR.setText(Integer.toString(RR));
    }

    public void setBrakeTemperature(int FL, int FR, int RL, int RR) {
        brakeFL.setText(Integer.toString(FL));
        brakeFR.setText(Integer.toString(FR));
        brakeRL.setText(Integer.toString(RL));
        brakeRR.setText(Integer.toString(RR));
    }

    public void setgForce(float latG, float longG){
        lateralG.setText(Float.toString(latG));
        longitudinalG.setText(Float.toString(longG));
    }

    public void setDefaults() {
        setClutchBar(0);
        setBrakeBar(0);
        setThrottleBar(0);
        setStageTime(0);
        setVelocity(0);
        setRPMs(0, 0);
        setGear(0);
        setSuspensionPosition(0, 0, 0, 0);
        setTireVelo(0, 0, 0, 0);
        setBrakeTemperature(0, 0, 0, 0);
        setgForce(0,0);
    }

}
