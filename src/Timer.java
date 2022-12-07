import java.util.Arrays;

public class Timer {

int second = 1;
    public synchronized void number (int n) {

       for (int i = second; i<=n; i++) {
           if (second <=n) {
               System.out.print(second + "," + " ");;
               second++;
           } else {
               break;
           }

           while (second % 3 == 0 || second % 5 == 0) {
               try {
                   System.out.print("");
                   wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
           notifyAll();
       }
    }

        public synchronized void fizz () {
            while (second % 3 != 0 || second % 5 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.print("fizz" + "," + " ");;
                second++;

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            notifyAll();
        }

    public synchronized void buzz () {
        while (second % 5 != 0 || second % 3 ==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("buzz" + "," + " ");;
        second++;

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        notifyAll();
    }
    public synchronized void fizzbuzz () {
        while (second % 3 !=0 || second % 5 !=0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("fizzbuzz" + "," + " ");
        second++;

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        notifyAll();
    }
    }

