package exceptionPractice.myExceptions.unchecked;

import exceptionPractice.myExceptions.MyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Class demonstrates the behaviour of unchecked FileNotFoundException
 */
public class MyFileNotFoundException implements MyException {

    /**
     * Demo
     */
    @Override
    public void startDemo() {

        System.out.printf("\n%s", "Starting " + MyFileNotFoundException.class.getName());

        try {
            FileInputStream fis1 = getInputStream("foo.bar");
        } catch (FileNotFoundException ex) {
            System.out.printf("\n%s", "FileNotFoundException caught");
        } catch (Exception any) {
            System.out.println("Unexpected Exception! " + any);
        }

        System.out.printf("\n%s", "end of FileNotFoundException demo\n");
    }

    /**
     * Get file input stream 1
     *
     * @param fileName - name of target file
     * @return FileInputStream
     * @throws FileNotFoundException
     */
    FileInputStream getInputStream(String fileName) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        System.out.println("f1: File input stream created");
        return fis;
    }
}
