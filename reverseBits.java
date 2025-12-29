class Solution {
    public int reverseBits(int n) {
        String n_bits = "";
        //StringBuilder result_bits;
        
        while(n > 0){
            n_bits = Integer.toString(n % 2) + n_bits;
            n /= 2;
        }

        //System.out.println(n_bits);

        while(n_bits.length() < 32){
            n_bits = "0" + n_bits;
        }

        int result = 0;
        int index = 0;

        for(char c : n_bits.toCharArray()){
            if(c == '1')
                result += (int) Math.pow(2, index);

            index++;
        }

        return result;
    }
}