package s2ju

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DummySpec extends Specification {

  "foo" should {
  
    "bar" in {
    
      1 must_== 1
    }
  }
}
