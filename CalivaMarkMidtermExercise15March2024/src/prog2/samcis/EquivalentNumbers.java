/**
 Name of programmer: Caliva, Mark Chester P.

 Class Code and Schedule: 9322B 3:00-4:30 TF

 Date: March, 19 2024
 **/

package prog2.samcis;

/**
 * A template for an object representing a whole number with its decimal, binary,
 * octal, and hexadecimal form.
 **/

public class EquivalentNumbers implements NumberConverter {
    private int decimalNumber; // decimal number form
    private String hexadecimalString; // decimal number form
    private String binaryString; // binary number form
    private String octalString; // octal number form

    /**
     * Constructs an object representing the number 0
     **/

    public EquivalentNumbers(){
        decimalNumber = 0;
        hexadecimalString = "0";
        binaryString = "0";
        octalString = "0";
    }

    /**
     * Constructs an object representing a q whole number a
     **/

    public EquivalentNumbers(int a, String b, String c, String d){
        decimalNumber = a;
        hexadecimalString = b;
        binaryString = c;
        octalString = d;
    }

    /**
     * Returns the decimal form of an object of EquivalentNumbers
     **/

    public long getDecimalNumber(){
        return decimalNumber;
    }

    /**
     * Returns the hexadecimal number form of an object of EquivalentNumbers
     **/

    public String getHexadecimalString(){
        return hexadecimalString;
    }

    /**
     *Returns the binary number form of an object of EquivalentNumbers
     **/

    public String getBinaryString(){
        return binaryString;
    }

    /**
     * Returns the octal number form of an object of EquivalentNumbers
     **/

    public String getOctalString(){
        return octalString;
    }

    /**
     * Sets the decimal number, then the hexadecimal number, binary number, and octal
     * number are set based  on the decimal number.
     */
    public void setDecimalNumber(double d){
        decimalNumber = (int)d;
        double decimal = d - decimalNumber;
        hexadecimalString = Integer.toHexString(decimalNumber);
        binaryString = Integer.toBinaryString(decimalNumber);
        octalString = Integer.toOctalString(decimalNumber);
        String decimalBinary = convertDecimalToBinary(decimal);
        String decimalOctal = convertDecimalToOctal(decimal);
        String decimalHex = convertDecimalToHex(decimal);

        binaryString += "." + decimalBinary;
        octalString += "." + decimalOctal;
        hexadecimalString += "."+decimalHex;
    }


    /**
     * Sets the hexadecimal number, then the decimal number, binary number, and octal
     * number are set based on the hexadecimal number.
     */

    public void setHexadecimalString(String n){
        hexadecimalString = n;
        decimalNumber = hexadecimalToDecimal(hexadecimalString);
        binaryString = Integer.toBinaryString(decimalNumber);
        octalString = Integer.toOctalString(decimalNumber);
    }

    /**
     * Sets the octal number, then the decimal number, binary number, and hexadecimal
     * number are set based on the octal number.
     */

    public void setOctalString(String n){
        octalString = n;
        decimalNumber = octalToDecimal(octalString);
        binaryString = Integer.toBinaryString(decimalNumber);
        hexadecimalString = Integer.toHexString(decimalNumber);
    }

    /**
     * Returns the hexadecimal digit corresponding to a given number in the range
     * 0 to 15
     **/
    public char hexDigit(byte digit){
        char r = '0';
        switch (digit){
            case 0: r = '0'; break;
            case 1: r = '1'; break;
            case 2: r = '2'; break;
            case 3: r = '3'; break;
            case 4: r = '4'; break;
            case 5: r = '5'; break;
            case 6: r = '6'; break;
            case 7: r = '7'; break;
            case 8: r = '8'; break;
            case 9: r = '9'; break;
            case 10: r = 'A'; break;
            case 11: r = 'B'; break;
            case 12: r = 'C'; break;
            case 13: r = 'D'; break;
            case 14: r = 'E'; break;
            case 15: r = 'F'; break;
        }
        return r;
        }

    /**
     * Returns the decimal number corresponding to a given binary number
     **/
    public int binaryToDecimal(String b) throws Exception{
        int result = 0;
        if(!isValidBinaryString(b))
            throw new Exception("Invalid Binary Number");
        for(int i = 0; i <b.length();i++){
            result += Integer.parseInt(""+b.charAt(i))*Math.pow(2,(int)(b.length()-1-i));
        }
        return result;
    }

    /**
     * Returns the decimal number corresponding to a given hexadecimal number
     **/
    public int hexadecimalToDecimal(String h){
        int result=0;
        for (int i=0; i<h.length(); i++){
            switch (h.charAt(i)){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    result += Integer.parseInt(""+h.charAt(i))* Math.pow(16,(int) (h.length()-1-i) );
                  break;
                case 'a':
                case 'A':
                    result += 10* Math.pow(16,(int) (h.length()-1-i) );
                    break;
                case 'b':
                case 'B':
                    result += 11* Math.pow(16,(int) (h.length()-1-i) );
                    break;
                case 'c':
                case 'C':
                    result += 12* Math.pow(16,(int) (h.length()-1-i) );
                    break;
                case 'd':
                case 'D':
                    result += 13* Math.pow(16,(int) (h.length()-1-i) );
                    break;
                case 'e':
                case 'E':
                    result += 14* Math.pow(16,(int) (h.length()-1-i) );
                    break;
                case 'f':
                case 'F':
                    result += 15* Math.pow(16,(int) (h.length()-1-i) );
                    break;
            }
        }
        return (result);
    }

    /**
     * Returns the decimal number corresponding to a given octal number
     **/
    public int octalToDecimal(String n){
        int result = 0;
        for(int i = 0; i<n.length(); i++){
            result += Integer.parseInt(""+n.charAt(i))*Math.pow(8,(int)(n.length()-1-i));
        }
        return(result);
    }

    private String convertDecimalToBinary(double decimal){
        StringBuilder binary = new StringBuilder();

        while(decimal > 0 && binary.length() < 5){
            decimal *= 2;
            int a = (int) Math.floor(decimal);
            binary.append(a);
            decimal -=a;
        }
        return (binary.toString());
    }

    private String convertDecimalToOctal(double decimal){
        StringBuilder octal = new StringBuilder();
        while(decimal > 0 && octal.length() <5){
            decimal *= 8;
            int a = (int) Math.floor(decimal);
            octal.append(a);
            decimal -= a;
        }
        return octal.toString();
    }

    private String convertDecimalToHex(double decimal){
        StringBuilder hex = new StringBuilder();
        while(decimal > 0 && hex.length() < 5){
            decimal *= 16;
            int a = (int) Math.floor(decimal);
            hex.append(Integer.toHexString(a));
            decimal -= a;
        }
        return hex.toString();
    }

    /**
     * Returns a string showing a whole number with its decimal, binary, octal,
     * and hexadecimal form.
     **/
    public String toString(){
        return("Decimal Value = "+decimalNumber+"\nBinary Value = "+binaryString+
                "\nOctal Value = "+octalString+"\nHexadecimal Value = "+hexadecimalString);
    }

    /**
     * Returns true if this number is equivalent to another number.
     **/
    public boolean equals(EquivalentNumbers another){
        return(this.decimalNumber == another.getDecimalNumber());
    }

    private boolean isValidBinaryString(String s){
        boolean result = true;
        for(int index = 0;index<s.length();index++){
            if(s.charAt(index)!='0'&&s.charAt(index)!='1')
                result = false;
        }
        return result;
    }
} // end of EquivalentNumbers

