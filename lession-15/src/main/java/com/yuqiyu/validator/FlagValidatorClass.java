package com.yuqiyu.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Administrator on 2018/4/17/017.
 */
public class FlagValidatorClass implements ConstraintValidator<FlagValidator, Object> {
    private String values;

    @Override
    public void initialize(FlagValidator constraintAnnotation) {
        this.values = constraintAnnotation.values();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        String[] value_array = values.split(",");
        boolean isFlag = false;
        for (String value : value_array) {
            if (value.equals(o)) {
                isFlag = true;
                break;
            }
        }
        return isFlag;
    }
}
