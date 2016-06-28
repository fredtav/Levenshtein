/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import levenshtein.Levenshtein;
import org.junit.Test;

/**
 *
 * @author Frederico
 */
public class LevenshteinTest {
    
    public LevenshteinTest() {
    }
    /**
     * Caso de teste com uma string vazia
     */
    @Test
    public void calculaDistanciaVazioTest(){
        String a="";
        String b="teste";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==5);
        
        tam = lev.calculaDistancia(b, a);
        Assert.assertTrue(tam==5);
    }
    /**
     * Caso de teste onde as duas strings são iguais
     */
    @Test
    public void calculaDistanciaIgualTest(){
        String a="teste";
        String b="teste";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==0);
    }
    /**
     * Caso de teste onde o tamanho das strings é igual mas os caracteres são 
     * totalmente diferente
     */
    @Test
    public void calculaDistanciaDifTest(){
        String a= "abcd";
        String b= "efgh";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==a.length());
    }
    
    /**
     * Caso de teste com inserção no fim
     */
    @Test
    public void calculaDistanciaInsertFimTest(){
        String a= "banana";
        String b= "bananal";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==1);
    }
    
    /**
     *Caso de teste com inserção no início 
     */
    @Test
    public void calculaDistanciaInsertIniTest(){
        String a= "anana";
        String b= "banana";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==1);
    }
    
    @Test
    public void calculaDistanciaInsertMidTest(){
        String a= "af";
        String b= "abcdef";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==4);
    }
    
    /**
     * Caso de Teste onde tem caracteres vazios
     */
    @Test
    public void calculaDistanciaCaracterVazioTest(){
        String a= " a b c";
        String b= "ab c";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==2);
    }
    
    /**
     * Caso de teste com inserção no fim
     */
    @Test
    public void calculaDistanciaRemoveFimTest(){
        String a= "abcde";
        String b= "abc";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==2);
    }
    
    @Test
    public void calculaDistanciaRemoveIniTest(){
        String a= "abcde";
        String b= "cde";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==2);
    }
    
    @Test
    public void calculaDistanciaRemoveMidTest(){
        String a= "abcdef";
        String b= "af";
        
        Levenshtein lev = new Levenshtein();
        int tam = lev.calculaDistancia(a, b);
        
        Assert.assertTrue(tam==4);
    }
    
}
