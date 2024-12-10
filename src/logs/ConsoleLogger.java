package logs;

import logs.interfaces.Logger;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("[Log]: "+message);
    }
}
