package de.kluk.fimyfi_webservice.exception;


import de.kluk.fimyfi_webservice.model.ExceptionData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

    @Value(value = "${data.exception.msgfixexists}")
    private String msgAlraedyExits;
    @Value(value = "${data.exception.msgfixnotfound}")
    private String msgFixNotFound;
    @Value(value = "${data.exception.msgnoconnec}")
    private String msgNoConnectionToDb;


    // try out with new ResponseEntity as return
    @ExceptionHandler(FixtureAlreadyExistsException.class)
    public ResponseEntity<ExceptionData> handleFixtureAlreadyExistException(FixtureAlreadyExistsException exception) {
        ExceptionData data = new ExceptionData(msgAlraedyExits, HttpStatus.CONFLICT.value());
        return new ResponseEntity(data, HttpStatus.CONFLICT);
    }

    // way without ResponseEntity, just with creation of new ExceptionData Object, works as well
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(FixtureNotFoundException.class)
    public ExceptionData handleFixtureNotFoundException(FixtureNotFoundException exception) {
        return new ExceptionData(msgFixNotFound, HttpStatus.NOT_FOUND.value());
    }


    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ExceptionData handleException(Exception exception) {
        return new ExceptionData(msgNoConnectionToDb, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

    // user exceptions
    private static final String USER_ALREADY_EXISTS_MSG = "User already exists";
    private static final String USER_NOT_FOUND_MSG = "User fot found";


    // try out with new ResponseEntity as return
    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ExceptionData> handleFixtureAlreadyExistException(UserAlreadyExistsException exception) {
        ExceptionData data = new ExceptionData(USER_ALREADY_EXISTS_MSG, HttpStatus.CONFLICT.value());
        return new ResponseEntity(data, HttpStatus.CONFLICT);
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public ExceptionData handleFixtureNotFoundException(UserNotFoundException exception) {
        return new ExceptionData(USER_NOT_FOUND_MSG, HttpStatus.NOT_FOUND.value());
    }


}
