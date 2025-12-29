// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

// Example 1:

// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:

// Input: n = 1
// Output: ["()"]

class Solution {
    public List<String> generateParenthesis(int n) {
        // Instantiate an initial List that we will return
        List<String> result = new ArrayList<String>();
        recursion(result, 0, 0, "", n);
        return result;

    }

    // We will use this function to generate every possible combination via recursion
    public void recursion(List<String> result, int left, int right, String s, int n){

        // If it find the resulting string is long enough, it adds it to the list, and ends the function
        if(s.length() == n * 2){
            result.add(s);
            return;
        }

        // If left is less than n, the function adds a left parenthesis to the string
        // and increments left by 1, before calling the function again
        if(left < n){
            recursion(result, left + 1, right, s + "(", n);
        }

        // If right is less then left, the function adds a right parenthesis to the string
        // and increments right by 1, before calling the function again
        if (right < left){
            recursion(result, left, right + 1, s + ")", n);
        }
    }
}