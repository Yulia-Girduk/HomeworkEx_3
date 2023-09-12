package org.example;

public class NotEnoughQuantityException extends Exception{
    public NotEnoughQuantityException(String message) {
        super(message);
    }
}
