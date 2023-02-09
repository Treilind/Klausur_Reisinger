package org.campus02.oop;

import java.util.ArrayList;

public abstract class LogEntryAnalyzer {

    private ArrayList<LogEntry> logEntries;

    public LogEntryAnalyzer() {
        logEntries = new ArrayList<>();
    }

    public ArrayList<LogEntry> getLogEntries() {
        return logEntries;
    }

    public void setLogEntries(ArrayList<LogEntry> logEntries) {
        this.logEntries = logEntries;
    }

    public abstract void analyze();
}
