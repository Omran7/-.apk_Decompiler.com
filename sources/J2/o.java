package J2;

import C.d;
import E3.b;
import F3.e;
import O2.X;
import O2.r0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import c1.h;
import c1.l;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.fragments.gangBase.I;
import g3.C0550c;
import g3.n;
import g3.p;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import k.C0671K0;
import k.C0681P0;
import k.C0740u;

public final class o implements C0550c {

    /* renamed from: a  reason: collision with root package name */
    public Object f1317a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1318b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1319c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1320e;

    /* renamed from: f  reason: collision with root package name */
    public Object f1321f;

    public static boolean j(int[] iArr, int i2) {
        for (int i5 : iArr) {
            if (i5 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, J2.o] */
    public static o l(String str, C0404i iVar, X x6, r0 r0Var, Integer num) {
        if (r0Var == r0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        ? obj = new Object();
        obj.f1317a = str;
        obj.f1318b = t.b(str);
        obj.f1319c = iVar;
        obj.d = x6;
        obj.f1320e = r0Var;
        obj.f1321f = num;
        return obj;
    }

    public static ColorStateList m(Context context, int i2) {
        int c3 = C0681P0.c(context, R.attr.colorControlHighlight);
        int b6 = C0681P0.b(context, R.attr.colorButtonNormal);
        int[] iArr = C0681P0.f9216b;
        int[] iArr2 = C0681P0.d;
        int b7 = d.b(c3, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, C0681P0.f9217c, C0681P0.f9219f}, new int[]{b6, b7, d.b(c3, i2), i2});
    }

    public static LayerDrawable o(C0671K0 k02, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable c3 = k02.c(context, R.drawable.abc_star_black_48dp);
        Drawable c6 = k02.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c3 instanceof BitmapDrawable) && c3.getIntrinsicWidth() == dimensionPixelSize && c3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) c3;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c3.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((c6 instanceof BitmapDrawable) && c6.getIntrinsicWidth() == dimensionPixelSize && c6.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c6;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c6.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void r(Drawable drawable, int i2, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0740u.f9389b;
        }
        mutate.setColorFilter(C0740u.c(i2, mode));
    }

    public Object a(Class cls) {
        if (((Set) this.f1317a).contains(p.a(cls))) {
            Object a6 = ((C0550c) this.f1321f).a(cls);
            if (!cls.equals(b.class)) {
                return a6;
            }
            b bVar = (b) a6;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    public K3.b b(p pVar) {
        if (((Set) this.f1318b).contains(pVar)) {
            return ((C0550c) this.f1321f).b(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    public K3.b c(Class cls) {
        return b(p.a(cls));
    }

    public Set d(p pVar) {
        if (((Set) this.d).contains(pVar)) {
            return ((C0550c) this.f1321f).d(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    public Object e(p pVar) {
        if (((Set) this.f1317a).contains(pVar)) {
            return ((C0550c) this.f1321f).e(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + pVar + ".");
    }

    public K3.b f(p pVar) {
        if (((Set) this.f1320e).contains(pVar)) {
            return ((C0550c) this.f1321f).f(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<Set<" + pVar + ">>.");
    }

    public n g(p pVar) {
        if (((Set) this.f1319c).contains(pVar)) {
            return ((C0550c) this.f1321f).g(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + pVar + ">.");
    }

    public n h(Class cls) {
        return g(p.a(cls));
    }

    public void i(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1320e;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public h k() {
        String str;
        if (((String) this.f1317a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((l) this.f1318b) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1319c) == null) {
            str = o3.d.f(str, " eventMillis");
        }
        if (((Long) this.d) == null) {
            str = o3.d.f(str, " uptimeMillis");
        }
        if (((HashMap) this.f1320e) == null) {
            str = o3.d.f(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new h((String) this.f1317a, (Integer) this.f1321f, (l) this.f1318b, ((Long) this.f1319c).longValue(), ((Long) this.d).longValue(), (HashMap) this.f1320e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    public Task n(Task task) {
        return task.continueWith(new Object(), new e((Object) this, 2));
    }

    public ColorStateList p(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return A.h.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i2 == 2131165291) {
            return A.h.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i2 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d6 = C0681P0.d(context, R.attr.colorSwitchThumbNormal);
            if (d6 == null || !d6.isStateful()) {
                iArr[0] = C0681P0.f9216b;
                iArr2[0] = C0681P0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = C0681P0.f9218e;
                iArr2[1] = C0681P0.c(context, R.attr.colorControlActivated);
                iArr[2] = C0681P0.f9219f;
                iArr2[2] = C0681P0.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = C0681P0.f9216b;
                iArr[0] = iArr3;
                iArr2[0] = d6.getColorForState(iArr3, 0);
                iArr[1] = C0681P0.f9218e;
                iArr2[1] = C0681P0.c(context, R.attr.colorControlActivated);
                iArr[2] = C0681P0.f9219f;
                iArr2[2] = d6.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
            return m(context, C0681P0.c(context, R.attr.colorButtonNormal));
        } else {
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return m(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return m(context, C0681P0.c(context, R.attr.colorAccent));
            }
            if (i2 == 2131165286 || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return A.h.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (j((int[]) this.f1318b, i2)) {
                return C0681P0.d(context, R.attr.colorControlNormal);
            }
            if (j((int[]) this.f1320e, i2)) {
                return A.h.getColorStateList(context, R.color.abc_tint_default);
            }
            if (j((int[]) this.f1321f, i2)) {
                return A.h.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return A.h.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        /*
            r1 = this;
            java.lang.String r0 = "scope"
            r4.putString(r0, r3)
            java.lang.String r3 = "sender"
            r4.putString(r3, r2)
            java.lang.String r3 = "subtype"
            r4.putString(r3, r2)
            java.lang.String r2 = "gmp_app_id"
            java.lang.Object r3 = r1.f1317a
            R2.i r3 = (R2.i) r3
            r3.b()
            R2.m r3 = r3.f2492c
            java.lang.String r3 = r3.f2501b
            r4.putString(r2, r3)
            java.lang.String r2 = "gmsv"
            java.lang.Object r3 = r1.f1318b
            I3.e r3 = (I3.e) r3
            monitor-enter(r3)
            int r0 = r3.f1172e     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.PackageInfo r0 = r3.d(r0)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x003a
            int r0 = r0.versionCode     // Catch:{ all -> 0x0037 }
            r3.f1172e = r0     // Catch:{ all -> 0x0037 }
            goto L_0x003a
        L_0x0037:
            r2 = move-exception
            goto L_0x0125
        L_0x003a:
            int r0 = r3.f1172e     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)
            java.lang.String r3 = java.lang.Integer.toString(r0)
            r4.putString(r2, r3)
            java.lang.String r2 = "osv"
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r4.putString(r2, r3)
            java.lang.String r2 = "app_ver"
            java.lang.Object r3 = r1.f1318b
            I3.e r3 = (I3.e) r3
            java.lang.String r3 = r3.a()
            r4.putString(r2, r3)
            java.lang.String r2 = "app_ver_name"
            java.lang.Object r3 = r1.f1318b
            r0 = r3
            I3.e r0 = (I3.e) r0
            monitor-enter(r0)
            java.io.Serializable r3 = r0.d     // Catch:{ all -> 0x006e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0071
            r0.g()     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r2 = move-exception
            goto L_0x0123
        L_0x0071:
            java.io.Serializable r3 = r0.d     // Catch:{ all -> 0x006e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x006e }
            monitor-exit(r0)
            r4.putString(r2, r3)
            java.lang.String r2 = "firebase-app-name-hash"
            java.lang.Object r3 = r1.f1317a
            R2.i r3 = (R2.i) r3
            r3.b()
            java.lang.String r3 = r3.f2491b
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0099 }
            byte[] r3 = r3.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x0099 }
            byte[] r3 = r0.digest(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0099 }
            r0 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            java.lang.String r3 = "[HASH-ERROR]"
        L_0x009b:
            r4.putString(r2, r3)
            java.lang.Object r2 = r1.f1321f     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            L3.e r2 = (L3.e) r2     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            L3.d r2 = (L3.d) r2     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            com.google.android.gms.tasks.Task r2 = r2.d()     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            L3.a r2 = (L3.a) r2     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            java.lang.String r2 = r2.f1709a     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = "Goog-Firebase-Installations-Auth"
            r4.putString(r3, r2)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            goto L_0x00cf
        L_0x00bc:
            r2 = move-exception
            goto L_0x00c8
        L_0x00be:
            r2 = move-exception
            goto L_0x00c8
        L_0x00c0:
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r2, r3)     // Catch:{ ExecutionException -> 0x00be, InterruptedException -> 0x00bc }
            goto L_0x00cf
        L_0x00c8:
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r0 = "Failed to get FIS auth token"
            android.util.Log.e(r3, r0, r2)
        L_0x00cf:
            java.lang.String r2 = "appid"
            java.lang.Object r3 = r1.f1321f
            L3.e r3 = (L3.e) r3
            L3.d r3 = (L3.d) r3
            com.google.android.gms.tasks.Task r3 = r3.c()
            java.lang.Object r3 = com.google.android.gms.tasks.Tasks.await(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4.putString(r2, r3)
            java.lang.String r2 = "cliv"
            java.lang.String r3 = "fcm-24.1.1"
            r4.putString(r2, r3)
            java.lang.Object r2 = r1.f1320e
            K3.b r2 = (K3.b) r2
            java.lang.Object r2 = r2.get()
            H3.h r2 = (H3.h) r2
            java.lang.Object r3 = r1.d
            K3.b r3 = (K3.b) r3
            java.lang.Object r3 = r3.get()
            U3.b r3 = (U3.b) r3
            if (r2 == 0) goto L_0x0122
            if (r3 == 0) goto L_0x0122
            H3.e r2 = (H3.e) r2
            int r2 = r2.a()
            r0 = 1
            if (r2 == r0) goto L_0x0122
            java.lang.String r0 = "Firebase-Client-Log-Type"
            int r2 = q.C0928e.c(r2)
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r4.putString(r0, r2)
            java.lang.String r2 = "Firebase-Client"
            java.lang.String r3 = r3.a()
            r4.putString(r2, r3)
        L_0x0122:
            return
        L_0x0123:
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r2
        L_0x0125:
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.o.q(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public Task s(String str, String str2, Bundle bundle) {
        try {
            q(str, str2, bundle);
            return ((y1.b) this.f1319c).a(bundle);
        } catch (InterruptedException | ExecutionException e6) {
            return Tasks.forException(e6);
        }
    }

    public Task t(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task<TContinuationResult> continueWithTask;
        String str2 = "*";
        if (zzae.zzc(str)) {
            str = str2;
        }
        Task<TContinuationResult> u6 = u(str);
        if (bool.booleanValue() || u6 == null) {
            if (!zzae.zzc(str)) {
                str2 = str;
            }
            if (bool.booleanValue() || (continueWithTask = u(str2)) == null) {
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f1320e;
                continueWithTask = firebaseAuth.f6865e.zza(firebaseAuth.f6867i, "RECAPTCHA_ENTERPRISE").continueWithTask(new X4.d(this, str2, 18));
            }
            u6 = continueWithTask;
        }
        return u6.continueWithTask(new I(recaptchaAction, 23));
    }

    public Task u(String str) {
        Task task;
        synchronized (this.f1317a) {
            task = (Task) ((HashMap) this.f1318b).get(str);
        }
        return task;
    }
}
