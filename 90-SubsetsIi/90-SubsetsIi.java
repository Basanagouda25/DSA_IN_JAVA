// Last updated: 4/11/2026, 12:51:14 PM
class Solution {
    public List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        solve(nums,0,temp);
        return result;
    }

    public void solve(int[] nums,int start,List<Integer> temp){

        result.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            solve(nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}