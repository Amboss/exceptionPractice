package exceptionPractice.myExceptions.checked;

import exceptionPractice.myExceptions.MyException;

/**
 * Class demonstrates the behaviour of checked ClassNotFoundException
 */
public class MyClassNotFoundException implements MyException {

    private String fileName = "foo.bar.ClassA";

    private ClassLoader classLoader = null;

    private Class<?> callerClass = null;

    private Object newClassAInstance = null;

    /**
     * Demo
     */
    @Override
    public void startDemo() {

        System.out.printf("\n%s", "Starting " + MyClassNotFoundException.class.getName());

        try {
            getInstanceOfClass();
        } catch (ClassNotFoundException ex) {
            System.out.printf("\n%s", "ClassNotFoundException caught");
        } catch (Exception any) {
            System.out.printf("\n%s", "Unexpected Exception! " + any);
        }

        System.out.printf("\n%s", "end of ClassNotFoundException demo\n");
    }

    Object getInstanceOfClass() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        classLoader = Thread.currentThread().getContextClassLoader();
        callerClass = classLoader.loadClass(fileName);
        System.out.printf("\n%s", "SUCCESS!: " + newClassAInstance);
        return newClassAInstance = callerClass.newInstance();
    }
}
