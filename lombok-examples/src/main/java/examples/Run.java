package examples;

import examples.log.*;

/**
 * Created by shantonu on 5/31/16.
 */
public class Run {
    public static void main(String... args){
       logExperiments();
    }

    public static void logExperiments(){
        //AllLoggers.log();/*
        CommonsLogExample.log();
        JavaLogApiExample.log();
        Log4jExample.log();
        Log4j2Example.log();
        XSlf4jExample.log();
        Slf4jExample.log();
    }
}
