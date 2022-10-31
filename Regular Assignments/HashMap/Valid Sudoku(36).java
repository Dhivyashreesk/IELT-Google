class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set visited = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!visited.add(number + " in row " + i) || !visited.add(number + " in column " + j) || !visited.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}
