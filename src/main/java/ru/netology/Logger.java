package ru.netology;

import java.time.LocalDateTime;

public class Logger {
    protected int num = 1;
    private static Logger instance;

    public void log(String message) {
        System.out.println("[ "+ LocalDateTime.now() + " " + num++ + "]" + message);
    }

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
