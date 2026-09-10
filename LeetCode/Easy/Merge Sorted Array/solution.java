class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m+n];
        int i = 0;
        int j = 0;
        int indx = 0;
        while(i < m && j < n){
            if(nums1[i] == nums2[j]){
                arr[indx++] = nums1[i++];
                arr[indx++] = nums2[j++];
            }else if(nums1[i] < nums2[j]){
                arr[indx++] = nums1[i++];
            }else {
                arr[indx++] = nums2[j++];
            }
        }
        while(i<m){
            arr[indx++] = nums1[i++];
        }
        while(j<n){
            arr[indx++] = nums2[j++];
        }
        for(int k=0; k<m+n; k++){
            nums1[k] = arr[k];
        }
    }
}