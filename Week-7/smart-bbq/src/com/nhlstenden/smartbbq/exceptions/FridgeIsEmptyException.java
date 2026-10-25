package com.nhlstenden.smartbbq.exceptions;

public class FridgeIsEmptyException extends RuntimeException
{
    public FridgeIsEmptyException(String message)
    {
        super(message);
    }
}
