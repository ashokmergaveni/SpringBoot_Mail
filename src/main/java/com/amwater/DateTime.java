package com.amwater;

import java.text.ParseException;

public class DateTime {
    public StartDate start;
	public EndDate end;
	public EndDate getEnd() {
		return end;
	}

	public void setEnd(EndDate end) throws ParseException {
		this.end = end;
	}


public StartDate getStart() {
	return start;
}

public void setStart(StartDate start) throws ParseException {
		this. start=start;
	}
}
