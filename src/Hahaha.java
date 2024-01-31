import javax.swing.*;

public class Hahaha extends JFrame {
    public Hahaha(){
        initFrame();
        initLabel();
    }

    private void initLabel() {
        JLabel label=new JLabel(new ImageIcon("res/3.gif"));
        label.setBounds(0,0,300,300);
        this.add(label);
    }

    private void initFrame(){
        this.setSize(300,300);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

}
