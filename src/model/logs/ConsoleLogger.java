package model.logs;

import model.logs.interfaces.Logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("[Log]: "+message);
    }
}
