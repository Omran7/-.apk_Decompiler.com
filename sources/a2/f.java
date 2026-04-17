package A2;

import B0.H;
import B0.l;
import H.j;
import K.O;
import K1.e;
import N3.b;
import Y4.D;
import Z4.g;
import a3.C0261a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.util.AttributeSet;
import android.widget.ImageView;
import c1.i;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.internal.C0358l;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.M;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.o0;
import com.mtma.criminal.city.utils.u0;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e.C0476a;
import h0.C0552a;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.p;
import i3.q;
import j4.C0639o;
import j4.Z;
import j4.p0;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.KeyGenerator;
import k.C0684R0;
import k.C0724m;
import k.C0725m0;
import k.C0740u;
import q.C0928e;
import v4.C1052a;

public final class f implements q, o0, T, p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f28a;

    /* renamed from: b  reason: collision with root package name */
    public int f29b;

    /* renamed from: c  reason: collision with root package name */
    public Object f30c;
    public Object d;

    public f(int i2, String str, ArrayList arrayList) {
        this.f28a = 22;
        this.f29b = i2;
        this.d = str;
        this.f30c = arrayList;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r15v14, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r10v21, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static A2.f h(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            r0 = r29
            r1 = r31
            java.lang.String r2 = "gradient"
            android.content.res.XmlResourceParser r3 = r29.getXml(r30)
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)
        L_0x000e:
            int r5 = r3.next()
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L_0x0019
            if (r5 == r7) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r5 != r6) goto L_0x028b
            java.lang.String r5 = r3.getName()
            r5.getClass()
            r8 = 0
            boolean r9 = r5.equals(r2)
            if (r9 != 0) goto L_0x005d
            java.lang.String r2 = "selector"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = B.c.b(r0, r3, r4, r1)
            A2.f r1 = new A2.f
            int r2 = r0.getDefaultColor()
            r1.<init>((android.graphics.Shader) r8, (android.content.res.ColorStateList) r0, (int) r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r5 = r3.getName()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x026d
            int[] r2 = y.C1106a.d
            android.content.res.TypedArray r2 = B.b.f(r0, r1, r4, r2)
            java.lang.String r5 = "startX"
            boolean r5 = B.b.c(r3, r5)
            r9 = 0
            if (r5 != 0) goto L_0x0078
            r11 = r9
            goto L_0x007f
        L_0x0078:
            r5 = 8
            float r5 = r2.getFloat(r5, r9)
            r11 = r5
        L_0x007f:
            java.lang.String r5 = "startY"
            boolean r5 = B.b.c(r3, r5)
            if (r5 != 0) goto L_0x0089
            r12 = r9
            goto L_0x0090
        L_0x0089:
            r5 = 9
            float r5 = r2.getFloat(r5, r9)
            r12 = r5
        L_0x0090:
            java.lang.String r5 = "endX"
            boolean r5 = B.b.c(r3, r5)
            if (r5 != 0) goto L_0x009a
            r13 = r9
            goto L_0x00a1
        L_0x009a:
            r5 = 10
            float r5 = r2.getFloat(r5, r9)
            r13 = r5
        L_0x00a1:
            java.lang.String r5 = "endY"
            boolean r5 = B.b.c(r3, r5)
            if (r5 != 0) goto L_0x00ab
            r14 = r9
            goto L_0x00b2
        L_0x00ab:
            r5 = 11
            float r5 = r2.getFloat(r5, r9)
            r14 = r5
        L_0x00b2:
            java.lang.String r5 = "centerX"
            boolean r5 = B.b.c(r3, r5)
            r10 = 3
            if (r5 != 0) goto L_0x00bd
            r5 = r9
            goto L_0x00c1
        L_0x00bd:
            float r5 = r2.getFloat(r10, r9)
        L_0x00c1:
            java.lang.String r15 = "centerY"
            boolean r15 = B.b.c(r3, r15)
            if (r15 != 0) goto L_0x00cb
            r15 = r9
            goto L_0x00d0
        L_0x00cb:
            r15 = 4
            float r15 = r2.getFloat(r15, r9)
        L_0x00d0:
            java.lang.String r8 = "type"
            boolean r8 = B.b.c(r3, r8)
            r10 = 0
            if (r8 != 0) goto L_0x00db
            r8 = r10
            goto L_0x00df
        L_0x00db:
            int r8 = r2.getInt(r6, r10)
        L_0x00df:
            java.lang.String r6 = "startColor"
            boolean r6 = B.b.c(r3, r6)
            if (r6 != 0) goto L_0x00e9
            r6 = r10
            goto L_0x00ed
        L_0x00e9:
            int r6 = r2.getColor(r10, r10)
        L_0x00ed:
            java.lang.String r9 = "centerColor"
            boolean r19 = B.b.c(r3, r9)
            boolean r9 = B.b.c(r3, r9)
            if (r9 != 0) goto L_0x00fb
            r9 = r10
            goto L_0x0100
        L_0x00fb:
            r9 = 7
            int r9 = r2.getColor(r9, r10)
        L_0x0100:
            java.lang.String r7 = "endColor"
            boolean r7 = B.b.c(r3, r7)
            if (r7 != 0) goto L_0x010a
            r7 = r10
            goto L_0x0111
        L_0x010a:
            r7 = 1
            int r21 = r2.getColor(r7, r10)
            r7 = r21
        L_0x0111:
            java.lang.String r10 = "tileMode"
            boolean r10 = B.b.c(r3, r10)
            if (r10 != 0) goto L_0x011d
            r22 = r5
            r5 = 0
            goto L_0x0126
        L_0x011d:
            r10 = 6
            r22 = r5
            r5 = 0
            int r10 = r2.getInt(r10, r5)
            r5 = r10
        L_0x0126:
            java.lang.String r10 = "gradientRadius"
            boolean r10 = B.b.c(r3, r10)
            if (r10 != 0) goto L_0x0132
            r23 = r15
            r10 = 0
            goto L_0x013a
        L_0x0132:
            r10 = 5
            r23 = r15
            r15 = 0
            float r10 = r2.getFloat(r10, r15)
        L_0x013a:
            r2.recycle()
            int r2 = r3.getDepth()
            r15 = 1
            int r2 = r2 + r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r24 = r10
            r10 = 20
            r15.<init>(r10)
            r25 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r10)
        L_0x0153:
            int r10 = r3.next()
            r26 = r13
            r13 = 1
            if (r10 == r13) goto L_0x01c9
            int r13 = r3.getDepth()
            r27 = r12
            if (r13 >= r2) goto L_0x0167
            r12 = 3
            if (r10 == r12) goto L_0x01cb
        L_0x0167:
            r12 = 2
            if (r10 == r12) goto L_0x016f
        L_0x016a:
            r13 = r26
            r12 = r27
            goto L_0x0153
        L_0x016f:
            if (r13 > r2) goto L_0x016a
            java.lang.String r10 = r3.getName()
            java.lang.String r12 = "item"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x017e
            goto L_0x016a
        L_0x017e:
            int[] r10 = y.C1106a.f12611e
            android.content.res.TypedArray r10 = B.b.f(r0, r1, r4, r10)
            r12 = 0
            boolean r13 = r10.hasValue(r12)
            r12 = 1
            boolean r20 = r10.hasValue(r12)
            if (r13 == 0) goto L_0x01ae
            if (r20 == 0) goto L_0x01ae
            r13 = 0
            int r21 = r10.getColor(r13, r13)
            r13 = 0
            float r28 = r10.getFloat(r12, r13)
            r10.recycle()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r21)
            r14.add(r10)
            java.lang.Float r10 = java.lang.Float.valueOf(r28)
            r15.add(r10)
            goto L_0x016a
        L_0x01ae:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c9:
            r27 = r12
        L_0x01cb:
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x01d7
            I3.h r0 = new I3.h
            r0.<init>((java.util.ArrayList) r14, (java.util.ArrayList) r15)
            goto L_0x01d8
        L_0x01d7:
            r0 = 0
        L_0x01d8:
            if (r0 == 0) goto L_0x01dc
        L_0x01da:
            r1 = 1
            goto L_0x01ea
        L_0x01dc:
            if (r19 == 0) goto L_0x01e4
            I3.h r0 = new I3.h
            r0.<init>((int) r6, (int) r9, (int) r7)
            goto L_0x01da
        L_0x01e4:
            I3.h r0 = new I3.h
            r0.<init>((int) r6, (int) r7)
            goto L_0x01da
        L_0x01ea:
            if (r8 == r1) goto L_0x022a
            r2 = 2
            if (r8 == r2) goto L_0x0217
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            if (r5 == r1) goto L_0x01fd
            if (r5 == r2) goto L_0x01fa
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
        L_0x01f7:
            r17 = r1
            goto L_0x0200
        L_0x01fa:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01f7
        L_0x01fd:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x01f7
        L_0x0200:
            java.lang.Object r1 = r0.f1179b
            r15 = r1
            int[] r15 = (int[]) r15
            java.lang.Object r0 = r0.f1180c
            r16 = r0
            float[] r16 = (float[]) r16
            r1 = 0
            r10 = r3
            r12 = r27
            r13 = r26
            r14 = r25
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x025e
        L_0x0217:
            r1 = 0
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            java.lang.Object r2 = r0.f1179b
            int[] r2 = (int[]) r2
            java.lang.Object r0 = r0.f1180c
            float[] r0 = (float[]) r0
            r9 = r22
            r15 = r23
            r3.<init>(r9, r15, r2, r0)
            goto L_0x025e
        L_0x022a:
            r9 = r22
            r15 = r23
            r1 = 0
            r2 = 0
            int r2 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0265
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            r2 = 1
            if (r5 == r2) goto L_0x0244
            r2 = 2
            if (r5 == r2) goto L_0x0241
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
        L_0x023e:
            r21 = r2
            goto L_0x0247
        L_0x0241:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x023e
        L_0x0244:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x023e
        L_0x0247:
            java.lang.Object r2 = r0.f1179b
            r19 = r2
            int[] r19 = (int[]) r19
            java.lang.Object r0 = r0.f1180c
            r20 = r0
            float[] r20 = (float[]) r20
            r0 = r15
            r15 = r3
            r16 = r9
            r17 = r0
            r18 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21)
        L_0x025e:
            A2.f r0 = new A2.f
            r2 = 0
            r0.<init>((android.graphics.Shader) r3, (android.content.res.ColorStateList) r2, (int) r1)
            return r0
        L_0x0265:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x026d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x028b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.f.h(android.content.res.Resources, int, android.content.res.Resources$Theme):A2.f");
    }

    public void B(C0588d dVar) {
        switch (this.f28a) {
            case 5:
            case ModuleDescriptor.MODULE_VERSION /*11*/:
            case 12:
            case 14:
            case 15:
            case 17:
                return;
            case 20:
                ((C1052a) ((p0) this.d).f9075b).f12325n0.add(Integer.valueOf(this.f29b));
                return;
            case 21:
                ((C1052a) ((C0724m) this.d).f9345b).f12325n0.add(Integer.valueOf(this.f29b));
                return;
            default:
                return;
        }
    }

    public void a() {
        C0684R0 r02;
        ImageView imageView = (ImageView) this.f30c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C0725m0.a(drawable);
        }
        if (drawable != null && (r02 = (C0684R0) this.d) != null) {
            C0740u.e(drawable, r02, imageView.getDrawableState());
        }
    }

    public b b() {
        if ("".isEmpty()) {
            return new b((String) this.f30c, ((Long) this.d).longValue(), this.f29b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public void c(boolean z3) {
        switch (this.f28a) {
            case 8:
                if (z3) {
                    e.t0(this.f29b, new I(this, 14));
                    return;
                }
                R2.b.w(false);
                boolean equals = ((String) this.d).equals("gold");
                Context context = (Context) this.f30c;
                if (equals) {
                    c.y0(context);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context, (String) null);
                    return;
                }
            default:
                if (z3) {
                    String id = o.getAccountObject().getId();
                    String z4 = android.support.v4.media.session.a.z();
                    D d6 = (D) this.f30c;
                    android.support.v4.media.session.a.B0(d6.f4293a, d6.f4294b, d6.f4298i, this.f29b, new K(this, 25), id, z4, true);
                    return;
                }
                R2.b.w(false);
                Z z5 = (Z) this.d;
                int i2 = z5.d;
                Context context2 = z5.f8965b;
                if (i2 == 0) {
                    c.y0(context2);
                    return;
                } else if (i2 == 1) {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context2, (String) null);
                    return;
                } else {
                    return;
                }
        }
    }

    public void d(int i2, boolean z3) {
        switch (this.f28a) {
            case zzaky.zzf.zzg /*7*/:
                M m6 = (M) this.d;
                if (this.f29b == I1.b.U(m6.f7365b).size() - 1) {
                    R2.b.w(false);
                    R2.b.M0(R.raw.add_new_item);
                    v0.f(m6.f7366c, (ArrayList) this.f30c, (u0) null);
                    return;
                }
                return;
            default:
                D d6 = (D) this.f30c;
                if (z3) {
                    long j6 = d6.f4297f / 2;
                    U.g(o.getAccountObject().getId(), "cash", j6 * ((long) this.f29b), new l((Object) this, i2, 20));
                    return;
                }
                R2.b.w(false);
                C0639o oVar = (C0639o) this.d;
                a.n(MyApplication.f7090a, R.string.no_enough_items, oVar.f9065a, (String) null);
                if (i2 <= 0) {
                    oVar.remove((D) oVar.getItem(oVar.getPosition(d6)));
                } else if (o.getLocationObject().getCurrentCity() == 0 || !d6.f4304o) {
                    ((D) oVar.getItem(oVar.getPosition(d6))).h = i2;
                } else {
                    ((D) oVar.getItem(oVar.getPosition(d6))).h = i2 + 1;
                }
                oVar.notifyDataSetChanged();
                return;
        }
    }

    public C0261a e() {
        int i2 = this.f29b;
        if (i2 == 0 && ((KeyGenParameterSpec) this.d) == null) {
            throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
        }
        if (i2 == 1) {
            this.d = new KeyGenParameterSpec.Builder((String) this.f30c, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
        }
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.d;
        if (keyGenParameterSpec != null) {
            Object obj = o0.c.f10423a;
            if (keyGenParameterSpec.getKeySize() != 256) {
                throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
            } else if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
            } else if (keyGenParameterSpec.getPurposes() != 3) {
                throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
            } else if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
            } else if (!keyGenParameterSpec.isUserAuthenticationRequired() || keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() >= 1) {
                synchronized (o0.c.f10423a) {
                    String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    instance.load((KeyStore.LoadStoreParameter) null);
                    if (!instance.containsAlias(keystoreAlias)) {
                        try {
                            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            instance2.init(keyGenParameterSpec);
                            instance2.generateKey();
                        } catch (ProviderException e6) {
                            throw new GeneralSecurityException(e6.getMessage(), e6);
                        }
                    }
                }
                return new C0261a((Object) (KeyGenParameterSpec) this.d, keyGenParameterSpec.getKeystoreAlias());
            } else {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
        } else {
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }
    }

    public H f(C0595k kVar) {
        if (kVar.b() == null) {
            return R2.b.W0(kVar);
        }
        int intValue = ((Integer) kVar.c(Integer.class)).intValue();
        boolean equals = ((String) this.f30c).equals("stockSpace");
        int i2 = this.f29b;
        if (equals && intValue + i2 > 10000) {
            return R2.b.a();
        }
        kVar.d(Integer.valueOf(intValue + i2));
        return R2.b.W0(kVar);
    }

    public n g() {
        e eVar = (e) this.d;
        if (eVar == null) {
            n a6 = n.a(this.f29b, (Object[]) this.f30c, this);
            e eVar2 = (e) this.d;
            if (eVar2 == null) {
                return a6;
            }
            throw eVar2.a();
        }
        throw eVar.a();
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (((Shader) this.f30c) != null || (colorStateList = (ColorStateList) this.d) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public void j(AttributeSet attributeSet, int i2) {
        ImageView imageView = (ImageView) this.f30c;
        Context context = imageView.getContext();
        int[] iArr = C0476a.f7536f;
        i A6 = i.A(context, attributeSet, iArr, i2);
        O.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) A6.f5606c, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) A6.f5606c;
            if (drawable == null) {
                int resourceId = typedArray.getResourceId(1, -1);
                if (!(resourceId == -1 || (drawable = R2.b.J(imageView.getContext(), resourceId)) == null)) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                C0725m0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                Q.f.c(imageView, A6.m(2));
            }
            if (typedArray.hasValue(3)) {
                Q.f.d(imageView, C0725m0.b(typedArray.getInt(3, -1), (PorterDuff.Mode) null));
            }
            A6.G();
        } catch (Throwable th) {
            A6.G();
            throw th;
        }
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        int intValue = ((Integer) cVar.f(Integer.class)).intValue();
        o0 o0Var = (o0) this.d;
        if (dVar != null || !cVar.b() || !z3) {
            o0Var.d(intValue, false);
            return;
        }
        String str = (String) this.f30c;
        if (str.equals("stockSpace")) {
            o.getStockObject().setStockSpace(intValue);
        } else if (str.equals("stallSpace")) {
            o.getStockObject().setStallSpace(intValue);
        } else if (str.equals("museumSpace")) {
            o.getStockObject().setMuseumSpace(intValue);
        }
        o0Var.d(intValue, true);
    }

    public void s(g gVar) {
        boolean z3 = gVar.isAllProcessSuccess;
        Z z4 = (Z) this.d;
        if (z3) {
            ((Y4.l) z4.getItem(z4.getPosition((Y4.l) this.f30c))).h = this.f29b;
            z4.notifyDataSetChanged();
            R2.b.w(false);
            v0.e(z4.f8965b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
            R2.b.M0(R.raw.add_new_item);
            return;
        }
        R2.b.w(false);
        if (!gVar.isPositionAllowedChangeOtherPlayerPosition) {
            a.n(MyApplication.f7090a, R.string.dialog_gang_position_not_allowed_to_take_action, z4.f8965b, (String) null);
        } else if (!gVar.isPositionAvailable) {
            a.n(MyApplication.f7090a, R.string.dialog_gang_position_reach_maximum, z4.f8965b, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, z4.f8965b, (String) null);
        }
    }

    public void t(Object obj, Object obj2) {
        int i2 = (this.f29b + 1) * 2;
        Object[] objArr = (Object[]) this.f30c;
        if (i2 > objArr.length) {
            this.f30c = Arrays.copyOf(objArr, e.o(objArr.length, i2));
        }
        d.c(obj, obj2);
        Object[] objArr2 = (Object[]) this.f30c;
        int i5 = this.f29b;
        int i6 = i5 * 2;
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        this.f29b = i5 + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0380, code lost:
        r14 = (double) r10;
        r16 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0395, code lost:
        if (d5.o.getSchoolObject().getLawLessons().get(0).intValue() != 2) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0397, code lost:
        r16 = com.bumptech.glide.c.H(0, 0) + 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x039d, code lost:
        if (r0 != 10) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03b1, code lost:
        if (d5.o.getSchoolObject().getScienceLessons().get(2).intValue() != 2) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03b3, code lost:
        r16 = com.bumptech.glide.c.H(3, 2) + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03bb, code lost:
        if (r0 != 16) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03cf, code lost:
        if (d5.o.getSchoolObject().getScienceLessons().get(4).intValue() != 2) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03d1, code lost:
        r18 = com.bumptech.glide.c.H(3, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03d5, code lost:
        r16 = r18 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03ea, code lost:
        if (d5.o.getSchoolObject().getScienceLessons().get(1).intValue() != 2) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03ec, code lost:
        r18 = com.bumptech.glide.c.H(3, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03f3, code lost:
        if (r0 != 11) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0407, code lost:
        if (d5.o.getSchoolObject().getHistoryLessons().get(3).intValue() != 2) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0409, code lost:
        r12 = com.bumptech.glide.c.H(2, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x040d, code lost:
        r16 = r12 + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0422, code lost:
        if (d5.o.getSchoolObject().getHistoryLessons().get(1).intValue() != 2) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0424, code lost:
        r12 = com.bumptech.glide.c.H(2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0429, code lost:
        r12 = K1.e.S(15) + r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0437, code lost:
        if (R2.b.i0(607) == false) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0439, code lost:
        r12 = r12 + 0.2d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0440, code lost:
        r12 = (r12 + 1.0d) * r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0449, code lost:
        if (android.support.v4.media.session.a.C(r0, r6) != 0) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x044b, code lost:
        r14 = 0.25d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x044d, code lost:
        r12 = r12 * r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0453, code lost:
        if (android.support.v4.media.session.a.C(r0, r6) != 1) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0455, code lost:
        r14 = 0.5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x045f, code lost:
        if (((double) K1.e.J(0, 100)) > r12) goto L_0x0463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0461, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0463, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0464, code lost:
        r5 = K1.e.J(0, 100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0468, code lost:
        if (r2 == false) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x046a, code lost:
        if (r5 > 20) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x046d, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x046f, code lost:
        if (r5 > 80) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0471, code lost:
        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(i3.C0592h.b().e(), "players"), "mainStatesObject").H(new com.mtma.criminal.city.utils.C0436f(r0, r2, r6, new j4.C(r1, r2, r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x034d, code lost:
        r10 = 40 - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0352, code lost:
        r10 = 45 - r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0357, code lost:
        r10 = 50 - r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(i3.C0587c r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = 4
            r3 = 26
            java.lang.Class<d5.j> r4 = d5.j.class
            java.lang.Class<d5.k> r5 = d5.k.class
            r6 = 24
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.String r8 = "players"
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 2
            r13 = 3
            int r14 = r1.f28a
            switch(r14) {
                case 5: goto L_0x0491;
                case 11: goto L_0x0290;
                case 12: goto L_0x01d0;
                case 14: goto L_0x0167;
                case 15: goto L_0x012a;
                case 17: goto L_0x00ef;
                case 20: goto L_0x009f;
                case 21: goto L_0x004f;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.Class<d5.m> r2 = d5.m.class
            java.lang.Object r0 = r0.f(r2)
            d5.m r0 = (d5.m) r0
            if (r0 == 0) goto L_0x004e
            int r0 = r0.getGold()
            int r2 = r1.f29b
            if (r0 >= r2) goto L_0x003a
            R2.b.w(r11)
            java.lang.Object r0 = r1.d
            y4.e r0 = (y4.C1118e) r0
            com.mtma.criminal.city.activities.MainActivity r0 = r0.f12723d0
            com.bumptech.glide.c.y0(r0)
            goto L_0x004e
        L_0x003a:
            d5.a r0 = d5.o.getAccountObject()
            java.lang.String r0 = r0.getId()
            int r2 = -r2
            long r2 = (long) r2
            k.m r4 = new k.m
            r4.<init>(r1, r6)
            java.lang.String r5 = "gold"
            com.mtma.criminal.city.utils.U.g(r0, r5, r2, r4)
        L_0x004e:
            return
        L_0x004f:
            java.lang.Object r0 = r0.f(r5)
            d5.k r0 = (d5.k) r0
            int r2 = r1.f29b
            java.lang.Object r3 = r1.d
            k.m r3 = (k.C0724m) r3
            if (r0 == 0) goto L_0x0091
            java.lang.String r4 = r0.getNickName()
            java.lang.String r5 = r0.getProfilePicUrl()
            int r6 = r0.getGender()
            long r7 = r0.getVipEndTime()
            boolean r7 = R2.b.k0(r7)
            long r8 = r0.getLastSeen()
            boolean r0 = R2.b.l0(r8)
            java.lang.Object r8 = r1.f30c
            Y4.k r8 = (Y4.k) r8
            r8.f4377c = r4
            r8.d = r5
            r8.f4378e = r6
            r8.f4379f = r7
            r8.g = r0
            java.lang.Object r0 = r3.f9345b
            v4.a r0 = (v4.C1052a) r0
            java.util.ArrayList r0 = r0.f12324m0
            r0.set(r2, r8)
            goto L_0x009e
        L_0x0091:
            java.lang.Object r0 = r3.f9345b
            v4.a r0 = (v4.C1052a) r0
            java.util.ArrayList r0 = r0.f12325n0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L_0x009e:
            return
        L_0x009f:
            java.lang.Object r0 = r0.f(r5)
            d5.k r0 = (d5.k) r0
            int r2 = r1.f29b
            java.lang.Object r3 = r1.d
            j4.p0 r3 = (j4.p0) r3
            if (r0 == 0) goto L_0x00e1
            java.lang.String r4 = r0.getNickName()
            java.lang.String r5 = r0.getProfilePicUrl()
            int r6 = r0.getGender()
            long r7 = r0.getVipEndTime()
            boolean r7 = R2.b.k0(r7)
            long r8 = r0.getLastSeen()
            boolean r0 = R2.b.l0(r8)
            java.lang.Object r8 = r1.f30c
            Y4.k r8 = (Y4.k) r8
            r8.f4377c = r4
            r8.d = r5
            r8.f4378e = r6
            r8.f4379f = r7
            r8.g = r0
            java.lang.Object r0 = r3.f9075b
            v4.a r0 = (v4.C1052a) r0
            java.util.ArrayList r0 = r0.f12324m0
            r0.set(r2, r8)
            goto L_0x00ee
        L_0x00e1:
            java.lang.Object r0 = r3.f9075b
            v4.a r0 = (v4.C1052a) r0
            java.util.ArrayList r0 = r0.f12325n0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L_0x00ee:
            return
        L_0x00ef:
            java.lang.Object r0 = r0.f(r4)
            d5.j r0 = (d5.j) r0
            if (r0 == 0) goto L_0x0129
            int r2 = r0.getCurrentPlace()
            java.lang.Object r4 = r1.d
            j4.M0 r4 = (j4.M0) r4
            if (r2 != r13) goto L_0x010f
            R2.b.w(r11)
            android.content.Context r0 = r4.f8919a
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            r3 = 2131886403(0x7f120143, float:1.9407384E38)
            com.google.android.gms.internal.measurement.a.n(r2, r3, r0, r10)
            goto L_0x0129
        L_0x010f:
            i3.h r2 = i3.C0592h.b()
            i3.f r2 = r2.e()
            i3.f r2 = com.google.android.gms.internal.measurement.a.c(r2, r8)
            java.lang.String r4 = r4.d
            i3.f r2 = r2.E(r4)
            X4.d r4 = new X4.d
            r4.<init>(r1, r0, r3)
            r2.d(r4)
        L_0x0129:
            return
        L_0x012a:
            java.lang.Object r2 = r1.f30c
            i3.f r2 = (i3.C0590f) r2
            java.lang.String r4 = "deletedChats"
            i3.f r2 = r2.E(r4)
            java.lang.Object r4 = r1.d
            j4.h r4 = (j4.C0626h) r4
            int r5 = r1.f29b
            java.lang.Object r4 = r4.getItem(r5)
            b5.l r4 = (b5.l) r4
            java.lang.String r4 = r4.getPlayerId()
            i3.f r2 = r2.E(r4)
            long r4 = com.bumptech.glide.c.f5744o
            java.lang.String r4 = java.lang.String.valueOf(r4)
            i3.f r2 = r2.E(r4)
            v3.m r0 = r0.f8278a
            v3.s r0 = r0.f12296a
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.tasks.Task r0 = r2.I(r0)
            H4.e r2 = new H4.e
            r2.<init>(r1, r3)
            r0.addOnSuccessListener(r2)
            return
        L_0x0167:
            java.lang.Object r0 = r0.f(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r2 = r1.d
            j4.b0 r2 = (j4.C0615b0) r2
            if (r0 == 0) goto L_0x01c2
            int r0 = r0.intValue()
            r2.f8979c = r0
            if (r0 == 0) goto L_0x0197
            if (r0 == r9) goto L_0x0197
            if (r0 == r12) goto L_0x0197
            if (r0 == r13) goto L_0x0197
            R2.b.w(r11)
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r0 = r0.getApplicationContext()
            r3 = 2131887046(0x7f1203c6, float:1.9408688E38)
            java.lang.String r0 = r0.getString(r3)
            android.content.Context r2 = r2.f8978b
            com.bumptech.glide.c.s0(r2, r0, r10)
            goto L_0x01cf
        L_0x0197:
            java.lang.Object r0 = r1.f30c
            Y4.n r0 = (Y4.n) r0
            int r3 = r1.f29b
            if (r3 != 0) goto L_0x01bc
            java.lang.String r3 = r0.f4401a
            java.lang.String r4 = r0.f4402b
            d5.g r5 = d5.o.getGangObject()
            java.lang.String r5 = r5.getId()
            d5.g r7 = d5.o.getGangObject()
            java.lang.String r7 = r7.getName()
            X4.d r8 = new X4.d
            r8.<init>(r2, r0, r6)
            com.bumptech.glide.d.a(r3, r4, r5, r7, r8)
            goto L_0x01cf
        L_0x01bc:
            if (r3 != r9) goto L_0x01cf
            r2.b(r0)
            goto L_0x01cf
        L_0x01c2:
            R2.b.w(r11)
            android.content.Context r0 = r2.f8978b
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            r3 = 2131889016(0x7f120b78, float:1.9412684E38)
            com.google.android.gms.internal.measurement.a.n(r2, r3, r0, r10)
        L_0x01cf:
            return
        L_0x01d0:
            java.lang.Object r0 = r0.f(r4)
            d5.j r0 = (d5.j) r0
            r3 = 2131886367(0x7f12011f, float:1.940731E38)
            java.lang.Object r4 = r1.d
            j4.h r4 = (j4.C0626h) r4
            if (r0 == 0) goto L_0x0281
            int r5 = r0.getCurrentPlace()
            if (r5 != r9) goto L_0x01f8
            R2.b.w(r11)
            android.content.Context r0 = r4.f9018b
            com.mtma.criminal.city.activities.MainActivity r0 = (com.mtma.criminal.city.activities.MainActivity) r0
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            r3 = 2131886363(0x7f12011b, float:1.9407303E38)
            com.google.android.gms.internal.measurement.a.p(r2, r3, r0, r10)
            r4.f9019c = r11
            goto L_0x028f
        L_0x01f8:
            int r5 = r0.getCurrentPlace()
            if (r5 != r12) goto L_0x0211
            R2.b.w(r11)
            android.content.Context r0 = r4.f9018b
            com.mtma.criminal.city.activities.MainActivity r0 = (com.mtma.criminal.city.activities.MainActivity) r0
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            r3 = 2131886365(0x7f12011d, float:1.9407307E38)
            com.google.android.gms.internal.measurement.a.p(r2, r3, r0, r10)
            r4.f9019c = r11
            goto L_0x028f
        L_0x0211:
            int r5 = r0.getCurrentPlace()
            if (r5 != r13) goto L_0x0229
            R2.b.w(r11)
            android.content.Context r0 = r4.f9018b
            com.mtma.criminal.city.activities.MainActivity r0 = (com.mtma.criminal.city.activities.MainActivity) r0
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            r3 = 2131886364(0x7f12011c, float:1.9407305E38)
            com.google.android.gms.internal.measurement.a.p(r2, r3, r0, r10)
            r4.f9019c = r11
            goto L_0x028f
        L_0x0229:
            int r5 = r0.getCurrentPlace()
            if (r5 != r2) goto L_0x0241
            R2.b.w(r11)
            android.content.Context r0 = r4.f9018b
            com.mtma.criminal.city.activities.MainActivity r0 = (com.mtma.criminal.city.activities.MainActivity) r0
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            r3 = 2131886366(0x7f12011e, float:1.9407309E38)
            com.google.android.gms.internal.measurement.a.p(r2, r3, r0, r10)
            r4.f9019c = r11
            goto L_0x028f
        L_0x0241:
            int r2 = r0.getCurrentPlace()
            if (r2 != 0) goto L_0x0272
            int r0 = r0.getCurrentCity()
            i3.h r2 = i3.C0592h.b()
            i3.f r2 = r2.e()
            i3.f r2 = com.google.android.gms.internal.measurement.a.c(r2, r8)
            java.lang.Object r3 = r1.f30c
            Y4.i r3 = (Y4.i) r3
            java.lang.String r3 = r3.f4366a
            i3.f r2 = r2.E(r3)
            java.lang.String r3 = "locationObject"
            i3.f r2 = r2.E(r3)
            B0.l r3 = new B0.l
            r4 = 23
            r3.<init>((java.lang.Object) r1, (int) r0, (int) r4)
            r2.d(r3)
            goto L_0x028f
        L_0x0272:
            R2.b.w(r11)
            android.content.Context r0 = r4.f9018b
            com.mtma.criminal.city.activities.MainActivity r0 = (com.mtma.criminal.city.activities.MainActivity) r0
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            com.google.android.gms.internal.measurement.a.p(r2, r3, r0, r10)
            r4.f9019c = r11
            goto L_0x028f
        L_0x0281:
            R2.b.w(r11)
            android.content.Context r0 = r4.f9018b
            com.mtma.criminal.city.activities.MainActivity r0 = (com.mtma.criminal.city.activities.MainActivity) r0
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            com.google.android.gms.internal.measurement.a.p(r2, r3, r0, r10)
            r4.f9019c = r11
        L_0x028f:
            return
        L_0x0290:
            java.lang.Object r0 = r0.f(r7)     // Catch:{ Exception -> 0x029b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x029b }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x029b }
            goto L_0x02a8
        L_0x029b:
            r0 = move-exception
            int r3 = j4.D.f8855f
            java.lang.String r3 = "Exception from try-catch block inside "
            java.lang.String r4 = "D"
            java.lang.String r5 = " in  method startCrimeExecution when get the crime tool count (ignore it, default value added 0)."
            com.google.android.gms.internal.measurement.a.q(r3, r4, r5, r0, r4)
            r0 = r11
        L_0x02a8:
            java.lang.Object r3 = r1.d
            j4.D r3 = (j4.D) r3
            if (r0 >= r9) goto L_0x02dc
            R2.b.w(r11)
            android.content.Context r0 = r3.f8856a
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r2 = r2.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            Y4.D r5 = r3.f8858c
            int r5 = r5.f4295c
            java.lang.String r4 = r4.getString(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 2131886789(0x7f1202c5, float:1.9408167E38)
            java.lang.String r2 = r2.getString(r5, r4)
            com.bumptech.glide.c.s0(r0, r2, r10)
            r3.d = r11
            r3.notifyDataSetChanged()
            goto L_0x0490
        L_0x02dc:
            int r0 = r3.f8857b
            switch(r0) {
                case 1: goto L_0x0321;
                case 2: goto L_0x031d;
                case 3: goto L_0x0319;
                case 4: goto L_0x0315;
                case 5: goto L_0x0311;
                case 6: goto L_0x030d;
                case 7: goto L_0x0309;
                case 8: goto L_0x0305;
                case 9: goto L_0x0301;
                case 10: goto L_0x02fd;
                case 11: goto L_0x02f9;
                case 12: goto L_0x02f5;
                case 13: goto L_0x02f1;
                case 14: goto L_0x02ed;
                case 15: goto L_0x02e9;
                case 16: goto L_0x02e5;
                default: goto L_0x02e1;
            }
        L_0x02e1:
            r0 = 2131820549(0x7f110005, float:1.9273816E38)
            goto L_0x0324
        L_0x02e5:
            r0 = 2131820557(0x7f11000d, float:1.9273832E38)
            goto L_0x0324
        L_0x02e9:
            r0 = 2131820556(0x7f11000c, float:1.927383E38)
            goto L_0x0324
        L_0x02ed:
            r0 = 2131820555(0x7f11000b, float:1.9273828E38)
            goto L_0x0324
        L_0x02f1:
            r0 = 2131820554(0x7f11000a, float:1.9273826E38)
            goto L_0x0324
        L_0x02f5:
            r0 = 2131820553(0x7f110009, float:1.9273824E38)
            goto L_0x0324
        L_0x02f9:
            r0 = 2131820552(0x7f110008, float:1.9273822E38)
            goto L_0x0324
        L_0x02fd:
            r0 = 2131820551(0x7f110007, float:1.927382E38)
            goto L_0x0324
        L_0x0301:
            r0 = 2131820565(0x7f110015, float:1.9273849E38)
            goto L_0x0324
        L_0x0305:
            r0 = 2131820564(0x7f110014, float:1.9273847E38)
            goto L_0x0324
        L_0x0309:
            r0 = 2131820563(0x7f110013, float:1.9273844E38)
            goto L_0x0324
        L_0x030d:
            r0 = 2131820562(0x7f110012, float:1.9273842E38)
            goto L_0x0324
        L_0x0311:
            r0 = 2131820561(0x7f110011, float:1.927384E38)
            goto L_0x0324
        L_0x0315:
            r0 = 2131820560(0x7f110010, float:1.9273838E38)
            goto L_0x0324
        L_0x0319:
            r0 = 2131820559(0x7f11000f, float:1.9273836E38)
            goto L_0x0324
        L_0x031d:
            r0 = 2131820558(0x7f11000e, float:1.9273834E38)
            goto L_0x0324
        L_0x0321:
            r0 = 2131820550(0x7f110006, float:1.9273818E38)
        L_0x0324:
            R2.b.M0(r0)
            int r0 = r3.f8857b
            r3 = 80
            r4 = 20
            r5 = 100
            int r6 = r1.f29b
            r7 = 10
            switch(r0) {
                case 0: goto L_0x037c;
                case 1: goto L_0x0377;
                case 2: goto L_0x0372;
                case 3: goto L_0x036d;
                case 4: goto L_0x0368;
                case 5: goto L_0x0363;
                case 6: goto L_0x0360;
                case 7: goto L_0x035d;
                case 8: goto L_0x035a;
                case 9: goto L_0x0355;
                case 10: goto L_0x0350;
                case 11: goto L_0x034b;
                case 12: goto L_0x0346;
                case 13: goto L_0x0341;
                case 14: goto L_0x033c;
                case 15: goto L_0x033a;
                case 16: goto L_0x0338;
                default: goto L_0x0336;
            }
        L_0x0336:
            r10 = r11
            goto L_0x0380
        L_0x0338:
            r10 = r7
            goto L_0x0380
        L_0x033a:
            r10 = r4
            goto L_0x0380
        L_0x033c:
            int r10 = r6 * 3
            int r10 = 25 - r10
            goto L_0x0380
        L_0x0341:
            int r10 = r6 * 2
            int r10 = 30 - r10
            goto L_0x0380
        L_0x0346:
            int r10 = r6 * 3
            int r10 = 35 - r10
            goto L_0x0380
        L_0x034b:
            int r10 = r6 * 3
        L_0x034d:
            int r10 = 40 - r10
            goto L_0x0380
        L_0x0350:
            int r10 = r6 * 3
        L_0x0352:
            int r10 = 45 - r10
            goto L_0x0380
        L_0x0355:
            int r10 = r6 * 3
        L_0x0357:
            int r10 = 50 - r10
            goto L_0x0380
        L_0x035a:
            int r10 = r6 * 2
            goto L_0x034d
        L_0x035d:
            int r10 = r6 * 2
            goto L_0x0352
        L_0x0360:
            int r10 = r6 * 2
            goto L_0x0357
        L_0x0363:
            int r10 = r6 * 2
            int r10 = 55 - r10
            goto L_0x0380
        L_0x0368:
            int r10 = r6 * 5
            int r10 = 60 - r10
            goto L_0x0380
        L_0x036d:
            int r10 = r6 * 5
            int r10 = 70 - r10
            goto L_0x0380
        L_0x0372:
            int r10 = r6 * 3
            int r10 = 80 - r10
            goto L_0x0380
        L_0x0377:
            int r10 = r6 * 3
            int r10 = 90 - r10
            goto L_0x0380
        L_0x037c:
            int r10 = r6 * 5
            int r10 = 100 - r10
        L_0x0380:
            double r14 = (double) r10
            d5.q r10 = d5.o.getSchoolObject()
            java.util.ArrayList r10 = r10.getLawLessons()
            java.lang.Object r10 = r10.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r16 = 0
            if (r10 != r12) goto L_0x039d
            double r18 = com.bumptech.glide.c.H(r11, r11)
            double r16 = r18 + r16
        L_0x039d:
            if (r0 != r7) goto L_0x03b9
            d5.q r7 = d5.o.getSchoolObject()
            java.util.ArrayList r7 = r7.getScienceLessons()
            java.lang.Object r7 = r7.get(r12)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r12) goto L_0x03b9
            double r18 = com.bumptech.glide.c.H(r13, r12)
            double r16 = r18 + r16
        L_0x03b9:
            r7 = 16
            if (r0 != r7) goto L_0x03f1
            d5.q r7 = d5.o.getSchoolObject()
            java.util.ArrayList r7 = r7.getScienceLessons()
            java.lang.Object r7 = r7.get(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r12) goto L_0x03d8
            double r18 = com.bumptech.glide.c.H(r13, r2)
        L_0x03d5:
            double r16 = r18 + r16
            goto L_0x03f1
        L_0x03d8:
            d5.q r2 = d5.o.getSchoolObject()
            java.util.ArrayList r2 = r2.getScienceLessons()
            java.lang.Object r2 = r2.get(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r12) goto L_0x03f1
            double r18 = com.bumptech.glide.c.H(r13, r9)
            goto L_0x03d5
        L_0x03f1:
            r2 = 11
            if (r0 != r2) goto L_0x0429
            d5.q r2 = d5.o.getSchoolObject()
            java.util.ArrayList r2 = r2.getHistoryLessons()
            java.lang.Object r2 = r2.get(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r12) goto L_0x0410
            double r12 = com.bumptech.glide.c.H(r12, r13)
        L_0x040d:
            double r16 = r12 + r16
            goto L_0x0429
        L_0x0410:
            d5.q r2 = d5.o.getSchoolObject()
            java.util.ArrayList r2 = r2.getHistoryLessons()
            java.lang.Object r2 = r2.get(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r12) goto L_0x0429
            double r12 = com.bumptech.glide.c.H(r12, r9)
            goto L_0x040d
        L_0x0429:
            r2 = 15
            double r12 = K1.e.S(r2)
            double r12 = r12 + r16
            r2 = 607(0x25f, float:8.5E-43)
            boolean r2 = R2.b.i0(r2)
            if (r2 == 0) goto L_0x0440
            r16 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r12 = r12 + r16
        L_0x0440:
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 + r16
            double r12 = r12 * r14
            int r2 = android.support.v4.media.session.a.C(r0, r6)
            if (r2 != 0) goto L_0x044f
            r14 = 4598175219545276416(0x3fd0000000000000, double:0.25)
        L_0x044d:
            double r12 = r12 * r14
            goto L_0x0458
        L_0x044f:
            int r2 = android.support.v4.media.session.a.C(r0, r6)
            if (r2 != r9) goto L_0x0458
            r14 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x044d
        L_0x0458:
            int r2 = K1.e.J(r11, r5)
            double r14 = (double) r2
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0463
            r2 = r9
            goto L_0x0464
        L_0x0463:
            r2 = r11
        L_0x0464:
            int r5 = K1.e.J(r11, r5)
            if (r2 == 0) goto L_0x046f
            if (r5 > r4) goto L_0x046d
            goto L_0x0471
        L_0x046d:
            r9 = r11
            goto L_0x0471
        L_0x046f:
            if (r5 > r3) goto L_0x046d
        L_0x0471:
            j4.C r3 = new j4.C
            r3.<init>(r1, r2, r9)
            i3.h r4 = i3.C0592h.b()
            i3.f r4 = r4.e()
            i3.f r4 = com.google.android.gms.internal.measurement.a.c(r4, r8)
            java.lang.String r5 = "mainStatesObject"
            i3.f r4 = com.google.android.gms.internal.measurement.a.v(r4, r5)
            com.mtma.criminal.city.utils.f r5 = new com.mtma.criminal.city.utils.f
            r5.<init>(r0, r2, r6, r3)
            r4.H(r5)
        L_0x0490:
            return
        L_0x0491:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "packageName"
            i3.c r3 = r0.a(r3)     // Catch:{ Exception -> 0x04d9 }
            java.lang.Object r3 = r3.f(r2)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = "versionName"
            i3.c r4 = r0.a(r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.Object r2 = r4.f(r2)     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r4 = "versionCode"
            i3.c r4 = r0.a(r4)     // Catch:{ Exception -> 0x04d9 }
            java.lang.Object r4 = r4.f(r7)     // Catch:{ Exception -> 0x04d9 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r5 = "repairing"
            i3.c r0 = r0.a(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            java.lang.Object r0 = r0.f(r5)     // Catch:{ Exception -> 0x04d9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x04d9 }
            java.lang.Object r5 = r1.d
            com.mtma.criminal.city.activities.t r5 = (com.mtma.criminal.city.activities.t) r5
            if (r0 == 0) goto L_0x04db
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x04d9 }
            if (r0 == 0) goto L_0x04db
            com.mtma.criminal.city.activities.StartActivity r0 = r5.f7081b     // Catch:{ Exception -> 0x04d9 }
            com.mtma.criminal.city.activities.StartActivity r0 = r0.f7028I     // Catch:{ Exception -> 0x04d9 }
            com.bumptech.glide.c.u0(r0)     // Catch:{ Exception -> 0x04d9 }
            goto L_0x0517
        L_0x04d9:
            r0 = move-exception
            goto L_0x050e
        L_0x04db:
            java.lang.Object r0 = r1.f30c     // Catch:{ Exception -> 0x04d9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04d9 }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x04d9 }
            if (r0 != 0) goto L_0x04ed
            com.mtma.criminal.city.activities.StartActivity r0 = r5.f7081b     // Catch:{ Exception -> 0x04d9 }
            com.mtma.criminal.city.activities.StartActivity r0 = r0.f7028I     // Catch:{ Exception -> 0x04d9 }
            com.bumptech.glide.c.A0(r0)     // Catch:{ Exception -> 0x04d9 }
            goto L_0x0517
        L_0x04ed:
            if (r2 == 0) goto L_0x0506
            if (r4 == 0) goto L_0x0506
            int r0 = r1.f29b     // Catch:{ Exception -> 0x04d9 }
            int r2 = r4.intValue()     // Catch:{ Exception -> 0x04d9 }
            if (r0 < r2) goto L_0x04fe
            com.mtma.criminal.city.activities.StartActivity r0 = r5.f7081b     // Catch:{ Exception -> 0x04d9 }
            r0.f7035P = r9     // Catch:{ Exception -> 0x04d9 }
            goto L_0x0517
        L_0x04fe:
            com.mtma.criminal.city.activities.StartActivity r0 = r5.f7081b     // Catch:{ Exception -> 0x04d9 }
            com.mtma.criminal.city.activities.StartActivity r0 = r0.f7028I     // Catch:{ Exception -> 0x04d9 }
            com.bumptech.glide.c.z0(r0)     // Catch:{ Exception -> 0x04d9 }
            goto L_0x0517
        L_0x0506:
            com.mtma.criminal.city.activities.StartActivity r0 = r5.f7081b     // Catch:{ Exception -> 0x04d9 }
            com.mtma.criminal.city.activities.StartActivity r0 = r0.f7028I     // Catch:{ Exception -> 0x04d9 }
            com.bumptech.glide.c.s0(r0, r10, r10)     // Catch:{ Exception -> 0x04d9 }
            goto L_0x0517
        L_0x050e:
            boolean r2 = com.mtma.criminal.city.activities.StartActivity.f7025b0
            java.lang.String r2 = "Exception from try-catch block inside StartActivity in checkAppVersion method when getting app version from the app (not firebase)."
            java.lang.String r3 = "StartActivity"
            h0.C0552a.x(r0, r2, r3)
        L_0x0517:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.f.u(i3.c):void");
    }

    public void v(Collection collection) {
        if (collection != null) {
            int size = (collection.size() + this.f29b) * 2;
            Object[] objArr = (Object[]) this.f30c;
            if (size > objArr.length) {
                this.f30c = Arrays.copyOf(objArr, e.o(objArr.length, size));
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            t(entry.getKey(), entry.getValue());
        }
    }

    public void w() {
        if (C0928e.c(1) != 0) {
            throw new IllegalArgumentException("Unsupported scheme: ".concat("AES256_GCM"));
        } else if (((KeyGenParameterSpec) this.d) == null) {
            this.f29b = 1;
        } else {
            throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
        }
    }

    public void x(String str, C0358l lVar) {
        Map map = (Map) this.f30c;
        if (!map.containsKey(str)) {
            map.put(str, lVar);
            if (this.f29b > 0) {
                new zzh(Looper.getMainLooper()).post(new j(this, lVar, str, 13, false));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0552a.o("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public void y(Bundle bundle) {
        Bundle bundle2;
        this.f29b = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f30c).entrySet()) {
            C0358l lVar = (C0358l) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lVar.onCreate(bundle2);
        }
    }

    public void z(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.f30c).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((C0358l) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public /* synthetic */ f(Object obj, int i2, Object obj2, int i5) {
        this.f28a = i5;
        this.d = obj;
        this.f29b = i2;
        this.f30c = obj2;
    }

    public /* synthetic */ f(Object obj, Object obj2, int i2, int i5) {
        this.f28a = i5;
        this.d = obj;
        this.f30c = obj2;
        this.f29b = i2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map, n.j] */
    public f(int i2, byte b6) {
        this.f28a = i2;
        switch (i2) {
            case 4:
                this.f30c = Collections.synchronizedMap(new n.j(0));
                this.f29b = 0;
                return;
            default:
                return;
        }
    }

    public f(ImageView imageView) {
        this.f28a = 18;
        this.f29b = 0;
        this.f30c = imageView;
    }

    public f(Shader shader, ColorStateList colorStateList, int i2) {
        this.f28a = 1;
        this.f30c = shader;
        this.d = colorStateList;
        this.f29b = i2;
    }

    public f(Context context) {
        this.f28a = 19;
        context.getApplicationContext();
        this.f30c = "_androidx_security_master_key_";
    }

    public f(int i2) {
        this.f28a = 0;
        this.f30c = new Object[(i2 * 2)];
        this.f29b = 0;
    }

    public f(z1.j jVar) {
        this.f28a = 2;
        this.d = V0.c.a(150, new x1.i((Object) this, 1));
        this.f30c = jVar;
    }

    public f(String str, int i2, o0 o0Var) {
        this.f28a = 9;
        this.f30c = str;
        this.f29b = i2;
        this.d = o0Var;
    }

    public f(int i2, Context context, String str) {
        this.f28a = 8;
        this.f29b = i2;
        this.f30c = context;
        this.d = str;
    }

    private final void k(C0588d dVar) {
    }

    private final void m(C0588d dVar) {
    }

    private final void n(C0588d dVar) {
    }

    private final void o(C0588d dVar) {
    }

    private final void p(C0588d dVar) {
    }

    private final void q(C0588d dVar) {
    }

    private final void r(C0588d dVar) {
    }
}
