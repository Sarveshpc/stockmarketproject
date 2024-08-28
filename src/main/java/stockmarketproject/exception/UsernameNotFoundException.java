package stockmarketproject.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class UsernameNotFoundException extends RuntimeException {
	
	    private static final long serialVersionUID = 1L;

	    public UsernameNotFoundException(String message) {
	        super(message);
	    }

	    public UsernameNotFoundException(String message, Throwable throwable) {
	        super(message, throwable);
	    }
}
	    


