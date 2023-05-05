package oca.studyGuide.chapter4_methods.example11_static_imports;

//import static java.util.Arrays; // DOES NOT COMPILE

import static java.util.Arrays.asList;

//static import java.util.Arrays.*; // DOES NOT COMPILE
public class BadStaticImports {
    public static void main(String[] args) {
//   Arrays.asList("one"); // DOES NOT COMPILE
    }
}
