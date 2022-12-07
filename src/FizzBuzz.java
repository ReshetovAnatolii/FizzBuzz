public class FizzBuzz implements Runnable{
    Timer timer;

    public FizzBuzz(Timer timer) {
        this.timer = timer;

    }

    @Override
    public void run() {
        while(true) {
                timer.fizzbuzz();
        }
    }
}
