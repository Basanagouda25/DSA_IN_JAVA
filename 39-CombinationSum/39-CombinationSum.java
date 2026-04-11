// Last updated: 4/11/2026, 12:51:44 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(list,new ArrayList<>(),candidates,target,0);
        return list;
    }

    public void backtracking(List<List<Integer>> list,List<Integer> temp,int[] candidates,int remain,int start){
        if(remain < 0){
            return;
        }
        else if(remain == 0){
            list.add(new ArrayList<>(temp));
        }
        else{
            for(int i=start; i<candidates.length; i++){
                temp.add(candidates[i]);
                backtracking(list,temp,candidates,remain-candidates[i],i);
                temp.remove(temp.size()-1);
            }
        }
    }
}