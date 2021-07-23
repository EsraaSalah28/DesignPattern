/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletons;

/**
 *
 * @author Esraa
 */
public class DoubleCheckSingleton {
    private  static  volatile  DoubleCheckSingleton uniqueInstance;
    
    private  DoubleCheckSingleton()
    {}
    
    public static DoubleCheckSingleton getInstance()
    {   
        if(uniqueInstance == null)
         {  synchronized(DoubleCheckSingleton.class)
         {  
              if(uniqueInstance == null)
              {
              
               uniqueInstance = new DoubleCheckSingleton();
              }
         
         }
        
        
        }
    
    
    
    return uniqueInstance;
    }
}
