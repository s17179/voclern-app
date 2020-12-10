package pl.voclern.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = FieldMatchValidator.class)
public @interface FieldMatch {

    String message() default "Fields are not equal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String firstFieldName();

    String secondFieldName();
}
