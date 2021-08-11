import scala.io.StdIn.readLine

class Calculator {
    println("Operations Available : \n 1. add \n 2. sub \n 3. multiply \n 4. divide")

    def add(x: Int, y:Int): Int = { x + y  }
    def sub(x: Int , y:Int): Int = { x - y }
    def multiply(x: Int , y:Int): Int = { x * y  }
    def divide(x: Int , y:Int): Int = { x / y }
    def perform_func: Unit ={
      println("Enter your First Number: ")
      val firstNumber:Int = readLine().toInt
      println("Your first number is"+firstNumber)
      println("Enter your Second Number: ")
      val secondNumber: Int= readLine().toInt
      println("Your second number is"+secondNumber)
      println("Enter operation do you want")
      val operation: String = readLine()

      /* println(add(2,3)) ; */

      operation match {
        case "add" => println(add(firstNumber:Int,secondNumber :Int))
        case "sub" => println(sub(firstNumber:Int,secondNumber :Int))
        case "multiply" => println(multiply(firstNumber:Int,secondNumber :Int))
        case "divide" => println(divide(firstNumber:Int,secondNumber :Int))
        case _ => println("Incorrect Operator")
      }
    }

}
