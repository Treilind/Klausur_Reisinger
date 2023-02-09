package org.campus02.oop;

import java.util.ArrayList;

public class FilterAnalyzer extends LogEntryAnalyzer{

    private ArrayList<LogEntry> result;
    private String logLevel;

    public FilterAnalyzer(String logLevel) {
        this.logLevel = logLevel;
        result = new ArrayList<>();
    }

    public ArrayList<LogEntry> getResult() {
        return result;
    }

    public String getLogLevel() {
        return logLevel;
    }

    @Override
    public void analyze() {
        for (LogEntry l : super.getLogEntries()) {
            if (l.getLogLevel().equals(this.logLevel)) {
                this.result.add(l);
            }
        }
    }
}
