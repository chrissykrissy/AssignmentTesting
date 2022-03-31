package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String str = " ";
        int length = string.length();
        return str.repeat(length);
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++){
            Character c = string.charAt(i);
            if(Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }else{
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string1.length() || i < string2.length(); i++){
            if (i < string1.length()){
                sb.append(string1.charAt(i));
            }

            if(i < string2.length()){
                sb.append(string2.charAt(i));
            }
        }
        return sb.toString();
    }
}
