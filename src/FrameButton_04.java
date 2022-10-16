import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//Yessenia Mora Esquivel
class FrameButton_04 extends JFrame {
    private final JButton buttonJButtonSimple; // button with text only
    private final JButton buttonJButtonElegant;// button with icons

// ButtonFrame adds JButton objects to JFrame
 public FrameButton_04() {
    super("Button test");
    setLayout(new FlowLayout());
         buttonJButtonSimple = new JButton("Simple button");// button with text
         add(buttonJButtonSimple); // add buttonJButtonSimple to JFrame
         Icon image0 = new ImageIcon(getClass().getResource("image0.gif"));
         Icon image1 = new ImageIcon(getClass().getResource("image1.gif"));
        buttonJButtonElegant = new JButton("Elegant button", image0);// set the image
        buttonJButtonElegant.setRolloverIcon(image1); // set the replacement image
        add(buttonJButtonElegant); // add fancyButtonJButton to JFrame

     // create new ButtonHandler to handle button events
         ManejadorBoton handler = new ManejadorBoton();
         buttonJButtonElegant.addActionListener(handler);
         buttonJButtonSimple.addActionListener(handler);
 }
    // inner class to handle button events
         private class ManejadorBoton implements ActionListener
 {
     // handle button event
         @Override
 public void actionPerformed(ActionEvent evento)
         {
         JOptionPane.showMessageDialog(FrameButton_04.this, String.format(
         "You oppressed: %s", evento.getActionCommand()));
         }
    }
}// end the ButtonFrame class