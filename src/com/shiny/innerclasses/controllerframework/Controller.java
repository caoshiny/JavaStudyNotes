package com.shiny.innerclasses.controllerframework;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            for(Event e: eventList) {
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Event e = new Event(50000) {
            @Override
            public void action() {
                System.out.println("打开灯");
            }
        };
        Controller controller = new Controller();
        controller.addEvent(e);
        controller.run();
    }
}
