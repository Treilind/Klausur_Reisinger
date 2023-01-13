package org.campus02.oop;

import java.util.ArrayList;

public class LogEntryManager {
    private ArrayList<LogEntry> logEntries;

    public LogEntryManager() {
        logEntries = new ArrayList<>();
    }

    public ArrayList<LogEntry> getLogEntries() {
        return logEntries;
    }

    public void add (LogEntry p) {
        logEntries.add(p);
    }
}
