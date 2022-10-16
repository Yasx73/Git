// GridLayout containing six buttons
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
//Yessenia Mora Esquivel
public class FrameGridLayout_16 extends JFrame implements ActionListener{
   private final JButton[] buttons;// button array
   private static final String[] names = { "one", "two", "three", "four", "five", "six"};
   private boolean alternate = true;// toggle between two schemes
   private Container container;// frame container
   private GridLayout grid1;// first GridLayout object
   private GridLayout grid2;// second GridLayout object

// constructor with no arguments
public FrameGridLayout_16(){
  super("GridLayout demo");
  grid1 = new GridLayout(2, 3, 5, 5);// 2 times 3; spaces of 5
  grid2 = new GridLayout(3, 2);// 3 times 2; no spaces
  container = getContentPane();
  setLayout(grid1);
  buttons = new JButton[names.length];
   for (int count = 0; count < names.length; count++) {
   buttons[count] = new JButton(names[count]);
   buttons[count].addActionListener(this);// register listener component
   add(buttons[count]);// add button to JFrame object
   }
 }
// handle button events, toggling between schemes
 @Override
public void actionPerformed(ActionEvent event){
       if (alternate)// set schema based on toggle
            container.setLayout(grid2);
       else
            container.setLayout(grid1);
            alternate = !alternate;
            container.validate();// redistribute the container
   }
}// end the FrameGridLayout class
