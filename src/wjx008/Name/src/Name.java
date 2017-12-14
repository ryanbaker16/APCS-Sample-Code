// Jiaxi Davis Wang
// 11/30/2017
// Peirod 3
// Name
// Create a class called Name
// 1.0

public class Name {
    private String first, middle, last;

    public Name(String firstN, String middleN, String lastN) {
        first = firstN;
        middle = middleN;
        last = lastN;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }

    public String lastFirstMiddle() {
        return last + " " + first + " " + middle;
    }

    public boolean equals(Name otherName) {
        return first.equalsIgnoreCase(otherName.first)
                && middle.equalsIgnoreCase(otherName.middle) && last.equalsIgnoreCase(otherName.last);
    }

    public String initials() {
        return first.substring(0, 1)
                .concat("." + middle.substring(0, 1)).concat("." + last.substring(0, 1)).toUpperCase();
    }

    public int length() {
        return first.length() + middle.length() + last.length();
    }
}
