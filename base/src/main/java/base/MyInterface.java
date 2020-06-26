package base;

public interface MyInterface {

  default void doSomeProcess() {
    throw new RuntimeException("implement this!");
  }
}
