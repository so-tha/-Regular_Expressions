package com.souza;

public class Main {
    public static void main(String[] args) {
        ExpressaoRegular er = new ExpressaoRegular();
        String teste1 = "int x";
        String teste2 = "float media, String nome";
        String teste3 = "int x, double y, String texto";
        
        er.confere(er.PARAMETROFUNC, teste1);
        er.confere(er.PARAMETROFUNC, teste2);
        er.confere(er.PARAMETROFUNC, teste3);
        er.confere(er.DIGITOS, "000511200021");
        er.confere(er.LETRAS, "ASDFEAFdafsafdsf");
        er.confere(er.LETRAS, "ASDFEAFdafsafdsf4565");
        er.confere(er.REAL, "123.908777E+30");
        er.confere(er.REAL, "0.17E-5");
        er.confere(er.INTEIRO, "10");
        er.confere(er.CONDICAO, "if(3*a!=4+t)");
        er.confere(er.CONDICAO, "if(ano<1990)");
        er.confere(er.EXPRESSAOARITMETICA, "3 + media/3");
        er.confere(er.EXPRESSAOARITMETICA, "-4 + beta * media[1].x * soma(a,b)/4 * vetor[5].idade");
    }
}