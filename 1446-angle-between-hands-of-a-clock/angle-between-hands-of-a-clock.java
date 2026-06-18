class Solution {
    public double angleClock(int hour, int minutes) {
        return(Math.min(Math.abs((minutes*6)-((hour%12)*30 + minutes * 0.5)),360-Math.abs((minutes*6)-((hour%12)*30 + minutes * 0.5))));
    }
}