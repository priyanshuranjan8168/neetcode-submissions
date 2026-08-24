class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Map<Character,Integer> row=new HashMap<>();
            Map<Character,Integer> col=new HashMap<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    row.put(board[i][j],row.getOrDefault(board[i][j],0)+1);
                    if(row.get(board[i][j])>1) return false;
                }
                if(board[j][i]!='.'){
                    col.put(board[j][i],col.getOrDefault(board[j][i],0)+1);
                    if(col.get(board[j][i])>1) return false;
                }
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character> box=new HashSet<>();
                for(int row=i;row<i+3;row++){
                    for(int col=j;col<j+3;col++){
                    if(board[row][col]=='.') continue;
                    if(box.contains(board[row][col])) return false;
                    box.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }
}