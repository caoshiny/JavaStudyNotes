package com.shiny.expections;

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws BaseballException, RainedOut {
    }

    public StormyInning(String s) throws Foul, BaseballException {}

    public void event() {}

    public void atBat() throws PopFoul {}

    public void rainHard() throws RainedOut {}

    public static void main(String[] args) {
        try {
            throw new Foul();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
