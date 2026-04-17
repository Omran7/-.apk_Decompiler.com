package a4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: a4.b  reason: case insensitive filesystem */
public @interface C0263b {
    String[] alternate() default {};

    String value();
}
