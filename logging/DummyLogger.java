package org.eclipse.paho.client.mqttv3.logging;

import java.util.ResourceBundle;

public class DummyLogger implements Logger {
    @Override
    public void initialise(ResourceBundle messageCatalog, String loggerID, String resourceName) {

    }

    @Override
    public void setResourceName(String logContext) {

    }

    @Override
    public boolean isLoggable(int level) {
        return false;
    }

    @Override
    public void severe(String sourceClass, String sourceMethod, String msg) {

    }

    @Override
    public void severe(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

    }

    @Override
    public void severe(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

    }

    @Override
    public void warning(String sourceClass, String sourceMethod, String msg) {

    }

    @Override
    public void warning(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

    }

    @Override
    public void warning(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

    }

    @Override
    public void info(String sourceClass, String sourceMethod, String msg) {

    }

    @Override
    public void info(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

    }

    @Override
    public void info(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

    }

    @Override
    public void config(String sourceClass, String sourceMethod, String msg) {

    }

    @Override
    public void config(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

    }

    @Override
    public void config(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

    }

    @Override
    public void fine(String sourceClass, String sourceMethod, String msg) {

    }

    @Override
    public void fine(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

    }

    @Override
    public void fine(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable ex) {

    }

    @Override
    public void finer(String sourceClass, String sourceMethod, String msg) {

    }

    @Override
    public void finer(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

    }

    @Override
    public void finer(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable ex) {

    }

    @Override
    public void finest(String sourceClass, String sourceMethod, String msg) {

    }

    @Override
    public void finest(String sourceClass, String sourceMethod, String msg, Object[] inserts) {

    }

    @Override
    public void finest(String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable ex) {

    }

    @Override
    public void log(int level, String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable thrown) {

    }

    @Override
    public void trace(int level, String sourceClass, String sourceMethod, String msg, Object[] inserts, Throwable ex) {

    }

    @Override
    public String formatMessage(String msg, Object[] inserts) {
        return "";
    }

    @Override
    public void dumpTrace() {

    }
}
