package common;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class MyLibraryTest {
  @Test
  void testSomeLibraryMethod() {
    assertDoesNotThrow(() -> MyLibrary.doSomeProcess());
  }
}
