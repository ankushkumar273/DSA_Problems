class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        //process first k elements
        dq.addLast(0);
        for(int i=0; i<k; i++){
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        result.add(nums[dq.getFirst()]);

        //preocess remaning element
        for(int i=k; i<n; i++){
            if(i-dq.getFirst()>=k){
                dq.removeFirst();
            }
            //remove small elements
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            result.add(nums[dq.getFirst()]);
        }
        //convert list to array
        int [] resarr = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            resarr[i] = result.get(i);
        }
        return resarr;
    }
}