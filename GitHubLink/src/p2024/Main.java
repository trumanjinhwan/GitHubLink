package p2024;

import java.awt.*;

class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("TextArea 예제");
        TextArea textArea = new TextArea();

        frame.add(textArea);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}