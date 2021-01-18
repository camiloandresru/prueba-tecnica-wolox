package co.com.wolox.certification.movieswiper.exceptions;

public class AddFavoriteException extends AssertionError{

    public static final String VERIFY_ADD_MOVIE_EXCEPTION = "The movie wasn't added";
    public static final String VERIFY_GUEST_EXCEPTION = "The guest has access to the library option";

    public AddFavoriteException(String message, Throwable cause){
        super(message, cause);
    }

}
