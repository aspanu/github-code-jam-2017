package org.aspanu.codejam2017.tidyproblem;

/**
 * Created by aspanu on 4/8/17.
 */
public class TidyProblem {
    public boolean isTidyNumber(Long inputNumber) {
        String number = inputNumber.toString();
        int lastDigit = 0;

        for (Character c : number.toCharArray()) {
            if (Integer.valueOf(c) < lastDigit) {
                return false;
            }
            lastDigit = Integer.valueOf(c);
        }
        return true;
    }

    /**
     * Returns the index of the last digit which was tidy
     */
    public int getUntidyIndex(Long inputNumber) {
        String number = inputNumber.toString();
        int lastDigit = 0;
        for (int i = 0; i < number.length(); i++) {
            if (Integer.valueOf(number.charAt(i)) < lastDigit) {
                return i-1;
            }
            lastDigit = Integer.valueOf(number.charAt(i));
        }
        return -1;
    }

    /**
     * Drop a digit by one and then make the rest of the number filled with 9s
     * Automatically handles the case where the digit is 0 and needs to borrow one from before
     */
    public Long lowerDigitAndCascadeNumber(Long inputNumber, int digitIndex) {
        char[] number = inputNumber.toString().toCharArray();
        if (number[digitIndex] == '0') {
            // TODO: Deal with the case that this digit is 0
            return lowerDigitAndCascadeNumber(inputNumber, digitIndex - 1);
        } else {
            Integer newDigit = number[digitIndex] - '0';
            newDigit--;
            number[digitIndex] = newDigit.toString().toCharArray()[0];
        }
        for (int i = digitIndex + 1; i < number.length; i++) {
            number[i] = '9';
        }
        return Long.valueOf(String.valueOf(number));
    }

    public Long previousTidyNumberNaive(Long numberToTidy) {
        if (isTidyNumber(numberToTidy)) {
            return numberToTidy;
        }
        while (!isTidyNumber(--numberToTidy)) {
        }
        return numberToTidy;
    }

    public Long previousTidyNumberIntelligent(Long numberToTidy) {
        Long number = numberToTidy;
        while (true) {
            int untidyIndex = getUntidyIndex(number);
            if (untidyIndex == -1) {
                return number;
            }
            number = lowerDigitAndCascadeNumber(number, untidyIndex);
        }
    }
}
