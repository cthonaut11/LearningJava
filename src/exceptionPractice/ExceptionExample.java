package exceptionPractice;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Main start");
        try{
            unsafeMethod(19);
        } catch (FileNotFoundException | TimeoutException exception) {
            //handle exception
            exception.printStackTrace();
        }
//        System.out.println(testFinally());
        System.out.println("Main end");
    }

//    public static int testFinally(){
//        try{
//            return 2;
//        }catch (Throwable throwable){
//            return 3;
//        }
//        finally {
//            return 4;
//        }
//    }

    public static void unsafeMethod(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("Unsafe method start");
        if(value < 0){
            throw new FileNotFoundException();
        }
        System.out.println("Unsafe method end");
    }
}
