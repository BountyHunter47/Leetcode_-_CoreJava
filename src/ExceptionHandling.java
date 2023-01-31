import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class ExceptionHandling{
    public static void main(String[] args) {
        int c = 100;
        if(c < 10){
            throw new runtimeException("Can not vote yet😢");
        }
        else{
            System.out.println("You are eligible for voting😁");
        }
    }
}

class runtimeException extends RuntimeException{
    runtimeException(String warning){
        super(warning);
    }
}
