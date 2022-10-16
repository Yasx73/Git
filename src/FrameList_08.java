import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

//Yessenia Mora Esquivel
// JList object that displays a list of colors
public class FrameList_08 extends JFrame {
    private final JList<String> listJListColors;
    private static final String[] colorsName = {"Black", "Blue", "Cyan",
            "Dark gray", "Gray", "Green", "Light gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE,
            Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
            Color.RED, Color.WHITE, Color.YELLOW};

    // The constructor of ListFrame adds to the JFrame the JScrollPane that contains a JList
    public FrameList_08() {
        super("Test JList");
        setLayout(new FlowLayout());
        listJListColors = new JList<String>(colorsName);// list of namescolors
        listJListColors.setVisibleRowCount(5);// show five rows at a time
        listJListColors.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // no permite selecciones múltiples
        add(new JScrollPane(listJListColors));// anonymous inner class
        listJListColors.addListSelectionListener(
                new ListSelectionListener() {
                    // handle list selection events
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[listJListColors.getSelectedIndex()]);
                    }
                }
        );
    }
}// end class ListFrame
