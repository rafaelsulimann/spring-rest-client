package com.sulimann.restclient.utils.constants;

public final class Regex {

    public static final String EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    public static final String CPF_OU_CNPJ = "(\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2})|(\\d{2}\\.?\\d{3}\\.?\\d{3}/?\\d{4}-?\\d{2})";
    public static final String CEP = "\\d{5}-?\\d{3}";
    public static final String CELULAR = "(\\(\\d{2}\\))?\\d{2}[- ]?\\d{4,5}[- ]?\\d{4}";
    public static final String SENHA_LIMPA = "^\\$2[ayb]\\$\\d{2}\\$[./0-9A-Za-z]{53}$";

    private Regex() {
        throw new AssertionError("Não é permitido instanciar esta classe.");
    }

}
