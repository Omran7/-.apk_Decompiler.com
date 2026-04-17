package com.google.android.gms.common.internal;

import V1.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n.e;
import o3.d;

/* renamed from: com.google.android.gms.common.internal.i  reason: case insensitive filesystem */
public final class C0380i {

    /* renamed from: a  reason: collision with root package name */
    public final Set f6173a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f6174b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f6175c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6176e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6177f;
    public Integer g;

    public C0380i(Set set, e eVar, String str, String str2, a aVar) {
        Set set2;
        if (set == null) {
            set2 = Collections.emptySet();
        } else {
            set2 = Collections.unmodifiableSet(set);
        }
        this.f6173a = set2;
        Map emptyMap = eVar == null ? Collections.emptyMap() : eVar;
        this.f6175c = emptyMap;
        this.d = str;
        this.f6176e = str2;
        this.f6177f = aVar == null ? a.f3759a : aVar;
        HashSet hashSet = new HashSet(set2);
        Iterator it2 = emptyMap.values().iterator();
        if (!it2.hasNext()) {
            this.f6174b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw d.e(it2);
    }
}
