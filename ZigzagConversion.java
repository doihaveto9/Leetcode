// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a number of rows:

// string convert(string s, int numRows);
 

// Example 1:

// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"
// Example 2:

// Input: s = "PAYPALISHIRING", numRows = 4
// Output: "PINALSIGYAHRPI"
// Explanation:
// P     I    N
// A   L S  I G
// Y A   H R
// P     I
// Example 3:

// Input: s = "A", numRows = 1
// Output: "A"

class Solution {
    public String convert(String s, int numRows) {
        // If numsRows is 1 or greater than the length of s, the strings reads the same
        if(numRows == 1 || numRows >= s.length())
            return s;

        // Establish an array of Lists that will hold the characters in each row
        List<Character>[] chars = new ArrayList[numRows];

        // Establish an int to track the current row we're reading, and a boolean to
        // keep track of if we are iterating through the rows forwards or backwards
        int currentRow = 0;
        boolean goingUp = true;

        // Populate the array with empty arrayLists
        for (int i = 0; i < numRows; i++) {
            chars[i] = new ArrayList<>();
        }

        // Iterate over every character in the string
        for(int i = 0; i < s.length(); i++){
            // Add the current character to the list of the corresponding row
            chars[currentRow].add(s.charAt(i));

            // If the pointer is true, increment the currentRow
            if(goingUp){
                currentRow++;

                // If the currentRow value reaches numRows - 1, set the pointer to false
                if(currentRow == (numRows - 1)){
                    goingUp = false;
                }

                continue;
            }
            // If the pointer is false, decrement currentRow
            else{
                currentRow--;

                // If the currentRow value reaches 0, set the pointer to true
                if(currentRow == 0){
                    goingUp = true;
                }

                continue;
            }
        }

        // Establish a StringBuilder to act as the result
        StringBuilder sb = new StringBuilder();

        // Iterate over each character list by list, and append them to StringBuilder
        for(List<Character> row : chars){
            for(char c : row){
                sb.append(c);
            }
        }

        // return result
        return sb.toString();

    }
}