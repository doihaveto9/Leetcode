class Solution {
    public String intToRoman(int num) {
        
        String result = "";

        while(num > 0){
            if(num >= 1000){
                while(num >= 1000){
                    num -= 1000;
                    result = result + "M";
                }
            }

            if(num >= 900){
                num -= 900;
                result = result + "CM";
            }

            if (num >= 500){
                num -= 500;
                result = result + "D";
            }

            if (num >= 400){
                num -= 400;
                result = result + "CD";
            }

            if(num >= 100){
                while (num >= 100){
                    num -= 100;
                    result = result + "C";
                }
            }
            
            if(num >= 90){
                num -= 90;
                result += "XC";
            }

            if(num >= 50){
                num -= 50;
                result += "L";
            }

            if (num >= 40){
                num -= 40;
                result += "XL";
            }

            if (num >= 10){
                while(num >= 10){
                    num -= 10;
                    result += "X";
                }
            }

            if (num == 9){
                num -= 9;
                result += "IX";
            }

            if (num >= 5){
                num -= 5;
                result += "V";
            }

            if (num == 4){
                num -= 4;
                result += "IV";
            }

            if (num >= 1){
                while (num >= 1){
                    num -= 1;
                    result += "I";
                }
            }
        }

        return result;
    }
}