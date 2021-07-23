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
public class LazySingleton {
     private static LazySingleton uniqueIntance;
    private LazySingleton()
    {
    }
    private static synchronized LazySingleton getInstance()
    {
       if (uniqueIntance == null)
       {
        uniqueIntance = new LazySingleton();
       }
    
     return  uniqueIntance;
    }
    
}
