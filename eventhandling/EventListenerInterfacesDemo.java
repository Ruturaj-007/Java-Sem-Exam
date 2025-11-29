package sem_exm.eventhandling;

import java.awt.*;
import java.awt.event.*;

public class EventListenerInterfacesDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("All listener demo");
        frame.setSize(400,300);
        frame.setLayout(new FlowLayout());

        Button btn = new Button("Press Button");
        TextField tf = new TextField(20);

        // 1. Button click
        btn.addActionListener(e-> System.out.println("Button clicked"));

        // 2. Mouse clicked on textField (using adapter)
        tf.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked inside textfield");
            }
        });

        tf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
            }
            public void keyReleased(KeyEvent e) {}
            public void keyTyped(KeyEvent e) {}
        });

        frame.add(btn);
        frame.add(tf);

        // Closing the window Listener
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
