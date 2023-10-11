package org.example.search;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {

    public static void main(String[] args) {
        String s = "[0-9]+";
        Pattern p = Pattern.compile(s);
        Matcher m = p.matcher("a3n4b2n5m56m390m29");
        String text = "import";
        m.results()
                .map(MatchResult::group)
                .forEach(System.out::println);
    }
}
