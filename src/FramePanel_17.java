// Use of a JPanel object to help layout components.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
//Yessenia Mora Esquivel
public class FramePanel_17 extends JFrame  {
        private final JPanel panelButtons;// panel containing the buttons
        private final JButton[] buttons;

    // constructor with no arguments
public FramePanel_17(){
        super("Dashboard Demo");
        buttons = new JButton[5];
        panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(1, buttons.length));

    // create and add the buttons
        for (int count = 0; count < buttons.length; count++){
              buttons[count] = new JButton("Button " + (count + 1));
              panelButtons.add(buttons[count]);// add the button to the panel
         }
        add(panelButtons, BorderLayout.SOUTH);// add the panel to JFram
    }
}// end FramePanel class
