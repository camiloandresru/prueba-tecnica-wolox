package co.com.wolox.certification.movieswiper.exceptions;

public class DeleteFavoriteException extends AssertionError{

    public static final String VERIFY_DELETE_MOVIE_EXCEPTION = "The movie wasn't deleted";

    public DeleteFavoriteException(String message, Throwable cause){
        super(message, cause);
    }
}
