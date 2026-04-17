package a4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: a4.a  reason: case insensitive filesystem */
public @interface C0262a {
    boolean nullSafe() default true;

    Class value();
}
