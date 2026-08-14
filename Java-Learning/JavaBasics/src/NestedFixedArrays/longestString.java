package NestedFixedArrays;

public class longestString {
    public static void main(String[] args) {
        String [] names = {"Amy", "Chris", "Joe", "Thomas"};
        String longest = names[0];
        for (int index = 1; index < names.length; index++){
            if (names[index].length() > longest.length()){
                longest = names[index];
            }
        }
        System.out.println(longest);
    }
}
