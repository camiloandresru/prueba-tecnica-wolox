package co.com.wolox.certification.movieswiper.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

public class ScrollUntil implements Interaction {

    private final Target target;
    private final boolean click;

    protected ScrollUntil(Target target, boolean click) {
        this.target = target.waitingForNoMoreThan(Duration.ofSeconds(2));
        this.click = click;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int flag = 0;
        while (!isCurrentlyVisible(actor)) {
            actor.attemptsTo(Swipe.scrollUp());
            flag++;
            if (flag == 5)
                break;
        }

        if (click) {
            actor.attemptsTo(Click.on(target));
        }
    }

    private boolean isCurrentlyVisible(Actor actor) {
        try {
            return (target.resolveFor(actor).isCurrentlyVisible());
        } catch (Exception exception) {
            return false;
        }
    }

}
