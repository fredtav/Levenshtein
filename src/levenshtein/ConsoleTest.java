/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levenshtein;

/**
 *
 * @author Frederico
 */
public class ConsoleTest {
    
    public static void main(String[] args){
        Levenshtein lev = new Levenshtein();
        System.out.println(lev.calculaDistancia("", "carro"));
        System.out.println(lev.calculaDistancia("carro", ""));
        System.out.println(lev.calculaDistancia("macaco", "TaBaco"));
        System.out.println(lev.calculaDistancia("bananal", "banal"));
        System.out.println(lev.calculaDistancia("banal", "bananal"));
        System.out.println(lev.calculaDistancia("kitten", "kitchen"));
        System.out.println(lev.calculaDistancia("abc", "cba"));
        
        
    }
}
