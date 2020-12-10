package pl.voclern.validator;

import org.apache.commons.beanutils.BeanUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {

    private String firstFieldName;
    private String secondFieldName;

    @Override
    public void initialize(FieldMatch constraintAnnotation) {
        firstFieldName = constraintAnnotation.firstFieldName();
        secondFieldName = constraintAnnotation.secondFieldName();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        try {
            Object firstFieldValue = BeanUtils.getProperty(o, firstFieldName);
            Object secondFieldValue = BeanUtils.getProperty(o, secondFieldName);

            return firstFieldValue.equals(secondFieldValue);
        } catch (Exception ignore) {
        }

        return false;
    }
}
