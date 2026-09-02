class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                if(arr.size() == 0 || arr.get(arr.size() - 1) != a[i] ){
                    arr.add(a[i]);
                }
                i++;
            }
            else if(a[i] > b[j]){
                if(arr.size() == 0 || arr.get(arr.size() - 1) != b[j]){
                    arr.add(b[j]);
                } 
                j++;
            }
            else{
               if(arr.size() == 0 || arr.get(arr.size() - 1) != b[j]){
                    arr.add(b[j]);
            }
            i++;
            j++;
            }
            
            
        }
        while(i < a.length){
            if(arr.size() == 0 || arr.get(arr.size() -1) != a[i]){
                arr.add(a[i]);
            }
            i++;
        }
        while(j < b.length){
            if(arr.size() == 0 || arr.get(arr.size() -1) != b[j]){
                arr.add(b[j]);
            }
            j++;
        }
        return arr;
    }
    
}
