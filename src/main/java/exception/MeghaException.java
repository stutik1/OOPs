package exception;

class MeghaException extends Exception {

    MeghaException(String s,Throwable e){
        super(s,e);
    }

    @Override
    public String getMessage() {
        return  "Megha Error => "+super.getMessage();
    }
}