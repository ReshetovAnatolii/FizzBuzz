public class Buzz implements Runnable{
    Timer timer;

    public Buzz(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        while(true){
            timer.buzz();
        }
    }
}
