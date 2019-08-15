package com.springboot.rest.exception.handling.invoice;

public class InvoiceNotFoundException extends RuntimeException {

    public InvoiceNotFoundException(String exception) {
        super(exception);
    }
}
