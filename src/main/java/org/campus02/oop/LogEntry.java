package org.campus02.oop;

import java.util.Objects;

public class LogEntry {
	private String date;
	private String applicationName;
	private String iPAddress;	
	private String logLevel;
	private String message;
	private String countryID;
	private int logEntryID;



	
	public LogEntry(String date, String applicationName, 
			String iPAddress, String logLevel, String message,
			String countryID) {

		this.date = date;
		this.applicationName = applicationName;
		this.iPAddress = iPAddress;
		this.message = message;
		this.countryID = countryID;

		switch (logLevel){
			case "debug":
				this.logLevel = logLevel;
				break;
			case "info":
				this.logLevel = logLevel;
				break;
			case "warning":
				this.logLevel = logLevel;
				break;
			case "error":
				this.logLevel = logLevel;
				break;
			case "fatal":
				this.logLevel = logLevel;
				break;
			default:
				this.logLevel = "undefiniert";
				break;
		}
		// Fallback-Implementierung fuer logEntryID - Bitte entfernen
		logEntryID = (int) (Math.random()  * 10000); // Fallback-Implementierung fuer logEntryID
	}




	// IMPLEMENT Getter / Setter


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getiPAddress() {
		return iPAddress;
	}

	public void setiPAddress(String iPAddress) {
		this.iPAddress = iPAddress;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}

	public int getLogEntryID() {
		return logEntryID;
	}

	public void setLogEntryID(int logEntryID) {
		this.logEntryID = logEntryID;
	}

	@Override
	public String toString() {
		return "LogEntry{" +
				"date='" + date + '\'' +
				", applicationName='" + applicationName + '\'' +
				", iPAddress='" + iPAddress + '\'' +
				", logLevel='" + logLevel + '\'' +
				", message='" + message + '\'' +
				", countryID='" + countryID + '\'' +
				", logEntryID=" + logEntryID +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LogEntry logEntry = (LogEntry) o;
		return logEntryID == logEntry.logEntryID && Objects.equals(date, logEntry.date) && Objects.equals(applicationName, logEntry.applicationName) && Objects.equals(iPAddress, logEntry.iPAddress) && Objects.equals(logLevel, logEntry.logLevel) && Objects.equals(message, logEntry.message) && Objects.equals(countryID, logEntry.countryID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, applicationName, iPAddress, logLevel, message, countryID, logEntryID);
	}
}
