package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends LogEntryAnalyzer{

    private HashMap<String, Integer> result;

    public CountryAnalyzer() {
       result = new HashMap<>();
    }

    @Override
    public void analyze() {

        for (LogEntry l : super.getLogEntries()) {
            if(result.containsKey(l.getCountryID())){
                result.put(l.getCountryID(), result.get(l.getCountryID())+1);
            }
            else {
                result.put(l.getCountryID(), 1);
            }
        }

    }

    public HashMap<String, Integer> getResult() {
        return result;
    }

}
