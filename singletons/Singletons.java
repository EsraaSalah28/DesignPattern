/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletons;

/**
 *
 * @author Esraa Salah
 */
public class Singletons {

  private Singletons()
  {
  }
  
  private static Singletons uniqueInstance;
  
  public  static Singletons getInstance()
  {
    return uniqueInstance;
  }
  
}
