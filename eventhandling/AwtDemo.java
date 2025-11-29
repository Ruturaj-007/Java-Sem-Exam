package sem_exm.eventhandling;

import java.awt.*;

public class AwtDemo {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Components");
        f.setSize(400,300);
        f.setLayout(new FlowLayout());

        Button btn = new Button("Click Me");
        Label l = new Label("Enter name");
        TextField tf = new TextField(15);
        Checkbox cb = new Checkbox("I Agree");
        Choice ch = new Choice();
        ch.add("Virat"); ch.add("Dhoni"); ch.add("Sachin");
        List list = new List(3);
        list.add("Java"); list.add("Python"); list.add("C++");
        Scrollbar sb = new Scrollbar();

        f.add(l);
        f.add(tf);
        f.add(btn);
        f.add(cb);
        f.add(ch);
        f.add(list);
        f.add(sb);

        f.setVisible(true);


    }
}
