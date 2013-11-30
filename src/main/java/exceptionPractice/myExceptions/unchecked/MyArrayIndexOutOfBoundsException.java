package exceptionPractice.myExceptions.unchecked;

import exceptionPractice.myExceptions.MyException;


/**
 * Class demonstrates the behaviour of unchecked ArrayIndexOutOfBoundsException
 */
public class MyArrayIndexOutOfBoundsException implements MyException {

    /**
     * Demo
     */
    @Override
    public void startDemo() {

        System.out.printf("\n%s", "Starting " + MyArrayIndexOutOfBoundsException.class.getName());

        try {
            int [] myArray = new int[4];
            for(int i = 0; i <= myArray.length; i++) {
                myArray[i] = i + 1;
            }
            setArrayToString(myArray);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.printf("\n%s", "ArrayIndexOutOfBoundsException caught");
        } catch (Exception any) {
            System.out.println("Unexpected Exception! " + any);
        }

        System.out.printf("\n%s", "end of ArrayIndexOutOfBoundsException demo\n");
    }

    String setArrayToString(int [] foo) {

        String str = null;
        for (int i = 0; i <= foo.length + 1; i++) {
            str += Integer.toString(i);
        }
        return str;
    }
}
