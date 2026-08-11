// Last updated: 8/11/2026, 4:04:16 PM
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>merged = new ArrayList<>();
        for(int[]interval:occupiedIntervals){
            if(merged.isEmpty()||interval[0]>merged.get(merged.size()-1)[1]+1){
                merged.add(new int[]{interval[0],interval[1]});
            }else{
                merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],interval[1]);
            }
        }
        List<List<Integer>>ans = new ArrayList<>();
        for(int[]in:merged){
            int s = in[0];
            int e = in[1];
            if(e<freeStart||s>freeEnd){
                ans.add(Arrays.asList(s,e));
            }else{
                if(s<freeStart){
                    ans.add(Arrays.asList(s,freeStart-1));
                }
                if(e>freeEnd){
                    ans.add(Arrays.asList(freeEnd+1,e));
                }
            }
        }
        return ans;
    }
}