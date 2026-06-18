class Solution {
    public double angleClock(int hour, int minutes) {
        double am=minutes*6;
        double ah=(hour%12)*30 + minutes * 0.5;
        double angle = Math.abs(am-ah);
        return(Math.min(angle,360-angle));
    }
}