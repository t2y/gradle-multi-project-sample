package base;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MyBaseTest {

  class MySub1 extends MyBase {}

  class MySub2 implements MyInterface {}

  @Test
  void testMySub1() {
    assertDoesNotThrow(() -> new MySub1().doSomeProcess());
  }

  @Test
  void testMySub2() {
    assertThrows(RuntimeException.class, () -> new MySub2().doSomeProcess());
  }
}
