class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx==fx && sy==fy) {
            return t!=1;
        }

        int dx = Math.abs(fx-sx);
        int dy = Math.abs(fy-sy);

        int steps = Math.max(dx, dy);

    return steps <= t;
}
}