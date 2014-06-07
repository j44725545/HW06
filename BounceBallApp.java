import java.awt.*;
import javax.swing.*;

public class BounceBallApp extends JFrame {
  public BounceBallApp() {    
    setLayout(new BorderLayout(10,10));
    add(new BallControl());
  }

  public static void main(String[] args) {
    BounceBallApp frame = new BounceBallApp();    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("BounceBallApp");
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}
