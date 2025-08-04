class Solution {
    public int[][] makeZero(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
        for (int i = 0; i<matrix.length; i++) {
            matrix[i][col]=0;
        }
        return matrix;

    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] marker=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    marker[i][j]=false;
                }
                else
                marker[i][j]=true;
            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(marker[i][j]==false)
                makeZero(matrix,i,j);

        }
        }
    }
}