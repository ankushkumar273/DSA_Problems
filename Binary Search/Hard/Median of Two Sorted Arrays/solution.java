class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int ans[] = new int[m+n];
        int idx = 0;
         
        for(int i=0; i<m; i++){
            ans[idx++] = nums1[i];
        }
        for(int i=0; i<n; i++){
            ans[idx++] = nums2[i];
        }
        Arrays.sort(ans);

        int st = 0;
        int end = ans.length-1;

        double result = 0;

        int mid = ans.length/2;

        if(ans.length%2 !=0){
            result = ans[mid];
        }else{
            int mid1 = mid-1;
            int mid2 = mid;
            result = (ans[mid1]+ans[mid2])/2.0;
        }
        return result;
    }
}