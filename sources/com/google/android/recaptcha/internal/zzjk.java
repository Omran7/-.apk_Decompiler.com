package com.google.android.recaptcha.internal;

public abstract class zzjk implements Iterable {
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z3 = true;
        for (Object append : this) {
            if (!z3) {
                sb.append(", ");
            }
            sb.append(append);
            z3 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
