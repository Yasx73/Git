import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
//Yessenia Mora Esquivel
// BorderLayout containing five buttons
public class FrameBorderLayout_15 extends JFrame implements ActionListener {
        private final JButton buttons[];// array of buttons to hide portions
        private static final String names[] = {"Hide North", "Hide South",
        "Hide East", "Hide West", "Hide Center"};
        private final BorderLayout scheme;

// set the GUI and event handling
public FrameBorderLayout_15(){
        super("BorderLayout demo");
        scheme = new BorderLayout(5, 5);// 5 pixel spaces
        setLayout(scheme);
        buttons = new JButton[names.length];
        // create JButton objects and register listeners for them
        for (int count = 0; count < names.length; count++){
        buttons[count] = new JButton(names[count]);
        buttons[count].addActionListener(this);
        }
        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
         }

    // handle button events
   @Override
public void actionPerformed(ActionEvent evento){
        // check the event source and dispatch the content panel of chordal manner
        for (JButton button : buttons) {
        if (evento.getSource() == button)
        button.setVisible(false);// hide the clicked button
        else
        button.setVisible(true);// show the other buttons
            }
        scheme.layoutContainer(getContentPane());// layout the content pane
        }
}// end the FrameBorderLayout class
