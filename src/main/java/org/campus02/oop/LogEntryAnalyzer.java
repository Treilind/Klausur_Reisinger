package org.campus02.oop;

import java.time.LocalDateTime;
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

    public LogEntry createTestLogEntry()
    {
        String[] appNames = new String[] {"App", "Website", "Task1", "Task2", "Task3", "Service1"};
        String[] logLevels = new String[] {"debug", "info", "warning", "error", "fatal", "ente"};
        String[] countries = new String[] {"AT", "DE", "CH", "SI", "PL", "GB"};
        String[] ipAddress = new String[] {"13.112.224.240", "13.115.13.148", "13.210.129.177", "13.210.176.167", "13.228.126.182", "13.228.224.121", "13.230.11.13", "13.230.90.110", "13.55.153.188", "13.55.5.15", "13.56.126.253", "13.56.173.200"};


        LogEntry p = new LogEntry(
                LocalDateTime.now().minusMinutes((long)(Math.random() * 1_000_000)).toString(),
                getRandom(appNames),
                getRandom(ipAddress),
                getRandom(logLevels),
                getRandomMessage(), getRandom(countries)
        );



        return p;
    }

    public static String getRandomMessage()
    {
        String[] arr = new String[] {"Error on creating user", "General error", "System not connected", "Network error", "application crashed"};


        String msg = arr[(int) (Math.random() * 100.0) % arr.length];

        if (Math.random() * 100 < 50)
        {
            msg += " " + LocalDateTime.now().getNano();
        }

        return msg;
    }

    public static String getRandom(String[] arr)
    {
        return arr[(int) (Math.random() * 100.0) % arr.length];
    }

    public abstract void analyze();
}
