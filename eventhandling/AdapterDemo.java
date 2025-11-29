package sem_exm.eventhandling;

import java.awt.*;
import java.awt.event.*;

public class AdapterDemo {
    public static void main(String[] args) {
        Frame f = new Frame("Adapter Demo");
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());

        TextField tf = new TextField(15);

        // MouseAdapter – only 1 method used
        tf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked in TextField");
            }
        });

        // KeyAdapter – only typing method used
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Typed Key: " + e.getKeyChar());
            }
        });

        // WindowAdapter – close window cleanly
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closed");
                f.dispose();
            }
        });

        f.add(tf);
        f.setVisible(true);
    }
}
