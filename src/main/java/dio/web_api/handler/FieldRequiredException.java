package dio.web_api.handler;

public class FieldRequiredException extends BusinessException {
    public FieldRequiredException(String field) {
        super("The field %s is required", field);
    }
}
