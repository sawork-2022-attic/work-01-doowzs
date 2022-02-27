package sa2022.ascii;

import asciiPanel.AsciiPanel;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sa2022.ascii.config.AsciiConfig;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsciiConfig.class);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AsciiPanel panel = context.getBean(AsciiPanel.class);
        panel.write("The quick brown fox jumps over the lazy dog.");
        frame.add(panel);
        frame.setSize(panel.getPreferredSize());
        frame.setVisible(true);

    }

}
