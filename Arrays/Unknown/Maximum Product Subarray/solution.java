class Solution {
    int maxProduct(int[] arr) {
        // code here
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int answer = arr[0];
        
        for(int i=1; i<arr.length; i++){
            int currEle = arr[i];
            if(currEle < 0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            
            maxProduct = Math.max(currEle, maxProduct*currEle);
            minProduct = Math.min(currEle, minProduct*currEle);
            answer = Math.max(answer, maxProduct);
            
        }
        return answer;
    }
}
