package com.singleton;

public class Logger {
    /*
    * To create a singleton class,
    * we use static keyword, because static is not one per object, but one per class.
    * Note: static methods can only call other static methods or data.
    *  */
    static Logger logger;


    /*
    * When you make a particular method private, it is not accessible outside of this particular class.
    * */
    private Logger () {

    }

    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();

        return logger;
    }
}
