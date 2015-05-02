package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    
    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

	public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
    
    public String getDate() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("E, MMM d, y");
        String formattedCurrentDate = simpleDateFormat.format(mDate);
		return formattedCurrentDate;
	}

	public void setDate(Date date) {
		mDate = date;
	}

    
}
