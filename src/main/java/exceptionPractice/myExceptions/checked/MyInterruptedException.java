package exceptionPractice.myExceptions.checked;

import exceptionPractice.myExceptions.MyException;

/**
 * Class demonstrates the behaviour of unchecked InterruptedException
 */
public class MyInterruptedException implements MyException {

    /**
     * Demo
     */
    @Override
    public void startDemo() {

        System.out.printf("\n%s", "Starting " + MyInterruptedException.class.getName());

        try {
            startTestTread();
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.printf("\n%s", "InterruptedException caught");
        } catch (Exception any) {
            System.out.println("Unexpected Exception! " + any);
        }

        System.out.printf("\n%s", "end of InterruptedException demo\n");
    }

    void startTestTread() {
        final Thread mainThread = Thread.currentThread();

        Thread interruptingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Let the main thread start to sleep
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                mainThread.interrupt();
            }
        });
        interruptingThread.start();
    }
}
