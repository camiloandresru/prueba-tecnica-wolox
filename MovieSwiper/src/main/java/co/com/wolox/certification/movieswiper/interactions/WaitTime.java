package co.com.wolox.certification.movieswiper.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitTime implements Interaction {

    private int time;

    public WaitTime(int time) {
        this.time = time*1000;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        InternalSystemClock clock = new InternalSystemClock();
        clock.pauseFor(time);
    }

    public static WaitTime inSeconds(int time){
        return Tasks.instrumented(WaitTime.class, time);
    }

}
