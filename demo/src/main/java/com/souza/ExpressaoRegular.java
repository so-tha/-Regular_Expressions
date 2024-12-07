package com.souza;

public class  ExpressaoRegular {

    public String BRANCO, BRANCOS;
    public String DIGITO, DIGITOS;
    public String LETRA, LETRAS;
    public String IDENT;
    public String EXPONENCIAL;
    public String REAL;
    public String INTEIRO;
    public String PALAVRA;
    public String VIRGULA;
    public String ASSFUNCOES;
    public String FRACIONARIA;
    public String TIPOS;
    public String PARAMETROFUNC;
    public String SIMBOLOSARI;
    public String SIMBOLOSRELACIONAIS;
    public String VARIAVEL;
    public String TERMO;
    public String EXPRESSAO;
    public String ESTRUCONDICIONAL;
    public String CONDICAO;
    public String EXPRESSAOARITMETICA;
    public String OPERADOR;
    public String ARRAY;
    public String CHAMADAFUNC;
    public String MEMBER_ACCESS;

    public  ExpressaoRegular() {    
        BRANCO = "([ \\s])";
        VIRGULA = ",";
        BRANCOS = "([ \\s]*)";
        DIGITO = "([0-9])";
        DIGITOS = "([0-9]*)";
        LETRA = "([a-zA-Z])";
        LETRAS = LETRA + "*";
        PALAVRA = LETRAS + "(" + LETRAS + "|" + DIGITO + ")*";
        SIMBOLOSRELACIONAIS = "(<|>|<=|>=|==|!=)";
        SIMBOLOSARI = "(\\+|\\-|\\*|\\/|\\(|\\))";
        EXPONENCIAL = "(E(\\+|-)" + DIGITOS + ")";
        FRACIONARIA = "\\." + DIGITOS + EXPONENCIAL + "?";
        REAL = "\\-?" + DIGITOS + FRACIONARIA;
        INTEIRO = "("+DIGITOS + EXPONENCIAL + "?)";
        TIPOS = "(void|int|float|double|String|char|Long|boolean)";
        ESTRUCONDICIONAL = "(if|else)";
        MEMBER_ACCESS = "(\\.\\w+)";
        OPERADOR = "(\\+|\\-|\\*|\\/)";
        ARRAY = "(\\[\\d+\\])";
        CHAMADAFUNC = "(\\w+\\([^\\)]*\\))";
        VARIAVEL = "([a-zA-Z_]" + "(" + LETRAS + "|" + DIGITOS + "|_)*" + ")";
        TERMO = "(-?\\d+|" + VARIAVEL + ARRAY + "?" + MEMBER_ACCESS + "?|" + CHAMADAFUNC + ")";
        EXPRESSAO = TERMO + "(" + "\\s*" + SIMBOLOSARI + "\\s*" + TERMO + ")*";
        CONDICAO = ESTRUCONDICIONAL + "\\s*\\(\\s*" + 
                   EXPRESSAO + "\\s*" + SIMBOLOSRELACIONAIS + "\\s*" + EXPRESSAO + 
                   "\\s*\\)";
        ASSFUNCOES = TIPOS +  BRANCOS  + PALAVRA + BRANCOS + "(" + TIPOS + VIRGULA + BRANCOS + PALAVRA + "(," + "\\)" + BRANCO + "\\;"; 
        PARAMETROFUNC = TIPOS + BRANCOS + PALAVRA + "(" + BRANCOS + VIRGULA + BRANCOS + TIPOS + BRANCOS + PALAVRA + ")*";
        EXPRESSAOARITMETICA = TERMO + 
                             "(" + BRANCOS + OPERADOR + BRANCOS + TERMO + ")*";
    }

    public void confere(String er, String sentenca) {
        System.out.println("Testando: " + sentenca);
        System.out.println("Expressão: " + er);
        if (sentenca.matches(er)) {
            System.out.println("A sentenca foi aceita");
        } else {
            System.out.println("A sentenca não foi aceita");
        }
        System.out.println();
    }

}
