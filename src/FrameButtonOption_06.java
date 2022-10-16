import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
//Yessenia Mora Esquivel
// Create radio buttons, using ButtonGroup and JRadioButton
 class FrameButtonOption extends JFrame {
    private final JTextField textField;
    private final Font typeLetterSimple; // is used to show the changes in the font
    private final Font typeLetterBold; // font for bold text
    private final Font typeLetterItalics; // font for italic text
    private final Font typeLetterBoldItalics; // font for bold and italic text
    private final JRadioButton simpleJRadioButton; // select simple text
    private final JRadioButton boldJRadioButton; // select bold text
    private final JRadioButton italicsJRadioButton; // select italic text
    private final JRadioButton boldItalicsJRadioButton; // contains the radio buttons
    private ButtonGroup groupOptions;

// The constructor of OptionButtonFrame adds the JRadioButton objects to the JFrame
 public FrameButtonOption() {
        super("Test RadioButton");
        setLayout(new FlowLayout());
        textField = new JTextField("Notice the change in the font style", 25);
        add(textField);// add TextField to JFrame

     // create the radio buttons
        simpleJRadioButton = new JRadioButton("Simple", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicsJRadioButton = new JRadioButton("Italics", false);
        boldItalicsJRadioButton = new JRadioButton("Bold/Italics", false);
        add(simpleJRadioButton); // add simple button to JFrame
        add(boldJRadioButton); // add bold button to JFrame
        add(italicsJRadioButton); // add italics button to JFrame
        add(boldItalicsJRadioButton); // add bold and italic button

// create a logical relationship between the JRadioButton objects
        groupOptions = new ButtonGroup(); // create ButtonGroup
        groupOptions.add(simpleJRadioButton); // add simple to the group
        groupOptions.add(boldJRadioButton); // add bold to the group
        groupOptions.add(italicsJRadioButton); // add italics to the group
        groupOptions.add(boldItalicsJRadioButton); // add bold and italics
     // create font objects
        typeLetterSimple = new Font("Serif", Font.PLAIN, 14);
        typeLetterBold = new Font("Serif", Font.BOLD, 14);
        typeLetterItalics = new Font("Serif", Font.ITALIC, 14);
        typeLetterBoldItalics = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(typeLetterSimple);

// register events for JRadioButton objects
        simpleJRadioButton.addItemListener(
          new OptionButtonHandler(typeLetterSimple));
        boldJRadioButton.addItemListener(
          new OptionButtonHandler(typeLetterBold));
        italicsJRadioButton.addItemListener(
          new OptionButtonHandler(typeLetterItalics));
        boldItalicsJRadioButton.addItemListener(
          new OptionButtonHandler(typeLetterBoldItalics));
  }
    // private inner class to handle radio button events
   private class OptionButtonHandler implements ItemListener {
    private Font typeLetter;// font associated with this component listening

   public OptionButtonHandler(Font f) {
     typeLetter = f;
   }
// handle radio button events
  @Override
  public void itemStateChanged(ItemEvent event) {
    textField.setFont(typeLetter);
     }
   }
}
