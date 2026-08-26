class Solution {
    public int[][] imageSmoother(int[][] img) {
       int r = img.length;
       int c = img[0].length;

       int smooth[][] = new int[r][c];
       for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            int sum = 0;
            int numberOfEle = 0;

            for(int k=i-1; k<=i+1; k++){
                for(int l=j-1; l<=j+1; l++){
                    if(k>=0 && k<r && l>=0 && l<c){
                        sum += img[k][l];
                        numberOfEle++;
                    }
                }
            }
            smooth[i][j] = sum/numberOfEle;
        }
       } 
       return smooth;
    }
}