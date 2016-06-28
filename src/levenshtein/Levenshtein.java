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
public class Levenshtein {

    public Levenshtein() {
    }

    public int calculaDistancia(String palavra1, String palavra2) {
        //implimentei sem ser Case Sensitive, para mudar bastaria apagar as duas
        //linhas abaixo
        String str1 = palavra1.toLowerCase();
        String str2 = palavra2.toLowerCase();

        //verifica se as strings são iguais, caso sejam já retorna 0
        if (str1.equals(str2)) {
            return 0;
        }

        //verifica se uma das strings não é vazia retornando o tamanho da outra
        if (str1.length() == 0) {
            return str2.length();
        }
        if (str2.length() == 0) {
            return str1.length();
        }

        //verifica se o primeiro char das duas strings são iguais, se forem chama a função de novo sem eles
        if (str1.charAt(0) == str2.charAt(0)) {
            return calculaDistancia(str1.substring(1), str2.substring(1));
        }

        int pal1 = calculaDistancia(str1.substring(1), str2.substring(1));
        int pal2 = calculaDistancia(str1, str2.substring(1));
        int pal3 = calculaDistancia(str1.substring(1), str2);

        //retorna o valor mínimo
        return Math.min(pal1, Math.min(pal2, pal3)) + 1;

    }
}
