package OperTacCalc.GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import OperTacCalc.Radar.*;
import OperTacCalc.Geometry.*;

public class MainWindow implements Runnable, ActionListener
{
    private JLabel message;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu taskRadarMenu, taskGeomMenu;
    private JMenuItem dirPatMenuItem, antGainMenuItem, esaMenuItem, fDopMenuItem, rDtimeMenuItem, rangeResMenuItem;
    private JMenuItem hAhMenuItem, lenArcMenuItem;
    JTextField smallField, bigField;
    LenghtArc lenghtArc;
    public static void main(String[] args)
    { SwingUtilities.invokeLater(new MainWindow()); }
    public void run() {
        frame = new JFrame("OperTac Calculator");
        menuBar = new JMenuBar();
        message = new JLabel();
        message.setHorizontalAlignment(JLabel.CENTER);
        // build the RadarTasks menu
        taskRadarMenu = new JMenu("RadarTasks");
        dirPatMenuItem = new JMenuItem("DirectPatterns");
        taskRadarMenu.add(dirPatMenuItem);
        antGainMenuItem = new JMenuItem("AntennaGain");
        taskRadarMenu.add(antGainMenuItem);
        esaMenuItem = new JMenuItem("EffScattArea");
        taskRadarMenu.add(esaMenuItem);
        fDopMenuItem = new JMenuItem("FreqDopler");
        taskRadarMenu.add(fDopMenuItem);
        rDtimeMenuItem = new JMenuItem("RangeOfDelayTime");
        taskRadarMenu.add(rDtimeMenuItem);
        rangeResMenuItem = new JMenuItem("RangeResolution");
        taskRadarMenu.add(rangeResMenuItem);
        dirPatMenuItem.addActionListener(this);
        antGainMenuItem.addActionListener(this);
        esaMenuItem.addActionListener(this);
        fDopMenuItem.addActionListener(this);
        rDtimeMenuItem.addActionListener(this);
        rangeResMenuItem.addActionListener(this);
        // build the GeomTasks menu
        taskGeomMenu = new JMenu("GeomTasks");
        lenArcMenuItem = new JMenuItem("LenghtArc");
        taskGeomMenu.add(lenArcMenuItem);
        hAhMenuItem = new JMenuItem("HeightAboveHorizon");
        taskGeomMenu.add(hAhMenuItem);
        lenArcMenuItem.addActionListener(this);
        hAhMenuItem.addActionListener(this);
        //set listener
        // taskMenuItem.addActionListener(this);
        // add menus to menubar
        menuBar.add(taskRadarMenu);
        menuBar.add(taskGeomMenu);
        // put the menubar on the frame
        frame.setJMenuBar(menuBar);
        frame.add(message, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //create textField
        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");
        bigField = new JTextField("Текст поля", 25);
        bigField.setToolTipText("Длиное поле");

    }    //handles the click event on JMenuItem
    public void actionPerformed(ActionEvent ev)
    {   lenghtArc =  new LenghtArc( );
        String textOnMenu = ((JMenuItem) ev.getSource()).getText();
        message.setText(textOnMenu + " menu item clicked.");

    }
}
