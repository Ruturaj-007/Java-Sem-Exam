package sem_exm.eventhandling;

import java.awt.*;
import java.awt.event.*;

public class EventClassesDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Event clases Demo");
        frame.setSize(400,300);
        frame.setLayout(new FlowLayout());

        // Components
        Button btn = new Button("Submit");
        TextField tf = new TextField(20);
        Checkbox cb = new Checkbox("I agree");

        // 1.ActionEvent
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent: Button = " + e.getActionCommand());
            }
        });

        // 2. MouseEvent
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("MouseEvent: Click at X=" + e.getX() + " Y=" + e.getY());
            }
        });

        // 3. KeyEvent
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("KeyEvent: Key = " + e.getKeyChar());
            }
        });

        // 4. Item Event
        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("ItemEvent: Checkbox = " + cb.getLabel() +
                        ", State = " + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });

        // 5. Window Event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closed");
                frame.dispose();
            }
        });

        frame.add(btn);
        frame.add(tf);
        frame.add(cb);

        frame.setVisible(true);
    }
}
