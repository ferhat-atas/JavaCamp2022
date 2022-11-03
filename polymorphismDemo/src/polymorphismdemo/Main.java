/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismdemo;


public class Main {
    
    public static void main(String[] args) {
        
       /* EmailLogger emailLogger = new EmailLogger();
        
        emailLogger.log("hello world");
        
        BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
        
        for (BaseLogger ney : loggers) {
            
            ney.log("Hello Kardaş");
            
        }*/
        
       CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
       
       customerManager.add();
        
    }
    
}
