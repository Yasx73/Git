// Handling key events
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
//Yessenia Mora Esquivel
public class FrameworkDemoKeys_13 extends JFrame implements KeyListener {
        private String line1 = "";// first line of the textarea
        private String line2 = "";// second line of the textarea
        private String line3 = "";// third line of the textarea
        private JTextArea textArea;// textarea to display the output

public FrameworkDemoKeys_13() {
        // KeyDemoFrame constructor
        super("Demo of key press events");
        textArea = new JTextArea(10, 15);// set the JTextArea object
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea);// add the textarea to JFrame
        addKeyListener(this);
        }
        // handle the event of pressing any key
        @Override
public void keyPressed(KeyEvent event) {
        line1 = String.format("Key pressed: %s",
        KeyEvent.getKeyText(event.getKeyCode()));
        setLines2and3(event);
        }
         @Override
public void keyReleased(KeyEvent event) {
        line1 = String.format("Key released: %s",
        KeyEvent.getKeyText(event.getKeyCode()));// show the key pressed
        setLines2and3(event);// set output lines two and three
        }
        // handle the event of releasing any key
         @Override
public void keyTyped(KeyEvent event){
        line1 = String.format("Key pressed: %s", event.getKeyChar());
                 setLines2and3(event);// set output lines two and three
        }
        // set output lines two and three
private void setLines2and3(KeyEvent event)
        {
        line2 = String.format("This key %s is an action key", (event.isActionKey() ? "" : "no "));
        String temp = KeyEvent.getKeyModifiersText(event.getModifiers()); //It is crossed out because it´s a deprecated method
        line3 = String.format("Modifier keys pressed: %s",
        (temp.equals("") ? "none" : temp));// print modifiers
        textArea.setText(String.format("%s\\n%s\\n%s\\n",
        line1, line2, line3));// print three lines of text
       }
}// end class KeyDemoFrame
