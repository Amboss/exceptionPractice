package exceptionPractice.myExceptions.checked;

import exceptionPractice.myExceptions.MyException;

/**
 * Class
 */
public class MyNoSuchMethodException implements MyException {
    /**
     * Demo
     */
    @Override
    public void startDemo() {

        System.out.printf("\n%s", "Starting " + MyNoSuchMethodException.class.getName());

        Class c;
        try {
            c = Class.forName("java.lang.String");
            Class[] paramTypes = new Class[5];
            c.getDeclaredMethod("fooMethod", paramTypes);
        } catch (NoSuchMethodException ex) {
            System.out.printf("\n%s", "NoSuchMethodException caught");
        } catch (Exception any) {
            System.out.println("Unexpected Exception! " + any);
        }

        System.out.printf("\n%s", "end of NoSuchMethodException demo\n");
    }
}
