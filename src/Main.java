public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        int count = 0;
        for (int x = 0; x < str.length(); x++) {
            if (str.charAt(x) == '(') {
                count++;
            }
            if (str.charAt(x) == ')') {
                count--;
            }
        }
        return count == 0;
    }


    // 2. reverseInteger
    public static String reverseInteger(int num) {
        String numString = Integer.toString(num);
        String print = "";
        char add;
        add = ' ';
        for (int x = numString.length()-1; x > -1; x--) {
            add = numString.charAt(x);
            print = print + add;
        }
        return print;
    }


    // 3. encryptThis
    public static String encryptThis(String str){
        str = str + " ";
        String print = "";
        String word = "";
        for (int x = 0; x < str.length(); x++) {
            if (str.charAt(x) == ' ') {
                print = print + (int)word.charAt(0);
                print = print + word.charAt(word.length() - 1);
                if(word.length() > 2){
                    print = print + word.substring(2, word.length()-1);
                    print = print + word.charAt(1);
                }
                if(x != str.length() - 1) {
                    print = print + " ";
                }
                word = "";
            } else {
                word = word + str.charAt(x);
            }
        }
        return print;
    }

    // 4. decipherThis
    public static String decipherThis(String str){
        str = str + " ";
        String print = "";
        String word = "";
        for (int x = 0; x < str.length(); x++) {
            // word is 72olle
            if (str.charAt(x) == ' ') {
                String asciiString = "";
                int yValue = 0; // yvalue is 2
                for (int y = 0; y < word.length(); y++) {
                    if (word.charAt(y) >= '0' && word.charAt(y) <= '9') {
                        asciiString = asciiString + word.charAt(y);
                        yValue = y + 1;
                    } else {
                        break;
                    }
                }
                int ascii = Integer.parseInt(asciiString);
                char asciiToChar = (char) ascii;
                print = asciiToChar + str.substring(yValue); //str = Holle
                char switchOne = str.charAt(1); //switchone = o
                char switchTwo = str.charAt(str.length() - 1); //switchone = e
                print = str.charAt(0) + switchTwo + str.substring(2, str.length() - 2) + switchOne;
            } else {
                word = word + str.charAt(x);
            }
        }
        return print;
    }


}