package exceptionPractice;

import exceptionPractice.myExceptions.MyException;
import exceptionPractice.myExceptions.checked.MyClassNotFoundException;
import exceptionPractice.myExceptions.checked.MyNoSuchMethodException;
import exceptionPractice.myExceptions.error.MyErrorException;
import exceptionPractice.myExceptions.unchecked.MyFileNotFoundException;

/**
 * Class
 */
public class ExceptionPracticeApp {

    public static void main(String [] args) {

        // unchecked
        MyException myFileNotFoundException = new MyFileNotFoundException();
        myFileNotFoundException.startDemo();

        // checked
        MyException myClassNotFoundException = new MyClassNotFoundException();
        myClassNotFoundException.startDemo();

        MyException myNoSuchMethodError = new MyNoSuchMethodException();

        // error
        MyException myError = new MyErrorException();

        // assert

    }
}
