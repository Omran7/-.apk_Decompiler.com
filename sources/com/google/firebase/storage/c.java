package com.google.firebase.storage;

import K3.b;
import R2.i;
import R2.m;
import Z2.e;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.I;
import java.io.UnsupportedEncodingException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final i f6915a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6916b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6917c;
    public final String d;

    /* JADX WARNING: type inference failed for: r2v1, types: [b3.a, java.lang.Object] */
    public c(String str, i iVar, b bVar, b bVar2) {
        this.d = str;
        this.f6915a = iVar;
        this.f6916b = bVar;
        this.f6917c = bVar2;
        if (bVar2 != null && bVar2.get() != null) {
            ((e) ((b3.b) bVar2.get())).a(new Object());
        }
    }

    public static c a() {
        i e6 = i.e();
        e6.b();
        m mVar = e6.f2492c;
        String str = mVar.f2504f;
        if (str == null) {
            return b(e6, (Uri) null);
        }
        try {
            StringBuilder sb = new StringBuilder("gs://");
            e6.b();
            sb.append(mVar.f2504f);
            return b(e6, d.S0(sb.toString()));
        } catch (UnsupportedEncodingException e7) {
            Log.e("FirebaseStorage", "Unable to parse bucket:".concat(str), e7);
            throw new IllegalArgumentException("The storage Uri could not be parsed.");
        }
    }

    public static c b(i iVar, Uri uri) {
        String str;
        c cVar;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (uri == null || TextUtils.isEmpty(uri.getPath())) {
            d dVar = (d) iVar.c(d.class);
            I.h(dVar, "Firebase Storage component is not present.");
            synchronized (dVar) {
                cVar = (c) dVar.f6918a.get(str);
                if (cVar == null) {
                    cVar = new c(str, dVar.f6919b, dVar.f6920c, dVar.d);
                    dVar.f6918a.put(str, cVar);
                }
            }
            return cVar;
        }
        throw new IllegalArgumentException("The storage Uri cannot contain a path element.");
    }

    public final f c() {
        boolean z3;
        String str = this.d;
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().scheme("gs").authority(str).path("/").build();
            I.h(build, "uri must not be null");
            if (TextUtils.isEmpty(str) || build.getAuthority().equalsIgnoreCase(str)) {
                z3 = true;
            } else {
                z3 = false;
            }
            I.a("The supplied bucketname does not match the storage bucket of the current instance.", z3);
            return new f(build, this);
        }
        throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
    }
}
