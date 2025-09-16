import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
class RequestBean {
    // ...
}

@Component
class SingletonBean {
    @Autowired
    private RequestBean requestBean; // Noncompliant: same instance used for all requests

    public RequestBean getRequestBean() {
        return requestBean;
    }
}

@Component
@Scope("prototype")
class PrototypeBean {
    public Object execute() {
        // ...
        return null;
    }
}

@Component
class AnotherSingletonBean {
    private PrototypeBean prototypeBean;

    @Autowired
    public AnotherSingletonBean(PrototypeBean prototypeBean) { // Noncompliant: same instance used for all requests
        this.prototypeBean = prototypeBean;
    }

    public Object process() {
        return prototypeBean.execute();
    }
}
