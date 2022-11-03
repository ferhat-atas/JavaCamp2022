/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismdemo;

/**
 *
 * @author ferha
 */
public class CustomerManager {
    
    private BaseLogger logger;
    
   public CustomerManager(BaseLogger logger){
       
       this.logger = logger;
   }
    
    BaseLogger baseLogger = new BaseLogger();
    
    public void add(){
        System.out.println("Müşteri Eklendi");
        this.logger.log("Log mesajı");
        
        
    }
    
}
