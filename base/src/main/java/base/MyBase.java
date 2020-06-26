package base;

import com.google.common.math.LongMath;
import common.MyLibrary;
import java.math.RoundingMode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.math3.stat.Frequency;

@Slf4j
public abstract class MyBase implements MyInterface {

  @Override
  public void doSomeProcess() {
    log.info("called doSomeProcess in Base");
    MyLibrary.doSomeProcess();
    log.info("log floor: {}", LongMath.log2(8, RoundingMode.FLOOR));
  }

  public void countStringFrequencies() {
    Frequency f = new Frequency();
    f.addValue("one");
    f.addValue("One");
    f.addValue("oNe");
    f.addValue("Z");
    log.info("f.getCumPct('Z'): {}", f.getCumPct("Z")); // displays 0.5
  }
}
