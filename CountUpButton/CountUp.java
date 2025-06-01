/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JButton;

public class CountUp
extends Thread {
    private MyData data = new MyData();
    boolean running = false;
    private volatile boolean paused = true;
    private JButton button;

    public CountUp(JButton button) {
        this.button = button;
    }

    @Override
    public void run() {
        this.running = true;
        System.out.println("run\u306b\u5165\u308a\u307e\u3059");
        while (this.isRunning()) {
            this.button.setText(this.data.increment());
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void startCounting() {
        this.running = true;
    }

    public synchronized void stopCounting() {
        this.running = false;
    }

    public synchronized boolean isRunning() {
        return this.running;
    }
}
