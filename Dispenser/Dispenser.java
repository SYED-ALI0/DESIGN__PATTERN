/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispenser;

public interface Dispenser {
	void setNext(Dispenser next);
	void dispense(Currency ammount);
}
