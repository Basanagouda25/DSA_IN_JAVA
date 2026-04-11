// Last updated: 4/11/2026, 12:51:43 PM
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(result,new ArrayList<>(),candidates,0,target);
        return result;
    }

    public void solve(List<List<Integer>> result,
                      List<Integer> temp,
                      int[] candidates,
                      int idx,
                      int remain
                      )
    {
        if(remain < 0){
            return;
        }
        else if(remain == 0){
            result.add(new ArrayList<>(temp));
        }
        else{
            for(int i=idx; i<candidates.length; i++){
                if(i > idx && candidates[i] == candidates[i-1]){
                    continue;
                }
                temp.add(candidates[i]);
                solve(result,temp,candidates,i+1,remain-candidates[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
}