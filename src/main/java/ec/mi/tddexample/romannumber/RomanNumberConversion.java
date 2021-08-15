package ec.mi.tddexample.romannumber;

public class RomanNumberConversion {

    int[] ARABIC_DIGITS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] ROMAN_DIGITS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    // I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, XII, XIV, XV

    public String intToRoman(int arabic) {
        StringBuilder roman = new StringBuilder();
     
        for (int i = 0; i < ARABIC_DIGITS.length; i++) {
           while (arabic >= ARABIC_DIGITS[i]) {
              roman.append(ROMAN_DIGITS[i]);
              arabic -= ARABIC_DIGITS[i];
           }
        }
     
        return roman.toString();
    }

}
