class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==0) hour=0;
        double mn=minutes*6;
        double hr=(hour*30)+(minutes*0.5);
        double diff= Math.abs(hr-mn);
        return Math.min(diff, 360 - diff);
    }
}