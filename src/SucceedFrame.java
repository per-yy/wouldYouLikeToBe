import javax.swing.*;

public class SucceedFrame extends JFrame {
    public SucceedFrame(){
        initFrame();
        initLabel();
    }
    private void initFrame(){
        this.setSize(250,195);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    private void initLabel(){
        JLabel imgLabel=new JLabel(new ImageIcon("res/4.gif"));
        imgLabel.setBounds(0,0,234,157);
        this.add(imgLabel);

    }

}
