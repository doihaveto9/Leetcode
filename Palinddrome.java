class Solution {
    public boolean isPalindrome(int x) {

        //If the int is only one digit, it will automatically be true
        if (x % 10 == x && x >= 0){
            return true;
        }

        //If the int is negative, or ends in 0, it will automatically be false
        if(x < 0 || x % 10 == 0)
            return false;

        ArrayList<Integer> digits = new ArrayList<>();
        
        while(x > 0){
            digits.add(x % 10);
            x = x / 10;
        }

        for (int i = 0; i < (digits.size() - (digits.size() % 2)); i++){
            if(digits.get(i) != digits.get(digits.size() - (i + 1)))
                return false;
        }

        return true;
    }
}