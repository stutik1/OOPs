package exception;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Arrays;
//guru exp
//MCQ https://www.geeksforgeeks.org/java-gq/exception-handling-2-gq/

public class ExceptionExpl {
    //throw try catch throws finally
    @SneakyThrows
    public static void main(String args[]) {
       try{
        example();
       }catch (Exception e){
           System.out.println(" catched it "+ e.getMessage());
           e.printStackTrace();
       }
    }

    private static void example() throws Exception {
        ArrayList<Integer> arrayList=new ArrayList<Integer>(1);
        try {
            int a=0;
            //arrayList.get(5);
            int x=10/0;
            Object o = null;
            o.equals("abc");

            return ;
        }catch (IndexOutOfBoundsException e){
            throw new MeghaException(e.getMessage(),e);
        }catch (NullPointerException e){
            throw e;
        }catch (Exception e){
            throw new Exception("Arth Exception",e);
        }finally {
            System.out.println("final");
        }
    }

}
