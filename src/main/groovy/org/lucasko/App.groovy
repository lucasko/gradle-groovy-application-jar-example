package org.lucasko

import org.apache.log4j.Logger;
class App {

    private static final Logger logger = Logger.getLogger(App.class);

    public String getGreeting(def name) {
        return "Hello world, I am $name"
    }

    static void main(String[] args) {
        App app = new App()

        def myName = System.getProperty("myName")
        assert myName     : "-DmyName can not be null."
        def greeting = app.getGreeting(myName)

        logger.info "[SUCCESS] $greeting"
    }
}
