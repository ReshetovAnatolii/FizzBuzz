public class Fizz implements Runnable{
    Timer timer;

    public Fizz(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        while (true) {
            timer.fizz();
        }
    }
}
