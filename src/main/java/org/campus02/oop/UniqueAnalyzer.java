package org.campus02.oop;

import java.util.ArrayList;

public class UniqueAnalyzer extends LogEntryAnalyzer {

    private ArrayList<String> result;

    public UniqueAnalyzer() {
        result = new ArrayList<>();
    }

    public ArrayList<String> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        for (LogEntry l : super.getLogEntries()) {
            if(!result.contains(l.getMessage())){
                result.add(l.toString());
            }
        }
    }
}
