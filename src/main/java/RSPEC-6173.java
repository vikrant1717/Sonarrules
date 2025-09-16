import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.springframework.web.bind.annotation.*;

@RestController
public class EffectController
{
    @GetMapping(value = "/filter/apply")
    @ResponseBody
    public String apply(@RequestParam("effect") String effectName)
    {
        try
        {
            Class effectClass                = Class.forName(effectName);  // Noncompliant
            Constructor<?> effectConstructor = effectClass.getConstructor();
            Object EffectObject              = effectConstructor.newInstance();
            Method applyMethod               = effectClass.getMethod("applyFilter");

            boolean result = (boolean) applyMethod.invoke(EffectObject);

            if (result) {
                return "Filter Applied";
            }

        } catch (Exception e) {}

        return "Filter Failure";
    }
}
