package dio.web_api.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String message, Object... params){
        super(String.format(message, params));
    }

    // Nota: a classe BusinessException possui dois construtores, um para definição de uma mensagem simples e o outro para uma mensagem mais csutomizada, utiliziando o recurso varargs.

}
