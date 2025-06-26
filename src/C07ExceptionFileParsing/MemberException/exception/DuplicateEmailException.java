package C07ExceptionFileParsing.MemberException.exception;

public class DuplicateEmailException extends RuntimeException {
    public DuplicateEmailException(String message) {
        super(message);
    }
}
