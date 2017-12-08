// Jiaxi Davis Wang
// 12/7/2017
// Peirod 3
// CompareThree
// Comparable Interface
// 1.0

public class CompareThreeDAVISWANG {
    static public Object largest(Comparable a, Comparable b, Comparable c) {
        return a.compareTo(b) > 0 && a.compareTo(c) > 0 ? a : b.compareTo(a) > 0 && b.compareTo(c) > 0 ? b : c;
    }
}
