package B0;

import C2.f;
import C2.h;
import C2.l;
import D2.k;
import D2.n;
import D2.q;
import D2.r;
import F3.p;
import I0.C0057d;
import I0.y;
import I2.b;
import J.c;
import J2.i;
import J2.o;
import K2.e;
import N0.a;
import O2.N;
import O2.f0;
import O2.g0;
import O2.r0;
import P.g;
import P2.j;
import S3.z;
import T1.B;
import T1.C0156b0;
import T1.C0163d1;
import T1.C0212u0;
import T1.U;
import a3.C0261a;
import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.view.KeyEvent;
import androidx.emoji2.text.d;
import androidx.emoji2.text.t;
import androidx.emoji2.text.u;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.J;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import c0.C0335a;
import c0.C0336b;
import c0.C0337c;
import com.google.android.gms.common.internal.C0389s;
import com.google.android.gms.common.internal.C0392v;
import com.google.android.gms.common.internal.C0393w;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.D;
import com.google.firebase.messaging.FirebaseMessagingService;
import h0.C0552a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.C0738t;

/* renamed from: B0.h  reason: case insensitive filesystem */
public final class C0009h implements a, g, N2.a, C0163d1, C0156b0 {

    /* renamed from: e  reason: collision with root package name */
    public static C0009h f226e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f227a;

    /* renamed from: b  reason: collision with root package name */
    public Object f228b;

    /* renamed from: c  reason: collision with root package name */
    public Object f229c;
    public Object d;

    public /* synthetic */ C0009h(int i2) {
        this.f227a = i2;
    }

