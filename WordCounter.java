import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCounter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Word Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 350, 100);
        frame.add(textArea);

        JLabel wordCountLabel = new JLabel("Word Count: 0");
        wordCountLabel.setBounds(20, 140, 200, 30);
        frame.add(wordCountLabel);

        // Button to count words
        JButton countButton = new JButton("Count Words");
        countButton.setBounds(20, 180, 120, 30);
        frame.add(countButton);

        // Button action listener
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText().trim();
                if (text.isEmpty()) {
                    wordCountLabel.setText("Word Count: 0");
                } else {
                    String[] words = text.split("\\s+"); // Splitting by spaces
                    wordCountLabel.setText("Word Count: " + words.length);
                }
            }
        });
        // Set frame visible
        frame.setVisible(true);
    }
}

