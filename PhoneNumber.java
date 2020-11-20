package com.company;

public class PhoneNumber {

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String toString() {
        StringBuffer buff = new StringBuffer();
        String lastNums = number.substring(number.length() - 4);
        String ch1 = number.substring(number.length() - 4 - 3, number.length() - 1 - 4);
        String ch2 = number.substring(number.length() - 4 - 3 - 3, number.length() - 1 - 4 - 3);
        String code;
        if (number.charAt(0) == '+') {
            code = number.substring(1, number.length() - 4 - 3 - 3);
        } else {
            code = number.substring(0, number.length() - 4 - 3 - 3);
        }
        buff.append("+");
        buff.append(code);
        buff.append("-");
        buff.append(ch1);
        buff.append("-");
        buff.append(ch2);
        buff.append("-");
        buff.append(lastNums);
        return buff.toString();
    }

    private String number;
}
