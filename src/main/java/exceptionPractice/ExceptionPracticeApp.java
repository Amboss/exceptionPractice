package exceptionPractice;

import exceptionPractice.myExceptions.MyException;
import exceptionPractice.myExceptions.checked.MyClassNotFoundException;
import exceptionPractice.myExceptions.checked.MyInstantiationException;
import exceptionPractice.myExceptions.checked.MyInterruptedException;
import exceptionPractice.myExceptions.checked.MyNoSuchMethodException;
import exceptionPractice.myExceptions.unchecked.MyArrayIndexOutOfBoundsException;
import exceptionPractice.myExceptions.unchecked.MyClassCastException;
import exceptionPractice.myExceptions.unchecked.MyFileNotFoundException;
import exceptionPractice.myExceptions.unchecked.MyNullPointerException;

/**
 * Class
 */
public class ExceptionPracticeApp {

    public static void main(String [] args) {

        /*
         * unchecked
         */
        MyException myFileNotFoundException = new MyFileNotFoundException();
        myFileNotFoundException.startDemo();

        MyException myClassCastException = new MyClassCastException();
        myClassCastException.startDemo();

        MyException myArrayIndexOutOfBoundsException = new MyArrayIndexOutOfBoundsException();
        myArrayIndexOutOfBoundsException.startDemo();

        MyException myNullPointerException = new MyNullPointerException();
        myNullPointerException.startDemo();

        /*
         * checked
         */
        MyException myClassNotFoundException = new MyClassNotFoundException();
        myClassNotFoundException.startDemo();

        MyException myNoSuchMethodError = new MyNoSuchMethodException();
        myNoSuchMethodError.startDemo();

        MyException myInterruptedException = new MyInterruptedException();
       myInterruptedException.startDemo();

        MyException myInstantiationException = new MyInstantiationException();
        myInstantiationException.startDemo();

    }
}
