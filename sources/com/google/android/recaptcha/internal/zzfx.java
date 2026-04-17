package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;
import m5.C0849h;

public abstract class zzfx implements InvocationHandler {
    private final Object zza;

    public zzfx(Object obj) {
        this.zza = obj;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        int i2;
        if (j.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (j.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (!j.a(method.getName(), "equals") || method.getParameterTypes().length == 0) {
            boolean zza2 = zza(obj, method, objArr);
            C0849h hVar = C0849h.f10203c;
            if (!zza2) {
                return hVar;
            }
            if ((this.zza != null || !j.a(method.getReturnType(), Void.TYPE)) && ((obj2 = this.zza) == null || !j.a(zzkm.zza(obj2.getClass()), zzkm.zza(method.getReturnType())))) {
                throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
            }
            Object obj3 = this.zza;
            if (obj3 == null) {
                return hVar;
            }
            return obj3;
        }
        boolean z3 = false;
        if (!(objArr == null || objArr.length == 0)) {
            Object obj4 = objArr[0];
            if (obj4 != null) {
                i2 = obj4.hashCode();
            } else {
                i2 = 0;
            }
            if (i2 == obj.hashCode()) {
                z3 = true;
            }
        }
        return Boolean.valueOf(z3);
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
