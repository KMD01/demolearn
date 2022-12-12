package studyGuide.chapter4_methods.example11_static_imports;

import java.util.List;

import static java.util.Arrays.asList;

public class StaticImports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // no Arrays.
    } }
