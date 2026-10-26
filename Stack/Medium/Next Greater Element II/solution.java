class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int result[] = new int[nums.length];
        Stack<Integer> s = new Stack<>();

        for(int i=2*nums.length-1; i>=0; i--){
            int index = i % nums.length;
            while(!s.isEmpty() && nums[s.peek()] <= nums[index]){
                s.pop();
            }
            if(s.isEmpty()){
                result[index] = -1;
            }else{
                result[index] = nums[s.peek()];
            }
            s.push(index);
        }
        return result;
    }
}