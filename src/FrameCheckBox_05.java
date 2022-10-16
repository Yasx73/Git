import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
// JcheckBox buttons and element events
//Yessenia Mora Esquivel
    public class FrameCheckBox_05 extends JFrame {
        private JTextField textFrame; // display the text in fonts changeable
        private JCheckBox boldJCheckBox; // to select/deselect bold
        private JCheckBox italicJCheckBox; // to select/deselect bold

    // The constructor of CheckBoxFrame adds JCheckBox objects to JFrame
    public FrameCheckBox_05() {
        super("JCheckBox test");
        setLayout(new FlowLayout());
        // set JTextField and its font
        textFrame = new JTextField("Notice how the font style changes", 20);// add "bold" checkbox to JFrame
        textFrame.setFont(new Font("Serif", Font.PLAIN, 14));// add "italic" checkbox to JFrame
        add(textFrame);

        // register listener components for JCheckBox objects
        boldJCheckBox = new JCheckBox("Bold font");
        italicJCheckBox = new JCheckBox("Italics");
        add(boldJCheckBox);
        add(italicJCheckBox);

        FrameCheckBox handler = new FrameCheckBox();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
}
    // private inner class for handling ItemListener events
    private class FrameCheckBox implements ItemListener {
        // respond to checkbox events
        @Override
        public void itemStateChanged(ItemEvent evento) {
        Font tipoletra = null;  // store the new Font object
            // determine which CheckBox objects are selected and create the Font object
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.BOLD, 14);
            else if (italicJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.ITALIC, 14);
        else
        tipoletra = new Font("Serif", Font.PLAIN, 14);
            textFrame.setFont(tipoletra);
        }
    }
}// end class CheckBoxFrame
