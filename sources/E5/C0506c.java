package e5;

import B0.C0004c;
import I1.b;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import c5.C0344c;
import c5.C0345d;
import c5.C0346e;
import java.util.ArrayList;

/* renamed from: e5.c  reason: case insensitive filesystem */
public final class C0506c extends ViewGroup implements GestureDetector.OnGestureListener {

    /* renamed from: A  reason: collision with root package name */
    public final float f7672A;

    /* renamed from: B  reason: collision with root package name */
    public final float f7673B;

    /* renamed from: C  reason: collision with root package name */
    public final float f7674C;

    /* renamed from: D  reason: collision with root package name */
    public final int f7675D;

    /* renamed from: E  reason: collision with root package name */
    public final int f7676E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public final Handler f7677G;

    /* renamed from: H  reason: collision with root package name */
    public final C0004c f7678H;

    /* renamed from: I  reason: collision with root package name */
    public final GestureDetector f7679I;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences.Editor f7680a;

    /* renamed from: b  reason: collision with root package name */
    public int f7681b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f7682c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f7683e;

    /* renamed from: f  reason: collision with root package name */
    public final Bitmap f7684f;

    /* renamed from: p  reason: collision with root package name */
    public final Bitmap f7685p;

    /* renamed from: q  reason: collision with root package name */
    public final Bitmap f7686q;

    /* renamed from: r  reason: collision with root package name */
    public final Bitmap f7687r;

    /* renamed from: s  reason: collision with root package name */
    public final Bitmap f7688s;

    /* renamed from: t  reason: collision with root package name */
    public final Bitmap f7689t;

    /* renamed from: u  reason: collision with root package name */
    public final C0346e f7690u = new C0346e(false);

    /* renamed from: v  reason: collision with root package name */
    public final C0346e f7691v;

    /* renamed from: w  reason: collision with root package name */
    public final C0346e f7692w;

    /* renamed from: x  reason: collision with root package name */
    public final float f7693x;

    /* renamed from: y  reason: collision with root package name */
    public final float f7694y;

