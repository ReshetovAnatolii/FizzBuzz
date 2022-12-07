public class Main {


    public static void main(String[] args) {
        Timer timer = new Timer();
        Thread thread = new Thread(new Counter(timer));
        Thread thread1 = new Thread(new Fizz(timer));
        Thread thread2 = new Thread(new Buzz(timer));
        Thread thread3 = new Thread(new FizzBuzz(timer));

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();




    }
}