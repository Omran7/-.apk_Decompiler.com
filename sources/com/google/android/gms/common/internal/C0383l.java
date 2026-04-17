package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import z1.d;

/* renamed from: com.google.android.gms.common.internal.l  reason: case insensitive filesystem */
public abstract class C0383l extends C0377f implements g {
    private static volatile Executor zaa;
    private final C0380i zab;
    private final Set zac;
    private final Account zad = null;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0383l(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C0380i r13, com.google.android.gms.common.api.internal.C0353g r14, com.google.android.gms.common.api.internal.r r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.U r3 = com.google.android.gms.common.internal.C0384m.a(r10)
            z1.e r4 = z1.e.d
            com.google.android.gms.common.internal.I.g(r14)
            com.google.android.gms.common.internal.I.g(r15)
            com.google.android.gms.common.internal.t r6 = new com.google.android.gms.common.internal.t
            r6.<init>(r14)
            com.google.android.gms.common.internal.t r7 = new com.google.android.gms.common.internal.t
            r7.<init>(r15)
            java.lang.String r8 = r13.f6176e
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.zab = r13
            r10 = 0
            r9.zad = r10
            java.util.Set r10 = r13.f6174b
            java.util.Set r11 = r9.validateScopes(r10)
            java.util.Iterator r12 = r11.iterator()
        L_0x002e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0049
            java.lang.Object r13 = r12.next()
            com.google.android.gms.common.api.Scope r13 = (com.google.android.gms.common.api.Scope) r13
            boolean r13 = r10.contains(r13)
            if (r13 == 0) goto L_0x0041
            goto L_0x002e
        L_0x0041:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x0049:
            r9.zac = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0383l.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.i, com.google.android.gms.common.api.internal.g, com.google.android.gms.common.api.internal.r):void");
    }

    public final Account getAccount() {
        return this.zad;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public final C0380i getClientSettings() {
        return this.zab;
    }

    public d[] getRequiredFeatures() {
        return new d[0];
    }

    public final Set<Scope> getScopes() {
        return this.zac;
    }

    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
