package sem_exm.eventhandling;
import java.awt.*;
import java.awt.event.*;

public class LayoutFrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Layout + Frame Demo");

        // ---- Frame Basics
        f.setSize(400, 300);
        f.setLayout(new FlowLayout()); // try: GridLayout(2,2), BorderLayout(), CardLayout()

        // ---- AWT Components
        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");

        // ---- Add Components
        f.add(b1);
        f.add(b2);
        f.add(b3);

        // ---- Close Frame using WindowAdapter
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setVisible(true);
    }
}
