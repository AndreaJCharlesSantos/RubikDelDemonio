/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubik;

/**
 *
 * @author PC JORGE
 */
public class Cubo {
	public char color[];
	public char orientacion[];

	public Cubo(int numeroTuplas){
		color=new char[numeroTuplas];
		orientacion=new char[numeroTuplas];
	}
}