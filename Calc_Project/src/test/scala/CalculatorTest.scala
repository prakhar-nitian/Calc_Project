import org.scalatest.FunSuite
   
class CalculatorTest extends FunSuite {

  val calculator_obj = new Calculator


  test("Add Test Cases") {
    assert(calculator_obj.add(2, 0) == 2)
    assert(calculator_obj.add(-2, -2) == -4)
  }
  test("Subtract Test Cases") {
    assert(calculator_obj.sub(2, 0) == 2)
    assert(calculator_obj.sub(-2, -2) == 0)
  }

  test("multiply Test Cases") {
    assert(calculator_obj.multiply(2, 0) == 0)
    assert(calculator_obj.multiply(0, 4) == 0)
    assert(calculator_obj.multiply(0, 0) == 0)
  }

  test("Divide Test case") {
    assertThrows[ArithmeticException](calculator_obj.divide(1, 0))
  }
  
}
