import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
//Yessenia Mora Esquivel
// FlowLayout allows components to flow across multiple lines
public class FrameFlowLayout_14 extends JFrame {
        private final JButton buttonJButtonLeft;// button to set the left alignment
        private final JButton buttonJButtonMiddle; // button to set the center alignment
        private final JButton buttonJButtonRight;// button to set the right alignment
        private final FlowLayout scheme; // schema object
        private final Container container; // container to set the schema

    // set up the GUI and register the button listeners
public FrameFlowLayout_14(){
        super("Demo FlowLayout");
        scheme = new FlowLayout();
        container = getContentPane();// get container for schema
        setLayout(scheme);
    // set buttonJButtonLeft and register listener component
        buttonJButtonLeft = new JButton("Left");
        add(buttonJButtonLeft);// add Left button to frame
        buttonJButtonLeft.addActionListener(
        new ActionListener() {// anonymous inner class

        // process event of buttonJButtonIzquierda
        @Override
public void actionPerformed(ActionEvent event) {
            // realign attached components
        scheme.setAlignment(FlowLayout.LEFT);
        scheme.layoutContainer(container);
        }
      }
    );

    // set buttonJButtonCenter and register listener component
        buttonJButtonMiddle = new JButton("Middle");
        add(buttonJButtonMiddle);// add Center button to frame
        buttonJButtonMiddle.addActionListener(
        new ActionListener(){// anonymous inner class

            // process event of buttonJButtonCentro
         @Override
public void actionPerformed(ActionEvent event){
        scheme.setAlignment(FlowLayout.CENTER);
             // realign attached components
        scheme.layoutContainer(container);
       }
     }
  );
    // set RightButtonJButton and register listener
        buttonJButtonRight = new JButton("Right");
        add(buttonJButtonRight);// add Right button to frame
        buttonJButtonRight.addActionListener(
        new ActionListener(){// anonymous inner class
            // process event of buttonJButtonRight
         @Override
public void actionPerformed(ActionEvent evento) {
        scheme.setAlignment(FlowLayout.RIGHT);
             // realign attached components
        scheme.layoutContainer(container);
        }
      }
     );
   }// end FrameFlowLayout constructor
 }// end the FrameFlowLayout class
