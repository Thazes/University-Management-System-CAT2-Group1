public class InvalidDataEntryException extends Exception{
    public InvalidDataEntryException(String message){
        //Custom exception class that extends Exception class to validate data entry
        super(message);
    }
}
