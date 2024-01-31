import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MainFrame extends JFrame implements ActionListener {

    private JButton yes;
    private JButton no;
    private JButton close;
    private int count;

    public MainFrame() {
        count = 0;
        initFrame();
        initLabel();
        initButton();
    }

    public void initFrame() {
        this.setLocation(500, 200);
        this.setSize(300, 200);
        this.setLayout(null);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initLabel() {
        JLabel textLabel = new JLabel("做我女朋友好吗?");
        textLabel.setBounds(145, 70, 200, 40);
        textLabel.setFont(new Font("宋体", Font.PLAIN, 20));
        JLabel imgLabel = new JLabel(new ImageIcon("res/1.jpg"));
        imgLabel.setBounds(0, 30, 130, 101);
        this.add(textLabel);
        this.add(imgLabel);
    }

    private void initButton() {
        yes = new JButton("愿意");
        no = new JButton("不愿意");
        close = new JButton(new ImageIcon("res/close.png"));
        //去除按钮背景
        close.setContentAreaFilled(false);
        //去除按钮边框
        //close.setBorderPainted(false);
        yes.setBounds(0, 160, 80, 40);
        this.add(yes);
        yes.addActionListener(this);
        no.setBounds(220, 160, 80, 40);
        this.add(no);
        no.addActionListener(this);
        close.setBounds(284, 0, 16, 16);
        this.add(close);
        close.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();
        if (obj == yes) {
            JOptionPane.showMessageDialog(null, "好耶！！！！");
            new SucceedFrame();
            this.dispose();
        } else if (obj == no) {
            Random random = new Random();
            this.setLocation(random.nextInt(0, 1200), random.nextInt(0, 600));
            count++;
            if (count > 5) {
                JOptionPane.showMessageDialog(null, "不要挣扎了");
                new Hahaha();
            }
        } else if (obj == close) {

            JOptionPane.showMessageDialog(null, "关不掉哦的");
            new CloseFrame();
        }
    }

}
