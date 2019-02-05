import java.util.*;

/**
 * ProblemTwo
 */
public class ProblemTwo {

    public static void main(String[] args) {

    }

    public static <T> void combine(List<T> one, List<T> two) {
        List<T> newList = new ArrayList<T>(one);
        newList.addAll(two);
    }
}