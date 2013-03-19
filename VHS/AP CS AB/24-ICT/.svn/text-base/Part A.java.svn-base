    public Position patternPos(int[][]pattern){
        int count = 0;
        //Position p = null;
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] == pattern[0][0]){
                    p = new Position(r, c);
                    for(int row = 0; row < pattern.length; row++){
                        for(int col = 0; col < pattern[0].length; col++){
                            if(row + r >= board.length || col + c >= board[0].length)
                                p = null;
                            else if(board[row + r][col + c] == pattern[row][col])
                                count ++;
                        }
                    }
                }
            }
        }