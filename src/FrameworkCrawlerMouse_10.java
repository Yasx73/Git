import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Yessenia Mora Esquivel
// Mouse event handling.
public class FrameworkCrawlerMouse_10 extends JFrame {
    private final JPanel panelMouse;// panel in which the events will occur of mouse
    private final JLabel statusBar;// display event information
    // The MouseTrackerFrame constructor sets up the GUI and
    // register mouse event handlers
    public FrameworkCrawlerMouse_10() {
        super("Mouse events demo");
        panelMouse = new JPanel();
        panelMouse.setBackground(Color.WHITE);
        add(panelMouse, BorderLayout.CENTER);// add panel to JFrame

        statusBar = new JLabel("Mouse out of JPanel");
        add(statusBar, BorderLayout.SOUTH); // agrega etiqueta a JFrame

        HandlerMouse handler = new HandlerMouse();
        panelMouse.addMouseListener(handler);
        panelMouse.addMouseMotionListener(handler);
    }
    // create and register a listener component for mouse events and its movement
    private class HandlerMouse implements MouseListener,
            MouseMotionListener {
        // The MouseListener event handlers
        // handle the event when the mouse is released right after pressing the button
        @Override
        public void mouseClicked(MouseEvent event) {
            statusBar.setText(String.format("Clicked [%d, %d]",
                    event.getX(), event.getY()));
        }
        // handle event when mouse is pressed
        @Override
        public void mousePressed(MouseEvent event) {
            statusBar.setText(String.format("Was pressed on [%d, %d]",
                    event.getX(), event.getY()));
        }
        // handle event when mouse button is released
        @Override
        public void mouseReleased(MouseEvent event) {
            statusBar.setText(String.format("Got loose in [%d, %d]",
                    event.getX(), event.getY()));
        }
        // handle event when mouse enters area
        @Override
        public void mouseEntered(MouseEvent event) {
            statusBar.setText(String.format("Mouse entered [%d, %d]",
                    event.getX(), event.getY()));
            panelMouse.setBackground(Color.GREEN);
        }
        // handle event when mouse leaves area
        @Override
        public void mouseExited(MouseEvent event) {
            statusBar.setText("Mouse out of JPanel");
            panelMouse.setBackground(Color.WHITE);
        }
        // Los manejadores de eventos de MouseMotionListener manejan
        // el evento cuando el usuario arrastra el ratón con el botón oprimido
        @Override
        public void mouseDragged(MouseEvent event) {
            statusBar.setText(String.format("Crawled in [%d, %d]",
                    event.getX(), event.getY()));
        }
        // handle event when user moves mouse
        @Override
        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Moved in [%d, %d]",
                    event.getX(), event.getY()));
        }
    }// end inner class MouseHandler
}// end MouseTrackerFrame class
