/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CountUpAPanel
extends JPanel
implements ActionListener {
    private JButton button = new JButton("START");
    private boolean button_s = false;
    boolean finishbutton = true;
    private CountUp cu;

    public CountUpAPanel() {
        this.add(this.button);
        this.button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button) {
            this.button_s = !this.button_s;
            this.finishbutton = !this.finishbutton;
            System.out.println(this.button_s);
            if (this.button_s) {
                this.cu = new CountUp(this.button);
                this.cu.start();
                this.finishbutton = true;
            } else if (!this.button_s) {
                this.cu.stopCounting();
                this.button.setText("START");
                this.finishbutton = true;
            }
        }
    }
}
