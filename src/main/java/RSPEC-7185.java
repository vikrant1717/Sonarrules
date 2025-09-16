import org.springframework.context.event.EventListener;

class CustomerEvent {}
class ExceptionalEvent {}

class Example {
    @EventListener
    void handleEvent(CustomerEvent customerEvent, ExceptionalEvent exceptionalEvent) { // Noncompliant
        //... some event handling
    }
}
