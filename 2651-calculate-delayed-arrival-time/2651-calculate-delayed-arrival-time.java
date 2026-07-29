class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int arrt=arrivalTime+delayedTime;
        if(arrt==24) return 0;
        else if (arrt>24) return arrt-24;
        else return arrt;
    }
}