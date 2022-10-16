import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class TestDrawingPanel_12_1 {
    // DrawPanel test
    public static void main(String[] args) {
        // create JFrame object
        JFrame app = new JFrame("A simple drawing program");
        DrawingPanel_12 drawingPanel_12 = new DrawingPanel_12();
        app.add(drawingPanel_12, BorderLayout.CENTER);
        // create a label and place it in the SOUTH region of the BorderLayout
        app.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(400,200);
        app.setVisible(true);
    }
}// end Painter class
