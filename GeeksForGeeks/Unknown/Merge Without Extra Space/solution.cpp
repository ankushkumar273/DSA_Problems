class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int l1 = a.length;
        int l2 = b.length;
        int t[] = new int[l1+l2];
        
        int i=0,j=0,k = 0;
        while(i<l1&&j<l2){
            if(a[i]<b[j]){
                t[k++] = a[i];
                i++;
            }
            else{
                t[k++] = b[j];
                j++;
            }
            
        }
        while(i<l1){
         t[k++] = a[i]; 
         i++;
        }
        while(j<l2){
            t[k++] = b[j];
            j++;
        }
        int x1 = 0;
        for(int x2=0;x2<l1; x2++){
            a[x2] = t[x1];
            x1++;
        }
        for(int x2=0; x2<l2; x2++){
            b[x2] = t[x1];
            x1++;
        }
    }
}
