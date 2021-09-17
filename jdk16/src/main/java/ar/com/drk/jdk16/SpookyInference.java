package ar.com.drk.jdk16;

import java.util.Comparator;

public class SpookyInference {

  interface SecondLevel {
  }

  interface FirstLevel<T extends SecondLevel & Comparable<T>> {
    T get();

    int number();
  }

  public static void main(final String[] args) {
    Comparator.<FirstLevel<?>>comparingInt(FirstLevel::number)
        .thenComparing(FirstLevel::get);
  }
}
