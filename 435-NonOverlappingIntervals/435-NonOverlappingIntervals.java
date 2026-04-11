// Last updated: 4/11/2026, 12:50:02 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        int res = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int prev_end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) 
        {
            if (prev_end > intervals[i][0]) {
                res++;
            } else {
                prev_end = intervals[i][1];
            }
        }
        return res;        
    }
}