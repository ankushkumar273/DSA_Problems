class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap <Integer, Integer> map = new HashMap<>();

        //arr1 ki frequency
        for(int num:arr1){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int ans[] = new int[arr1.length];
        int index = 0;
         // arr2 ke order me element ko add karo
         for(int num:arr2){
            int count = map.get(num);
            for(int i=0; i<count; i++){
                ans[index++] = num;
            }    
            map.remove(num);
         } 
         //bache hue element ko add karenge
         ArrayList <Integer> remaning = new ArrayList<>();
         for(int num:map.keySet()){
            int count = map.get(num);
            for(int i=0; i<count; i++){
                remaning.add(num);
            }
         }
         Collections.sort(remaning);
         for(int num:remaning){
            ans[index++] = num;
         }
         return ans;
    }
}