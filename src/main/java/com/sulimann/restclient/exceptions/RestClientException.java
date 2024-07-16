package com.sulimann.restclient.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class RestClientException extends RuntimeException {

    public ProblemDetail toProblemDetail(){
        var pb = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);

        pb.setTitle("RestClient Internal Server Error");

        return pb;
    }
}
