package com.yuqiyu.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/4/17/017.
 */
@Documented
@Constraint(
        validatedBy = FlagValidatorClass.class
)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FlagValidator {
    String values();

    String message() default "not in value list";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
