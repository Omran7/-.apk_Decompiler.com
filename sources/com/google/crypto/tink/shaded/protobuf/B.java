package com.google.crypto.tink.shaded.protobuf;

import E2.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class B {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f6742a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6743b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6743b = bArr;
        ByteBuffer.wrap(bArr);
        d.h(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }
}
