import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
//Yessenia Mora Esquivel
// JComboBox object that displays a list of image names
    public class FrameBoxCombined_07 extends JFrame {
        private final JComboBox<String> imagesJComboBox;// contains icon names
        private final JLabel label;// show the selected icon
        private static final String names[]=
                {"ima0.gif","ima1.gif","ima2.gif","ima3.gif"};
        private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))};

    // ComboBoxFrame constructor adds a JComboBox object to JFrame
        public FrameBoxCombined_07(){
        super("Test JComboBox");
        setLayout(new FlowLayout());// set the frame schema
        imagesJComboBox = new JComboBox<String>(names);// set JComboBox
        imagesJComboBox.setMaximumRowCount(3);// show three rows
        imagesJComboBox.addItemListener(
        new ItemListener(){// anonymous inner class

        // handle JComboBox event
        @Override
        public void itemStateChanged(ItemEvent event) {
        // determine if the element is selected
        if (event.getStateChange() == ItemEvent.SELECTED)
        label.setIcon(icons[
        imagesJComboBox.getSelectedIndex()]);
                }
            }// end anonymous inner class
        ); // end addItemListener call
            add(imagesJComboBox);// add combobox to JFrame
            label = new JLabel(icons[0]); // add label to JFrame
            add(label);
        }
 }
