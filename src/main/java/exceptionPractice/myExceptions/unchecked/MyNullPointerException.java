package exceptionPractice.myExceptions.unchecked;

import exceptionPractice.myExceptions.MyException;

/**
 * Class
 */
public class MyNullPointerException  implements MyException {

    /**
     * Demo
     */
    @Override
    public void startDemo() {

        System.out.printf("\n%s", "Starting " + MyNullPointerException.class.getName());

        // get file input stream 1
        try {
            int[] myArray = null;
            getSizeOfArray(myArray);
        } catch (NullPointerException ex) {
            System.out.printf("\n%s", "NullPointerException caught");
        } catch (Exception any) {
            System.out.println("Unexpected Exception! " + any);
        }

        System.out.printf("\n%s", "end of NullPointerException demo\n");
    }

    int getSizeOfArray(int [] array) {
        return array.length;
    }
}
