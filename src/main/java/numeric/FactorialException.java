/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeric;

/**
 *
 * @author Joshua Cappella
 */
public class FactorialException extends IllegalStateException {
    /**
     * This exception is for negative factorials
     */
    public FactorialException (String a){
        super (a);
    }
}
