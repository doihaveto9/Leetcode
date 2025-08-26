class Solution {
    public int reverse(int x) {
        
        // String reverseInt = "";
        // boolean negative = false;

        // for(char c : Integer.toString(x).toCharArray()){
        //     if(c == '-')
        //         negative = true;
        //     else
        //         reverseInt = c + reverseInt;
        // }

        // long result = 0;

        // if(negative){
        //     if((-1 * Long.valueOf(reverseInt) < Integer.MIN_VALUE))
        //         return 0;
        //     else
        //         return (-1 * Integer.valueOf(reverseInt));
        // }
        // else{
        //     if((Long.valueOf(reverseInt) > Integer.MAX_VALUE))
        //         return 0;
        //     else
        //         return Integer.valueOf(reverseInt);
        // }
        
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;

    }
}