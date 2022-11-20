package br.com.fabiosnascimento.junitapi.services.exceptions;

public class DataIntegrityViolationException extends RuntimeException {

    public DataIntegrityViolationException(String msg) {
        super(msg);
    }
}