    /* JADX INFO: finally extract failed */
    public static final C0009h C(f fVar, b bVar) {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) fVar.f440b;
        try {
            N C6 = N.C(byteArrayInputStream, C0411p.a());
            byteArrayInputStream.close();
            if (C6.A().size() != 0) {
                try {
                    g0 G6 = g0.G(bVar.b(C6.A().x(), bArr), C0411p.a());
                    if (G6.B() > 0) {
                        return u(G6);
                    }
                    throw new GeneralSecurityException("empty keyset");
                } catch (D unused) {
                    throw new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            } else {
                throw new GeneralSecurityException("empty keyset");
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static boolean s(Editable editable, KeyEvent keyEvent, boolean z3) {
        u[] uVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) == null || uVarArr.length <= 0)) {
            int length = uVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                u uVar = uVarArr[i2];
                int spanStart = editable.getSpanStart(uVar);
                int spanEnd = editable.getSpanEnd(uVar);
                if ((!z3 || spanStart != selectionStart) && ((z3 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i2++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static final C0009h u(g0 g0Var) {
        Integer num;
        if (g0Var.B() > 0) {
            ArrayList arrayList = new ArrayList(g0Var.B());
            for (f0 f0Var : g0Var.C()) {
                f0Var.getClass();
                int D4 = f0Var.D();
                if (f0Var.E() == r0.RAW) {
                    num = null;
                } else {
                    num = Integer.valueOf(D4);
                }
                try {
                    try {
                        C2.b a6 = i.f1307b.a(o.l(f0Var.C().D(), f0Var.C().E(), f0Var.C().C(), f0Var.E(), num));
                        int ordinal = f0Var.F().ordinal();
                        if (!(ordinal == 1 || ordinal == 2)) {
                            if (ordinal != 3) {
                                throw new GeneralSecurityException("Unknown key status");
                            }
                        }
                        arrayList.add(new h(a6));
                    } catch (GeneralSecurityException unused) {
                        arrayList.add((Object) null);
                    }
                } catch (GeneralSecurityException e6) {
                    throw new RuntimeException("Creating a protokey serialization failed", e6);
                }
            }
            return new C0009h(g0Var, Collections.unmodifiableList(arrayList));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public boolean A(CharSequence charSequence, int i2, int i5, t tVar) {
        int i6;
        if ((tVar.f4962c & 3) == 0) {
            d dVar = (d) this.d;
            V.a c3 = tVar.c();
            int a6 = c3.a(8);
            if (a6 != 0) {
                ((ByteBuffer) c3.d).getShort(a6 + c3.f1342a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = d.f4923b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i5) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = dVar.f4924a;
            String sb2 = sb.toString();
            int i7 = C.i.f377a;
            boolean a7 = C.h.a(textPaint, sb2);
            int i8 = tVar.f4962c & 4;
            if (a7) {
                i6 = i8 | 2;
            } else {
                i6 = i8 | 1;
            }
            tVar.f4962c = i6;
        }
        if ((tVar.f4962c & 3) == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00bc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object B(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, androidx.emoji2.text.m r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            androidx.emoji2.text.n r5 = new androidx.emoji2.text.n
            java.lang.Object r6 = r0.f229c
            S3.z r6 = (S3.z) r6
            java.lang.Object r6 = r6.d
            androidx.emoji2.text.q r6 = (androidx.emoji2.text.q) r6
            r5.<init>(r6)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 1
            r8 = 0
            r9 = r6
            r11 = r7
            r10 = r8
            r6 = r18
        L_0x0022:
            r8 = r6
        L_0x0023:
            r12 = 2
            if (r6 >= r2) goto L_0x00ce
            if (r10 >= r3) goto L_0x00ce
            if (r11 == 0) goto L_0x00ce
            androidx.emoji2.text.q r13 = r5.f4944c
            android.util.SparseArray r13 = r13.f4954a
            if (r13 != 0) goto L_0x0032
            r13 = 0
            goto L_0x0038
        L_0x0032:
            java.lang.Object r13 = r13.get(r9)
            androidx.emoji2.text.q r13 = (androidx.emoji2.text.q) r13
        L_0x0038:
            int r14 = r5.f4942a
            r15 = 3
            if (r14 == r12) goto L_0x004c
            if (r13 != 0) goto L_0x0044
            r5.a()
        L_0x0042:
            r13 = r7
            goto L_0x008c
        L_0x0044:
            r5.f4942a = r12
            r5.f4944c = r13
            r5.f4946f = r7
        L_0x004a:
            r13 = r12
            goto L_0x008c
        L_0x004c:
            if (r13 == 0) goto L_0x0056
            r5.f4944c = r13
            int r13 = r5.f4946f
            int r13 = r13 + r7
            r5.f4946f = r13
            goto L_0x004a
        L_0x0056:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L_0x005f
            r5.a()
            goto L_0x0042
        L_0x005f:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L_0x0065
            goto L_0x004a
        L_0x0065:
            androidx.emoji2.text.q r13 = r5.f4944c
            androidx.emoji2.text.t r14 = r13.f4955b
            if (r14 == 0) goto L_0x0088
            int r14 = r5.f4946f
            if (r14 != r7) goto L_0x0082
            boolean r13 = r5.b()
            if (r13 == 0) goto L_0x007e
            androidx.emoji2.text.q r13 = r5.f4944c
            r5.d = r13
            r5.a()
        L_0x007c:
            r13 = r15
            goto L_0x008c
        L_0x007e:
            r5.a()
            goto L_0x0042
        L_0x0082:
            r5.d = r13
            r5.a()
            goto L_0x007c
        L_0x0088:
            r5.a()
            goto L_0x0042
        L_0x008c:
            r5.f4945e = r9
            if (r13 == r7) goto L_0x00bc
            if (r13 == r12) goto L_0x00ad
            if (r13 == r15) goto L_0x0095
            goto L_0x0023
        L_0x0095:
            if (r21 != 0) goto L_0x00a1
            androidx.emoji2.text.q r12 = r5.d
            androidx.emoji2.text.t r12 = r12.f4955b
            boolean r12 = r0.A(r1, r8, r6, r12)
            if (r12 != 0) goto L_0x0022
        L_0x00a1:
            androidx.emoji2.text.q r11 = r5.d
            androidx.emoji2.text.t r11 = r11.f4955b
            boolean r11 = r4.b(r1, r8, r6, r11)
            int r10 = r10 + 1
            goto L_0x0022
        L_0x00ad:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto L_0x00b9
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        L_0x00b9:
            r6 = r12
            goto L_0x0023
        L_0x00bc:
            int r6 = java.lang.Character.codePointAt(r1, r8)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r8
            if (r6 >= r2) goto L_0x0022
            int r8 = java.lang.Character.codePointAt(r1, r6)
            r9 = r8
            goto L_0x0022
        L_0x00ce:
            int r2 = r5.f4942a
            if (r2 != r12) goto L_0x00f9
            androidx.emoji2.text.q r2 = r5.f4944c
            androidx.emoji2.text.t r2 = r2.f4955b
            if (r2 == 0) goto L_0x00f9
            int r2 = r5.f4946f
            if (r2 > r7) goto L_0x00e2
            boolean r2 = r5.b()
            if (r2 == 0) goto L_0x00f9
        L_0x00e2:
            if (r10 >= r3) goto L_0x00f9
            if (r11 == 0) goto L_0x00f9
            if (r21 != 0) goto L_0x00f2
            androidx.emoji2.text.q r2 = r5.f4944c
            androidx.emoji2.text.t r2 = r2.f4955b
            boolean r2 = r0.A(r1, r8, r6, r2)
            if (r2 != 0) goto L_0x00f9
        L_0x00f2:
            androidx.emoji2.text.q r2 = r5.f4944c
            androidx.emoji2.text.t r2 = r2.f4955b
            r4.b(r1, r8, r6, r2)
        L_0x00f9:
            java.lang.Object r1 = r22.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0009h.B(java.lang.CharSequence, int, int, int, boolean, androidx.emoji2.text.m):java.lang.Object");
    }

    public boolean D(Object obj) {
        if (obj instanceof V0.b) {
            ((V0.b) obj).j().f3758a = true;
        }
        switch (((B) this.f229c).f2803a) {
            case 24:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((c) this.d).c(obj);
    }

    public void E(int i2) {
        if (i2 == 16 || i2 == 32) {
            this.f228b = Integer.valueOf(i2);
            return;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i2 * 8)}));
    }

    public synchronized void H(int i2, int i5, long j6, long j7) {
        synchronized (this) {
            ((C0212u0) this.f228b).f3501w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AtomicLong atomicLong = (AtomicLong) this.d;
            if (atomicLong.get() != -1) {
                if (elapsedRealtime - atomicLong.get() <= 1800000) {
                    return;
                }
            }
            ((B1.c) this.f229c).c(new C0392v(0, Arrays.asList(new C0389s[]{new C0389s(36301, i2, 0, j6, j7, (String) null, (String) null, 0, i5)}))).addOnFailureListener(new U(this, elapsedRealtime));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void a(int r12, java.io.IOException r13, byte[] r14) {
        /*
            r11 = this;
            java.lang.Object r14 = r11.f228b
            T1.b1 r14 = (T1.C0157b1) r14
            r14.o()
            java.lang.Object r0 = r11.d
            T1.L1 r0 = (T1.L1) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r12 == r1) goto L_0x0018
            r1 = 204(0xcc, float:2.86E-43)
            if (r12 == r1) goto L_0x0018
            r1 = 304(0x130, float:4.26E-43)
            if (r12 != r1) goto L_0x0033
            r12 = r1
        L_0x0018:
            if (r13 != 0) goto L_0x0033
            java.lang.Object r12 = r14.f398a
            T1.u0 r12 = (T1.C0212u0) r12
            T1.Z r12 = r12.f3496r
            T1.C0212u0.k(r12)
            T1.X r12 = r12.f3180w
            long r1 = r0.f2983a
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r12.b(r13, r1)
            T1.h1 r12 = T1.C0175h1.f3334c
            goto L_0x006f
        L_0x0033:
            java.lang.Object r1 = r14.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.Z r1 = r1.f3496r
            T1.C0212u0.k(r1)
            T1.X r1 = r1.f3175r
            long r2 = r0.f2983a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.d(r4, r2, r3, r13)
            T1.G r13 = T1.H.f2945u
            r1 = 0
            java.lang.Object r13 = r13.a(r1)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r1 = ","
            java.lang.String[] r13 = r13.split(r1)
            java.util.List r13 = java.util.Arrays.asList(r13)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            boolean r12 = r13.contains(r12)
            if (r12 == 0) goto L_0x006d
            T1.h1 r12 = T1.C0175h1.f3335e
            goto L_0x006f
        L_0x006d:
            T1.h1 r12 = T1.C0175h1.d
        L_0x006f:
            java.lang.Object r13 = r11.f229c
            java.util.concurrent.atomic.AtomicReference r13 = (java.util.concurrent.atomic.AtomicReference) r13
            java.lang.Object r1 = r14.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.w1 r1 = r1.r()
            T1.d r8 = new T1.d
            long r9 = r0.f2983a
            int r5 = r12.f3337a
            long r6 = r0.f2987f
            r2 = r8
            r3 = r9
            r2.<init>(r3, r5, r6)
            r1.o()
            r1.p()
            r0 = 1
            T1.Z1 r0 = r1.C(r0)
            H.j r2 = new H.j
            r3 = 7
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (java.lang.Object) r8, (int) r3)
            r1.F(r2)
            java.lang.Object r14 = r14.f398a
            T1.u0 r14 = (T1.C0212u0) r14
            T1.Z r14 = r14.f3496r
            T1.C0212u0.k(r14)
            T1.X r14 = r14.f3180w
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.String r1 = "[sgtm] Updated status for row_id"
            r14.c(r1, r0, r12)
            monitor-enter(r13)
            r13.set(r12)     // Catch:{ all -> 0x00b9 }
            r13.notifyAll()     // Catch:{ all -> 0x00b9 }
            monitor-exit(r13)     // Catch:{ all -> 0x00b9 }
            return
        L_0x00b9:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00b9 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0009h.a(int, java.io.IOException, byte[]):void");
    }

    public ClipDescription b() {
        return (ClipDescription) this.f229c;
    }

    public Object c() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.lang.String r8, int r9, java.io.IOException r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            int r8 = r7.f227a
            switch(r8) {
                case 24: goto L_0x00b9;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r8 = r7.d
            T1.T1 r8 = (T1.T1) r8
            T1.r0 r12 = r8.f()
            r12.o()
            r8.k()
            r12 = 0
            if (r11 != 0) goto L_0x001c
            byte[] r11 = new byte[r12]     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r9 = move-exception
            goto L_0x00b3
        L_0x001c:
            java.lang.Object r0 = r7.f229c
            T1.U1 r0 = (T1.U1) r0
            r1 = 200(0xc8, float:2.8E-43)
            long r2 = r0.f3079a
            java.lang.Object r0 = r7.f228b
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == r1) goto L_0x002f
            r1 = 204(0xcc, float:2.86E-43)
            if (r9 != r1) goto L_0x0077
            r9 = r1
        L_0x002f:
            if (r10 != 0) goto L_0x0077
            T1.n r10 = r8.f3062c     // Catch:{ all -> 0x0019 }
            T1.T1.L(r10)     // Catch:{ all -> 0x0019 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0019 }
            r10.C(r11)     // Catch:{ all -> 0x0019 }
            T1.Z r10 = r8.c()     // Catch:{ all -> 0x0019 }
            T1.X r10 = r10.f3180w     // Catch:{ all -> 0x0019 }
            java.lang.String r11 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0019 }
            r10.c(r11, r0, r9)     // Catch:{ all -> 0x0019 }
            T1.g r9 = r8.h0()     // Catch:{ all -> 0x0019 }
            T1.G r10 = T1.H.f2867M0     // Catch:{ all -> 0x0019 }
            r11 = 0
            boolean r9 = r9.B(r11, r10)     // Catch:{ all -> 0x0019 }
            if (r9 == 0) goto L_0x0073
            T1.d0 r9 = r8.f3061b     // Catch:{ all -> 0x0019 }
            T1.T1.L(r9)     // Catch:{ all -> 0x0019 }
            boolean r9 = r9.N()     // Catch:{ all -> 0x0019 }
            if (r9 == 0) goto L_0x0073
            T1.n r9 = r8.f3062c     // Catch:{ all -> 0x0019 }
            T1.T1.L(r9)     // Catch:{ all -> 0x0019 }
            boolean r9 = r9.N(r0)     // Catch:{ all -> 0x0019 }
            if (r9 == 0) goto L_0x0073
            r8.Z(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x00ad
        L_0x0073:
            r8.F()     // Catch:{ all -> 0x0019 }
            goto L_0x00ad
        L_0x0077:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0019 }
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0019 }
            r1.<init>(r11, r4)     // Catch:{ all -> 0x0019 }
            int r11 = r1.length()     // Catch:{ all -> 0x0019 }
            r4 = 32
            int r11 = java.lang.Math.min(r4, r11)     // Catch:{ all -> 0x0019 }
            java.lang.String r11 = r1.substring(r12, r11)     // Catch:{ all -> 0x0019 }
            T1.Z r1 = r8.c()     // Catch:{ all -> 0x0019 }
            T1.X r1 = r1.f3177t     // Catch:{ all -> 0x0019 }
            java.lang.String r4 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0019 }
            if (r10 != 0) goto L_0x009b
            r10 = r11
        L_0x009b:
            r1.d(r4, r0, r9, r10)     // Catch:{ all -> 0x0019 }
            T1.n r9 = r8.f3062c     // Catch:{ all -> 0x0019 }
            T1.T1.L(r9)     // Catch:{ all -> 0x0019 }
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0019 }
            r9.F(r10)     // Catch:{ all -> 0x0019 }
            r8.F()     // Catch:{ all -> 0x0019 }
        L_0x00ad:
            r8.f3045D = r12
            r8.C()
            return
        L_0x00b3:
            r8.f3045D = r12
            r8.C()
            throw r9
        L_0x00b9:
            java.lang.Object r8 = r7.f229c
            r6 = r8
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r8 = r7.d
            r0 = r8
            T1.T1 r0 = (T1.T1) r0
            r1 = 1
            java.lang.Object r8 = r7.f228b
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            r2 = r9
            r3 = r10
            r4 = r11
            r0.u(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0009h.d(java.lang.String, int, java.io.IOException, byte[], java.util.Map):void");
    }

    public Uri e() {
        return (Uri) this.f228b;
    }

    public Uri g() {
        return (Uri) this.d;
    }

    public byte[] h(byte[] bArr, int i2) {
        byte[] bArr2;
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        } else if (C0552a.d(1)) {
            Cipher cipher = (Cipher) j.f2176b.f2178a.b("AES/ECB/NoPadding");
            cipher.init(1, (SecretKeySpec) this.f228b);
            int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
            if (max * 16 == bArr.length) {
                bArr2 = com.bumptech.glide.d.p1(bArr, (max - 1) * 16, (byte[]) this.f229c, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                if (copyOfRange.length < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                    bArr2 = com.bumptech.glide.d.q1(copyOf, (byte[]) this.d);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            for (int i5 = 0; i5 < max - 1; i5++) {
                bArr3 = cipher.doFinal(com.bumptech.glide.d.p1(bArr3, 0, bArr, i5 * 16, 16));
            }
            return Arrays.copyOf(cipher.doFinal(com.bumptech.glide.d.q1(bArr2, bArr3)), i2);
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }

    public D i(D d6, z0.i iVar) {
        Drawable drawable = (Drawable) d6.get();
        if (drawable instanceof BitmapDrawable) {
            return ((l) this.f229c).i(C0057d.e((C0.b) this.f228b, ((BitmapDrawable) drawable).getBitmap()), iVar);
        } else if (drawable instanceof M0.c) {
            return ((N0.d) this.d).i(d6, iVar);
        } else {
            return null;
        }
    }

    public Object j() {
        Object a6 = ((c) this.d).a();
        if (a6 == null) {
            a6 = ((V0.a) this.f228b).j();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + a6.getClass());
            }
        }
        if (a6 instanceof V0.b) {
            ((V0.b) a6).j().f3758a = false;
        }
        return a6;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [D2.i, java.lang.Object] */
    public D2.i k() {
        x1.i iVar;
        k kVar = (k) this.f228b;
        if (kVar == null || (iVar = (x1.i) this.f229c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f536b == ((Q2.a) iVar.f12553b).f2433a.length) {
            D2.j jVar = D2.j.f523e;
            D2.j jVar2 = kVar.f538e;
            if (jVar2 != jVar && ((Integer) this.d) == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (jVar2 == jVar && ((Integer) this.d) != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            } else {
                if (jVar2 == jVar) {
                    Q2.a.a(new byte[0]);
                } else if (jVar2 == D2.j.d) {
                    Q2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
                } else if (jVar2 == D2.j.f522c) {
                    Q2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((k) this.f228b).f538e);
                }
                return new Object();
            }
        } else {
            throw new GeneralSecurityException("Key size mismatch");
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [D2.n, java.lang.Object] */
    public n l() {
        x1.i iVar;
        D2.o oVar = (D2.o) this.f228b;
        if (oVar == null || (iVar = (x1.i) this.f229c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oVar.f543b == ((Q2.a) iVar.f12553b).f2433a.length) {
            D2.j jVar = D2.j.h;
            D2.j jVar2 = oVar.f545e;
            if (jVar2 != jVar && ((Integer) this.d) == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (jVar2 == jVar && ((Integer) this.d) != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            } else {
                if (jVar2 == jVar) {
                    Q2.a.a(new byte[0]);
                } else if (jVar2 == D2.j.g) {
                    Q2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
                } else if (jVar2 == D2.j.f524f) {
                    Q2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((D2.o) this.f228b).f545e);
                }
                return new Object();
            }
        } else {
            throw new GeneralSecurityException("Key size mismatch");
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, D2.q] */
    public q m() {
        x1.i iVar;
        r rVar = (r) this.f228b;
        if (rVar == null || (iVar = (x1.i) this.f229c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (rVar.f549b == ((Q2.a) iVar.f12553b).f2433a.length) {
            D2.j jVar = D2.j.f527k;
            D2.j jVar2 = rVar.f550c;
            if (jVar2 != jVar && ((Integer) this.d) == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (jVar2 == jVar && ((Integer) this.d) != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            } else {
                if (jVar2 == jVar) {
                    Q2.a.a(new byte[0]);
                } else if (jVar2 == D2.j.f526j) {
                    Q2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
                } else if (jVar2 == D2.j.f525i) {
                    Q2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((r) this.f228b).f550c);
                }
                return new Object();
            }
        } else {
            throw new GeneralSecurityException("Key size mismatch");
        }
    }

    public K2.a n() {
        x1.i iVar;
        Q2.a aVar;
        e eVar = (e) this.f228b;
        if (eVar == null || (iVar = (x1.i) this.f229c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eVar.f1481b == ((Q2.a) iVar.f12553b).f2433a.length) {
            K2.d dVar = K2.d.f1471f;
            K2.d dVar2 = eVar.d;
            if (dVar2 != dVar && ((Integer) this.d) == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (dVar2 == dVar && ((Integer) this.d) != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            } else {
                if (dVar2 == dVar) {
                    aVar = Q2.a.a(new byte[0]);
                } else if (dVar2 == K2.d.f1470e || dVar2 == K2.d.d) {
                    aVar = Q2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
                } else if (dVar2 == K2.d.f1469c) {
                    aVar = Q2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((e) this.f228b).d);
                }
                return new K2.a((e) this.f228b, aVar);
            }
        } else {
            throw new GeneralSecurityException("Key size mismatch");
        }
    }

    public e o() {
        Integer num = (Integer) this.f228b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        } else if (((Integer) this.f229c) == null) {
            throw new GeneralSecurityException("tag size not set");
        } else if (((K2.d) this.d) != null) {
            return new e(num.intValue(), ((Integer) this.f229c).intValue(), (K2.d) this.d);
        } else {
            throw new GeneralSecurityException("variant not set");
        }
    }

    public K2.j p() {
        x1.i iVar;
        Q2.a aVar;
        K2.k kVar = (K2.k) this.f228b;
        if (kVar == null || (iVar = (x1.i) this.f229c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f1489b == ((Q2.a) iVar.f12553b).f2433a.length) {
            K2.d dVar = K2.d.f1478o;
            K2.d dVar2 = kVar.d;
            if (dVar2 != dVar && ((Integer) this.d) == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (dVar2 == dVar && ((Integer) this.d) != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            } else {
                if (dVar2 == dVar) {
                    aVar = Q2.a.a(new byte[0]);
                } else if (dVar2 == K2.d.f1477n || dVar2 == K2.d.f1476m) {
                    aVar = Q2.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
                } else if (dVar2 == K2.d.f1475l) {
                    aVar = Q2.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((K2.k) this.f228b).d);
                }
                return new K2.j((K2.k) this.f228b, aVar);
            }
        } else {
            throw new GeneralSecurityException("Key size mismatch");
        }
    }

    public Task q(HashMap hashMap) {
        p pVar = (p) this.d;
        F3.h hVar = (F3.h) this.f228b;
        hVar.getClass();
        Task task = F3.h.f746i.getTask();
        F3.e eVar = new F3.e(hVar, pVar);
        Executor executor = hVar.f748a;
        Task continueWithTask = task.continueWithTask(executor, eVar).continueWithTask(executor, new F3.f(hVar, (String) this.f229c, hashMap, pVar, 0));
        kotlin.jvm.internal.j.d(continueWithTask, "providerInstalled.task\n …context, options)\n      }");
        return continueWithTask;
    }

    public Bitmap r(BitmapFactory.Options options) {
        switch (this.f227a) {
            case 10:
                return BitmapFactory.decodeStream(new U0.a(U0.c.c((ByteBuffer) this.f228b)), (Rect) null, options);
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                y yVar = (y) ((com.bumptech.glide.load.data.h) this.f228b).f5814b;
                yVar.reset();
                return BitmapFactory.decodeStream(yVar, (Rect) null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.h) this.d).e().getFileDescriptor(), (Rect) null, options);
        }
    }

    public void t(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f228b;
        D3.f fVar = new D3.f(byteArrayOutputStream, hashMap, (HashMap) this.f229c, (C3.a) this.d);
        if (obj != null) {
            A3.d dVar = (A3.d) hashMap.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, fVar);
                return;
            }
            throw new RuntimeException("No encoder for " + obj.getClass());
        }
    }

    public String toString() {
        switch (this.f227a) {
            case 3:
                return C2.p.a((g0) this.f228b).toString();
            default:
                return super.toString();
        }
    }

    public O v(Class cls, String str) {
        O o6;
        M m6;
        kotlin.jvm.internal.j.e(str, "key");
        T t6 = (T) this.f228b;
        t6.getClass();
        LinkedHashMap linkedHashMap = t6.f5258a;
        O o7 = (O) linkedHashMap.get(str);
        boolean isInstance = cls.isInstance(o7);
        S s6 = (S) this.f229c;
        if (isInstance) {
            if (s6 instanceof M) {
                m6 = (M) s6;
            } else {
                m6 = null;
            }
            if (m6 != null) {
                kotlin.jvm.internal.j.b(o7);
                C0309u uVar = m6.d;
                if (uVar != null) {
                    C0738t tVar = m6.f5242e;
                    kotlin.jvm.internal.j.b(tVar);
                    J.a(o7, tVar, uVar);
                }
            }
            kotlin.jvm.internal.j.c(o7, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return o7;
        }
        C0337c cVar = new C0337c((C0336b) this.d);
        cVar.f5577a.put(P.f5249b, str);
        try {
            o6 = s6.b(cls, cVar);
        } catch (AbstractMethodError unused) {
            o6 = s6.a(cls);
        }
        kotlin.jvm.internal.j.e(o6, "viewModel");
        O o8 = (O) linkedHashMap.put(str, o6);
        if (o8 != null) {
            o8.b();
        }
        return o6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bumptech.glide.load.ImageHeaderParser$ImageType w() {
        /*
            r10 = this;
            int r0 = r10.f227a
            switch(r0) {
                case 10: goto L_0x006b;
                case 11: goto L_0x0053;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.d
            com.bumptech.glide.load.data.h r0 = (com.bumptech.glide.load.data.h) r0
            java.lang.Object r1 = r10.f228b
            C0.g r1 = (C0.g) r1
            java.lang.Object r2 = r10.f229c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 0
        L_0x0016:
            if (r4 >= r3) goto L_0x0050
            java.lang.Object r5 = r2.get(r4)
            z0.d r5 = (z0.C1128d) r5
            r6 = 0
            I0.y r7 = new I0.y     // Catch:{ all -> 0x0046 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            android.os.ParcelFileDescriptor r9 = r0.e()     // Catch:{ all -> 0x0046 }
            java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x0046 }
            r8.<init>(r9)     // Catch:{ all -> 0x0046 }
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0046 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.d(r7)     // Catch:{ all -> 0x0043 }
            r7.d()
            r0.e()
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            if (r5 == r6) goto L_0x0040
            goto L_0x0052
        L_0x0040:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0043:
            r1 = move-exception
            r6 = r7
            goto L_0x0047
        L_0x0046:
            r1 = move-exception
        L_0x0047:
            if (r6 == 0) goto L_0x004c
            r6.d()
        L_0x004c:
            r0.e()
            throw r1
        L_0x0050:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
        L_0x0052:
            return r5
        L_0x0053:
            java.lang.Object r0 = r10.f228b
            com.bumptech.glide.load.data.h r0 = (com.bumptech.glide.load.data.h) r0
            java.lang.Object r0 = r0.f5814b
            I0.y r0 = (I0.y) r0
            r0.reset()
            java.lang.Object r1 = r10.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r10.f229c
            C0.g r2 = (C0.g) r2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = z0.C1129e.b(r1, r0, r2)
            return r0
        L_0x006b:
            java.lang.Object r0 = r10.f228b
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = U0.c.c(r0)
            java.lang.Object r1 = r10.f229c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = z0.C1129e.c(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0009h.w():com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object x(java.lang.Class r15) {
        /*
            r14 = this;
            r0 = 1
            java.util.concurrent.atomic.AtomicReference r1 = C2.n.f450a
            r1 = 0
            J2.h r2 = J2.h.f1305b     // Catch:{ GeneralSecurityException -> 0x000b }
            java.lang.Class r2 = r2.a(r15)     // Catch:{ GeneralSecurityException -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            java.lang.String r3 = "No wrapper found for "
            if (r2 == 0) goto L_0x01c7
            int r4 = C2.p.f454a
            java.lang.Object r4 = r14.f228b
            O2.g0 r4 = (O2.g0) r4
            int r5 = r4.D()
            java.util.List r6 = r4.C()
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
            r10 = r0
            r8 = r7
            r9 = r8
        L_0x0026:
            boolean r11 = r6.hasNext()
            O2.Z r12 = O2.Z.ENABLED
            if (r11 == 0) goto L_0x00ba
            java.lang.Object r11 = r6.next()
            O2.f0 r11 = (O2.f0) r11
            O2.Z r13 = r11.F()
            if (r13 == r12) goto L_0x003b
            goto L_0x0026
        L_0x003b:
            boolean r12 = r11.G()
            if (r12 == 0) goto L_0x00a2
            O2.r0 r12 = r11.E()
            O2.r0 r13 = O2.r0.UNKNOWN_PREFIX
            if (r12 == r13) goto L_0x008a
            O2.Z r12 = r11.F()
            O2.Z r13 = O2.Z.UNKNOWN_STATUS
            if (r12 == r13) goto L_0x0072
            int r12 = r11.D()
            if (r12 != r5) goto L_0x0063
            if (r9 != 0) goto L_0x005b
            r9 = r0
            goto L_0x0063
        L_0x005b:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains multiple primary keys"
            r15.<init>(r0)
            throw r15
        L_0x0063:
            O2.Y r11 = r11.C()
            O2.X r11 = r11.C()
            O2.X r12 = O2.X.ASYMMETRIC_PUBLIC
            if (r11 == r12) goto L_0x0070
            r10 = r7
        L_0x0070:
            int r8 = r8 + r0
            goto L_0x0026
        L_0x0072:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            int r0 = r11.D()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "key %d has unknown status"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x008a:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            int r0 = r11.D()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "key %d has unknown prefix"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00a2:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            int r0 = r11.D()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "key %d has no key data"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        L_0x00ba:
            if (r8 == 0) goto L_0x01bf
            if (r9 != 0) goto L_0x00c9
            if (r10 == 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset doesn't contain a valid primary key"
            r15.<init>(r0)
            throw r15
        L_0x00c9:
            S3.z r5 = new S3.z
            r5.<init>((java.lang.Class) r2)
            java.lang.Object r6 = r5.f2712c
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            if (r6 == 0) goto L_0x01b7
            java.lang.Object r6 = r14.d
            M2.a r6 = (M2.a) r6
            r5.f2713e = r6
            r6 = r7
        L_0x00db:
            int r8 = r4.B()
            if (r6 >= r8) goto L_0x0149
            O2.f0 r8 = r4.A(r6)
            O2.Z r9 = r8.F()
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0147
            O2.Y r9 = r8.C()     // Catch:{ GeneralSecurityException -> 0x0102 }
            java.util.concurrent.atomic.AtomicReference r10 = C2.n.f450a     // Catch:{ GeneralSecurityException -> 0x0102 }
            java.lang.String r10 = r9.D()     // Catch:{ GeneralSecurityException -> 0x0102 }
            com.google.crypto.tink.shaded.protobuf.i r9 = r9.E()     // Catch:{ GeneralSecurityException -> 0x0102 }
            java.lang.Object r9 = C2.n.c(r10, r9, r2)     // Catch:{ GeneralSecurityException -> 0x0102 }
            goto L_0x011e
        L_0x0102:
            r9 = move-exception
            java.lang.String r10 = r9.getMessage()
            java.lang.String r11 = "No key manager found for key type "
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x011d
            java.lang.String r10 = r9.getMessage()
            java.lang.String r11 = " not supported by key manager of type "
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            throw r9
        L_0x011d:
            r9 = r1
        L_0x011e:
            java.lang.Object r10 = r14.f229c
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r10.get(r6)
            if (r11 == 0) goto L_0x0135
            java.lang.Object r10 = r10.get(r6)
            C2.h r10 = (C2.h) r10
            C2.b r10 = r10.f442a
            java.lang.Object r10 = C2.n.b(r10, r2)     // Catch:{ GeneralSecurityException -> 0x0135 }
            goto L_0x0136
        L_0x0135:
            r10 = r1
        L_0x0136:
            int r11 = r8.D()
            int r13 = r4.D()
            if (r11 != r13) goto L_0x0144
            r5.f(r10, r9, r8, r0)
            goto L_0x0147
        L_0x0144:
            r5.f(r10, r9, r8, r7)
        L_0x0147:
            int r6 = r6 + r0
            goto L_0x00db
        L_0x0149:
            java.lang.Object r0 = r5.f2712c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            if (r0 == 0) goto L_0x01af
            B0.h r2 = new B0.h
            java.lang.Object r4 = r5.d
            C2.k r4 = (C2.k) r4
            java.lang.Object r6 = r5.f2713e
            M2.a r6 = (M2.a) r6
            java.lang.Object r7 = r5.f2711b
            java.lang.Class r7 = (java.lang.Class) r7
            r2.<init>((java.util.concurrent.ConcurrentHashMap) r0, (C2.k) r4, (M2.a) r6, (java.lang.Class) r7)
            r5.f2712c = r1
            java.util.concurrent.atomic.AtomicReference r0 = C2.n.f450a
            J2.h r0 = J2.h.f1305b
            java.util.concurrent.atomic.AtomicReference r0 = r0.f1306a
            java.lang.Object r0 = r0.get()
            J2.n r0 = (J2.n) r0
            java.util.HashMap r0 = r0.f1316b
            boolean r1 = r0.containsKey(r15)
            if (r1 == 0) goto L_0x019d
            java.lang.Object r15 = r0.get(r15)
            C2.m r15 = (C2.m) r15
            java.lang.Class r0 = r15.a()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0195
            java.lang.Class r0 = r15.a()
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0195
            java.lang.Object r15 = r15.b(r2)
            return r15
        L_0x0195:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet"
            r15.<init>(r0)
            throw r15
        L_0x019d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x01af:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "build cannot be called twice"
            r15.<init>(r0)
            throw r15
        L_0x01b7:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "setAnnotations cannot be called after build"
            r15.<init>(r0)
            throw r15
        L_0x01bf:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset must contain at least one ENABLED key"
            r15.<init>(r0)
            throw r15
        L_0x01c7:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r15 = r15.getName()
            java.lang.String r15 = r3.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0009h.x(java.lang.Class):java.lang.Object");
    }

    public List y(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f228b).get(new l(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, z.n, C0.a] */
    /* JADX WARNING: type inference failed for: r5v41, types: [java.lang.Object, z.o, C0.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        if (r0 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x038f A[SYNTHETIC, Splitter:B:146:0x038f] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03b6 A[SYNTHETIC, Splitter:B:152:0x03b6] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x049b A[SYNTHETIC, Splitter:B:192:0x049b] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04de A[SYNTHETIC, Splitter:B:202:0x04de] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0600 A[SYNTHETIC, Splitter:B:256:0x0600] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00be A[Catch:{ NameNotFoundException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e6 A[SYNTHETIC, Splitter:B:38:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean z() {
        /*
            r19 = this;
            r1 = r19
            r3 = 2
            r4 = 3
            java.lang.Object r0 = r1.d
            S3.t r0 = (S3.t) r0
            java.lang.String r5 = "gcm.n.noui"
            boolean r0 = r0.g(r5)
            r5 = 1
            if (r0 == 0) goto L_0x0012
            return r5
        L_0x0012:
            java.lang.Object r0 = r1.f229c
            com.google.firebase.messaging.FirebaseMessagingService r0 = (com.google.firebase.messaging.FirebaseMessagingService) r0
            java.lang.String r6 = "keyguard"
            java.lang.Object r6 = r0.getSystemService(r6)
            android.app.KeyguardManager r6 = (android.app.KeyguardManager) r6
            boolean r6 = r6.inKeyguardRestrictedInputMode()
            r7 = 0
            if (r6 == 0) goto L_0x0026
            goto L_0x0053
        L_0x0026:
            int r6 = android.os.Process.myPid()
            java.lang.String r8 = "activity"
            java.lang.Object r0 = r0.getSystemService(r8)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0053
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0053
            java.lang.Object r8 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r8 = (android.app.ActivityManager.RunningAppProcessInfo) r8
            int r9 = r8.pid
            if (r9 != r6) goto L_0x003c
            int r0 = r8.importance
            r6 = 100
            if (r0 != r6) goto L_0x0053
            return r7
        L_0x0053:
            java.lang.Object r0 = r1.d
            S3.t r0 = (S3.t) r0
            java.lang.String r6 = "gcm.n.image"
            java.lang.String r0 = r0.o(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r9 = "FirebaseMessaging"
            if (r6 == 0) goto L_0x0067
        L_0x0065:
            r6 = 0
            goto L_0x0084
        L_0x0067:
            S3.s r6 = new S3.s     // Catch:{ MalformedURLException -> 0x0072 }
            java.net.URL r10 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0072 }
            r10.<init>(r0)     // Catch:{ MalformedURLException -> 0x0072 }
            r6.<init>(r10)     // Catch:{ MalformedURLException -> 0x0072 }
            goto L_0x0084
        L_0x0072:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "Not downloading image, bad URL: "
            r6.<init>(r10)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r9, r0)
            goto L_0x0065
        L_0x0084:
            if (r6 == 0) goto L_0x00a0
            java.lang.Object r0 = r1.f228b
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            com.google.android.gms.tasks.TaskCompletionSource r10 = new com.google.android.gms.tasks.TaskCompletionSource
            r10.<init>()
            B.m r11 = new B.m
            r11.<init>(r6, r10, r4)
            java.util.concurrent.Future r0 = r0.submit(r11)
            r6.f2697b = r0
            com.google.android.gms.tasks.Task r0 = r10.getTask()
            r6.f2698c = r0
        L_0x00a0:
            java.lang.Object r0 = r1.f229c
            r10 = r0
            com.google.firebase.messaging.FirebaseMessagingService r10 = (com.google.firebase.messaging.FirebaseMessagingService) r10
            java.lang.Object r0 = r1.d
            r11 = r0
            S3.t r11 = (S3.t) r11
            java.util.concurrent.atomic.AtomicInteger r0 = S3.C0144e.f2664a
            java.lang.String r12 = "Couldn't get own application info: "
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r13 = r10.getPackageName()
            r14 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r13, r14)     // Catch:{ NameNotFoundException -> 0x00c4 }
            if (r0 == 0) goto L_0x00d4
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00c4 }
            if (r0 == 0) goto L_0x00d4
        L_0x00c2:
            r13 = r0
            goto L_0x00d7
        L_0x00c4:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            android.util.Log.w(r9, r0)
        L_0x00d4:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            goto L_0x00c2
        L_0x00d7:
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r11.o(r0)
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 26
            if (r14 >= r15) goto L_0x00e6
        L_0x00e3:
            r0 = 0
            goto L_0x016d
        L_0x00e6:
            android.content.pm.PackageManager r14 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00e3 }
            java.lang.String r8 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00e3 }
            android.content.pm.ApplicationInfo r8 = r14.getApplicationInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x00e3 }
            int r8 = r8.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00e3 }
            if (r8 >= r15) goto L_0x00f7
            goto L_0x00e3
        L_0x00f7:
            java.lang.Class<android.app.NotificationManager> r8 = android.app.NotificationManager.class
            java.lang.Object r8 = r10.getSystemService(r8)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x0122
            android.app.NotificationChannel r14 = r8.getNotificationChannel(r0)
            if (r14 == 0) goto L_0x010c
            goto L_0x016d
        L_0x010c:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Notification Channel requested ("
            r14.<init>(r15)
            r14.append(r0)
            java.lang.String r0 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            android.util.Log.w(r9, r0)
        L_0x0122:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r0 = r13.getString(r0)
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x013b
            android.app.NotificationChannel r14 = r8.getNotificationChannel(r0)
            if (r14 == 0) goto L_0x0135
            goto L_0x016d
        L_0x0135:
            java.lang.String r0 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r9, r0)
            goto L_0x0140
        L_0x013b:
            java.lang.String r0 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r9, r0)
        L_0x0140:
            android.app.NotificationChannel r0 = r8.getNotificationChannel("fcm_fallback_notification_channel")
            if (r0 != 0) goto L_0x016b
            android.content.res.Resources r0 = r10.getResources()
            java.lang.String r14 = r10.getPackageName()
            java.lang.String r15 = "fcm_fallback_notification_channel_label"
            java.lang.String r4 = "string"
            int r0 = r0.getIdentifier(r15, r4, r14)
            if (r0 != 0) goto L_0x0160
            java.lang.String r0 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r9, r0)
            java.lang.String r0 = "Misc"
            goto L_0x0164
        L_0x0160:
            java.lang.String r0 = r10.getString(r0)
        L_0x0164:
            android.app.NotificationChannel r0 = C0.h.c(r0)
            r8.createNotificationChannel(r0)
        L_0x016b:
            java.lang.String r0 = "fcm_fallback_notification_channel"
        L_0x016d:
            java.lang.String r4 = r10.getPackageName()
            android.content.res.Resources r8 = r10.getResources()
            android.content.pm.PackageManager r14 = r10.getPackageManager()
            z.q r15 = new z.q
            r15.<init>(r10, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r11.m(r8, r4, r0)
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            if (r16 != 0) goto L_0x0190
            java.lang.CharSequence r0 = z.q.b(r0)
            r15.f12771e = r0
        L_0x0190:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r11.m(r8, r4, r0)
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            if (r16 != 0) goto L_0x01b0
            java.lang.CharSequence r5 = z.q.b(r0)
            r15.f12772f = r5
            z.o r5 = new z.o
            r5.<init>()
            java.lang.CharSequence r0 = z.q.b(r0)
            r5.f12767b = r0
            r15.e(r5)
        L_0x01b0:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = r11.o(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x01f0
            java.lang.String r5 = "drawable"
            int r5 = r8.getIdentifier(r0, r5, r4)
            if (r5 == 0) goto L_0x01cb
            boolean r17 = S3.C0144e.a(r8, r5)
            if (r17 == 0) goto L_0x01cb
            goto L_0x0224
        L_0x01cb:
            java.lang.String r5 = "mipmap"
            int r5 = r8.getIdentifier(r0, r5, r4)
            if (r5 == 0) goto L_0x01da
            boolean r17 = S3.C0144e.a(r8, r5)
            if (r17 == 0) goto L_0x01da
            goto L_0x0224
        L_0x01da:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon resource "
            r5.<init>(r2)
            r5.append(r0)
            java.lang.String r0 = " not found. Notification will use default icon."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r9, r0)
        L_0x01f0:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r2 = r13.getInt(r0, r7)
            if (r2 == 0) goto L_0x01fe
            boolean r0 = S3.C0144e.a(r8, r2)
            if (r0 != 0) goto L_0x0215
        L_0x01fe:
            android.content.pm.ApplicationInfo r0 = r14.getApplicationInfo(r4, r7)     // Catch:{ NameNotFoundException -> 0x0205 }
            int r2 = r0.icon     // Catch:{ NameNotFoundException -> 0x0205 }
            goto L_0x0215
        L_0x0205:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r12)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r9, r0)
        L_0x0215:
            if (r2 == 0) goto L_0x0220
            boolean r0 = S3.C0144e.a(r8, r2)
            if (r0 != 0) goto L_0x021e
            goto L_0x0220
        L_0x021e:
            r5 = r2
            goto L_0x0224
        L_0x0220:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            r5 = r0
        L_0x0224:
            android.app.Notification r0 = r15.f12783s
            r0.icon = r5
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r11.o(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x023a
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r11.o(r0)
        L_0x023a:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0242
            r0 = 0
            goto L_0x0271
        L_0x0242:
            java.lang.String r2 = "default"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x026d
            java.lang.String r2 = "raw"
            int r2 = r8.getIdentifier(r0, r2, r4)
            if (r2 == 0) goto L_0x026d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "android.resource://"
            r2.<init>(r5)
            r2.append(r4)
            java.lang.String r5 = "/raw/"
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0271
        L_0x026d:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r3)
        L_0x0271:
            r2 = -1
            if (r0 == 0) goto L_0x028e
            android.app.Notification r5 = r15.f12783s
            r5.sound = r0
            r5.audioStreamType = r2
            android.media.AudioAttributes$Builder r0 = z.p.b()
            r8 = 4
            android.media.AudioAttributes$Builder r0 = z.p.c(r0, r8)
            r8 = 5
            android.media.AudioAttributes$Builder r0 = z.p.e(r0, r8)
            android.media.AudioAttributes r0 = z.p.a(r0)
            r5.audioAttributes = r0
        L_0x028e:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r11.o(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x02a8
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            r5.setPackage(r4)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)
            goto L_0x02e1
        L_0x02a8:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r11.o(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x02ba
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r11.o(r0)
        L_0x02ba:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x02c5
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x02c6
        L_0x02c5:
            r0 = 0
        L_0x02c6:
            if (r0 == 0) goto L_0x02d6
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.VIEW"
            r5.<init>(r8)
            r5.setPackage(r4)
            r5.setData(r0)
            goto L_0x02e1
        L_0x02d6:
            android.content.Intent r5 = r14.getLaunchIntentForPackage(r4)
            if (r5 != 0) goto L_0x02e1
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r9, r0)
        L_0x02e1:
            java.util.concurrent.atomic.AtomicInteger r0 = S3.C0144e.f2664a
            r4 = 1140850688(0x44000000, float:512.0)
            java.lang.String r8 = "google.c.a.e"
            if (r5 != 0) goto L_0x02eb
            r2 = 0
            goto L_0x0347
        L_0x02eb:
            r12 = 67108864(0x4000000, float:1.5046328E-36)
            r5.addFlags(r12)
            android.os.Bundle r12 = new android.os.Bundle
            java.lang.Object r14 = r11.f2700b
            android.os.Bundle r14 = (android.os.Bundle) r14
            r12.<init>(r14)
            java.util.Set r14 = r14.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0301:
            boolean r18 = r14.hasNext()
            if (r18 == 0) goto L_0x032d
            java.lang.Object r18 = r14.next()
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "google.c."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L_0x0327
            java.lang.String r3 = "gcm.n."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L_0x0327
            java.lang.String r3 = "gcm.notification."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x032a
        L_0x0327:
            r12.remove(r2)
        L_0x032a:
            r2 = -1
            r3 = 2
            goto L_0x0301
        L_0x032d:
            r5.putExtras(r12)
            boolean r2 = r11.g(r8)
            if (r2 == 0) goto L_0x033f
            android.os.Bundle r2 = r11.x()
            java.lang.String r3 = "gcm.n.analytics_data"
            r5.putExtra(r3, r2)
        L_0x033f:
            int r2 = r0.incrementAndGet()
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r10, r2, r5, r4)
        L_0x0347:
            r15.g = r2
            boolean r2 = r11.g(r8)
            if (r2 != 0) goto L_0x0351
            r0 = 0
            goto L_0x037d
        L_0x0351:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r2.<init>(r3)
            android.os.Bundle r3 = r11.x()
            android.content.Intent r2 = r2.putExtras(r3)
            int r0 = r0.incrementAndGet()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "com.google.android.c2dm.intent.RECEIVE"
            r3.<init>(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.Intent r3 = r3.setPackage(r5)
            java.lang.String r5 = "wrapped_intent"
            android.content.Intent r2 = r3.putExtra(r5, r2)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r10, r0, r2, r4)
        L_0x037d:
            if (r0 == 0) goto L_0x0383
            android.app.Notification r2 = r15.f12783s
            r2.deleteIntent = r0
        L_0x0383:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r11.o(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x03ae
            int r2 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x0398 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0398 }
            goto L_0x03c5
        L_0x0398:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Color is invalid: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ". Notification will use default color."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r9, r0)
        L_0x03ae:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r13.getInt(r0, r7)
            if (r0 == 0) goto L_0x03c4
            int r0 = A.h.getColor(r10, r0)     // Catch:{ NotFoundException -> 0x03bf }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x03bf }
            goto L_0x03c5
        L_0x03bf:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r9, r0)
        L_0x03c4:
            r0 = 0
        L_0x03c5:
            if (r0 == 0) goto L_0x03cd
            int r0 = r0.intValue()
            r15.f12779o = r0
        L_0x03cd:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r11.g(r0)
            r2 = 1
            r0 = r0 ^ r2
            r15.c(r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r11.g(r0)
            r15.f12777m = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r11.o(r0)
            if (r0 == 0) goto L_0x03f0
            android.app.Notification r2 = r15.f12783s
            java.lang.CharSequence r0 = z.q.b(r0)
            r2.tickerText = r0
        L_0x03f0:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r11.i(r0)
            r2 = -2
            if (r0 != 0) goto L_0x03fb
        L_0x03f9:
            r0 = 0
            goto L_0x041f
        L_0x03fb:
            int r3 = r0.intValue()
            if (r3 < r2) goto L_0x0408
            int r3 = r0.intValue()
            r4 = 2
            if (r3 <= r4) goto L_0x041f
        L_0x0408:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "notificationPriority is invalid "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ". Skipping setting notificationPriority."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r9, r0)
            goto L_0x03f9
        L_0x041f:
            if (r0 == 0) goto L_0x0427
            int r0 = r0.intValue()
            r15.f12774j = r0
        L_0x0427:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r11.i(r0)
            java.lang.String r3 = "NotificationParams"
            if (r0 != 0) goto L_0x0433
        L_0x0431:
            r0 = 0
            goto L_0x0458
        L_0x0433:
            int r4 = r0.intValue()
            r5 = -1
            if (r4 < r5) goto L_0x0441
            int r4 = r0.intValue()
            r5 = 1
            if (r4 <= r5) goto L_0x0458
        L_0x0441:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "visibility is invalid: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ". Skipping setting visibility."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r3, r0)
            goto L_0x0431
        L_0x0458:
            if (r0 == 0) goto L_0x0460
            int r0 = r0.intValue()
            r15.f12780p = r0
        L_0x0460:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r11.i(r0)
            if (r0 != 0) goto L_0x046a
        L_0x0468:
            r0 = 0
            goto L_0x0487
        L_0x046a:
            int r4 = r0.intValue()
            if (r4 >= 0) goto L_0x0487
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "notificationCount is invalid: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ". Skipping setting notificationCount."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r9, r0)
            goto L_0x0468
        L_0x0487:
            if (r0 == 0) goto L_0x048f
            int r0 = r0.intValue()
            r15.f12773i = r0
        L_0x048f:
            java.lang.String r0 = "gcm.n.event_time"
            java.lang.String r4 = r11.o(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x04c6
            long r12 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x04a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ NumberFormatException -> 0x04a4 }
            goto L_0x04c7
        L_0x04a4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Couldn't parse value of "
            r5.<init>(r8)
            java.lang.String r0 = S3.t.y(r0)
            r5.append(r0)
            java.lang.String r0 = "("
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ") into a long"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r3, r0)
        L_0x04c6:
            r0 = 0
        L_0x04c7:
            if (r0 == 0) goto L_0x04d4
            r4 = 1
            r15.f12775k = r4
            long r4 = r0.longValue()
            android.app.Notification r0 = r15.f12783s
            r0.when = r4
        L_0x04d4:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r0 = r11.k(r0)
            if (r0 != 0) goto L_0x04de
        L_0x04dc:
            r8 = 0
            goto L_0x0515
        L_0x04de:
            int r4 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            r5 = 1
            if (r4 <= r5) goto L_0x04f6
            int r4 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            long[] r8 = new long[r4]     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            r10 = r7
        L_0x04ec:
            if (r10 >= r4) goto L_0x0515
            long r12 = r0.optLong(r10)     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            r8[r10] = r12     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            int r10 = r10 + r5
            goto L_0x04ec
        L_0x04f6:
            org.json.JSONException r4 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            java.lang.String r5 = "vibrateTimings have invalid length"
            r4.<init>(r5)     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            throw r4     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
        L_0x04fe:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "User defined vibrateTimings is invalid: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ". Skipping setting vibrateTimings."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r3, r0)
            goto L_0x04dc
        L_0x0515:
            if (r8 == 0) goto L_0x051b
            android.app.Notification r0 = r15.f12783s
            r0.vibrate = r8
        L_0x051b:
            java.lang.String r4 = ". Skipping setting LightSettings"
            java.lang.String r5 = "LightSettings is invalid: "
            java.lang.String r0 = "gcm.n.light_settings"
            org.json.JSONArray r8 = r11.k(r0)
            if (r8 != 0) goto L_0x0529
        L_0x0527:
            r0 = 0
            goto L_0x0593
        L_0x0529:
            r10 = 3
            int[] r0 = new int[r10]
            int r12 = r8.length()     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            if (r12 != r10) goto L_0x0559
            java.lang.String r10 = r8.optString(r7)     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            int r10 = android.graphics.Color.parseColor(r10)     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r10 == r12) goto L_0x0551
            r0[r7] = r10     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            r10 = 1
            int r12 = r8.optInt(r10)     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            r0[r10] = r12     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            r10 = 2
            int r12 = r8.optInt(r10)     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            r0[r10] = r12     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            goto L_0x0593
        L_0x054f:
            r0 = move-exception
            goto L_0x0561
        L_0x0551:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            java.lang.String r10 = "Transparent color is invalid"
            r0.<init>(r10)     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            throw r0     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
        L_0x0559:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            java.lang.String r10 = "lightSettings don't have all three fields"
            r0.<init>(r10)     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
            throw r0     // Catch:{ JSONException -> 0x0580, IllegalArgumentException -> 0x054f }
        L_0x0561:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r5)
            r10.append(r8)
            java.lang.String r5 = ". "
            r10.append(r5)
            java.lang.String r0 = r0.getMessage()
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = r10.toString()
            android.util.Log.w(r3, r0)
            goto L_0x0527
        L_0x0580:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r8)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            goto L_0x0527
        L_0x0593:
            if (r0 == 0) goto L_0x05b2
            r3 = r0[r7]
            r4 = 1
            r5 = r0[r4]
            r4 = 2
            r0 = r0[r4]
            android.app.Notification r4 = r15.f12783s
            r4.ledARGB = r3
            r4.ledOnMS = r5
            r4.ledOffMS = r0
            if (r5 == 0) goto L_0x05ab
            if (r0 == 0) goto L_0x05ab
            r0 = 1
            goto L_0x05ac
        L_0x05ab:
            r0 = r7
        L_0x05ac:
            int r3 = r4.flags
            r2 = r2 & r3
            r0 = r0 | r2
            r4.flags = r0
        L_0x05b2:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r11.g(r0)
            java.lang.String r2 = "gcm.n.default_vibrate_timings"
            boolean r2 = r11.g(r2)
            if (r2 == 0) goto L_0x05c2
            r2 = 2
            r0 = r0 | r2
        L_0x05c2:
            java.lang.String r2 = "gcm.n.default_light_settings"
            boolean r2 = r11.g(r2)
            if (r2 == 0) goto L_0x05cd
            r2 = 4
            r0 = r0 | r2
            goto L_0x05ce
        L_0x05cd:
            r2 = 4
        L_0x05ce:
            android.app.Notification r3 = r15.f12783s
            r3.defaults = r0
            r0 = r0 & r2
            if (r0 == 0) goto L_0x05db
            int r0 = r3.flags
            r2 = 1
            r0 = r0 | r2
            r3.flags = r0
        L_0x05db:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r11.o(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x05e9
        L_0x05e7:
            r2 = r0
            goto L_0x05fc
        L_0x05e9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FCM-Notification:"
            r0.<init>(r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x05e7
        L_0x05fc:
            if (r6 != 0) goto L_0x0600
        L_0x05fe:
            r3 = 3
            goto L_0x0660
        L_0x0600:
            com.google.android.gms.tasks.Task r0 = r6.f2698c     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            com.google.android.gms.common.internal.I.g(r0)     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            r4 = 5
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0, r4, r3)     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            r15.d(r0)     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            z.n r3 = new z.n     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            r3.<init>()     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            if (r0 != 0) goto L_0x061c
            r4 = 0
            r5 = 1
            goto L_0x0624
        L_0x061c:
            androidx.core.graphics.drawable.IconCompat r4 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            r5 = 1
            r4.<init>(r5)     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            r4.f4882b = r0     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
        L_0x0624:
            r3.f12765b = r4     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            r4 = 0
            r3.f12766c = r4     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            r3.d = r5     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            r15.e(r3)     // Catch:{ ExecutionException -> 0x062f, InterruptedException -> 0x063a, TimeoutException -> 0x0631 }
            goto L_0x05fe
        L_0x062f:
            r0 = move-exception
            goto L_0x064a
        L_0x0631:
            java.lang.String r0 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r9, r0)
            r6.close()
            goto L_0x05fe
        L_0x063a:
            java.lang.String r0 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r9, r0)
            r6.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x05fe
        L_0x064a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to download image: "
            r3.<init>(r4)
            java.lang.Throwable r0 = r0.getCause()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r9, r0)
            goto L_0x05fe
        L_0x0660:
            boolean r0 = android.util.Log.isLoggable(r9, r3)
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = "Showing notification"
            android.util.Log.d(r9, r0)
        L_0x066b:
            java.lang.Object r0 = r1.f229c
            com.google.firebase.messaging.FirebaseMessagingService r0 = (com.google.firebase.messaging.FirebaseMessagingService) r0
            java.lang.String r3 = "notification"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.Notification r3 = r15.a()
            r0.notify(r2, r7, r3)
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0009h.z():boolean");
    }

    public /* synthetic */ C0009h(Object obj, Object obj2, Object obj3, int i2) {
        this.f227a = i2;
        this.f228b = obj;
        this.f229c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ C0009h(Object obj, Object obj2, Object obj3, int i2, boolean z3) {
        this.f227a = i2;
        this.f228b = obj2;
        this.f229c = obj3;
        this.d = obj;
    }

    public C0009h(Context context, C0212u0 u0Var) {
        this.f227a = 22;
        this.d = new AtomicLong(-1);
        Context context2 = context;
        this.f229c = new com.google.android.gms.common.api.l(context2, (Activity) null, B1.c.f339a, new C0393w("measurement:api"), com.google.android.gms.common.api.k.f6119c);
        this.f228b = u0Var;
    }

    public C0009h(Uri uri) {
        this.f227a = 27;
        this.d = uri;
        Uri uri2 = W3.b.f4074j;
        this.f228b = uri2;
        Uri.Builder appendEncodedPath = uri2.buildUpon().appendPath("b").appendEncodedPath(uri.getAuthority());
        String f02 = com.bumptech.glide.c.f0(uri.getPath());
        if (f02.length() > 0 && !"/".equals(f02)) {
            appendEncodedPath = appendEncodedPath.appendPath("o").appendPath(f02);
        }
        this.f229c = appendEncodedPath.build();
    }

    public C0009h(T t6, S s6, C0336b bVar) {
        this.f227a = 29;
        kotlin.jvm.internal.j.e(t6, "store");
        kotlin.jvm.internal.j.e(bVar, "defaultCreationExtras");
        this.f228b = t6;
        this.f229c = s6;
        this.d = bVar;
    }

    public C0009h(F3.h hVar, String str, p pVar) {
        this.f227a = 9;
        kotlin.jvm.internal.j.e(hVar, "functionsClient");
        this.f228b = hVar;
        this.f229c = str;
        this.d = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0009h(T t6, S s6) {
        this(t6, s6, (C0336b) C0335a.f5576b);
        this.f227a = 29;
        kotlin.jvm.internal.j.e(t6, "store");
    }

    public C0009h(FirebaseMessagingService firebaseMessagingService, S3.t tVar, ExecutorService executorService) {
        this.f227a = 20;
        this.f228b = executorService;
        this.f229c = firebaseMessagingService;
        this.d = tVar;
    }

    private final void F() {
    }

    private final void G() {
    }

    public void f() {
    }

    public C0009h(byte[] bArr) {
        this.f227a = 19;
        P2.p.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f228b = secretKeySpec;
        if (C0552a.d(1)) {
            Cipher cipher = (Cipher) j.f2176b.f2178a.b("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] j6 = K1.e.j(cipher.doFinal(new byte[16]));
            this.f229c = j6;
            this.d = K1.e.j(j6);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public C0009h(Runnable runnable) {
        this.f227a = 13;
        this.f229c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f228b = runnable;
    }

    public C0009h(z zVar, B b6, d dVar, Set set) {
        this.f227a = 28;
        this.f228b = b6;
        this.f229c = zVar;
        this.d = dVar;
        if (!set.isEmpty()) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                int[] iArr = (int[]) it2.next();
                String str = new String(iArr, 0, iArr.length);
                B(str, 0, str.length(), 1, true, new C0261a(str, 1));
            }
        }
    }

    public C0009h(U0.l lVar, ArrayList arrayList, C0.g gVar) {
        this.f227a = 11;
        U0.g.c(gVar, "Argument must not be null");
        this.f229c = gVar;
        U0.g.c(arrayList, "Argument must not be null");
        this.d = arrayList;
        this.f228b = new com.bumptech.glide.load.data.h(lVar, gVar);
    }

    public C0009h(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C0.g gVar) {
        this.f227a = 12;
        U0.g.c(gVar, "Argument must not be null");
        this.f228b = gVar;
        U0.g.c(arrayList, "Argument must not be null");
        this.f229c = arrayList;
        this.d = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }

    public C0009h(ConcurrentHashMap concurrentHashMap, C2.k kVar, M2.a aVar, Class cls) {
        this.f227a = 4;
        this.f228b = concurrentHashMap;
        this.f229c = kVar;
        this.d = aVar;
    }

    public C0009h(q qVar, Q0.f fVar, u uVar) {
        this.f227a = 2;
        this.d = qVar;
        this.f229c = fVar;
        this.f228b = uVar;
    }

    public C0009h(g0 g0Var, List list) {
        this.f227a = 3;
        this.f228b = g0Var;
        this.f229c = list;
        this.d = M2.a.f1819b;
    }
}
