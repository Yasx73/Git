import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
// Demonstration of mouse clicks and how to differentiate mouse buttons
//Yessenia Mora Esquivel
public class FrameDetailsMouse_11 extends JFrame{
    private String details;// String displayed in StatusBar
    private final JLabel statusBar;// JLabel that appears at the botton of the window

    // constructor sets String of title bar and registers component mouse listening
public FrameDetailsMouse_11() {
        super("Clicks and mouse buttons");
        statusBar = new JLabel("Click on the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());// add handler
        }
    // inner class to handle mouse events
private class MouseClickHandler extends MouseAdapter {
        // handle mouse click event and determine which button was pressed
        @Override
        //CHECK CODE, ONLY SHOWS LEFT SIDE CLICKS
public void mouseClicked(MouseEvent event) {
            int xPos = event.getX();// get mouse position x
            int yPos = event.getY();// get mouse y position
            details = String.format("Clicked %d time(s)",
            event.getClickCount());
            if (event.isMetaDown())// the right button of the mouse
            details += "with the right mouse button";
            else if (event.isAltDown())// middle mouse button
                details += "with the middle mouse button";
            else // left mouse button
            details+= "with the left mouse button";
            statusBar.setText(details);// display message in statusbar
          }
     }
}// end class MouseDetailFrame
