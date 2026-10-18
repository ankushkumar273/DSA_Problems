class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        while(list.size() < n){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<list.size(); i++){
                int x = list.get(i);
                int odd = 2*x-1;
                if(odd <= n){
                temp.add(odd);
                }
            }
            for(int j=0; j<list.size(); j++){
                int x = list.get(j);
                int even = 2*x;
                if(even <= n){
                    temp.add(even);
                }
            }
            list = temp;
        }
        int[] ans = new int [n];
        for(int i=0; i<n; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}