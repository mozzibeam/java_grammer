package C07ExceptionFileParsing.MemberException.exception;

public class NoMembersFoundException extends RuntimeException{
    public NoMembersFoundException(String message) {
        super(message);
    }
}
