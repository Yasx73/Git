// Adapter class used to implement event handlers
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;
public class DrawingPanel_12 extends JPanel {
         private final ArrayList<Point> points = new ArrayList<>();// list of Point references

    // set the GUI and register the mouse event handler
public DrawingPanel_12(){
    // handle mouse move event on frame
       addMouseMotionListener(// anonymous inner class
       new MouseMotionAdapter() {
        @Override

public void mouseDragged(MouseEvent event) {
        points.add(event.getPoint());
        repaint();
        }
      }
    );
   }
    // store drag coordinates and redraw
    @Override
public void paintComponent(Graphics g) {
        super.paintComponent(g);// clear the drawing area
        // draw all points
        for (Point point : points)
        g.fillOval(point.x, point.y, 4, 4);
     }
}// end class DrawingPanel
