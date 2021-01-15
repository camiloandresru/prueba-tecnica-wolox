package co.com.wolox.certification.movieswiper.exceptions;

public class AddFavoriteException extends AssertionError{

    public static final String VERIFY_ADD_MOVIE_EXCEPTION = "The movie wasn't added";

    public AddFavoriteException(String message, Throwable cause){
        super(message, cause);
    }

}
