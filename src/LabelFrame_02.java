//Yessenia Mora Esquivel
// Components Jlabel with text and icons.
import java.awt.FlowLayout; // specifies how components are to be ordered
import javax.swing.JFrame; // give the basic characteristics of a window
import javax.swing.JLabel;  // show text and images
import javax.swing.SwingConstants;  // common constants use with Swing
import javax.swing.Icon;  // interface use for manipulation of images
import javax.swing.ImageIcon;  // load the images
//Yessenia Mora Esquivel
public class LabelFrame_02 extends JFrame{
    private JLabel label1; // JLabel only with text
    private JLabel label2; // JLabel construct with text and icon
    private JLabel label3; // JLabelwith adicional text and icon

    public LabelFrame_02() {
        super("Test of JLabel");
        setLayout(new FlowLayout());  // set the frame schema

        //Constructor of JLabel with a String argue
        label1=new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1); //add label1 to JFrame

        //Constructor of JLabel with String argue, Icon and alineation
        Icon insect=new ImageIcon(getClass().getResource("insect1.png"));//DOWNLOAD IMAGE
        label2=new JLabel("Label with text and icon",insect,SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); //add label2 to JFrame

        label3=new JLabel(); //constructor of JLabel without argue
        label3.setText("Label with icon and text in the bottom left");
        label3.setIcon(insect); //add icon to JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3); //add label3 to JFrame
    }
}
