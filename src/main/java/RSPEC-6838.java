import org.springframework.context.annotation.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Configuration(proxyBeanMethods = false)
class ConfigurationExample {
    @Bean
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean() {
        return new PrototypeBean(singletonBean()); // Noncompliant: creates new SingletonBean for each PrototypeBean
    }

    class SingletonBean {
        // ...
    }

    class PrototypeBean {
        public PrototypeBean(SingletonBean singletonBean) {
            // ...
        }
    }
}
