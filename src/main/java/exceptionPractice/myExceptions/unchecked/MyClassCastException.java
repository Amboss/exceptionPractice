package exceptionPractice.myExceptions.unchecked;

import exceptionPractice.myExceptions.MyException;

import java.util.Vector;

/**
 * Class demonstrates the behaviour of unchecked ClassCastException
 */
public class MyClassCastException implements MyException {

    /**
     * Demo
     */
    @Override
    public void startDemo() {

        System.out.printf("\n%s", "Starting " + MyClassCastException.class.getName());

        try {
            castToObject();
        } catch (ClassCastException ex) {
            System.out.printf("\n%s", "ClassCastException caught");
        } catch (Exception any) {
            System.out.printf("\n%s", "Unexpected Exception! " + any);
        }

        System.out.printf("\n%s", "end of ClassCastException demo\n");
    }

    Object castToObject() {

        int a = 10;
        Vector vector = new Vector();
        Object obj = vector.add(a);
        return (String)obj;
    }
}
