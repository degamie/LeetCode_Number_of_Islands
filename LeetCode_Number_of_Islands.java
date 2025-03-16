class Solution {
    public int numIslands(char[][] grid) {
      //T(C(N) and S(C(N))==O(n**2) as it rquires non contigous memory space quaterly 
        if (grid == null || grid.length == 0) {//printing the initial grid Length
            return 0;
        }
        int numIslands = 0;//initializing numIslands
        for (int i = 0; i < grid.length; i++) {//Outer Grid's Iteration
            for (int j = 0; j < grid[0].length; j++) {//Inner Grid's Iteration
                if (grid[i][j] == '1') {//Grid's Unit Cell
                    numIslands++;//Incrementing NumsIsland
                    dfs(grid, i, j);//Calling Dfs func
                }
            }
        }
        
        return numIslands;//Printing NumsIslands
    }
    
    private void dfs(char[][] grid, int i, int j) {//Dfs Funct Declare
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {//Printing Nums Lenght
            return;
        }
        
        grid[i][j] = '0'; // Initial Cell visit
        dfs(grid, i - 1, j); // Grid's Up Cell
        dfs(grid, i + 1, j); // Grid's Down Cell
        
        dfs(grid, i, j - 1); // Grid's left Cell
        dfs(grid, i, j + 1); // Grid's Right Cell
      
    }
}

// class Solution {
//     public void callBfs(char [][]grid,int i,int j){
//         if(i<0 || i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='0')grid[i][j]='0';

//         callBfs(grid,i+1,j);
//         callBfs(grid,i+1,j);

//         callBfs(grid,i-1,j);
//         callBfs(grid,i+1,j-1);
//     }
//     public int numIslands(char[][] grid) {
//         int cnt=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=i;i<grid[i].length;j++){
//             if(grid[i][j]=='1'){
//                 cnt+=1;
//                 callBfs(grid,i,j);
//             }
//         }
//         }return cnt;
//     }
// }
