package com.company;

public class ForEachExemplo {

    public static void main(String[] args){

        String[] vect = new String[]{"Maria", "Bob", "Alex"}; // iniciando um vetor chamado "vect" de tipo String, já definindo seu conteúdo

        for (int i = 0; i < vect.length; i++){ //a função "NomeDoVetor.length" faz com que eu já use automaticamente o tamanho exato desse vetor

            System.out.println(vect[i]);
        }

        System.out.println("----------------------------------");

        for (String obj : vect) {

            System.out.println(obj);
        }
        // Usando o FOR EACH não preciso fazer o condicionamento de um laço FOR normal, que é um pouco extenso
        // Deste modo iniciamos com o tipo dos elementos do vetor, que no exemplo são String
        // Em seguida damos um "APELIDO" para esses elementos, no caso usamos o apelido "obj"
        // Usamos ":" significando "CONTIDO EM"
        // E em seguida colocamos a "coleção" em que estamos buscando elementos, no caso da nossa busca, os elementos então contidos no vetor "vect"
        // Assim, na hora de imprimi-lo não precisamos chamar cada posição do vetor usando o laço FOR
        // Podemos simplesmente chamar o "apelido" que já imprimirá o conteúdo do vetor vect

    }
}