package OperTacCalc.GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class ComboBox extends JPanel
        implements ActionListener
{    JLabel picture;
    public ComboBox()
    {   super(new BorderLayout());
        ArrayList<String> listTask = new ArrayList<String>();
        listTask.add("LenghtArc");
        listTask.add("DirectPatterns");
        listTask.add("AntennaGain");
        listTask.add("EffScattArea");
        listTask.add("FreqDopler");
        listTask.add("RangeOfDelayTime");
        //Create the combo box, select the item at index 4.
        //Indices start at 0, so 4 specifies the EPR.
        JComboBox taskList = new JComboBox(listTask.toArray());
        taskList.setSelectedIndex(4);
        taskList.addActionListener(this);
        //Set up the picture.
        picture = new JLabel();
        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
        picture.setHorizontalAlignment(JLabel.CENTER);
        updateLabel(listTask.get(taskList.getSelectedIndex()));
        picture.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        //The preferred size is hard-coded to be the width of the
        //widest image and the height of the tallest image + the border.
        //A real program would compute this.
        picture.setPreferredSize(new Dimension(277, 122 + 10));
        //Lay out the demo.
        add(taskList, BorderLayout.PAGE_START);
        add(picture, BorderLayout.PAGE_END);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
    // Listens to the combo box.
     public void actionPerformed(ActionEvent e)
    {   JComboBox cb = (JComboBox) e.getSource();
        String petName = (String) cb.getSelectedItem();
        updateLabel(petName);  }
    protected void updateLabel(String name)
    {
        picture.setText(name);
    }
    /** Create the GUI and show it.  For thread safety,
     * this method should be invoked from the event-dispatching thread.  */
    private static void createAndShowGUI()
    {   //Create and set up the window.
        JFrame frame = new JFrame("OperTacCalc (ComBoxDemo)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create and set up the content pane.
        JComponent newContentPane = new ComboBox();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        //Display the window.
        frame.pack();
        frame.setVisible(true);  }
    public static void main(String[] args)
    {   //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {  public void run()
            {
                createAndShowGUI();
            }  });  }
}
