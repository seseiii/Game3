import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Pac Man");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Make the frame full-screen
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        //frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);

    }
}
