package OperTacCalc.GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;
import OperTacCalc.*; //Radar.*;
//import OperTacCalc.Geometry.LenghtArc;
public class MainWindow implements Runnable, ActionListener
{
    private JLabel message;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu taskMenu, editMenu;
    private JMenuItem lenArcMenuItem, dirPatMenuItem, antGainMenuItem, esaMenuItem, fDopMenuItem, rDtimeMenuItem;
    private JMenuItem cutMenuItem, copyMenuItem, pasteMenuItem;
    JTextField smallField, bigField;
    public static void main(String[] args)
    { SwingUtilities.invokeLater(new MainWindow()); }
    public void run() {
        frame = new JFrame("OperTac Calculator");
        menuBar = new JMenuBar();
        message = new JLabel();
        message.setHorizontalAlignment(JLabel.CENTER);
        // build the File menu
        taskMenu = new JMenu("Tasks");
        lenArcMenuItem = new JMenuItem("LenghtArc");
        taskMenu.add(lenArcMenuItem);
        dirPatMenuItem = new JMenuItem("DirectPatterns");
        taskMenu.add(dirPatMenuItem);
        antGainMenuItem = new JMenuItem("AntennaGain");
        taskMenu.add(antGainMenuItem);
        esaMenuItem = new JMenuItem("EffScattArea");
        taskMenu.add(esaMenuItem);
        fDopMenuItem = new JMenuItem("FreqDopler");
        taskMenu.add(fDopMenuItem);
        rDtimeMenuItem = new JMenuItem("RangeOfDelayTime");
        taskMenu.add(rDtimeMenuItem);
        lenArcMenuItem.addActionListener(this);
        dirPatMenuItem.addActionListener(this);
        antGainMenuItem.addActionListener(this);
        esaMenuItem.addActionListener(this);
        fDopMenuItem.addActionListener(this);
        rDtimeMenuItem.addActionListener(this);
        // build the Edit menu
        editMenu = new JMenu("Edit");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        //set listener
        // taskMenuItem.addActionListener(this);
        cutMenuItem.addActionListener(this);
        copyMenuItem.addActionListener(this);
        pasteMenuItem.addActionListener(this);
        // add menus to menubar
        menuBar.add(taskMenu);
        menuBar.add(editMenu);
        // put the menubar on the frame
        frame.setJMenuBar(menuBar);
        frame.add(message, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }    //handles the click event on JMenutem
    public void actionPerformed(ActionEvent ev)
    {   String textOnMenu = ((JMenuItem) ev.getSource()).getText();
        message.setText(textOnMenu + " menu item clicked."); }
}
