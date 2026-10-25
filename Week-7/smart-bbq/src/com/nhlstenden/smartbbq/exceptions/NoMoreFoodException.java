package com.nhlstenden.smartbbq.exceptions;

public class NoMoreFoodException extends RuntimeException
{
    public NoMoreFoodException(String message)
    {
        super(message);
    }
}