    /* renamed from: z  reason: collision with root package name */
    public final float f7695z;

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, c5.c] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0440 A[SYNTHETIC, Splitter:B:110:0x0440] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x039e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x02ac A[SYNTHETIC, Splitter:B:49:0x02ac] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02e6 A[Catch:{ Exception -> 0x02f3 }, LOOP:1: B:57:0x02e0->B:59:0x02e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0302 A[Catch:{ Exception -> 0x02f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0506c(com.mtma.criminal.city.activities.MainActivity r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = 1
            r16.<init>(r17)
            r3 = 0
            r1.f7681b = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f7682c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            c5.e r0 = new c5.e
            r0.<init>((boolean) r3)
            r1.f7690u = r0
            c5.e r0 = new c5.e
            r0.<init>((int) r3)
            r1.f7691v = r0
            c5.e r4 = new c5.e
            r4.<init>((int) r3)
            r1.f7692w = r4
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            android.content.SharedPreferences r4 = android.preference.PreferenceManager.getDefaultSharedPreferences(r4)
            android.content.SharedPreferences$Editor r4 = r4.edit()
            r1.f7680a = r4
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            android.view.WindowManager r5 = r17.getWindowManager()
            android.view.Display r5 = r5.getDefaultDisplay()
            r5.getMetrics(r4)
            int r5 = r4.widthPixels
            float r5 = (float) r5
            r1.f7693x = r5
            int r4 = r4.heightPixels
            float r4 = (float) r4
            r1.f7694y = r4
            r4 = -1
            switch(r18) {
                case 0: goto L_0x005f;
                case 1: goto L_0x005c;
                case 2: goto L_0x005c;
                case 3: goto L_0x005c;
                case 4: goto L_0x005c;
                case 5: goto L_0x005c;
                case 6: goto L_0x005c;
                case 7: goto L_0x005c;
                case 8: goto L_0x005c;
                case 9: goto L_0x005c;
                case 10: goto L_0x005c;
                default: goto L_0x005a;
            }
        L_0x005a:
            r5 = r4
            goto L_0x0061
        L_0x005c:
            r5 = 1600(0x640, float:2.242E-42)
            goto L_0x0061
        L_0x005f:
            r5 = 2000(0x7d0, float:2.803E-42)
        L_0x0061:
            r1.f7675D = r5
            switch(r18) {
                case 0: goto L_0x006e;
                case 1: goto L_0x006b;
                case 2: goto L_0x006b;
                case 3: goto L_0x006b;
                case 4: goto L_0x006b;
                case 5: goto L_0x0068;
                case 6: goto L_0x0068;
                case 7: goto L_0x0068;
                case 8: goto L_0x006b;
                case 9: goto L_0x006b;
                case 10: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            r5 = r4
            goto L_0x0070
        L_0x0068:
            r5 = 1800(0x708, float:2.522E-42)
            goto L_0x0070
        L_0x006b:
            r5 = 1250(0x4e2, float:1.752E-42)
            goto L_0x0070
        L_0x006e:
            r5 = 2500(0x9c4, float:3.503E-42)
        L_0x0070:
            r1.f7676E = r5
            switch(r18) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0079;
                case 2: goto L_0x0079;
                case 3: goto L_0x0079;
                case 4: goto L_0x0079;
                case 5: goto L_0x0076;
                case 6: goto L_0x0076;
                case 7: goto L_0x0076;
                case 8: goto L_0x0079;
                case 9: goto L_0x0079;
                case 10: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x007a
        L_0x0076:
            r4 = 500(0x1f4, float:7.0E-43)
            goto L_0x007a
        L_0x0079:
            r4 = r3
        L_0x007a:
            r1.F = r4
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            com.mtma.criminal.city.app.MyApplication r5 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "window"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            if (r5 == 0) goto L_0x009b
            android.view.Display r5 = r5.getDefaultDisplay()
            r5.getMetrics(r4)
            float r4 = r4.density
            goto L_0x009d
        L_0x009b:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x009d:
            r5 = 1062836634(0x3f59999a, float:0.85)
            float r4 = r4 * r5
            r1.f7695z = r4
            int r5 = r1.f7675D
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            float r4 = r4 * r5
            float r5 = r1.f7694y
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bb
            int r4 = r1.f7675D
            int r4 = java.lang.Math.abs(r4)
            float r4 = (float) r4
            float r5 = r5 / r4
            r1.f7695z = r5
        L_0x00bb:
            float r4 = r1.f7695z
            int r5 = r1.f7676E
            float r5 = (float) r5
            float r4 = r4 * r5
            float r6 = r1.f7693x
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00cb
            float r4 = r6 / r5
            r1.f7695z = r4
        L_0x00cb:
            int r4 = r1.f7675D
            float r4 = (float) r4
            float r7 = r1.f7695z
            float r4 = r4 * r7
            r1.f7672A = r4
            int r4 = r1.F
            float r4 = (float) r4
            float r4 = r4 * r7
            r1.f7674C = r4
            float r5 = r5 * r7
            r1.f7673B = r5
            int r4 = (int) r4
            float r5 = r5 - r6
            int r5 = (int) r5
            int r4 = K1.e.J(r4, r5)
            float r4 = (float) r4
            r0.f5712b = r4
            r4 = 0
            int r4 = (int) r4
            float r5 = r1.f7672A
            float r6 = r1.f7694y
            float r5 = r5 - r6
            int r5 = (int) r5
            int r4 = K1.e.J(r4, r5)
            float r4 = (float) r4
            r0.f5713c = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = I1.b.C(r18)
            r0.append(r4)
            java.lang.String r4 = "/floor.png"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.graphics.Bitmap r0 = I1.b.B(r0)
            r1.f7683e = r0
            android.graphics.Bitmap r0 = I1.b.s(r0)
            r1.f7684f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = I1.b.C(r18)
            r0.append(r4)
            java.lang.String r4 = "/roads.png"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.graphics.Bitmap r0 = I1.b.B(r0)
            r1.f7685p = r0
            android.graphics.Bitmap r0 = I1.b.s(r0)
            r1.f7686q = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = I1.b.C(r18)
            r0.append(r4)
            java.lang.String r4 = "/buildings.png"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.graphics.Bitmap r0 = I1.b.B(r0)
            r1.f7687r = r0
            android.graphics.Bitmap r0 = I1.b.s(r0)
            r1.f7688s = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = I1.b.C(r18)
            r0.append(r4)
            java.lang.String r4 = "/banners.png"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.graphics.Bitmap r0 = I1.b.B(r0)
            r1.f7689t = r0
            java.util.ArrayList r4 = new java.util.ArrayList
            android.graphics.Bitmap r0 = r1.f7683e
            int r0 = r0.getWidth()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.graphics.Bitmap r5 = r1.f7685p
            int r5 = r5.getWidth()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.graphics.Bitmap r6 = r1.f7687r
            int r6 = r6.getWidth()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.graphics.Bitmap r7 = r1.f7689t
            int r7 = r7.getWidth()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r5, r6, r7}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = I1.b.C(r18)
            r0.append(r5)
            java.lang.String r5 = "/floor.atlas"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r0 = I1.b.N(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = I1.b.C(r18)
            r5.append(r6)
            java.lang.String r6 = "/roads.atlas"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.util.ArrayList r5 = I1.b.N(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = I1.b.C(r18)
            r6.append(r7)
            java.lang.String r7 = "/buildings.atlas"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.util.ArrayList r6 = I1.b.N(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = I1.b.C(r18)
            r7.append(r8)
            java.lang.String r8 = "/banners.atlas"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.ArrayList r7 = I1.b.N(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList[] r0 = new java.util.ArrayList[]{r0, r5, r6, r7}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r8.<init>(r0)
            java.lang.String r5 = "Exception from try-catch block inside "
            java.lang.String r6 = "b"
            java.lang.String r7 = " in getJsonObject method."
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            com.mtma.criminal.city.app.MyApplication r11 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            android.content.Context r11 = r11.getApplicationContext()     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            r12.<init>()     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            java.lang.String r13 = I1.b.C(r18)     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            r12.append(r13)     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            java.lang.String r13 = "/MainScene.dt"
            r12.append(r13)     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            java.io.InputStream r11 = r11.open(r12)     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            r10.<init>(r0)     // Catch:{ Exception -> 0x0290, all -> 0x028b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0264 }
            r0.<init>()     // Catch:{ Exception -> 0x0264 }
            r11 = 1024(0x400, float:1.435E-42)
            char[] r11 = new char[r11]     // Catch:{ Exception -> 0x0264 }
        L_0x0255:
            int r12 = r10.read(r11)     // Catch:{ Exception -> 0x0264 }
            if (r12 <= 0) goto L_0x0266
            r0.append(r11, r3, r12)     // Catch:{ Exception -> 0x0264 }
            goto L_0x0255
        L_0x025f:
            r0 = move-exception
            r2 = r0
            r9 = r10
            goto L_0x043e
        L_0x0264:
            r0 = move-exception
            goto L_0x0292
        L_0x0266:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0264 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0264 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0264 }
            r10.close()     // Catch:{ IOException -> 0x0273 }
            goto L_0x02c8
        L_0x0273:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r6)
            r0.append(r7)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r6, r0)
            goto L_0x02c8
        L_0x028b:
            r0 = move-exception
            r2 = r0
            r9 = 0
            goto L_0x043e
        L_0x0290:
            r0 = move-exception
            r10 = 0
        L_0x0292:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x025f }
            r11.<init>()     // Catch:{ all -> 0x025f }
            r11.append(r5)     // Catch:{ all -> 0x025f }
            r11.append(r6)     // Catch:{ all -> 0x025f }
            r11.append(r7)     // Catch:{ all -> 0x025f }
            r11.append(r0)     // Catch:{ all -> 0x025f }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x025f }
            android.util.Log.e(r6, r0)     // Catch:{ all -> 0x025f }
            if (r10 == 0) goto L_0x02c7
            r10.close()     // Catch:{ IOException -> 0x02b0 }
            goto L_0x02c7
        L_0x02b0:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r6)
            r0.append(r7)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r6, r0)
        L_0x02c7:
            r11 = 0
        L_0x02c8:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r0 = "composite"
            org.json.JSONObject r0 = r11.getJSONObject(r0)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r10 = "content"
            org.json.JSONObject r0 = r0.getJSONObject(r10)     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r10 = "games.rednblack.editor.renderer.data.CompositeItemVO"
            org.json.JSONArray r10 = r0.getJSONArray(r10)     // Catch:{ Exception -> 0x02f3 }
            r11 = r3
        L_0x02e0:
            int r12 = r10.length()     // Catch:{ Exception -> 0x02f3 }
            if (r11 >= r12) goto L_0x02f5
            org.json.JSONObject r12 = r10.getJSONObject(r11)     // Catch:{ Exception -> 0x02f3 }
            c5.b r12 = I1.b.F(r12)     // Catch:{ Exception -> 0x02f3 }
            r7.add(r12)     // Catch:{ Exception -> 0x02f3 }
            int r11 = r11 + r2
            goto L_0x02e0
        L_0x02f3:
            r0 = move-exception
            goto L_0x030f
        L_0x02f5:
            java.lang.String r10 = "games.rednblack.editor.renderer.data.SimpleImageVO"
            org.json.JSONArray r0 = r0.getJSONArray(r10)     // Catch:{ Exception -> 0x02f3 }
            r10 = r3
        L_0x02fc:
            int r11 = r0.length()     // Catch:{ Exception -> 0x02f3 }
            if (r10 >= r11) goto L_0x0314
            org.json.JSONObject r11 = r0.getJSONObject(r10)     // Catch:{ Exception -> 0x02f3 }
            c5.b r11 = I1.b.d0(r11)     // Catch:{ Exception -> 0x02f3 }
            r7.add(r11)     // Catch:{ Exception -> 0x02f3 }
            int r10 = r10 + r2
            goto L_0x02fc
        L_0x030f:
            java.lang.String r10 = " in getImagesPropertiesFromMapFile method."
            com.google.android.gms.internal.measurement.a.q(r5, r6, r10, r0, r6)
        L_0x0314:
            H4.i r0 = new H4.i
            r5 = 7
            r0.<init>(r5)
            r7.sort(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5 = r3
        L_0x0323:
            int r6 = r7.size()
            if (r5 >= r6) goto L_0x03fc
            java.lang.Object r6 = r7.get(r5)
            c5.b r6 = (c5.C0343b) r6
            java.lang.String r10 = r6.f5697a
            boolean r11 = r6.h
            boolean r12 = r6.f5702i
            c5.c r13 = new c5.c
            r13.<init>()
            r13.f5704a = r10
            java.lang.String r10 = r6.f5698b
            r13.f5705b = r10
            r13.f5707e = r11
            r13.f5708f = r12
            java.lang.String r14 = "floor"
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x034e
        L_0x034c:
            r10 = r3
            goto L_0x036b
        L_0x034e:
            java.lang.String r14 = "roads"
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x0358
            r10 = r2
            goto L_0x036b
        L_0x0358:
            java.lang.String r14 = "buildings"
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x0362
            r10 = 2
            goto L_0x036b
        L_0x0362:
            java.lang.String r14 = "banners"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x034c
            r10 = 3
        L_0x036b:
            r14 = r3
        L_0x036c:
            java.lang.Object r15 = r8.get(r10)
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x039e
            java.lang.Object r15 = r8.get(r10)
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r15 = r15.get(r14)
            c5.a r15 = (c5.C0342a) r15
            java.lang.String r15 = r15.f5693a
            java.lang.String r3 = r6.f5697a
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x039b
            java.lang.Object r3 = r8.get(r10)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r14)
            c5.a r3 = (c5.C0342a) r3
            goto L_0x039f
        L_0x039b:
            int r14 = r14 + r2
            r3 = 0
            goto L_0x036c
        L_0x039e:
            r3 = 0
        L_0x039f:
            java.lang.Object r10 = r4.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            int r14 = r6.d
            int r15 = r6.f5699c
            if (r12 == 0) goto L_0x03c0
            android.graphics.Rect r3 = new android.graphics.Rect
            int r10 = r6.g
            int r10 = r14 - r10
            int r11 = r6.f5701f
            int r11 = r11 + r15
            r3.<init>(r15, r10, r11, r14)
            c5.d r6 = r6.f5703j
            r13.g = r6
            goto L_0x03f3
        L_0x03c0:
            android.graphics.Rect r6 = new android.graphics.Rect
            int r12 = r3.f5696e
            int r12 = r14 - r12
            int r9 = r3.d
            int r9 = r9 + r15
            r6.<init>(r15, r12, r9, r14)
            if (r11 == 0) goto L_0x03e1
            android.graphics.Rect r9 = new android.graphics.Rect
            int r11 = r3.f5694b
            int r12 = r3.d
            int r12 = r12 + r11
            int r12 = r10 - r12
            int r14 = r3.f5695c
            int r10 = r10 - r11
            int r3 = r3.f5696e
            int r3 = r3 + r14
            r9.<init>(r12, r14, r10, r3)
            goto L_0x03f0
        L_0x03e1:
            android.graphics.Rect r9 = new android.graphics.Rect
            int r10 = r3.f5694b
            int r11 = r3.f5695c
            int r12 = r3.d
            int r12 = r12 + r10
            int r3 = r3.f5696e
            int r3 = r3 + r11
            r9.<init>(r10, r11, r12, r3)
        L_0x03f0:
            r13.f5706c = r9
            r3 = r6
        L_0x03f3:
            r13.d = r3
            r0.add(r13)
            int r5 = r5 + r2
            r3 = 0
            goto L_0x0323
        L_0x03fc:
            r1.f7682c = r0
            r3 = 0
        L_0x03ff:
            java.util.ArrayList r0 = r1.f7682c
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x0424
            java.util.ArrayList r0 = r1.f7682c
            java.lang.Object r0 = r0.get(r3)
            c5.c r0 = (c5.C0344c) r0
            boolean r0 = r0.f5708f
            if (r0 == 0) goto L_0x0422
            java.util.ArrayList r0 = r1.f7682c
            java.lang.Object r0 = r0.get(r3)
            c5.c r0 = (c5.C0344c) r0
            c5.d r0 = r0.g
            java.util.ArrayList r4 = r1.d
            r4.add(r0)
        L_0x0422:
            int r3 = r3 + r2
            goto L_0x03ff
        L_0x0424:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.f7677G = r0
            B0.c r0 = new B0.c
            r2 = 28
            r0.<init>((java.lang.Object) r1, (int) r2)
            r1.f7678H = r0
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r2 = r17
            r0.<init>(r2, r1)
            r1.f7679I = r0
            return
        L_0x043e:
            if (r9 == 0) goto L_0x045b
            r9.close()     // Catch:{ IOException -> 0x0444 }
            goto L_0x045b
        L_0x0444:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r6)
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r6, r0)
        L_0x045b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.C0506c.<init>(com.mtma.criminal.city.activities.MainActivity, int):void");
    }

    public final void a() {
        C0346e eVar = this.f7691v;
        int i2 = (eVar.f5713c > 0.0f ? 1 : (eVar.f5713c == 0.0f ? 0 : -1));
        C0346e eVar2 = this.f7692w;
        if (i2 <= 0) {
            eVar.f5713c = 0.0f;
            eVar2.f5713c = 0.0f;
        }
        float f6 = eVar.f5713c;
        float f7 = this.f7672A;
        float f8 = this.f7694y;
        if (f6 >= f7 - f8) {
            eVar.f5713c = f7 - f8;
            eVar2.f5713c = 0.0f;
        }
        float f9 = eVar.f5712b;
        float f10 = this.f7674C;
        if (f9 <= f10) {
            eVar.f5712b = f10;
            eVar2.f5712b = 0.0f;
        }
        float f11 = eVar.f5712b;
        float f12 = this.f7673B;
        float f13 = this.f7693x;
        if (f11 >= f12 - f13) {
            eVar.f5712b = f12 - f13;
            eVar2.f5712b = 0.0f;
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        boolean z3;
        Canvas canvas2;
        Rect rect;
        Bitmap bitmap;
        Canvas canvas3 = canvas;
        canvas.save();
        C0346e eVar = this.f7691v;
        canvas3.translate(-eVar.f5712b, -eVar.f5713c);
        float f6 = this.f7695z;
        canvas3.scale(f6, f6);
        super.dispatchDraw(canvas);
        int i2 = 0;
        while (i2 < this.f7682c.size()) {
            Rect rect2 = ((C0344c) this.f7682c.get(i2)).d;
            int i5 = rect2.left;
            int i6 = rect2.top;
            int i7 = rect2.right;
            int i8 = rect2.bottom;
            float f7 = eVar.f5712b;
            float f8 = this.f7695z;
            double d6 = (double) (f7 / f8);
            double d7 = (double) ((f7 + this.f7693x) / f8);
            float f9 = eVar.f5713c;
            C0346e eVar2 = eVar;
            double d8 = (double) (f9 / f8);
            double d9 = (double) ((f9 + this.f7694y) / f8);
            Rect rect3 = rect2;
            double d10 = (double) i5;
            boolean z4 = true;
            if (d10 < d6 || d10 > d7) {
                double d11 = (double) i7;
                if (d11 < d6 || d11 > d7) {
                    z3 = false;
                    double d12 = (double) i6;
                    if (d12 < d8 || d12 > d9) {
                        double d13 = (double) i8;
                        if (d13 < d8 || d13 > d9) {
                            z4 = false;
                        }
                    }
                    if (z3 || !z4) {
                        canvas2 = canvas;
                    } else {
                        if (((C0344c) this.f7682c.get(i2)).f5708f) {
                            bitmap = b.B("Buildings/" + ((C0344c) this.f7682c.get(i2)).f5704a + ".png");
                            canvas2 = canvas;
                            rect = null;
                        } else {
                            if (((C0344c) this.f7682c.get(i2)).f5705b.equals("floor") && !((C0344c) this.f7682c.get(i2)).f5707e) {
                                bitmap = this.f7683e;
                            } else if (((C0344c) this.f7682c.get(i2)).f5705b.equals("floor") && ((C0344c) this.f7682c.get(i2)).f5707e) {
                                bitmap = this.f7684f;
                            } else if (((C0344c) this.f7682c.get(i2)).f5705b.equals("roads") && !((C0344c) this.f7682c.get(i2)).f5707e) {
                                bitmap = this.f7685p;
                            } else if (((C0344c) this.f7682c.get(i2)).f5705b.equals("roads") && ((C0344c) this.f7682c.get(i2)).f5707e) {
                                bitmap = this.f7686q;
                            } else if (((C0344c) this.f7682c.get(i2)).f5705b.equals("buildings") && !((C0344c) this.f7682c.get(i2)).f5707e) {
                                bitmap = this.f7687r;
                            } else if (((C0344c) this.f7682c.get(i2)).f5705b.equals("buildings") && ((C0344c) this.f7682c.get(i2)).f5707e) {
                                bitmap = this.f7688s;
                            } else if (((C0344c) this.f7682c.get(i2)).f5705b.equals("banners")) {
                                bitmap = this.f7689t;
                            } else {
                                bitmap = null;
                            }
                            rect = ((C0344c) this.f7682c.get(i2)).f5706c;
                            canvas2 = canvas;
                        }
                        canvas2.drawBitmap(bitmap, rect, rect3, (Paint) null);
                    }
                    i2++;
                    canvas3 = canvas2;
                    eVar = eVar2;
                }
            }
            z3 = true;
            double d122 = (double) i6;
            double d132 = (double) i8;
            z4 = false;
            if (z3) {
            }
            canvas2 = canvas;
            i2++;
            canvas3 = canvas2;
            eVar = eVar2;
        }
        Canvas canvas4 = canvas3;
        canvas.restore();
        C0346e eVar3 = this.f7692w;
        if (Math.abs(eVar3.f5712b) > 10.0f || Math.abs(eVar3.f5713c) > 10.0f) {
            this.f7677G.postDelayed(this.f7678H, 10);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C0346e eVar = this.f7692w;
        eVar.f5712b = 0.0f;
        eVar.f5713c = 0.0f;
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        this.f7681b = 1;
        float f8 = -f6;
        C0346e eVar = this.f7692w;
        eVar.f5712b = f8;
        eVar.f5713c = -f7;
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        double d6;
        int i2;
        ArrayList arrayList;
        int i5 = 0;
        int i6 = 1;
        if (this.f7681b == 1) {
            this.f7681b = 0;
            return true;
        }
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        C0346e eVar = this.f7691v;
        int i7 = (int) (((eVar.f5712b + x6) * ((float) this.f7676E)) / this.f7673B);
        int i8 = (int) (((eVar.f5713c + y6) * ((float) this.f7675D)) / this.f7672A);
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i9 >= arrayList2.size()) {
                break;
            }
            Point point = new Point(i7, i8);
            ArrayList arrayList3 = ((C0345d) arrayList2.get(i9)).f5710b;
            int size = arrayList3.size();
            double d7 = (double) point.x;
            double d8 = (double) point.y;
            Point point2 = (Point) arrayList3.get(i5);
            int i10 = i5;
            int i11 = i6;
            while (i11 <= size) {
                Point point3 = (Point) arrayList3.get(i11 % size);
                int i12 = i7;
                int i13 = i8;
                if (d8 <= ((double) Math.min(point2.y, point3.y)) || d8 > ((double) Math.max(point2.y, point3.y)) || d7 > ((double) Math.max(point2.x, point3.x))) {
                    arrayList = arrayList3;
                    i2 = size;
                    d6 = d8;
                } else {
                    int i14 = point2.y;
                    arrayList = arrayList3;
                    int i15 = point3.x;
                    int i16 = point2.x;
                    i2 = size;
                    d6 = d8;
                    double d9 = (((d8 - ((double) i14)) * ((double) (i15 - i16))) / ((double) (point3.y - i14))) + ((double) i16);
                    if (i16 == i15 || d7 <= d9) {
                        i10 ^= 1;
                    }
                }
                i11++;
                i7 = i12;
                point2 = point3;
                i8 = i13;
                arrayList3 = arrayList;
                size = i2;
                d8 = d6;
            }
            int i17 = i7;
            int i18 = i8;
            if (i10 != 0) {
                this.f7680a.putString("clicked_building", ((C0345d) arrayList2.get(i9)).f5709a).apply();
                break;
            }
            i9++;
            i7 = i17;
            i8 = i18;
            i5 = 0;
            i6 = 1;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        C0346e eVar = this.f7690u;
        if (action == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            eVar.f5712b = x6;
            eVar.f5713c = y6;
        } else if (action == 2) {
            float x7 = eVar.f5712b - motionEvent.getX();
            float y7 = eVar.f5713c - motionEvent.getY();
            if (Math.abs(x7) > 1.0f || Math.abs(y7) > 1.0f) {
                C0346e eVar2 = this.f7691v;
                eVar2.f5712b += x7;
                eVar2.f5713c += y7;
                a();
                invalidate();
            }
            float x8 = motionEvent.getX();
            float y8 = motionEvent.getY();
            eVar.f5712b = x8;
            eVar.f5713c = y8;
        }
        this.f7679I.onTouchEvent(motionEvent);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
    }
}
