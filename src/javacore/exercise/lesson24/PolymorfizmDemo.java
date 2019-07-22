package javacore.exercise.lesson24;

public class PolymorfizmDemo {
    public static void main(String[] args) {

//        EmailLogger emailLogger = new EmailLogger();
//        emailLogger.log("++ Log Mesajı");
//
//        BaseLogger[] baseLoggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()};
//        for(BaseLogger logger:baseLoggers){
//            logger.log("Log Mesajı");
//        }
//


        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();


    }
}
