package org.campus02.oop;

public class MaxLogEntryAnalyzer extends LogEntryAnalyzer{

    private LogEntry logEntry;



    @Override
    public void analyze() {
        int result = 0;

        for (LogEntry l : super.getLogEntries()) {
            if(l.getLogEntryID() > result){
                result = l.getLogEntryID();
            }
        }

        for (LogEntry l : super.getLogEntries()) {
            if(l.getLogEntryID() == result){
                this.logEntry = l;
            }
        }

    }

    public LogEntry getLogEntry() {
        return logEntry;
    }
}
