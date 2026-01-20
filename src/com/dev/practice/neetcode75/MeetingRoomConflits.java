package com.dev.practice.neetcode75;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Meeting {
    int start;
    int end;
    Meeting(int start,int end) {
        this.start=start;
        this.end=end;
    }
}
public class MeetingRoomConflits {
    public static void main(String[] args) {
        List<Meeting> meetings= Arrays.asList(new Meeting(1,3),new Meeting(6,8),new Meeting(3,5));
        //user sort
        System.out.println(hasConflicts(meetings));
        //use bruteforce
        System.out.println(hasConflictsBf(meetings));
    }
    //TC==O(N2) SC==O(1)
    private static boolean hasConflictsBf(List<Meeting> meetings) {
      int n=meetings.size();
      for(int i=0;i<n;i++) {
          Meeting meetingA=meetings.get(i);
          for(int j=i+1;j<n;j++) {
              Meeting meetingB=meetings.get(j);
              if(Math.min(meetingA.end,meetingB.end) > Math.max(meetingA.start,meetingB.start)) {
                  return false;
              }
          }
      }
        return true;
    }

    //TC==O(n log n) SC==0(1) because sorting
    private static boolean hasConflicts(List<Meeting> meetings) {
         if(meetings==null || meetings.size()<=1) {
             return false;
         }
         //Sort  by start time
         meetings.sort(Comparator.comparingInt(m -> m.start));
         for(int i=1;i<meetings.size();i++) {
             Meeting m1=meetings.get(i-1);
             Meeting m2=meetings.get(i);
             //overlap check
             if(m1.end > m2.start) {
                 return false;
             }
         }
        return true;
    }
}
