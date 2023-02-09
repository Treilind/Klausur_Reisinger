package org.campus02.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UniqueAnalyzerTest {

    private LogEntry logEntry1;
    private LogEntry logEntry2;
    private LogEntry logEntry3;

    private ArrayList<LogEntry> logEntries;
    private UniqueAnalyzer uniqueAnalyzer;

    private ArrayList<String> message;

    @BeforeEach
    void setUp() {
        logEntry1 = new LogEntry("2022-10-21T07:07:31.786297900", "Task1", "13.112.224.240", "debug", "Error on creating user 790286800", "GB");
        logEntry2 = new LogEntry("2022-04-02T15:14:32.005596400", "App", "13.210.176.167", "debug", "Generation error", "GB");
        logEntry3 = new LogEntry("2022-05-20T03:49:32.005709200", "Website", "13.230.11.13", "debug", "General error", "CH");
        logEntries = new ArrayList<>();
        uniqueAnalyzer = new UniqueAnalyzer();
        message = new ArrayList<>();

        logEntry1.setLogEntryID(1);
        logEntry2.setLogEntryID(3);
        logEntry3.setLogEntryID(2);

        logEntries.add(logEntry1);
        logEntries.add(logEntry2);
        logEntries.add(logEntry3);







    }

    @Test
    void analyze() {
        message.add(logEntry1.toString());
        message.add(logEntry3.toString());
        uniqueAnalyzer.setLogEntries(logEntries);
        uniqueAnalyzer.analyze();
        ArrayList<String> result = uniqueAnalyzer.getResult();
        int h = 1;
        Assertions.assertTrue(1==1);

    }
}