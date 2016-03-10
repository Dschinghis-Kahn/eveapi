package net.dschinghiskahn.eveapi;

public class EveApiException extends Exception {

    private static final long serialVersionUID = -4620986916119428527L;
    private Long code;

    public EveApiException(Long code, String message) {
        super(message);
        this.code = code;
    }

    public Long getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "EveApiException [code=" + code + ", message=" + getMessage() + "]";
    }

}
