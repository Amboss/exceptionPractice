package exceptionPractice.myExceptions.checked;

import exceptionPractice.myExceptions.MyException;

/**
 * Class
 */
public class MyInstantiationException implements MyException {

    Class foo;

    Object obj;

    /**
     * Demo
     */
    @Override
    public void startDemo() {

        System.out.printf("\n%s", "Starting " + MyInstantiationException.class.getName());

        try {
            foo = Class.forName("java.lang.Cloneable");
            getNewObject(foo);
        } catch (InstantiationException ex) {
            System.out.printf("\n%s", "InstantiationException caught");
        } catch (Exception any) {
            System.out.println("Unexpected Exception! " + any);
        }

        System.out.printf("\n%s", "end of InstantiationException demo\n");
    }

    Object getNewObject(Class foo) throws IllegalAccessException, InstantiationException {
            return obj = foo.newInstance();
    }
}
