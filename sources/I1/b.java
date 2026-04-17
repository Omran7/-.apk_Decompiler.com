package I1;

import F3.h;
import G5.C0048u;
import G5.F;
import G5.J;
import I5.s;
import K1.e;
import S3.z;
import Y4.C0246c;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c5.C0343b;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.m;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.M;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.Z;
import com.mtma.criminal.city.utils.a0;
import com.mtma.criminal.city.utils.e0;
import com.mtma.criminal.city.utils.f0;
import com.mtma.criminal.city.utils.g0;
import com.mtma.criminal.city.utils.h0;
import d5.C0469b;
import d5.C0475h;
import d5.o;
import d5.q;
import d5.r;
import e5.C0505b;
import h0.C0552a;
import i4.C0596a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import m5.C0846e;
import o3.d;
import org.json.JSONArray;
import org.json.JSONObject;
import p.k;
import q.C0928e;
import s2.u;
import x5.p;
import y1.l;
import z.f;
import z.g;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static Context f1148a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f1149b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f1150c = 0;
    public static boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1151e = false;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1152f = false;

    public static ArrayList A(int i2) {
        switch (i2) {
            case 0:
                return z(4, 6, 7, 10);
            case 1:
                return z(6, 7, 10);
            case 2:
            case zzaky.zzf.zzf /*6*/:
                return z(5, 6, 10);
            case 3:
            case 10:
                return z(5, 7, 10);
            case 4:
                return z(5, 6, 7, 10);
            case 5:
                return z(5, 10);
            case zzaky.zzf.zzg /*7*/:
                return z(5);
            case 8:
                return z(1, 5, 7, 10);
            case 9:
                return z(1, 6, 7, 10);
            default:
                return null;
        }
    }

    public static void A0(String str, String str2, String str3) {
        File file = new File(C0596a.f8296b + "/" + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, d.f(str2, ".jpg"));
        if (file2.exists()) {
            file2.delete();
        }
        j E6 = com.bumptech.glide.b.c(MyApplication.f7090a.getApplicationContext()).l().C(str3).E();
        E6.z(new a0(file2, 1), E6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r3 = r7;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        android.util.Log.e("b", "Exception from try-catch block inside " + "b" + " in getBitmapFromAsset method." + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        android.util.Log.e("b", "Exception from try-catch block inside " + "b" + " in getBitmapFromAsset method." + r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[ExcHandler: all (r7v9 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[SYNTHETIC, Splitter:B:24:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[SYNTHETIC, Splitter:B:30:0x007a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap B(java.lang.String r7) {
        /*
            java.lang.String r0 = " in getBitmapFromAsset method."
            java.lang.String r1 = "b"
            java.lang.String r2 = "Exception from try-catch block inside "
            r3 = 0
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ IOException -> 0x0044, all -> 0x003a }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ IOException -> 0x0044, all -> 0x003a }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ IOException -> 0x003f, all -> 0x003a }
            java.io.InputStream r7 = r4.open(r7)     // Catch:{ IOException -> 0x003f, all -> 0x003a }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ IOException -> 0x0038 }
            if (r7 == 0) goto L_0x0035
            r7.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0035
        L_0x001f:
            r7 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r1)
            r4.append(r0)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            android.util.Log.e(r1, r7)
        L_0x0035:
            return r3
        L_0x0036:
            r3 = move-exception
            goto L_0x0078
        L_0x0038:
            r4 = move-exception
            goto L_0x0046
        L_0x003a:
            r7 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
            goto L_0x0078
        L_0x003f:
            r4 = move-exception
        L_0x0040:
            r7 = r3
            goto L_0x0046
        L_0x0042:
            r4 = r7
            goto L_0x0040
        L_0x0044:
            r7 = move-exception
            goto L_0x0042
        L_0x0046:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r5.<init>(r2)     // Catch:{ all -> 0x0036 }
            r5.append(r1)     // Catch:{ all -> 0x0036 }
            r5.append(r0)     // Catch:{ all -> 0x0036 }
            r5.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0036 }
            android.util.Log.e(r1, r4)     // Catch:{ all -> 0x0036 }
            if (r7 == 0) goto L_0x0077
            r7.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0077
        L_0x0061:
            r7 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r1)
            r4.append(r0)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            android.util.Log.e(r1, r7)
        L_0x0077:
            return r3
        L_0x0078:
            if (r7 == 0) goto L_0x0094
            r7.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0094
        L_0x007e:
            r7 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r1)
            r4.append(r0)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            android.util.Log.e(r1, r7)
        L_0x0094:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.b.B(java.lang.String):android.graphics.Bitmap");
    }

    public static void B0(String str) {
        File file = new File(C0596a.f8295a);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, C0552a.r(new StringBuilder(), str.split("token=")[1], ".jpg"));
        if (file2.exists()) {
            file2.delete();
        }
        j E6 = com.bumptech.glide.b.c(MyApplication.f7090a.getApplicationContext()).l().C(str).E();
        E6.z(new a0(file2, 0), E6);
    }

    public static String C(int i2) {
        switch (i2) {
            case 0:
                return "MainCity";
            case 1:
                return "Dubai";
            case 2:
                return "Gaza";
            case 3:
                return "Riyadh";
            case 4:
                return "Sanaa";
            case 5:
                return "Cairo";
            case zzaky.zzf.zzf /*6*/:
                return "Doha";
            case zzaky.zzf.zzg /*7*/:
                return "Tehran";
            case 8:
                return "Tripoli";
            case 9:
                return "Idlib";
            case 10:
                return "Rabat";
            default:
                return null;
        }
    }

    public static int D(int i2) {
        switch (i2) {
            case 0:
                return R.string.city_name_main_city;
            case 1:
                return R.string.city_name_dubai;
            case 2:
                return R.string.city_name_gaza;
            case 3:
                return R.string.city_name_riyadh;
            case 4:
                return R.string.city_name_sanaa;
            case 5:
                return R.string.city_name_cairo;
            case zzaky.zzf.zzf /*6*/:
                return R.string.city_name_doha;
            case zzaky.zzf.zzg /*7*/:
                return R.string.city_name_tehran;
            case 8:
                return R.string.city_name_tripoli;
            case 9:
                return R.string.city_name_idlib;
            case 10:
                return R.string.city_name_rabat;
            default:
                return -1;
        }
    }

    public static int E(int i2) {
        switch (i2) {
            case 0:
                return R.string.city_name_main_city_without_city_word;
            case 1:
                return R.string.city_name_dubai;
            case 2:
                return R.string.city_name_gaza;
            case 3:
                return R.string.city_name_riyadh;
            case 4:
                return R.string.city_name_sanaa;
            case 5:
                return R.string.city_name_cairo;
            case zzaky.zzf.zzf /*6*/:
                return R.string.city_name_doha;
            case zzaky.zzf.zzg /*7*/:
                return R.string.city_name_tehran;
            case 8:
                return R.string.city_name_tripoli;
            case 9:
                return R.string.city_name_idlib;
            case 10:
                return R.string.city_name_rabat;
            default:
                return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, c5.b] */
    /* JADX WARNING: type inference failed for: r1v3, types: [c5.d, java.lang.Object] */
    public static C0343b F(JSONObject jSONObject) {
        int i2;
        int i5;
        int i6;
        String str;
        int i7;
        int i8;
        JSONObject jSONObject2 = jSONObject;
        try {
            int i9 = 0;
            if (jSONObject2.has("x")) {
                i2 = jSONObject2.getInt("x");
            } else {
                i2 = 0;
            }
            if (jSONObject2.has("y")) {
                i5 = Math.abs(jSONObject2.getInt("y"));
            } else {
                i5 = 0;
            }
            if (jSONObject2.has("zIndex")) {
                i6 = jSONObject2.getInt("zIndex");
            } else {
                i6 = 0;
            }
            int i10 = jSONObject2.getInt("width");
            int i11 = jSONObject2.getInt("height");
            String string = jSONObject2.getString("layerName");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("content").getJSONArray("games.rednblack.editor.renderer.data.SimpleImageVO").getJSONObject(0);
            String string2 = jSONObject3.getString("imageName");
            ? obj = new Object();
            obj.h = false;
            obj.f5702i = false;
            obj.f5697a = string2;
            obj.f5698b = string;
            obj.f5699c = i2;
            obj.d = i5;
            obj.f5700e = i6;
            obj.f5701f = i10;
            obj.g = i11;
            if (jSONObject2.has("shape")) {
                obj.f5702i = true;
                JSONArray jSONArray = jSONObject2.getJSONObject("shape").getJSONArray("vertices");
                ArrayList arrayList = new ArrayList();
                int i12 = 0;
                while (i12 < jSONArray.length()) {
                    if (jSONArray.getJSONObject(i12).has("x")) {
                        i7 = jSONArray.getJSONObject(i12).getInt("x");
                    } else {
                        i7 = i9;
                    }
                    if (jSONArray.getJSONObject(i12).has("y")) {
                        i8 = jSONArray.getJSONObject(i12).getInt("y");
                    } else {
                        i8 = i9;
                    }
                    arrayList.add(new Point(i7 + i2, (i8 + i5) - i11));
                    i12++;
                    i9 = 0;
                }
                if (jSONObject2.has("itemIdentifier")) {
                    str = jSONObject2.getString("itemIdentifier");
                } else {
                    str = jSONObject3.getString("itemIdentifier");
                }
                ? obj2 = new Object();
                obj2.f5709a = str;
                obj2.f5710b = arrayList;
                obj.f5703j = obj2;
            }
            return obj;
        } catch (Exception e6) {
            a.q("Exception from try-catch block inside ", "b", " in getCompositeImageDataFromJson method.", e6, "b");
            return null;
        }
    }

    public static int F0(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * -862048943), 15)) * 461845907);
    }

    public static void G0(Context context, int i2) {
        R2.b.w(true);
        int i5 = i2;
        android.support.v4.media.session.a.B0(i5, 7, 0, -1, new M(i2, 1, context), o.getAccountObject().getId(), android.support.v4.media.session.a.z(), false);
    }

    public static final Object H0(s sVar, s sVar2, p pVar) {
        Object obj;
        Object B6;
        try {
            kotlin.jvm.internal.p.a(2, pVar);
            obj = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            obj = new C0048u(false, th);
        }
        p5.a aVar = p5.a.f11033a;
        if (obj == aVar || (B6 = sVar.B(obj)) == F.f864e) {
            return aVar;
        }
        if (!(B6 instanceof C0048u)) {
            return F.u(B6);
        }
        throw ((C0048u) B6).f950a;
    }

    public static final void I0(Object obj) {
        if (obj instanceof C0846e) {
            throw ((C0846e) obj).f10197a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[SYNTHETIC, Splitter:B:27:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a A[SYNTHETIC, Splitter:B:32:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4 A[SYNTHETIC, Splitter:B:39:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd A[SYNTHETIC, Splitter:B:44:0x00bd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap J(java.lang.String r7) {
        /*
            java.lang.String r0 = " when closing InputStream: "
            java.lang.String r1 = " when closing BufferedInputStream: "
            java.lang.String r2 = "Exception from try-catch block inside "
            java.lang.String r3 = "b"
            r4 = 0
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x006c, all -> 0x0067 }
            java.lang.String r7 = K(r7)     // Catch:{ Exception -> 0x006c, all -> 0x0067 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x006c, all -> 0x0067 }
            android.net.Uri r7 = android.net.Uri.fromFile(r5)     // Catch:{ Exception -> 0x006c, all -> 0x0067 }
            com.mtma.criminal.city.app.MyApplication r5 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ Exception -> 0x006c, all -> 0x0067 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Exception -> 0x006c, all -> 0x0067 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x006c, all -> 0x0067 }
            java.io.InputStream r7 = r5.openInputStream(r7)     // Catch:{ Exception -> 0x006c, all -> 0x0067 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0065, all -> 0x0060 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0065, all -> 0x0060 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ Exception -> 0x00a2, all -> 0x005e }
            r5.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0044
        L_0x0031:
            r5 = move-exception
            java.lang.StringBuilder r1 = h0.C0552a.t(r2, r3, r1)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L_0x0044:
            if (r7 == 0) goto L_0x005d
            r7.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x005d
        L_0x004a:
            r7 = move-exception
            java.lang.StringBuilder r0 = h0.C0552a.t(r2, r3, r0)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r3, r7)
        L_0x005d:
            return r4
        L_0x005e:
            r4 = move-exception
            goto L_0x006f
        L_0x0060:
            r5 = move-exception
            r6 = r5
            r5 = r4
            r4 = r6
            goto L_0x006f
        L_0x0065:
            r5 = r4
            goto L_0x00a2
        L_0x0067:
            r7 = move-exception
            r5 = r4
            r4 = r7
            r7 = r5
            goto L_0x006f
        L_0x006c:
            r7 = r4
            r5 = r7
            goto L_0x00a2
        L_0x006f:
            if (r5 == 0) goto L_0x0088
            r5.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0088
        L_0x0075:
            r5 = move-exception
            java.lang.StringBuilder r1 = h0.C0552a.t(r2, r3, r1)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L_0x0088:
            if (r7 == 0) goto L_0x00a1
            r7.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x00a1
        L_0x008e:
            r7 = move-exception
            java.lang.StringBuilder r0 = h0.C0552a.t(r2, r3, r0)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r3, r7)
        L_0x00a1:
            throw r4
        L_0x00a2:
            if (r5 == 0) goto L_0x00bb
            r5.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00bb
        L_0x00a8:
            r5 = move-exception
            java.lang.StringBuilder r1 = h0.C0552a.t(r2, r3, r1)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L_0x00bb:
            if (r7 == 0) goto L_0x00d4
            r7.close()     // Catch:{ IOException -> 0x00c1 }
            goto L_0x00d4
        L_0x00c1:
            r7 = move-exception
            java.lang.StringBuilder r0 = h0.C0552a.t(r2, r3, r0)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            android.util.Log.e(r3, r7)
        L_0x00d4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.b.J(java.lang.String):android.graphics.Bitmap");
    }

    public static String K(String str) {
        String[] split = str.split("token=");
        StringBuilder sb = new StringBuilder();
        sb.append(C0596a.f8297c);
        sb.append("/");
        return C0552a.r(sb, split[1], ".jpg");
    }

    public static void K0(Context context, String str, long j6) {
        if (o.getMainStatesObject().getCourageCurrent() >= com.bumptech.glide.d.d0()) {
            a.n(MyApplication.f7090a, R.string.current_courage_is_full, context, (String) null);
            return;
        }
        R2.b.w(true);
        U.g(o.getAccountObject().getId(), str, -j6, new h0(1, context, str));
    }

    public static C0475h L(C0475h hVar, r rVar, C0469b bVar, q qVar) {
        r rVar2 = rVar;
        C0469b bVar2 = bVar;
        q qVar2 = qVar;
        return new C0475h((e.T(1, rVar2, bVar2, qVar2) + 1.0d) * hVar.getStrength(), (e.T(2, rVar2, bVar2, qVar2) + 1.0d) * hVar.getDefense(), (e.T(3, rVar2, bVar2, qVar2) + 1.0d) * hVar.getSpeed(), (e.T(4, rVar2, bVar2, qVar2) + 1.0d) * hVar.getDexterity());
    }

    public static void L0(Context context, String str, long j6) {
        if (!f1151e) {
            f1151e = true;
            C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            if (o.getMainStatesObject().getGender() == 0) {
                textView.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.change_gender_content, new Object[]{MyApplication.f7090a.getApplicationContext().getString(R.string.gender_male), MyApplication.f7090a.getApplicationContext().getString(R.string.gender_female)}));
            } else {
                textView.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.change_gender_content, new Object[]{MyApplication.f7090a.getApplicationContext().getString(R.string.gender_female), MyApplication.f7090a.getApplicationContext().getString(R.string.gender_male)}));
            }
            linearLayout.setVisibility(0);
            textView2.setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new e0(relativeLayout, bVar, str, j6, context));
            relativeLayout2.setOnClickListener(new m(relativeLayout2, bVar, 8));
            bVar.show();
        }
    }

    public static void M0(Context context, String str, long j6) {
        if (!d) {
            d = true;
            C0505b bVar = new C0505b(context, R.layout.dialog_with_edit_field);
            EditText editText = (EditText) bVar.findViewById(R.id.dialog_with_edit_field_edit_text);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_with_edit_field_ok_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_with_edit_field_cancel_button);
            ((TextView) bVar.findViewById(R.id.dialog_with_edit_field_title)).setText(R.string.database_center);
            ((TextView) bVar.findViewById(R.id.dialog_with_edit_field_description)).setText(R.string.add_new_name);
            ((TextView) bVar.findViewById(R.id.dialog_with_edit_field_ok_button_text)).setText(R.string.button_change);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
            relativeLayout.setOnClickListener(new f0(relativeLayout, editText, context, bVar, str, j6));
            relativeLayout2.setOnClickListener(new m(relativeLayout2, bVar, 9));
            bVar.show();
        }
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [c5.a, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1 A[SYNTHETIC, Splitter:B:23:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf A[SYNTHETIC, Splitter:B:29:0x00cf] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList N(java.lang.String r8) {
        /*
            java.lang.String r0 = " in readAtlasFromFile method."
            java.lang.String r1 = "Exception from try-catch block inside "
            java.lang.String r2 = "b"
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00a6 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00a6 }
            com.mtma.criminal.city.app.MyApplication r7 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ IOException -> 0x00a6 }
            android.content.Context r7 = r7.getApplicationContext()     // Catch:{ IOException -> 0x00a6 }
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch:{ IOException -> 0x00a6 }
            java.io.InputStream r8 = r7.open(r8)     // Catch:{ IOException -> 0x00a6 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x00a6 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00a6 }
        L_0x0024:
            java.lang.String r8 = r5.readLine()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            if (r8 == 0) goto L_0x0089
            java.lang.String r4 = "@"
            boolean r4 = r8.contains(r4)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            if (r4 == 0) goto L_0x0024
            c5.a r4 = new c5.a     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r4.<init>()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r4.f5693a = r8     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r8 = r5.readLine()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r6 = "\tbounds: "
            java.lang.String r7 = ""
            java.lang.String r8 = r8.replace(r6, r7)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r6 = ","
            java.lang.String[] r8 = r8.split(r6)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r6 = 0
            r6 = r8[r6]     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r6 = r6.trim()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r4.f5694b = r6     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r6 = 1
            r6 = r8[r6]     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r6 = r6.trim()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r4.f5695c = r6     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r6 = 2
            r6 = r8[r6]     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r6 = r6.trim()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r4.d = r6     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r6 = 3
            r8 = r8[r6]     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.lang.String r8 = r8.trim()     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r4.f5696e = r8     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r3.add(r4)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            goto L_0x0024
        L_0x0083:
            r8 = move-exception
            r4 = r5
            goto L_0x00cd
        L_0x0086:
            r8 = move-exception
            r4 = r5
            goto L_0x00a7
        L_0x0089:
            r5.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x00cc
        L_0x008d:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
        L_0x0093:
            r4.append(r2)
            r4.append(r0)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            android.util.Log.e(r2, r8)
            goto L_0x00cc
        L_0x00a4:
            r8 = move-exception
            goto L_0x00cd
        L_0x00a6:
            r8 = move-exception
        L_0x00a7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a4 }
            r5.<init>()     // Catch:{ all -> 0x00a4 }
            r5.append(r1)     // Catch:{ all -> 0x00a4 }
            r5.append(r2)     // Catch:{ all -> 0x00a4 }
            r5.append(r0)     // Catch:{ all -> 0x00a4 }
            r5.append(r8)     // Catch:{ all -> 0x00a4 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x00a4 }
            android.util.Log.e(r2, r8)     // Catch:{ all -> 0x00a4 }
            if (r4 == 0) goto L_0x00cc
            r4.close()     // Catch:{ IOException -> 0x00c5 }
            goto L_0x00cc
        L_0x00c5:
            r8 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            goto L_0x0093
        L_0x00cc:
            return r3
        L_0x00cd:
            if (r4 == 0) goto L_0x00e9
            r4.close()     // Catch:{ IOException -> 0x00d3 }
            goto L_0x00e9
        L_0x00d3:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r2)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r2, r0)
        L_0x00e9:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.b.N(java.lang.String):java.util.ArrayList");
    }

    public static void N0(Context context, String str, long j6) {
        if (o.getMainStatesObject().getPowerCurrent() >= com.bumptech.glide.d.A0()) {
            a.n(MyApplication.f7090a, R.string.current_power_is_full, context, (String) null);
            return;
        }
        R2.b.w(true);
        U.g(o.getAccountObject().getId(), str, -j6, new h0(0, context, str));
    }

    public static ArrayList O(int... iArr) {
        ArrayList arrayList = new ArrayList();
        d.h(0, arrayList, 1, 2, 8);
        d.h(9, arrayList, 3, 10, 11);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(12);
        int i2 = 0;
        for (int i5 : iArr) {
            arrayList.remove(i5 - i2);
            i2++;
        }
        return arrayList;
    }

    public static void O0(int i2, long j6, Context context, String str) {
        R2.b.w(true);
        c.s(true, new g0(i2, j6, context, str));
    }

    public static long Q(int i2) {
        if (i2 < 5) {
            return 100;
        }
        if (i2 < 10) {
            return 300;
        }
        if (i2 < 15) {
            return 1000;
        }
        if (i2 < 20) {
            return 2000;
        }
        if (i2 < 25) {
            return 3000;
        }
        if (i2 < 30) {
            return 5000;
        }
        if (i2 < 35) {
            return 9000;
        }
        if (i2 < 40) {
            return 16000;
        }
        if (i2 < 45) {
            return 30000;
        }
        if (i2 < 50) {
            return 50000;
        }
        if (i2 < 55) {
            return 80000;
        }
        if (i2 < 60) {
            return 110000;
        }
        if (i2 < 65) {
            return 160000;
        }
        if (i2 < 70) {
            return 220000;
        }
        if (i2 < 75) {
            return 300000;
        }
        if (i2 < 80) {
            return 400000;
        }
        if (i2 < 85) {
            return 500000;
        }
        if (i2 < 90) {
            return 600000;
        }
        if (i2 < 95) {
            return 700000;
        }
        if (i2 < 100) {
            return 800000;
        }
        if (i2 < 105) {
            return 850000;
        }
        return (((long) (i2 / 5)) * 50000) + 850000;
    }

    public static ArrayList T(int i2) {
        if (i2 == 2058) {
            return new ArrayList(Arrays.asList(new Integer[]{500000, 2, 2, 1}));
        }
        if (i2 == 2059) {
            return new ArrayList(Arrays.asList(new Integer[]{500000, 5, 5, 5, 1}));
        }
        if (i2 == 2060) {
            return new ArrayList(Arrays.asList(new Integer[]{10000000, 10, 10, 1, 2}));
        }
        if (i2 == 2061) {
            return new ArrayList(Arrays.asList(new Integer[]{10000000, 10, 15, 5, 25}));
        }
        if (i2 == 2062) {
            return new ArrayList(Arrays.asList(new Integer[]{25000000, 15, 20, 30, 1}));
        }
        if (i2 == 2063) {
            return new ArrayList(Arrays.asList(new Integer[]{2, 20, 90, 10}));
        }
        if (i2 == 2064) {
            return new ArrayList(Arrays.asList(new Integer[]{3, 30, 100, 1}));
        }
        if (i2 == 2065) {
            return new ArrayList(Arrays.asList(new Integer[]{4, 40, 150, 3}));
        }
        if (i2 == 2066) {
            return new ArrayList(Arrays.asList(new Integer[]{4, 50, 200, 1}));
        }
        if (i2 == 2067) {
            return new ArrayList(Arrays.asList(new Integer[]{5, 60, 300, 1}));
        }
        if (i2 == 2068) {
            return new ArrayList(Arrays.asList(new Integer[]{70, 350, 10, 1}));
        }
        if (i2 == 2069) {
            return new ArrayList(Arrays.asList(new Integer[]{80, 400, 20, 1}));
        }
        if (i2 == 2084) {
            return new ArrayList(Arrays.asList(new Integer[]{1, 20, 50, 1}));
        }
        if (i2 == 2085) {
            return new ArrayList(Arrays.asList(new Integer[]{1, 20, 50, 1}));
        }
        if (i2 == 2086) {
            return new ArrayList(Arrays.asList(new Integer[]{1, 20, 60, 1}));
        }
        if (i2 == 2087) {
            return new ArrayList(Arrays.asList(new Integer[]{1, 20, 60, 1}));
        }
        return null;
    }

    public static ArrayList U(int i2) {
        if (i2 == 2058) {
            return new ArrayList(Arrays.asList(new Integer[]{-100, 2001, 2002, 2027}));
        }
        if (i2 == 2059) {
            return new ArrayList(Arrays.asList(new Integer[]{-100, 2001, 2002, 2005, 2022}));
        }
        if (i2 == 2060) {
            return new ArrayList(Arrays.asList(new Integer[]{-100, 2001, 2002, 2005, 2008}));
        }
        if (i2 == 2061) {
            return new ArrayList(Arrays.asList(new Integer[]{-100, 2082, 2002, 2008, 3001}));
        }
        if (i2 == 2062) {
            return new ArrayList(Arrays.asList(new Integer[]{-100, 2082, 2002, 3001, 30020}));
        }
        if (i2 == 2063) {
            return new ArrayList(Arrays.asList(new Integer[]{703, 2082, 3001, 2022}));
        }
        if (i2 == 2064) {
            return new ArrayList(Arrays.asList(new Integer[]{701, 2082, 3001, 30021}));
        }
        if (i2 == 2065) {
            return new ArrayList(Arrays.asList(new Integer[]{702, 2082, 3001, 2030}));
        }
        if (i2 == 2066) {
            return new ArrayList(Arrays.asList(new Integer[]{704, 2082, 3001, 30018}));
        }
        if (i2 == 2067) {
            return new ArrayList(Arrays.asList(new Integer[]{703, 2082, 3001, 30022}));
        }
        if (i2 == 2068) {
            return new ArrayList(Arrays.asList(new Integer[]{2082, 3001, 3005, 2005}));
        }
        if (i2 == 2069) {
            return new ArrayList(Arrays.asList(new Integer[]{2082, 3001, 3005, 2005}));
        }
        if (i2 == 2084) {
            return new ArrayList(Arrays.asList(new Integer[]{704, 2082, 3001, 20014}));
        }
        if (i2 == 2085) {
            return new ArrayList(Arrays.asList(new Integer[]{702, 2082, 3001, 20015}));
        }
        if (i2 == 2086) {
            return new ArrayList(Arrays.asList(new Integer[]{703, 2082, 3001, 20014}));
        }
        if (i2 == 2087) {
            return new ArrayList(Arrays.asList(new Integer[]{703, 2082, 3001, 20014}));
        }
        return null;
    }

    public static int V(int i2) {
        switch (i2) {
            case 2058:
            case 2070:
                return 10;
            case 2059:
            case 2071:
                return 20;
            case 2060:
            case 2072:
                return 30;
            case 2061:
            case 2073:
                return 40;
            case 2062:
            case 2074:
                return 50;
            case 2063:
            case 2075:
            case 2084:
            case 2085:
                return 60;
            case 2064:
            case 2076:
                return 70;
            case 2065:
            case 2077:
            case 2086:
            case 2087:
                return 80;
            case 2066:
            case 2078:
                return 90;
            case 2067:
            case 2079:
                return 100;
            default:
                return 200;
        }
    }

    public static SharedPreferences X(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static String Y(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0596a.f8296b);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        return C0552a.r(sb, str2, ".jpg");
    }

    public static String Z(String str) {
        String[] split = str.split("token=");
        StringBuilder sb = new StringBuilder();
        sb.append(C0596a.f8295a);
        sb.append("/");
        return C0552a.r(sb, split[1], ".jpg");
    }

    public static Integer a0(int i2) {
        if (i2 == 0) {
            return 1000;
        }
        if (i2 == 1) {
            return 2000;
        }
        if (i2 == 2) {
            return 3000;
        }
        if (i2 == 3) {
            return 4000;
        }
        if (i2 != 4) {
            return 0;
        }
        return 5000;
    }

    public static Bitmap b0(Bitmap bitmap) {
        int i2;
        float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        int i5 = 250;
        if (width > 1.0f) {
            i2 = (int) (((float) 250) / width);
        } else {
            i5 = (int) (((float) 250) * width);
            i2 = 250;
        }
        return Bitmap.createScaledBitmap(bitmap, i5, i2, true);
    }

    public static void c(Context context, int i2) {
        int i5;
        if (o.getStockObject().getMuseumBackgroundAvailable().contains(Integer.valueOf(i2))) {
            a.n(MyApplication.f7090a, R.string.already_have_museum_background, context, (String) null);
            return;
        }
        R2.b.w(true);
        String id = o.getAccountObject().getId();
        if (i2 == 4) {
            i5 = 999;
        } else if (i2 == 5) {
            i5 = 1499;
        } else if (i2 != 6) {
            i5 = 0;
        } else {
            i5 = 1999;
        }
        U.g(id, "gold", (long) (-i5), new M(i2, 4, context));
    }

    public static void d(Context context, int i2, boolean z3) {
        long j6;
        R2.b.w(true);
        if (z3) {
            j6 = 800;
        } else {
            j6 = 100 * ((long) i2);
        }
        U.g(o.getAccountObject().getId(), "gold", -j6, new M(i2, 3, context));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, c5.b] */
    public static C0343b d0(JSONObject jSONObject) {
        int i2;
        int i5;
        int i6;
        try {
            if (jSONObject.has("x")) {
                i2 = jSONObject.getInt("x");
            } else {
                i2 = 0;
            }
            if (jSONObject.has("y")) {
                i5 = Math.abs(jSONObject.getInt("y"));
            } else {
                i5 = 0;
            }
            if (jSONObject.has("zIndex")) {
                i6 = jSONObject.getInt("zIndex");
            } else {
                i6 = 0;
            }
            String string = jSONObject.getString("imageName");
            String string2 = jSONObject.getString("layerName");
            ? obj = new Object();
            obj.h = false;
            obj.f5702i = false;
            obj.f5697a = string;
            obj.f5698b = string2;
            obj.f5699c = i2;
            obj.d = i5;
            obj.f5700e = i6;
            if (jSONObject.has("flipX")) {
                obj.h = true;
            }
            return obj;
        } catch (Exception e6) {
            a.q("Exception from try-catch block inside ", "b", " in getSimpleImageDataFromJson method.", e6, "b");
            return null;
        }
    }

    public static void e0(ArrayList arrayList, U3.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("cityNumber", Integer.valueOf(o.getLocationObject().getCurrentCity()));
        hashMap.put("materialsIds", arrayList);
        h.b().a("getSpecialtiesCosts").q(hashMap).addOnCompleteListener(new C0451v(cVar, 3));
    }

    public static void f(Context context, String str) {
        if (o.getStockObject().getStockSpace() + 100 > 10000) {
            c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_maximum_sock_space, new Object[]{10000}), (String) null);
        } else {
            a.d(a.c(a.e(true), "players"), "stockObject", "stockSpace").d(new h0(context, str));
        }
    }

    public static long f0(int i2, long j6) {
        return (((long) ((i2 - 2000) / 100)) * j6) + j6;
    }

    public static void g(Context context, int i2, String str, long j6, F3.e eVar) {
        R2.b.w(true);
        U.g(o.getAccountObject().getId(), str, -(((long) i2) * j6), new l(i2, context, eVar, str));
    }

    public static int g0(int i2) {
        switch (i2) {
            case 0:
                return 100;
            case 1:
                return 95;
            case 2:
                return 75;
            case 3:
                return 50;
            case 4:
                return 25;
            case 5:
            case zzaky.zzf.zzf /*6*/:
            case zzaky.zzf.zzg /*7*/:
                return 10;
            case 8:
                return 7;
            case 9:
                return 5;
            case 10:
                return 3;
            default:
                return 1;
        }
    }

    public static File h0(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i2 = 0;
        while (i2 < 100) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i2++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static void i(StringBuilder sb, Object obj, x5.l lVar) {
        boolean z3;
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z3 = true;
        } else {
            z3 = obj instanceof CharSequence;
        }
        if (z3) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append(String.valueOf(obj));
        }
    }

    public static double i0(int i2, int i5, int i6) {
        double d6;
        Integer orDefault;
        if (i6 == 0 || i2 != i6) {
            d6 = 0.0d;
        } else {
            d6 = 0.05d;
        }
        if ((i2 == 1 && R2.b.i0(5001)) || ((i2 == 2 && R2.b.i0(5002)) || ((i2 == 3 && R2.b.i0(5003)) || (i2 == 4 && R2.b.i0(5004))))) {
            d6 += 0.05d;
        }
        if (o.getSchoolObject().getGymLessons().get(0).intValue() == 2) {
            d6 += c.H(4, 0);
        }
        if (o.getSkillsObject().getGangSkills().containsKey(e.w(14)) && (orDefault = o.getSkillsObject().getGangSkills().getOrDefault(e.w(14), 0)) != null) {
            d6 += (((double) c.B(14)) / 100.0d) * ((double) orDefault.intValue());
        }
        double d7 = ((double) i5) / 100.0d;
        int N6 = R2.b.N(o.getEstateObject());
        if (R2.b.i0(605)) {
            N6 *= 2;
        }
        return (d6 + 1.0d) * (((double) N6) / 100.0d) * d7 * 1.0d;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, p.i] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, p.l] */
    public static k j(J j6) {
        ? obj = new Object();
        obj.f10964c = new Object();
        k kVar = new k(obj);
        obj.f10963b = kVar;
        obj.f10962a = C0552a.class;
        try {
            j6.invokeOnCompletion(new H5.d(obj, j6, 1));
            obj.f10962a = "Deferred.asListenableFuture";
        } catch (Exception e6) {
            kVar.f10967b.y(e6);
        }
        return kVar;
    }

    public static int j0(int i2, int i5) {
        return (int) (((double) i2) * Math.pow(1.15d, (double) i5));
    }

    public static int k0(int i2) {
        if (i2 == 2026) {
            return 1;
        }
        if (i2 == 2027) {
            return 7;
        }
        if (i2 == 2028) {
            return 30;
        }
        if (i2 == 2029) {
            return 365;
        }
        return -1;
    }

    public static boolean l0(int i2, long j6) {
        String str;
        StringBuilder sb = new StringBuilder("activity_");
        if (i2 != 0) {
            str = null;
        } else {
            str = "goldBullionChase";
        }
        sb.append(str);
        sb.append("_startTimeInMilli");
        long x02 = com.bumptech.glide.d.x0(sb.toString());
        long Y3 = com.bumptech.glide.d.Y(i2);
        long j7 = j6 * 1000;
        if (j7 < x02 || j7 > Y3) {
            return false;
        }
        return true;
    }

    public static boolean m(long j6) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        instance2.setTimeInMillis(c.f5744o * 1000);
        instance.set(instance2.get(1), 0, 1, 0, 0, 0);
        if (j6 > instance.getTimeInMillis()) {
            return false;
        }
        return true;
    }

    public static int n(Context context, String str) {
        int i2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d6 = f.d(str);
        if (d6 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            Class cls = AppOpsManager.class;
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                i2 = f.c((AppOpsManager) f.a(context, cls), d6, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c3 = g.c(context);
                i2 = g.a(c3, d6, Binder.getCallingUid(), packageName);
                if (i2 == 0) {
                    i2 = g.a(c3, d6, myUid, g.b(context));
                }
            } else {
                i2 = f.c((AppOpsManager) f.a(context, cls), d6, packageName);
            }
            if (i2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static boolean n0(int i2) {
        int i5 = i2 - 1;
        if (o.getGymObject().getGymLessonsProgressList().get(i5).intValue() >= a0(i5).intValue()) {
            return true;
        }
        return false;
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean o0(android.content.Context r4) {
        /*
            java.lang.Class<I1.b> r0 = I1.b.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0018 }
            android.content.Context r2 = f1148a     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x001a
            java.lang.Boolean r3 = f1149b     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x001a
            if (r2 == r1) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r4
        L_0x0018:
            r4 = move-exception
            goto L_0x004e
        L_0x001a:
            r2 = 0
            f1149b = r2     // Catch:{ all -> 0x0018 }
            boolean r2 = G1.c.d()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0032
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x0018 }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x0018 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0018 }
            f1149b = r4     // Catch:{ all -> 0x0018 }
            goto L_0x0044
        L_0x0032:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0040 }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x0040 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0040 }
            f1149b = r4     // Catch:{ ClassNotFoundException -> 0x0040 }
            goto L_0x0044
        L_0x0040:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0018 }
            f1149b = r4     // Catch:{ all -> 0x0018 }
        L_0x0044:
            f1148a = r1     // Catch:{ all -> 0x0018 }
            java.lang.Boolean r4 = f1149b     // Catch:{ all -> 0x0018 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r4
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.b.o0(android.content.Context):boolean");
    }

    public static boolean p(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean q6 = q(file, inputStream);
                o(inputStream);
                return q6;
            } catch (Throwable th) {
                th = th;
                o(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            o(inputStream);
            throw th;
        }
    }

    public static boolean p0() {
        if (o.getGymObject().getDexterity() + o.getGymObject().getSpeed() + o.getGymObject().getDefense() + o.getGymObject().getStrength() >= ((double) Q(o.getMainStatesObject().getLevel()))) {
            return true;
        }
        return false;
    }

    public static boolean q(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        o(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e6) {
                e = e6;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    o(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    o(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                o(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            o(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static final C0846e r(Throwable th) {
        kotlin.jvm.internal.j.e(th, "exception");
        return new C0846e(th);
    }

    public static Bitmap s(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postScale(-1.0f, 1.0f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static boolean s0(C0475h hVar, int i2, int i5, int i6, int i7) {
        double strength = o.getGymObject().getStrength();
        if (i2 > 0) {
            strength += i0(1, i2, hVar.getSelectedGymLesson());
        }
        double defense = o.getGymObject().getDefense();
        if (i5 > 0) {
            defense += i0(2, i5, hVar.getSelectedGymLesson());
        }
        double speed = o.getGymObject().getSpeed();
        if (speed > 0.0d) {
            speed += i0(3, i6, hVar.getSelectedGymLesson());
        }
        double dexterity = o.getGymObject().getDexterity();
        if (i7 > 0) {
            dexterity += i0(4, i7, hVar.getSelectedGymLesson());
        }
        if (strength + defense + speed + dexterity > ((double) Q(o.getMainStatesObject().getLevel())) + 0.5d) {
            return true;
        }
        return false;
    }

    public static byte[] t(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i5 = i2 * 2;
                int digit = Character.digit(str.charAt(i5), 16);
                int digit2 = Character.digit(str.charAt(i5 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i2] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static List t0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.j.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static void u(ImageView imageView, String str, String str2) {
        Class<Drawable> cls = Drawable.class;
        if (str2 == null) {
            String i2 = d.i("token=", str);
            com.bumptech.glide.l c3 = com.bumptech.glide.b.c(imageView.getContext());
            Bitmap J5 = J(i2);
            c3.getClass();
            ((j) ((j) new j(c3.f5794a, c3, cls, c3.f5795b).C(J5).a((Q0.e) new Q0.a().d(B0.p.f284b)).j(R.drawable.gang_profile_pic_default)).e(R.drawable.gang_profile_pic_default)).A(imageView);
        } else if (str2.equals("no_gang_pic") || str2.equals("removed_gang_pic")) {
            imageView.setImageResource(R.drawable.gang_profile_pic_default);
            if (str.equals(o.getGangObject().getId())) {
                File file = new File(C0596a.f8297c, o.getGangObject().getId() + ".jpg");
                if (file.exists()) {
                    file.delete();
                }
            }
        } else {
            Bitmap J6 = J(str2);
            if (J6 != null) {
                imageView.setImageBitmap(J6);
                return;
            }
            com.bumptech.glide.l c6 = com.bumptech.glide.b.c(imageView.getContext());
            c6.getClass();
            ((j) ((j) new j(c6.f5794a, c6, cls, c6.f5795b).C(str2).j(R.drawable.gang_profile_pic_default)).e(R.drawable.gang_profile_pic_default)).B(new Z(str2, 1)).A(imageView);
        }
    }

    public static MappedByteBuffer u0(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[SYNTHETIC, Splitter:B:29:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097 A[SYNTHETIC, Splitter:B:34:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b1 A[SYNTHETIC, Splitter:B:41:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[SYNTHETIC, Splitter:B:46:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v(android.widget.ImageView r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "no_profile_pic"
            boolean r0 = r9.equals(r0)
            r1 = 2131166615(0x7f070597, float:1.794748E38)
            if (r0 == 0) goto L_0x0010
            r8.setImageResource(r1)
            goto L_0x0106
        L_0x0010:
            java.lang.String r0 = " when closing InputStream: "
            java.lang.String r2 = " when closing BufferedInputStream: "
            java.lang.String r3 = "Exception from try-catch block inside "
            java.lang.String r4 = "b"
            r5 = 0
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            java.lang.String r7 = Z(r9)     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            com.mtma.criminal.city.app.MyApplication r7 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            android.content.Context r7 = r7.getApplicationContext()     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            java.io.InputStream r6 = r7.openInputStream(r6)     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0074, all -> 0x0072 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0074, all -> 0x0072 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ Exception -> 0x00af, all -> 0x006f }
            r7.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r7 = move-exception
            java.lang.StringBuilder r2 = h0.C0552a.t(r3, r4, r2)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r4, r2)
        L_0x0054:
            if (r6 == 0) goto L_0x00cd
            r6.close()     // Catch:{ IOException -> 0x005b }
            goto L_0x00cd
        L_0x005b:
            r2 = move-exception
            java.lang.StringBuilder r0 = h0.C0552a.t(r3, r4, r0)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
            goto L_0x00cd
        L_0x006f:
            r8 = move-exception
            r5 = r7
            goto L_0x007c
        L_0x0072:
            r8 = move-exception
            goto L_0x007c
        L_0x0074:
            r7 = r5
            goto L_0x00af
        L_0x0076:
            r8 = move-exception
            r6 = r5
            goto L_0x007c
        L_0x0079:
            r6 = r5
            r7 = r6
            goto L_0x00af
        L_0x007c:
            if (r5 == 0) goto L_0x0095
            r5.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x0095
        L_0x0082:
            r9 = move-exception
            java.lang.StringBuilder r1 = h0.C0552a.t(r3, r4, r2)
            java.lang.String r9 = r9.getMessage()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.e(r4, r9)
        L_0x0095:
            if (r6 == 0) goto L_0x00ae
            r6.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x00ae
        L_0x009b:
            r9 = move-exception
            java.lang.StringBuilder r0 = h0.C0552a.t(r3, r4, r0)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.util.Log.e(r4, r9)
        L_0x00ae:
            throw r8
        L_0x00af:
            if (r7 == 0) goto L_0x00c8
            r7.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00c8
        L_0x00b5:
            r7 = move-exception
            java.lang.StringBuilder r2 = h0.C0552a.t(r3, r4, r2)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r4, r2)
        L_0x00c8:
            if (r6 == 0) goto L_0x00cd
            r6.close()     // Catch:{ IOException -> 0x005b }
        L_0x00cd:
            if (r5 == 0) goto L_0x00d3
            r8.setImageBitmap(r5)
            goto L_0x0106
        L_0x00d3:
            android.content.Context r0 = r8.getContext()
            com.bumptech.glide.l r0 = com.bumptech.glide.b.c(r0)
            r0.getClass()
            com.bumptech.glide.j r2 = new com.bumptech.glide.j
            android.content.Context r3 = r0.f5795b
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.b r5 = r0.f5794a
            r2.<init>(r5, r0, r4, r3)
            com.bumptech.glide.j r0 = r2.C(r9)
            Q0.a r0 = r0.j(r1)
            com.bumptech.glide.j r0 = (com.bumptech.glide.j) r0
            Q0.a r0 = r0.e(r1)
            com.bumptech.glide.j r0 = (com.bumptech.glide.j) r0
            com.mtma.criminal.city.utils.Z r1 = new com.mtma.criminal.city.utils.Z
            r2 = 0
            r1.<init>(r9, r2)
            com.bumptech.glide.j r9 = r0.B(r1)
            r9.A(r8)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.b.v(android.widget.ImageView, java.lang.String):void");
    }

    public static String w(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b6 : bArr) {
            byte b7 = b6 & 255;
            sb.append("0123456789abcdef".charAt(b7 / 16));
            sb.append("0123456789abcdef".charAt(b7 % 16));
        }
        return sb.toString();
    }

    public static String x(double d6) {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String format = decimalFormat.format(d6);
        if (!format.contains(".")) {
            return format.concat(".0");
        }
        return format;
    }

    public static String y(int i2) {
        String str;
        if (i2 == 0) {
            str = "eidAlFitre";
        } else if (i2 == 1) {
            str = "goldBullionChase";
        } else if (i2 != 2) {
            str = null;
        } else {
            str = "eidAlAdha";
        }
        StringBuilder b6 = C0928e.b(str, "/endAt-");
        b6.append(com.bumptech.glide.d.Y(i2));
        return b6.toString();
    }

    public static ArrayList z(int... iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0246c((int) R.string.market_guns, (int) R.drawable.market_guns, 0, 0));
        arrayList.add(new C0246c((int) R.string.market_armors, (int) R.drawable.market_armor, 1, 0));
        arrayList.add(new C0246c((int) R.string.market_grocery, (int) R.drawable.market_grocery, 2, 0));
        arrayList.add(new C0246c((int) R.string.market_work, (int) R.drawable.market_work, 8, 0));
        arrayList.add(new C0246c((int) R.string.market_specialties, (int) R.drawable.market_specialties, 9, 0));
        arrayList.add(new C0246c((int) R.string.market_pharmacy, (int) R.drawable.market_medicine, 3, 0));
        arrayList.add(new C0246c((int) R.string.market_herbs, (int) R.drawable.market_herbs, 10, 0));
        arrayList.add(new C0246c((int) R.string.market_gym_cards, (int) R.drawable.market_cards, 11, 0));
        arrayList.add(new C0246c((int) R.string.market_flowers, (int) R.drawable.market_flower, 4, 0));
        arrayList.add(new C0246c((int) R.string.market_food, (int) R.drawable.market_food, 5, 0));
        arrayList.add(new C0246c((int) R.string.market_tunnel, (int) R.drawable.market_tunnel, 12, 0));
        int i2 = 0;
        for (int i5 : iArr) {
            arrayList.remove(i5 - i2);
            i2++;
        }
        return arrayList;
    }

    public static void z0(String str) {
        File file = new File(C0596a.f8297c);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, C0552a.r(new StringBuilder(), str.split("token=")[1], ".jpg"));
        if (file2.exists()) {
            file2.delete();
        }
        j E6 = com.bumptech.glide.b.c(MyApplication.f7090a.getApplicationContext()).l().C(str).E();
        E6.z(new a0(file2, 2), E6);
        if (str.contains(o.getGangObject().getId())) {
            File file3 = new File(file, o.getGangObject().getId() + ".jpg");
            if (file3.exists()) {
                file3.delete();
            }
            j E7 = com.bumptech.glide.b.c(MyApplication.f7090a.getApplicationContext()).l().C(str).E();
            E7.z(new a0(file3, 3), E7);
        }
    }

    public abstract void C0(boolean z3);

    public abstract void D0(boolean z3);

    public abstract boolean E0(View view, float f6);

    public abstract void G(u uVar, float f6, float f7);

    public abstract int H();

    public abstract InputFilter[] I(InputFilter[] inputFilterArr);

    public abstract void J0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i5);

    public abstract int M();

    public abstract int P();

    public abstract void P0(Object obj, Object obj2);

    public Task Q0(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        J2.o oVar;
        boolean z3;
        K k6 = new K(19);
        k6.f7360b = this;
        synchronized (firebaseAuth) {
            oVar = firebaseAuth.f6868j;
        }
        if (oVar != null) {
            synchronized (oVar.f1317a) {
                try {
                    zzahk zzahk = (zzahk) oVar.f1319c;
                    if (zzahk == null || !zzahk.zzc("EMAIL_PASSWORD_PROVIDER")) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z3) {
                Task t6 = oVar.t(str, Boolean.FALSE, recaptchaAction);
                return t6.continueWithTask(k6).continueWithTask(new z(str, oVar, recaptchaAction, k6, 12));
            }
        }
        Task R02 = R0((String) null);
        z zVar = new z(11, false);
        zVar.f2712c = recaptchaAction;
        zVar.d = firebaseAuth;
        zVar.f2711b = str;
        zVar.f2713e = k6;
        return R02.continueWithTask(zVar);
    }

    public abstract int R();

    public abstract Task R0(String str);

    public abstract int S(View view);

    public abstract int W(CoordinatorLayout coordinatorLayout);

    public abstract int c0();

    public abstract int k(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float l(int i2);

    public abstract boolean m0(float f6);

    public abstract boolean q0(View view);

    public abstract boolean r0(float f6, float f7);

    public abstract View v0(int i2);

    public abstract void w0(int i2);

    public abstract void x0(Typeface typeface, boolean z3);

    public abstract boolean y0();
}
