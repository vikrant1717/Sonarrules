import org.springframework.web.servlet.ModelAndView;
import org.junit.Assert;

class Example {
    void test() {
        ModelAndView mav = getMyModelAndView();

        Assert.assertEquals("register", mav.getViewName()); // Noncompliant
        Assert.assertTrue((Boolean) mav.getModelMap().get("myAttribute")); // Noncompliant
        Assert.assertFalse((Boolean) mav.getModelMap().get("myAttribute")); // Noncompliant
        Assert.assertEquals(myObject, mav.getModelMap().get("myAttribute")); // Noncompliant
    }
    ModelAndView getMyModelAndView() { return null; }
    Object myObject;
}
