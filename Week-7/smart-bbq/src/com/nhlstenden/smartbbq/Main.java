package com.nhlstenden.smartbbq;

import com.nhlstenden.smartbbq.bbq.SmartBBQ;

public class Main
{
    public static void main(String[] args)
    {
        SmartBBQ bbq = new SmartBBQ();

        bbq.turnOn(180);
        System.out.println(bbq.getTemperature());

        bbq.setTemperature(200);
        System.out.println(bbq.getTemperature());
    }
}
