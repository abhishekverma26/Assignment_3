import org.scalatest.funsuite.AnyFunSuite

class FactLogTest extends AnyFunSuite {
   val obj = new FactLog

  test("Test recursive factorial") {
    assert(120==obj.Recfactorial(5))
  }

  test("Test tail recursive factorial") {
    assert(720==obj.TailRecfactorial(6))
  }

  test("Test log"){
    assert("[Update]: Logged in"==obj.log("Logged in", "Update"))
  }

  test("Test log without Level"){
    assert("[INFO]: Error 404"==obj.log("Error 404"))
  }

}
