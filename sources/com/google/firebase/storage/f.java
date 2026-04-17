package com.google.firebase.storage;

import A4.a;
import B0.C0009h;
import H.j;
import R2.i;
import V3.e;
import android.net.Uri;
import android.text.TextUtils;
import b3.b;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0524a;

public final class f implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f6922a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6923b;

    public f(Uri uri, c cVar) {
        boolean z3;
        boolean z4 = false;
        if (uri != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("storageUri cannot be null", z3);
        I.a("FirebaseApp cannot be null", cVar != null ? true : z4);
        this.f6922a = uri;
        this.f6923b = cVar;
    }

    public final f a(String str) {
        String str2;
        I.a("childName cannot be null or empty", !TextUtils.isEmpty(str));
        String f02 = c.f0(str);
        Uri.Builder buildUpon = this.f6922a.buildUpon();
        if (TextUtils.isEmpty(f02)) {
            str2 = "";
        } else {
            String encode = Uri.encode(f02);
            I.g(encode);
            str2 = encode.replace("%2F", "/");
        }
        return new f(buildUpon.appendEncodedPath(str2).build(), this.f6923b);
    }

    public final int compareTo(Object obj) {
        return this.f6922a.compareTo(((f) obj).f6922a);
    }

    public final Task e() {
        boolean z3;
        C0524a aVar;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j jVar = new j(14);
        jVar.f985b = this;
        jVar.f986c = taskCompletionSource;
        Uri uri = this.f6922a;
        Uri build = uri.buildUpon().path("").build();
        boolean z4 = false;
        if (build != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("storageUri cannot be null", z3);
        c cVar = this.f6923b;
        if (cVar != null) {
            z4 = true;
        }
        I.a("FirebaseApp cannot be null", z4);
        String path = build.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            path = path.substring(lastIndexOf + 1);
        }
        String path2 = uri.getPath();
        int lastIndexOf2 = path2.lastIndexOf(47);
        if (lastIndexOf2 != -1) {
            path2 = path2.substring(lastIndexOf2 + 1);
        }
        if (!path.equals(path2)) {
            i iVar = cVar.f6915a;
            iVar.b();
            b bVar = null;
            K3.b bVar2 = cVar.f6916b;
            if (bVar2 != null) {
                aVar = (C0524a) bVar2.get();
            } else {
                aVar = null;
            }
            K3.b bVar3 = cVar.f6917c;
            if (bVar3 != null) {
                bVar = (b) bVar3.get();
            }
            jVar.d = new e(iVar.f2490a, aVar, bVar, 120000);
            c.f5733a.execute(jVar);
            return taskCompletionSource.getTask();
        }
        throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return ((f) obj).toString().equals(toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final C0009h j() {
        this.f6923b.getClass();
        return new C0009h(this.f6922a);
    }

    public final q k(byte[] bArr) {
        boolean z3;
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("bytes cannot be null", z3);
        q qVar = new q(this, bArr);
        if (qVar.g(2)) {
            c.f5734b.execute(new a(qVar, 10));
        }
        return qVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("gs://");
        Uri uri = this.f6922a;
        sb.append(uri.getAuthority());
        sb.append(uri.getEncodedPath());
        return sb.toString();
    }
}
