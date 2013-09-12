/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;


/**
 *
 * @author SAMEERA
 */
public class InvalidNicException extends Exception {
    
    public InvalidNicException() {
		super("Entered NIC number is invalid");
	}
    
}
