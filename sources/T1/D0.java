package T1;

import A1.a;
import G1.b;
import G1.c;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzbn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import z1.i;
import z1.j;

public final class D0 extends zzbn implements J {

    /* renamed from: a  reason: collision with root package name */
    public final T1 f2818a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f2819b;

    /* renamed from: c  reason: collision with root package name */
    public String f2820c = null;

    public D0(T1 t12) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        I.g(t12);
        this.f2818a = t12;
    }

    public final List A(String str, String str2, String str3, boolean z3) {
        B(str, true);
        T1 t12 = this.f2818a;
        try {
            List<X1> list = (List) t12.f().u(new B0(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (X1 x12 : list) {
                if (!z3) {
                    if (!Y1.i0(x12.f3153c)) {
                    }
                }
                arrayList.add(new W1(x12));
            }
            return arrayList;
        } catch (InterruptedException e6) {
            e = e6;
            Z c3 = t12.c();
            c3.f3172f.c("Failed to get user properties as. appId", Z.w(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e7) {
            e = e7;
            Z c32 = t12.c();
            c32.f3172f.c("Failed to get user properties as. appId", Z.w(str), e);
            return Collections.emptyList();
        }
    }

    public final void B(String str, boolean z3) {
        boolean isEmpty = TextUtils.isEmpty(str);
        T1 t12 = this.f2818a;
        if (!isEmpty) {
            if (z3) {
                try {
                    if (this.f2819b == null) {
                        boolean z4 = true;
                        if (!"com.google.android.gms".equals(this.f2820c) && !c.e(t12.f3070u.f3489a, Binder.getCallingUid())) {
                            if (!j.b(t12.f3070u.f3489a).c(Binder.getCallingUid())) {
                                z4 = false;
                            }
                        }
                        this.f2819b = Boolean.valueOf(z4);
                    }
                    if (this.f2819b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e6) {
                    Z c3 = t12.c();
                    c3.f3172f.b(Z.w(str), "Measurement Service called with invalid calling package. appId");
                    throw e6;
                }
            }
            if (this.f2820c == null) {
                Context context = t12.f3070u.f3489a;
                int callingUid = Binder.getCallingUid();
                AtomicBoolean atomicBoolean = i.f12814a;
                if (c.g(callingUid, context, str)) {
                    this.f2820c = str;
                }
            }
            if (!str.equals(this.f2820c)) {
                throw new SecurityException("Unknown calling package name '" + str + "'.");
            }
            return;
        }
        t12.c().f3172f.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void C(C0214v vVar, Z1 z12) {
        T1 t12 = this.f2818a;
        t12.j();
        t12.q(vVar, z12);
    }

    public final void a(Runnable runnable) {
        T1 t12 = this.f2818a;
        if (t12.f().A()) {
            runnable.run();
        } else {
            t12.f().z(runnable);
        }
    }

    public final void b(Runnable runnable) {
        T1 t12 = this.f2818a;
        if (t12.f().A()) {
            runnable.run();
        } else {
            t12.f().y(runnable);
        }
    }

    public final void c(W1 w12, Z1 z12) {
        I.g(w12);
        j(z12);
        b(new H.j(this, w12, z12, 6, false));
    }

    public final byte[] d(C0214v vVar, String str) {
        I.d(str);
        I.g(vVar);
        B(str, true);
        T1 t12 = this.f2818a;
        Z c3 = t12.c();
        C0212u0 u0Var = t12.f3070u;
        S s6 = u0Var.f3500v;
        String str2 = vVar.f3508a;
        c3.f3179v.b(s6.d(str2), "Log and bundle. event");
        ((b) t12.g()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) t12.f().v(new C0186l0(this, vVar, str)).get();
            if (bArr == null) {
                t12.c().f3172f.b(Z.w(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((b) t12.g()).getClass();
            t12.c().f3179v.d("Log and bundle processed. event, size, time_ms", u0Var.f3500v.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e6) {
            e = e6;
            Z c6 = t12.c();
            c6.f3172f.d("Failed to log and bundle. appId, event, error", Z.w(str), u0Var.f3500v.d(str2), e);
            return null;
        } catch (ExecutionException e7) {
            e = e7;
            Z c62 = t12.c();
            c62.f3172f.d("Failed to log and bundle. appId, event, error", Z.w(str), u0Var.f3500v.d(str2), e);
            return null;
        }
    }

    public final void e(Z1 z12) {
        I.d(z12.f3201a);
        I.g(z12.f3189D);
        a(new C0218w0(this, z12, 0));
    }

    public final List f(String str, String str2, boolean z3, Z1 z12) {
        j(z12);
        String str3 = z12.f3201a;
        I.g(str3);
        T1 t12 = this.f2818a;
        try {
            List<X1> list = (List) t12.f().u(new B0(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (X1 x12 : list) {
                if (!z3) {
                    if (!Y1.i0(x12.f3153c)) {
                    }
                }
                arrayList.add(new W1(x12));
            }
            return arrayList;
        } catch (InterruptedException e6) {
            e = e6;
            Z c3 = t12.c();
            c3.f3172f.c("Failed to query user properties. appId", Z.w(str3), e);
            return Collections.emptyList();
        } catch (ExecutionException e7) {
            e = e7;
            Z c32 = t12.c();
            c32.f3172f.c("Failed to query user properties. appId", Z.w(str3), e);
            return Collections.emptyList();
        }
    }

    public final String g(Z1 z12) {
        j(z12);
        T1 t12 = this.f2818a;
        try {
            return (String) t12.f().u(new C0224y0(t12, z12, 2)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            Z c3 = t12.c();
            c3.f3172f.c("Failed to get app instance id. appId", Z.w(z12.f3201a), e6);
            return null;
        }
    }

    public final void h(C0164e eVar, Z1 z12) {
        I.g(eVar);
        I.g(eVar.f3273c);
        j(z12);
        C0164e eVar2 = new C0164e(eVar);
        eVar2.f3271a = z12.f3201a;
        b(new H.j(this, eVar2, z12, 3, false));
    }

    public final void i(Z1 z12) {
        String str = z12.f3201a;
        I.d(str);
        B(str, false);
        b(new C0218w0(this, z12, 5));
    }

    public final void j(Z1 z12) {
        I.g(z12);
        String str = z12.f3201a;
        I.d(str);
        B(str, false);
        this.f2818a.e().X(z12.f3202b, z12.f3215y);
    }

    public final void k(Z1 z12) {
        j(z12);
        b(new C0218w0(this, z12, 2));
    }

    public final void l(Z1 z12, M1 m12, N n2) {
        T1 t12 = this.f2818a;
        if (!t12.h0().B((String) null, H.f2872P0)) {
            try {
                n2.x(new N1(Collections.emptyList()));
                t12.c().f3180w.a("[sgtm] Client upload is not enabled on the service side.");
            } catch (RemoteException e6) {
                t12.c().f3175r.b(e6, "[sgtm] UploadBatchesCallback failed.");
            }
        } else {
            j(z12);
            String str = z12.f3201a;
            I.g(str);
            t12.f().y(new C0221x0((Object) this, (Serializable) str, (a) m12, (Object) n2, 0));
        }
    }

    public final void m(Z1 z12, Bundle bundle, L l6) {
        j(z12);
        String str = z12.f3201a;
        I.g(str);
        this.f2818a.f().y(new C0215v0(this, z12, bundle, l6, str));
    }

    public final void n(Z1 z12) {
        I.d(z12.f3201a);
        I.g(z12.f3189D);
        a(new C0218w0(this, z12, 6));
    }

    public final C0176i o(Z1 z12) {
        j(z12);
        String str = z12.f3201a;
        I.d(str);
        T1 t12 = this.f2818a;
        try {
            return (C0176i) t12.f().v(new C0224y0(this, z12, 1)).get(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            Z c3 = t12.c();
            c3.f3172f.c("Failed to get consent. appId", Z.w(str), e6);
            return new C0176i((Bundle) null);
        }
    }

    public final void p(C0214v vVar, Z1 z12) {
        I.g(vVar);
        j(z12);
        b(new H.j(this, vVar, z12, 4, false));
    }

    public final void q(Z1 z12) {
        j(z12);
        b(new C0218w0(this, z12, 3));
    }

    public final List r(String str, String str2, String str3) {
        B(str, true);
        T1 t12 = this.f2818a;
        try {
            return (List) t12.f().u(new B0(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e6) {
            t12.c().f3172f.b(e6, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    public final void s(Z1 z12) {
        j(z12);
        b(new C0218w0(this, z12, 4));
    }

    public final void t(Z1 z12, C0161d dVar) {
        if (this.f2818a.h0().B((String) null, H.f2872P0)) {
            j(z12);
            b(new H.j((Object) this, (Object) z12, (Object) dVar, 2));
        }
    }

    public final void u(Z1 z12, Bundle bundle) {
        j(z12);
        String str = z12.f3201a;
        I.g(str);
        b(new C0221x0(this, bundle, str, z12));
    }

    public final List v(String str, String str2, Z1 z12) {
        j(z12);
        String str3 = z12.f3201a;
        I.g(str3);
        T1 t12 = this.f2818a;
        try {
            return (List) t12.f().u(new B0(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e6) {
            t12.c().f3172f.b(e6, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    public final void y(long j6, String str, String str2, String str3) {
        b(new C0227z0(this, str2, str3, str, j6, 0));
    }

    public final void z(Z1 z12) {
        I.d(z12.f3201a);
        I.g(z12.f3189D);
        a(new C0218w0(this, z12, 1));
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v14, types: [T1.N] */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v19, types: [T1.L] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        /*
            r9 = this;
            T1.T1 r13 = r9.f2818a
            r0 = 0
            r1 = 0
            r2 = 1
            switch(r10) {
                case 1: goto L_0x03ab;
                case 2: goto L_0x0391;
                case 3: goto L_0x0008;
                case 4: goto L_0x037f;
                case 5: goto L_0x0353;
                case 6: goto L_0x0341;
                case 7: goto L_0x02cc;
                case 8: goto L_0x0008;
                case 9: goto L_0x02b1;
                case 10: goto L_0x0295;
                case 11: goto L_0x027e;
                case 12: goto L_0x0263;
                case 13: goto L_0x0231;
                case 14: goto L_0x020e;
                case 15: goto L_0x01ef;
                case 16: goto L_0x01d0;
                case 17: goto L_0x01b5;
                case 18: goto L_0x01a2;
                case 19: goto L_0x0187;
                case 20: goto L_0x0174;
                case 21: goto L_0x0153;
                case 22: goto L_0x0008;
                case 23: goto L_0x0008;
                case 24: goto L_0x00c9;
                case 25: goto L_0x00b6;
                case 26: goto L_0x00a3;
                case 27: goto L_0x0090;
                case 28: goto L_0x0008;
                case 29: goto L_0x005a;
                case 30: goto L_0x003f;
                case 31: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r1
        L_0x0009:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            android.os.Parcelable$Creator r13 = android.os.Bundle.CREATOR
            android.os.Parcelable r13 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r13)
            android.os.Bundle r13 = (android.os.Bundle) r13
            android.os.IBinder r1 = r11.readStrongBinder()
            if (r1 != 0) goto L_0x0020
            goto L_0x0034
        L_0x0020:
            java.lang.String r0 = "com.google.android.gms.measurement.internal.ITriggerUrisCallback"
            android.os.IInterface r3 = r1.queryLocalInterface(r0)
            boolean r4 = r3 instanceof T1.L
            if (r4 == 0) goto L_0x002e
            r0 = r3
            T1.L r0 = (T1.L) r0
            goto L_0x0034
        L_0x002e:
            T1.K r3 = new T1.K
            r3.<init>(r1, r0)
            r0 = r3
        L_0x0034:
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.m(r10, r13, r0)
            r12.writeNoException()
            goto L_0x03c4
        L_0x003f:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            android.os.Parcelable$Creator<T1.d> r13 = T1.C0161d.CREATOR
            android.os.Parcelable r13 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r13)
            T1.d r13 = (T1.C0161d) r13
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.t(r10, r13)
            r12.writeNoException()
            goto L_0x03c4
        L_0x005a:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            android.os.Parcelable$Creator<T1.M1> r13 = T1.M1.CREATOR
            android.os.Parcelable r13 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r13)
            T1.M1 r13 = (T1.M1) r13
            android.os.IBinder r1 = r11.readStrongBinder()
            if (r1 != 0) goto L_0x0071
            goto L_0x0085
        L_0x0071:
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IUploadBatchesCallback"
            android.os.IInterface r3 = r1.queryLocalInterface(r0)
            boolean r4 = r3 instanceof T1.N
            if (r4 == 0) goto L_0x007f
            r0 = r3
            T1.N r0 = (T1.N) r0
            goto L_0x0085
        L_0x007f:
            T1.M r3 = new T1.M
            r3.<init>(r1, r0)
            r0 = r3
        L_0x0085:
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.l(r10, r13, r0)
            r12.writeNoException()
            goto L_0x03c4
        L_0x0090:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.q(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x00a3:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.z(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x00b6:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.e(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x00c9:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.j(r10)
            java.lang.String r11 = r10.f3201a
            com.google.android.gms.common.internal.I.g(r11)
            T1.g r3 = r13.h0()
            T1.G r4 = T1.H.f2911h1
            boolean r0 = r3.B(r0, r4)
            java.lang.String r3 = "Failed to get trigger URIs. appId"
            if (r0 == 0) goto L_0x0122
            T1.r0 r0 = r13.f()
            T1.C0 r4 = new T1.C0
            r5 = 0
            r4.<init>(r9, r10, r1, r5)
            T1.p0 r10 = r0.v(r4)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x010f, InterruptedException -> 0x010d, ExecutionException -> 0x010b }
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r10 = r10.get(r4, r0)     // Catch:{ TimeoutException -> 0x010f, InterruptedException -> 0x010d, ExecutionException -> 0x010b }
            java.util.List r10 = (java.util.List) r10     // Catch:{ TimeoutException -> 0x010f, InterruptedException -> 0x010d, ExecutionException -> 0x010b }
            goto L_0x014b
        L_0x010b:
            r10 = move-exception
            goto L_0x0110
        L_0x010d:
            r10 = move-exception
            goto L_0x0110
        L_0x010f:
            r10 = move-exception
        L_0x0110:
            T1.Z r13 = r13.c()
            T1.Y r11 = T1.Z.w(r11)
            T1.X r13 = r13.f3172f
            r13.c(r3, r11, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x014b
        L_0x0122:
            T1.r0 r0 = r13.f()
            T1.C0 r4 = new T1.C0
            r5 = 1
            r4.<init>(r9, r10, r1, r5)
            T1.p0 r10 = r0.u(r4)
            java.lang.Object r10 = r10.get()     // Catch:{ InterruptedException -> 0x0139, ExecutionException -> 0x0137 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ InterruptedException -> 0x0139, ExecutionException -> 0x0137 }
            goto L_0x014b
        L_0x0137:
            r10 = move-exception
            goto L_0x013a
        L_0x0139:
            r10 = move-exception
        L_0x013a:
            T1.Z r13 = r13.c()
            T1.Y r11 = T1.Z.w(r11)
            T1.X r13 = r13.f3172f
            r13.c(r3, r11, r10)
            java.util.List r10 = java.util.Collections.emptyList()
        L_0x014b:
            r12.writeNoException()
            r12.writeTypedList(r10)
            goto L_0x03c4
        L_0x0153:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            T1.i r10 = r9.o(r10)
            r12.writeNoException()
            if (r10 != 0) goto L_0x016c
            r12.writeInt(r1)
            goto L_0x03c4
        L_0x016c:
            r12.writeInt(r2)
            r10.writeToParcel(r12, r2)
            goto L_0x03c4
        L_0x0174:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.n(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x0187:
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            android.os.Bundle r10 = (android.os.Bundle) r10
            android.os.Parcelable$Creator<T1.Z1> r13 = T1.Z1.CREATOR
            android.os.Parcelable r13 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r13)
            T1.Z1 r13 = (T1.Z1) r13
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.u(r13, r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x01a2:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.i(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x01b5:
            java.lang.String r10 = r11.readString()
            java.lang.String r13 = r11.readString()
            java.lang.String r0 = r11.readString()
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            java.util.List r10 = r9.r(r10, r13, r0)
            r12.writeNoException()
            r12.writeTypedList(r10)
            goto L_0x03c4
        L_0x01d0:
            java.lang.String r10 = r11.readString()
            java.lang.String r13 = r11.readString()
            android.os.Parcelable$Creator<T1.Z1> r0 = T1.Z1.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r0)
            T1.Z1 r0 = (T1.Z1) r0
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            java.util.List r10 = r9.v(r10, r13, r0)
            r12.writeNoException()
            r12.writeTypedList(r10)
            goto L_0x03c4
        L_0x01ef:
            java.lang.String r10 = r11.readString()
            java.lang.String r13 = r11.readString()
            java.lang.String r0 = r11.readString()
            boolean r1 = com.google.android.gms.internal.measurement.zzbo.zzf(r11)
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            java.util.List r10 = r9.A(r10, r13, r0, r1)
            r12.writeNoException()
            r12.writeTypedList(r10)
            goto L_0x03c4
        L_0x020e:
            java.lang.String r10 = r11.readString()
            java.lang.String r13 = r11.readString()
            boolean r0 = com.google.android.gms.internal.measurement.zzbo.zzf(r11)
            android.os.Parcelable$Creator<T1.Z1> r1 = T1.Z1.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r1)
            T1.Z1 r1 = (T1.Z1) r1
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            java.util.List r10 = r9.f(r10, r13, r0, r1)
            r12.writeNoException()
            r12.writeTypedList(r10)
            goto L_0x03c4
        L_0x0231:
            android.os.Parcelable$Creator<T1.e> r10 = T1.C0164e.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.e r10 = (T1.C0164e) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            com.google.android.gms.common.internal.I.g(r10)
            T1.W1 r11 = r10.f3273c
            com.google.android.gms.common.internal.I.g(r11)
            java.lang.String r11 = r10.f3271a
            com.google.android.gms.common.internal.I.d(r11)
            java.lang.String r11 = r10.f3271a
            r9.B(r11, r2)
            T1.e r11 = new T1.e
            r11.<init>(r10)
            B2.a r10 = new B2.a
            r13 = 10
            r0 = 0
            r10.<init>(r9, r11, r13, r0)
            r9.b(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x0263:
            android.os.Parcelable$Creator<T1.e> r10 = T1.C0164e.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.e r10 = (T1.C0164e) r10
            android.os.Parcelable$Creator<T1.Z1> r13 = T1.Z1.CREATOR
            android.os.Parcelable r13 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r13)
            T1.Z1 r13 = (T1.Z1) r13
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.h(r10, r13)
            r12.writeNoException()
            goto L_0x03c4
        L_0x027e:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            java.lang.String r10 = r9.g(r10)
            r12.writeNoException()
            r12.writeString(r10)
            goto L_0x03c4
        L_0x0295:
            long r4 = r11.readLong()
            java.lang.String r6 = r11.readString()
            java.lang.String r7 = r11.readString()
            java.lang.String r8 = r11.readString()
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r3 = r9
            r3.y(r4, r6, r7, r8)
            r12.writeNoException()
            goto L_0x03c4
        L_0x02b1:
            android.os.Parcelable$Creator<T1.v> r10 = T1.C0214v.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.v r10 = (T1.C0214v) r10
            java.lang.String r13 = r11.readString()
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            byte[] r10 = r9.d(r10, r13)
            r12.writeNoException()
            r12.writeByteArray(r10)
            goto L_0x03c4
        L_0x02cc:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            boolean r1 = com.google.android.gms.internal.measurement.zzbo.zzf(r11)
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.j(r10)
            java.lang.String r10 = r10.f3201a
            com.google.android.gms.common.internal.I.g(r10)
            T1.r0 r11 = r13.f()
            T1.y0 r3 = new T1.y0
            r4 = 0
            r3.<init>(r9, r10, r4)
            T1.p0 r11 = r11.u(r3)
            java.lang.Object r11 = r11.get()     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            java.util.List r11 = (java.util.List) r11     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            int r4 = r11.size()     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            r3.<init>(r4)     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
        L_0x0304:
            boolean r4 = r11.hasNext()     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            if (r4 == 0) goto L_0x0328
            java.lang.Object r4 = r11.next()     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            T1.X1 r4 = (T1.X1) r4     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            if (r1 != 0) goto L_0x031f
            java.lang.String r5 = r4.f3153c     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            boolean r5 = T1.Y1.i0(r5)     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            if (r5 != 0) goto L_0x0304
            goto L_0x031f
        L_0x031b:
            r11 = move-exception
            goto L_0x032a
        L_0x031d:
            r11 = move-exception
            goto L_0x032a
        L_0x031f:
            T1.W1 r5 = new T1.W1     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            r5.<init>(r4)     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            r3.add(r5)     // Catch:{ InterruptedException -> 0x031d, ExecutionException -> 0x031b }
            goto L_0x0304
        L_0x0328:
            r0 = r3
            goto L_0x0339
        L_0x032a:
            T1.Z r13 = r13.c()
            T1.Y r10 = T1.Z.w(r10)
            java.lang.String r1 = "Failed to get user properties. appId"
            T1.X r13 = r13.f3172f
            r13.c(r1, r10, r11)
        L_0x0339:
            r12.writeNoException()
            r12.writeTypedList(r0)
            goto L_0x03c4
        L_0x0341:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.s(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x0353:
            android.os.Parcelable$Creator<T1.v> r10 = T1.C0214v.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            r5 = r10
            T1.v r5 = (T1.C0214v) r5
            java.lang.String r6 = r11.readString()
            r11.readString()
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            com.google.android.gms.common.internal.I.g(r5)
            com.google.android.gms.common.internal.I.d(r6)
            r9.B(r6, r2)
            H.j r10 = new H.j
            r7 = 5
            r8 = 0
            r3 = r10
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r9.b(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x037f:
            android.os.Parcelable$Creator<T1.Z1> r10 = T1.Z1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.Z1 r10 = (T1.Z1) r10
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.k(r10)
            r12.writeNoException()
            goto L_0x03c4
        L_0x0391:
            android.os.Parcelable$Creator<T1.W1> r10 = T1.W1.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.W1 r10 = (T1.W1) r10
            android.os.Parcelable$Creator<T1.Z1> r13 = T1.Z1.CREATOR
            android.os.Parcelable r13 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r13)
            T1.Z1 r13 = (T1.Z1) r13
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.c(r10, r13)
            r12.writeNoException()
            goto L_0x03c4
        L_0x03ab:
            android.os.Parcelable$Creator<T1.v> r10 = T1.C0214v.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r10)
            T1.v r10 = (T1.C0214v) r10
            android.os.Parcelable$Creator<T1.Z1> r13 = T1.Z1.CREATOR
            android.os.Parcelable r13 = com.google.android.gms.internal.measurement.zzbo.zza(r11, r13)
            T1.Z1 r13 = (T1.Z1) r13
            com.google.android.gms.internal.measurement.zzbo.zzc(r11)
            r9.p(r10, r13)
            r12.writeNoException()
        L_0x03c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.D0.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
