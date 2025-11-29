package sem_exm.eventhandling;

import java.awt.*;
import java.awt.event.*;

public class DemoDelegation {
    public static void main(String[] args) {
        // Create Frame (Window)
        Frame frame = new Frame("Event Demo");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create Button (Event Source)
        Button btn = new Button("Click Me");

        // Register Listener using Inner Class
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Add Button to Frame
        frame.add(btn);

        // Close window when clicking X (using Adapter)
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
