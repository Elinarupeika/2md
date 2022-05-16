import org.junit.jupiter.api.Assertions;

public class unittest {
  
  @org.junit.jupiter.api.Test

  public void test() {
        unit unit = new unit();
    
    int result = unit.calculate(20,85,17);

     Assertions.assertEquals(100,result);

    }
}