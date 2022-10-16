// Copy the selected text from one JText area to another
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
//Yessenia Mora Esquivel
public class FrameAreaText_18 extends JFrame {
        private final JTextArea areaText1;// show demo string
        private final JTextArea areaText2;// the highlighted text is copied here
        private final JButton buttonCopy;// start copying text

        // constructor with no arguments
public FrameAreaText_18() {
        super("JTextArea demo");
        Box frame = Box.createHorizontalBox();// create a frame
        String demo = "This is a\ndemo string for\n" +
        "illustrate how to copy text\n from a text area to \n" +
        "another, using an\nexternal event\n";

        areaText1= new JTextArea(demo, 10, 15);
        frame.add(new JScrollPane(areaText1));// add scroll panel
        buttonCopy = new JButton("Copy >>>");// create copy button
        frame.add(buttonCopy);// add copy button to box
        buttonCopy.addActionListener(
        new ActionListener(){// anonymous inner class

     // set the text in textArea2 with the selected text from areaText1
        @Override
public void actionPerformed(ActionEvent event){
        areaText2.setText(areaText1.getSelectedText());
                 }
            }
        );
        areaText2 = new JTextArea(10, 15);
        areaText2.setEditable(false);
        frame.add(new JScrollPane(areaText2));// add scroll panel
        add(frame);// add frame to frame
        }
 }// end the TextAreaFrame class
