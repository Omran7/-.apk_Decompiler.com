package W0;

import G5.C;
import G5.C0034h0;
import G5.F;
import G5.N;
import G5.k0;
import G5.v0;
import I5.o;
import K5.e;
import R2.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.j;
import m5.C0849h;
import o5.d;
import o5.i;
import p5.a;
import q5.h;

/* renamed from: W0.e  reason: case insensitive filesystem */
public final class C0233e implements C {

    /* renamed from: A  reason: collision with root package name */
    public final int f3923A;

    /* renamed from: B  reason: collision with root package name */
    public final Uri f3924B;

    /* renamed from: C  reason: collision with root package name */
    public v0 f3925C = new k0((C0034h0) null);

    /* renamed from: a  reason: collision with root package name */
    public final Context f3926a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f3927b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f3928c;
    public final Bitmap d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f3929e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3930f;

    /* renamed from: p  reason: collision with root package name */
    public final int f3931p;

    /* renamed from: q  reason: collision with root package name */
    public final int f3932q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f3933r;

    /* renamed from: s  reason: collision with root package name */
    public final int f3934s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3935t;

    /* renamed from: u  reason: collision with root package name */
    public final int f3936u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3937v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f3938w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f3939x;

    /* renamed from: y  reason: collision with root package name */
    public final G f3940y;

    /* renamed from: z  reason: collision with root package name */
    public final Bitmap.CompressFormat f3941z;

    public C0233e(Context context, WeakReference weakReference, Uri uri, Bitmap bitmap, float[] fArr, int i2, int i5, int i6, boolean z3, int i7, int i8, int i9, int i10, boolean z4, boolean z5, G g, Bitmap.CompressFormat compressFormat, int i11, Uri uri2) {
        G g5 = g;
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        j.e(fArr, "cropPoints");
        j.e(g5, "options");
        j.e(compressFormat2, "saveCompressFormat");
        this.f3926a = context;
        this.f3927b = weakReference;
        this.f3928c = uri;
        this.d = bitmap;
        this.f3929e = fArr;
        this.f3930f = i2;
        this.f3931p = i5;
        this.f3932q = i6;
        this.f3933r = z3;
        this.f3934s = i7;
        this.f3935t = i8;
        this.f3936u = i9;
        this.f3937v = i10;
        this.f3938w = z4;
        this.f3939x = z5;
        this.f3940y = g5;
        this.f3941z = compressFormat2;
        this.f3923A = i11;
        this.f3924B = uri2;
    }

    public static final Object a(C0233e eVar, C0229a aVar, h hVar) {
        e eVar2 = N.f877a;
        Object w6 = F.w(o.f1276a, new C0230b(eVar, aVar, (d) null), hVar);
        if (w6 == a.f11033a) {
            return w6;
        }
        return C0849h.f10203c;
    }

    public final i b() {
        e eVar = N.f877a;
        H5.e eVar2 = o.f1276a;
        v0 v0Var = this.f3925C;
        eVar2.getClass();
        return b.v0(eVar2, v0Var);
    }
}
