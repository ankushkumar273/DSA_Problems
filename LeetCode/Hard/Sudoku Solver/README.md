# Sudoku Solver

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Hard |
| **Language** | java |
| **Solved On** | October 17, 2026 |
| **Tags** | Array, Hash Table, Backtracking, Matrix, Algorithm X, Dancing Links |
| **Link** | [View Problem](https://leetcode.com/problems/sudoku-solver/) |
| **Runtime** | 183 ms |
| **Memory** | 42.3 MB |

## Problem Description

<p>Write a program to solve a Sudoku puzzle by filling the empty cells.</p>

<p>A sudoku solution must satisfy <strong>all of the following rules</strong>:</p>

<ol>
	<li>Each of the digits <code>1-9</code> must occur exactly once in each row.</li>
	<li>Each of the digits <code>1-9</code> must occur exactly once in each column.</li>
	<li>Each of the digits <code>1-9</code> must occur exactly once in each of the 9 <code>3x3</code> sub-boxes of the grid.</li>
</ol>

<p>The <code>'.'</code> character indicates empty cells.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png" style="height: 250px; width: 250px;">
<pre><strong>Input:</strong> board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
<strong>Output:</strong> [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
<strong>Explanation:</strong>&nbsp;The input board is shown above and the only valid solution is shown below:

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Sudoku-by-L2G-20050714_solution.svg/250px-Sudoku-by-L2G-20050714_solution.svg.png" style="height: 250px; width: 250px;">
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>board.length == 9</code></li>
	<li><code>board[i].length == 9</code></li>
	<li><code>board[i][j]</code> is a digit or <code>'.'</code>.</li>
	<li>It is <strong>guaranteed</strong> that the input board has only one solution.</li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: JAVA EASIEST SOLUTION✅😎 || STEP BY STEP EXPLAINED🤯
**Author**: [@abhiyadav05](https://leetcode.com/abhiyadav05/)
**Upvotes**: 107 👍
**Link**: [View Original Post](https://leetcode.com/problems/sudoku-solver/solutions/3469400/)

---

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->O(9^(n*n))

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->O(n^2) 
![Screenshot_20230205_171246.png](https://assets.leetcode.com/users/images/cd9232bf-fd92-4a55-bf8d-3b9732e4ca43_1682846131.0732913.png)


# Code
```
class Solution {
    public void solveSudoku(char[][] board) {
        // Start solving sudoku from the first cell
        solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int row, int col) {
        // Base case: If row is equal to board length, entire board has been filled
        if (row == board.length) {
            return true;
        }
        
        // Move to next row when current row is fully filled
        if (col == board[0].length) {
            return solve(board, row + 1, 0);
        }
        
        // Skip cells that are already filled
        if (board[row][col] != \'.\') {
            return solve(board, row, col + 1);
        }
        
        // Try different numbers in current cell
        for (char num = \'1\'; num <= \'9\'; num++) {
            if (isValidPlacement(board, row, col, num)) {
                board[row][col] = num; // Fill current cell with valid number
                
                // Move to next cell
                if (solve(board, row, col + 1)) {
                    return true;
                }
                
                // Backtrack to previous state if solution not found
                board[row][col] = \'.\';
            }
        }
        
        // No valid solution found
        return false;
    }

    private boolean isValidPlacement(char[][] board, int row, int col, char num) {
        // Check if num is already in the same row, column or 3x3 subgrid
        for (int i = 0; i < board.length; i++) {
            // Check row
            if (board[i][col] == num) {
                return false;
            }

            // Check column
            if (board[row][i] == num) {
                return false;
            }
 
            // Check 3x3 subgrid
            int subgridRow = 3 * (row / 3) + i / 3; // Calculate row index of subgrid
            int subgridCol = 3 * (col / 3) + i % 3; // Calculate column index of subgrid
 
            if (board[subgridRow][subgridCol] == num) {
                return false;
            }
        }

        // Placement is valid
        return true;
    }
}

```

</details>
