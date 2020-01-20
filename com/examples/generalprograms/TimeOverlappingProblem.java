package com.examples.generalprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TimeOverlappingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(2, 4), new Meeting(2,6));
		 mergeRanges(meetings);
	}
	
	public static List<Meeting> mergeRanges(List<Meeting> meetings) {

	    // sort by start time
	    Collections.sort(meetings, new Comparator<Meeting>() {
	        @Override
	        public int compare(Meeting m1, Meeting m2) {
	            return m1.getStartTime() - m2.getStartTime();
	        }
	    });

	    // initialize mergedMeetings with the earliest meeting
	    List<Meeting> mergedMeetings = new ArrayList<>();
	    mergedMeetings.add(meetings.get(0));

	    for (Meeting currentMeeting : meetings) {

	        Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

	        // if the current meeting overlaps with the last merged meeting, use the
	        // later end time of the two
	        if (currentMeeting.getEndTime() >= lastMergedMeeting.getStartTime()) {
	            lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

	        // add the current meeting since it doesn't overlap
	        } else {
	            mergedMeetings.add(currentMeeting);
	        }
	    }

	    return mergedMeetings;
	}

}

 class Meeting {

    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
