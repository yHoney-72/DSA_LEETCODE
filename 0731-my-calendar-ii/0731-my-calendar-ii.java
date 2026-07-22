class MyCalendarTwo {
  List<int[]>bookings;
  List<int[]>overlaps;
    public MyCalendarTwo() {
     bookings = new ArrayList<>();
     overlaps = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[]x:overlaps){
            int first = x[0];
            int second = x[1];
            if(startTime<second&&endTime>first){
                return false;
            }
        }
        for(int y[] : bookings){
            int first = y[0];
            int second = y[1];
            if(startTime<second&&endTime>first){
                overlaps.add(new int[]{Math.max(startTime,first),Math.min(endTime,second)});
            }

        }
        bookings.add(new int[]{startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */