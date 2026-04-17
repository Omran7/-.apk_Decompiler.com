package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a  reason: case insensitive filesystem */
public abstract class C0396a implements S {
    protected int memoizedHashCode;

    public abstract int b(d0 d0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract C0416v d();

    public final byte[] e() {
        try {
            int b6 = ((C0418x) this).b((d0) null);
            byte[] bArr = new byte[b6];
            C0408m mVar = new C0408m(bArr, b6);
            f(mVar);
            if (b6 - mVar.f6837s == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e6) {
            throw new RuntimeException(c("byte array"), e6);
        }
    }

    public abstract void f(C0408m mVar);
}
