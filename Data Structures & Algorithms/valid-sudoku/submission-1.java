class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] freq = new int[9];
        // First traversal
        for(int i=0; i<9; i++){
            Arrays.fill(freq, 0);
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    int a = board[i][j] - '1';
                    freq[a]++;
                    if(freq[a] > 1){
                        return false;
                    }
                }
            }
        } 
        // second traversal
        for(int i=0; i<9; i++){
            Arrays.fill(freq, 0);
            for(int j=0; j<9; j++){
                if(board[j][i] != '.'){
                    int a = board[j][i] - '1';
                    freq[a]++;
                    if(freq[a] > 1){
                        return false;
                    }
                }
            }
        }
        // Third traversal
        for(int row = 0 ; row < 9 ; row +=3){
            for(int col = 0; col < 9; col +=3){
                Arrays.fill(freq,0);
                for(int i=0;i<3;i++){
                    for(int j=0; j<3 ;j++){
                        if(board[row+i][col+j] != '.'){
                            int a = board[row+i][col+j] - '1';
                            freq[a]++;
                            if(freq[a]>1){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
