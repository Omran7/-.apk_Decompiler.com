package com.canhub.cropper;

import C.a;
import C.b;
import C.c;
import G5.N;
import I3.h;
import W0.B;
import W0.C0232d;
import W0.C0233e;
import W0.C0243o;
import W0.F;
import W0.G;
import W0.u;
import W0.w;
import W0.y;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import c.C0333h;
import com.mtma.criminal.city.R;
import f.C0518i;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import o5.d;

public class CropImageActivity extends C0518i implements F, B {

    /* renamed from: P  reason: collision with root package name */
    public static final /* synthetic */ int f5846P = 0;

    /* renamed from: I  reason: collision with root package name */
    public Uri f5847I;

    /* renamed from: J  reason: collision with root package name */
    public w f5848J;

    /* renamed from: K  reason: collision with root package name */
    public CropImageView f5849K;

    /* renamed from: L  reason: collision with root package name */
    public h f5850L;

    /* renamed from: M  reason: collision with root package name */
    public Uri f5851M;

    /* renamed from: N  reason: collision with root package name */
    public final C0333h f5852N = ((C0333h) k(new u(2), new C0243o(this, 0)));

    /* renamed from: O  reason: collision with root package name */
    public final C0333h f5853O = ((C0333h) k(new u(6), new C0243o(this, 1)));

    public static void s(Menu menu, int i2, int i5) {
        Drawable icon;
        j.e(menu, "menu");
        MenuItem findItem = menu.findItem(i2);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                b bVar = b.f370a;
                ColorFilter colorFilter = null;
                if (Build.VERSION.SDK_INT >= 29) {
                    Object a6 = c.a(bVar);
                    if (a6 != null) {
                        colorFilter = a.a(i5, a6);
                    }
                } else {
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                    if (mode != null) {
                        colorFilter = new PorterDuffColorFilter(i5, mode);
                    }
                }
                icon.setColorFilter(colorFilter);
                findItem.setIcon(icon);
            } catch (Exception e6) {
                Log.w("AIC", "Failed to update menu item color", e6);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r1 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0194, code lost:
        if (checkSelfPermission("android.permission.CAMERA") != 0) goto L_0x020e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r57) {
        /*
            r56 = this;
            r9 = r56
            r0 = r57
            super.onCreate(r57)
            android.view.LayoutInflater r1 = r56.getLayoutInflater()
            r2 = 2131492897(0x7f0c0021, float:1.8609259E38)
            r10 = 0
            r11 = 0
            android.view.View r1 = r1.inflate(r2, r10, r11)
            if (r1 == 0) goto L_0x03fa
            com.canhub.cropper.CropImageView r1 = (com.canhub.cropper.CropImageView) r1
            I3.h r2 = new I3.h
            r3 = 29
            r4 = 0
            r2.<init>(r1, r1, r3, r4)
            r9.f5850L = r2
            r9.setContentView((android.view.View) r1)
            I3.h r1 = r9.f5850L
            java.lang.String r12 = "binding"
            if (r1 == 0) goto L_0x03f3
            java.lang.Object r1 = r1.f1180c
            com.canhub.cropper.CropImageView r1 = (com.canhub.cropper.CropImageView) r1
            r9.f5849K = r1
            android.content.Intent r1 = r56.getIntent()
            java.lang.String r2 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r1 = r1.getBundleExtra(r2)
            if (r1 == 0) goto L_0x004b
            java.lang.String r2 = "CROP_IMAGE_EXTRA_SOURCE"
            android.os.Parcelable r2 = r1.getParcelable(r2)
            boolean r3 = r2 instanceof android.net.Uri
            if (r3 != 0) goto L_0x0048
            r2 = r10
        L_0x0048:
            android.net.Uri r2 = (android.net.Uri) r2
            goto L_0x004c
        L_0x004b:
            r2 = r10
        L_0x004c:
            r9.f5847I = r2
            if (r1 == 0) goto L_0x005f
            java.lang.String r2 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            boolean r2 = r1 instanceof W0.w
            if (r2 != 0) goto L_0x005b
            r1 = r10
        L_0x005b:
            W0.w r1 = (W0.w) r1
            if (r1 != 0) goto L_0x00b7
        L_0x005f:
            W0.w r1 = new W0.w
            r13 = r1
            r53 = -1
            r54 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r55 = 63
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
        L_0x00b7:
            r9.f5848J = r1
            r13 = 1
            r14 = 33
            java.lang.String r15 = "cropImageOptions"
            if (r0 != 0) goto L_0x02f7
            android.net.Uri r0 = r9.f5847I
            if (r0 == 0) goto L_0x00da
            android.net.Uri r1 = android.net.Uri.EMPTY
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cd
            goto L_0x00da
        L_0x00cd:
            com.canhub.cropper.CropImageView r0 = r9.f5849K
            if (r0 == 0) goto L_0x00d6
            android.net.Uri r1 = r9.f5847I
            r0.setImageUriAsync(r1)
        L_0x00d6:
            r18 = r12
            goto L_0x0309
        L_0x00da:
            W0.w r0 = r9.f5848J
            if (r0 == 0) goto L_0x02f2
            boolean r1 = r0.f4031q0
            java.lang.String r2 = "tmp_image_file"
            java.lang.String r3 = ".png"
            java.lang.String r4 = "image/*"
            if (r1 == 0) goto L_0x026a
            F3.k r1 = new F3.k
            S3.t r0 = new S3.t
            r5 = 9
            r0.<init>(r9, r5)
            r1.<init>((com.canhub.cropper.CropImageActivity) r9, (S3.t) r0)
            W0.w r0 = r9.f5848J
            if (r0 == 0) goto L_0x0265
            java.lang.String r5 = r0.f4033r0
            if (r5 == 0) goto L_0x011b
            r6 = r11
        L_0x00fd:
            int r7 = r5.length()
            if (r6 >= r7) goto L_0x0116
            char r7 = r5.charAt(r6)
            boolean r8 = java.lang.Character.isWhitespace(r7)
            if (r8 != 0) goto L_0x0113
            boolean r7 = java.lang.Character.isSpaceChar(r7)
            if (r7 == 0) goto L_0x0117
        L_0x0113:
            int r6 = r6 + 1
            goto L_0x00fd
        L_0x0116:
            r5 = r10
        L_0x0117:
            if (r5 == 0) goto L_0x011b
            r1.f770c = r5
        L_0x011b:
            java.util.List r5 = r0.s0
            if (r5 == 0) goto L_0x012b
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r5 = r10
        L_0x0127:
            if (r5 == 0) goto L_0x012b
            r1.d = r5
        L_0x012b:
            boolean r5 = r0.f4010b
            if (r5 == 0) goto L_0x0142
            java.io.File r5 = r56.getCacheDir()
            java.io.File r2 = java.io.File.createTempFile(r2, r3, r5)
            r2.createNewFile()
            r2.deleteOnExit()
            android.net.Uri r2 = android.support.v4.media.session.a.h0(r9, r2)
            goto L_0x0143
        L_0x0142:
            r2 = r10
        L_0x0143:
            boolean r3 = r0.f4010b
            boolean r5 = r0.f4008a
            r1.f771e = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.pm.PackageManager r6 = r56.getPackageManager()
            java.lang.String r0 = "android.permission.CAMERA"
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.String r8 = r56.getPackageName()
            r10 = 4096(0x1000, float:5.74E-42)
            if (r7 < r14) goto L_0x0174
            android.content.pm.PackageManager r7 = r56.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0170 }
            r18 = r12
            long r11 = (long) r10
            android.content.pm.PackageManager$PackageInfoFlags r10 = android.content.pm.PackageManager.PackageInfoFlags.of(r11)     // Catch:{ NameNotFoundException -> 0x016e }
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r10)     // Catch:{ NameNotFoundException -> 0x016e }
            goto L_0x017e
        L_0x016e:
            r0 = move-exception
            goto L_0x019b
        L_0x0170:
            r0 = move-exception
            r18 = r12
            goto L_0x019b
        L_0x0174:
            r18 = r12
            android.content.pm.PackageManager r7 = r56.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016e }
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r10)     // Catch:{ NameNotFoundException -> 0x016e }
        L_0x017e:
            java.lang.String[] r7 = r7.requestedPermissions     // Catch:{ NameNotFoundException -> 0x016e }
            if (r7 == 0) goto L_0x019e
            int r8 = r7.length     // Catch:{ NameNotFoundException -> 0x016e }
            r10 = 0
        L_0x0184:
            if (r10 >= r8) goto L_0x019e
            r11 = r7[r10]     // Catch:{ NameNotFoundException -> 0x016e }
            if (r11 == 0) goto L_0x0198
            boolean r11 = r11.equalsIgnoreCase(r0)     // Catch:{ NameNotFoundException -> 0x016e }
            if (r11 != r13) goto L_0x0198
            int r0 = r9.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x019e
            goto L_0x020e
        L_0x0198:
            int r10 = r10 + 1
            goto L_0x0184
        L_0x019b:
            r0.printStackTrace()
        L_0x019e:
            if (r3 == 0) goto L_0x020e
            kotlin.jvm.internal.j.b(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r7 = "android.media.action.IMAGE_CAPTURE"
            r3.<init>(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r14) goto L_0x01be
            r7 = 0
            long r10 = (long) r7
            android.content.pm.PackageManager$ResolveInfoFlags r8 = android.content.pm.PackageManager.ResolveInfoFlags.of(r10)
            java.util.List r8 = r6.queryIntentActivities(r3, r8)
            goto L_0x01c3
        L_0x01be:
            r7 = 0
            java.util.List r8 = r6.queryIntentActivities(r3, r7)
        L_0x01c3:
            kotlin.jvm.internal.j.b(r8)
            java.util.Iterator r7 = r8.iterator()
        L_0x01ca:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x020b
            java.lang.Object r8 = r7.next()
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r3)
            android.content.ComponentName r11 = new android.content.ComponentName
            android.content.pm.ActivityInfo r12 = r8.activityInfo
            java.lang.String r14 = r12.packageName
            java.lang.String r12 = r12.name
            r11.<init>(r14, r12)
            r10.setComponent(r11)
            android.content.pm.ActivityInfo r11 = r8.activityInfo
            java.lang.String r11 = r11.packageName
            r10.setPackage(r11)
            android.content.pm.ActivityInfo r8 = r8.activityInfo
            java.lang.String r8 = r8.packageName
            java.lang.Object r11 = r1.f771e
            android.net.Uri r11 = (android.net.Uri) r11
            r12 = 3
            r9.grantUriPermission(r8, r11, r12)
            java.lang.String r8 = "output"
            java.lang.Object r11 = r1.f771e
            android.net.Uri r11 = (android.net.Uri) r11
            r10.putExtra(r8, r11)
            r0.add(r10)
            r14 = 33
            goto L_0x01ca
        L_0x020b:
            r2.addAll(r0)
        L_0x020e:
            java.lang.String r0 = "android.intent.action.PICK"
            if (r5 == 0) goto L_0x0228
            kotlin.jvm.internal.j.b(r6)
            java.lang.String r3 = "android.intent.action.GET_CONTENT"
            java.util.ArrayList r3 = r1.j(r6, r3)
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x0225
            java.util.ArrayList r3 = r1.j(r6, r0)
        L_0x0225:
            r2.addAll(r3)
        L_0x0228:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0234
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            goto L_0x0246
        L_0x0234:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.CHOOSER"
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r3.<init>(r6, r7)
            if (r5 == 0) goto L_0x0245
            r3.setAction(r0)
            r3.setType(r4)
        L_0x0245:
            r0 = r3
        L_0x0246:
            java.lang.Object r3 = r1.f770c
            java.lang.String r3 = (java.lang.String) r3
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r3)
            r3 = 0
            android.os.Parcelable[] r4 = new android.os.Parcelable[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            java.lang.String r3 = "android.intent.extra.INITIAL_INTENTS"
            r0.putExtra(r3, r2)
            java.lang.Object r1 = r1.f772f
            c.h r1 = (c.C0333h) r1
            r1.a(r0)
            goto L_0x0309
        L_0x0265:
            kotlin.jvm.internal.j.g(r15)
            r1 = 0
            throw r1
        L_0x026a:
            r18 = r12
            boolean r1 = r0.f4008a
            if (r1 == 0) goto L_0x02c8
            boolean r5 = r0.f4010b
            if (r5 == 0) goto L_0x02c8
            G5.l0 r0 = new G5.l0
            java.lang.Class<com.canhub.cropper.CropImageActivity> r4 = com.canhub.cropper.CropImageActivity.class
            java.lang.String r5 = "openSource"
            r2 = 1
            java.lang.String r6 = "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V"
            r7 = 0
            r8 = 1
            r1 = r0
            r3 = r56
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            B0.l r1 = new B0.l
            r1.<init>(r9)
            java.lang.Object r2 = r1.f247c
            f.b r2 = (f.C0511b) r2
            r3 = 0
            r2.f7753f = r3
            W0.q r3 = new W0.q
            r3.<init>(r9)
            r2.g = r3
            android.view.ContextThemeWrapper r3 = r2.f7749a
            r4 = 2131888263(0x7f120887, float:1.9411156E38)
            java.lang.CharSequence r3 = r3.getText(r4)
            r2.d = r3
            r3 = 2131888262(0x7f120886, float:1.9411154E38)
            java.lang.String r3 = r9.getString(r3)
            r4 = 2131888264(0x7f120888, float:1.9411158E38)
            java.lang.String r4 = r9.getString(r4)
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            W0.r r4 = new W0.r
            r4.<init>(r0)
            r2.h = r3
            r2.f7755j = r4
            f.f r0 = r1.a()
            r0.show()
            goto L_0x0309
        L_0x02c8:
            if (r1 == 0) goto L_0x02d0
            c.h r0 = r9.f5852N
            r0.a(r4)
            goto L_0x0309
        L_0x02d0:
            boolean r0 = r0.f4010b
            if (r0 == 0) goto L_0x02ee
            java.io.File r0 = r56.getCacheDir()
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)
            r0.createNewFile()
            r0.deleteOnExit()
            android.net.Uri r0 = android.support.v4.media.session.a.h0(r9, r0)
            r9.f5851M = r0
            c.h r1 = r9.f5853O
            r1.a(r0)
            goto L_0x0309
        L_0x02ee:
            r56.finish()
            goto L_0x0309
        L_0x02f2:
            kotlin.jvm.internal.j.g(r15)
            r1 = 0
            throw r1
        L_0x02f7:
            r18 = r12
            java.lang.String r1 = "bundle_key_tmp_uri"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x0306
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0307
        L_0x0306:
            r0 = 0
        L_0x0307:
            r9.f5851M = r0
        L_0x0309:
            W0.w r0 = r9.f5848J
            if (r0 == 0) goto L_0x03ee
            I3.h r1 = r9.f5850L
            if (r1 == 0) goto L_0x03e9
            java.lang.Object r1 = r1.f1179b
            com.canhub.cropper.CropImageView r1 = (com.canhub.cropper.CropImageView) r1
            int r0 = r0.f4042w0
            r1.setBackgroundColor(r0)
            f.J r0 = r56.o()
            if (r0 == 0) goto L_0x03d2
            W0.w r1 = r9.f5848J
            if (r1 == 0) goto L_0x03cd
            java.lang.CharSequence r1 = r1.f4003V
            int r2 = r1.length()
            if (r2 != 0) goto L_0x032e
            java.lang.String r1 = ""
        L_0x032e:
            r9.setTitle(r1)
            k.l0 r1 = r0.f7740t
            k.a1 r1 = (k.a1) r1
            int r2 = r1.f9258b
            r0.f7743w = r13
            r2 = r2 & -5
            r3 = 4
            r2 = r2 | r3
            r1.a(r2)
            W0.w r1 = r9.f5848J
            if (r1 == 0) goto L_0x03c8
            java.lang.Integer r1 = r1.f4044x0
            if (r1 == 0) goto L_0x0356
            int r1 = r1.intValue()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r0.f7739s
            r1.setPrimaryBackground(r2)
        L_0x0356:
            W0.w r1 = r9.f5848J
            if (r1 == 0) goto L_0x03c3
            java.lang.Integer r1 = r1.f4046y0
            if (r1 == 0) goto L_0x037d
            int r1 = r1.intValue()
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.CharSequence r4 = r56.getTitle()
            r2.<init>(r4)
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r4.<init>(r1)
            int r1 = r2.length()
            r5 = 0
            r6 = 33
            r2.setSpan(r4, r5, r1, r6)
            r9.setTitle(r2)
        L_0x037d:
            W0.w r1 = r9.f5848J
            if (r1 == 0) goto L_0x03be
            java.lang.Integer r1 = r1.f4048z0
            if (r1 == 0) goto L_0x03d2
            int r1 = r1.intValue()
            r2 = 2131165768(0x7f070248, float:1.7945762E38)
            android.graphics.drawable.Drawable r2 = A.h.getDrawable(r9, r2)     // Catch:{ Exception -> 0x039d }
            if (r2 == 0) goto L_0x039f
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter     // Catch:{ Exception -> 0x039d }
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Exception -> 0x039d }
            r4.<init>(r1, r5)     // Catch:{ Exception -> 0x039d }
            r2.setColorFilter(r4)     // Catch:{ Exception -> 0x039d }
            goto L_0x039f
        L_0x039d:
            r0 = move-exception
            goto L_0x03ba
        L_0x039f:
            k.l0 r0 = r0.f7740t     // Catch:{ Exception -> 0x039d }
            k.a1 r0 = (k.a1) r0     // Catch:{ Exception -> 0x039d }
            r0.f9261f = r2     // Catch:{ Exception -> 0x039d }
            int r1 = r0.f9258b     // Catch:{ Exception -> 0x039d }
            r1 = r1 & r3
            androidx.appcompat.widget.Toolbar r3 = r0.f9257a     // Catch:{ Exception -> 0x039d }
            if (r1 == 0) goto L_0x03b5
            if (r2 == 0) goto L_0x03af
            goto L_0x03b1
        L_0x03af:
            android.graphics.drawable.Drawable r2 = r0.f9268o     // Catch:{ Exception -> 0x039d }
        L_0x03b1:
            r3.setNavigationIcon((android.graphics.drawable.Drawable) r2)     // Catch:{ Exception -> 0x039d }
            goto L_0x03d2
        L_0x03b5:
            r1 = 0
            r3.setNavigationIcon((android.graphics.drawable.Drawable) r1)     // Catch:{ Exception -> 0x039d }
            goto L_0x03d2
        L_0x03ba:
            r0.printStackTrace()
            goto L_0x03d2
        L_0x03be:
            kotlin.jvm.internal.j.g(r15)
            r1 = 0
            throw r1
        L_0x03c3:
            r1 = 0
            kotlin.jvm.internal.j.g(r15)
            throw r1
        L_0x03c8:
            r1 = 0
            kotlin.jvm.internal.j.g(r15)
            throw r1
        L_0x03cd:
            r1 = 0
            kotlin.jvm.internal.j.g(r15)
            throw r1
        L_0x03d2:
            androidx.activity.B r0 = r56.i()
            W0.p r1 = new W0.p
            r1.<init>(r9)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.j.e(r0, r2)
            androidx.activity.C r2 = new androidx.activity.C
            r2.<init>(r13, r1)
            r0.b(r2)
            return
        L_0x03e9:
            kotlin.jvm.internal.j.g(r18)
            r1 = 0
            throw r1
        L_0x03ee:
            r1 = 0
            kotlin.jvm.internal.j.g(r15)
            throw r1
        L_0x03f3:
            r1 = r10
            r18 = r12
            kotlin.jvm.internal.j.g(r18)
            throw r1
        L_0x03fa:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "rootView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onCreateOptionsMenu(android.view.Menu r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r3 = "AIC"
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.j.e(r2, r0)
            W0.w r0 = r1.f5848J
            java.lang.String r4 = "cropImageOptions"
            r5 = 0
            if (r0 == 0) goto L_0x016d
            boolean r0 = r0.f4029p0
            r6 = 1
            if (r0 == 0) goto L_0x0018
            return r6
        L_0x0018:
            android.view.MenuInflater r0 = r17.getMenuInflater()
            r7 = 2131623936(0x7f0e0000, float:1.8875038E38)
            r0.inflate(r7, r2)
            W0.w r0 = r1.f5848J
            if (r0 == 0) goto L_0x0169
            boolean r7 = r0.f4020h0
            r8 = 2131297650(0x7f090572, float:1.821325E38)
            r9 = 2131297649(0x7f090571, float:1.8213249E38)
            if (r7 != 0) goto L_0x0036
            r2.removeItem(r9)
            r2.removeItem(r8)
            goto L_0x0041
        L_0x0036:
            boolean r0 = r0.f4022j0
            if (r0 == 0) goto L_0x0041
            android.view.MenuItem r0 = r2.findItem(r9)
            r0.setVisible(r6)
        L_0x0041:
            W0.w r0 = r1.f5848J
            if (r0 == 0) goto L_0x0165
            boolean r0 = r0.f4021i0
            r7 = 2131297646(0x7f09056e, float:1.8213243E38)
            if (r0 != 0) goto L_0x004f
            r2.removeItem(r7)
        L_0x004f:
            W0.w r0 = r1.f5848J
            if (r0 == 0) goto L_0x0161
            java.lang.CharSequence r0 = r0.f4026n0
            r10 = 2131296481(0x7f0900e1, float:1.821088E38)
            if (r0 == 0) goto L_0x006c
            android.view.MenuItem r0 = r2.findItem(r10)
            W0.w r11 = r1.f5848J
            if (r11 == 0) goto L_0x0068
            java.lang.CharSequence r11 = r11.f4026n0
            r0.setTitle(r11)
            goto L_0x006c
        L_0x0068:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x006c:
            W0.w r0 = r1.f5848J     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0087
            int r0 = r0.f4027o0     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0085
            android.graphics.drawable.Drawable r11 = A.h.getDrawable(r1, r0)     // Catch:{ Exception -> 0x0082 }
            android.view.MenuItem r0 = r2.findItem(r10)     // Catch:{ Exception -> 0x0080 }
            r0.setIcon(r11)     // Catch:{ Exception -> 0x0080 }
            goto L_0x0090
        L_0x0080:
            r0 = move-exception
            goto L_0x008b
        L_0x0082:
            r0 = move-exception
            r11 = r5
            goto L_0x008b
        L_0x0085:
            r11 = r5
            goto L_0x0090
        L_0x0087:
            kotlin.jvm.internal.j.g(r4)     // Catch:{ Exception -> 0x0082 }
            throw r5     // Catch:{ Exception -> 0x0082 }
        L_0x008b:
            java.lang.String r12 = "Failed to read menu crop drawable"
            android.util.Log.w(r3, r12, r0)
        L_0x0090:
            W0.w r0 = r1.f5848J
            if (r0 == 0) goto L_0x015d
            int r0 = r0.f4004W
            if (r0 == 0) goto L_0x00c5
            s(r2, r9, r0)
            W0.w r0 = r1.f5848J
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.f4004W
            s(r2, r8, r0)
            W0.w r0 = r1.f5848J
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.f4004W
            s(r2, r7, r0)
            if (r11 == 0) goto L_0x00c5
            W0.w r0 = r1.f5848J
            if (r0 == 0) goto L_0x00b9
            int r0 = r0.f4004W
            s(r2, r10, r0)
            goto L_0x00c5
        L_0x00b9:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x00bd:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x00c1:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x00c5:
            W0.w r0 = r1.f5848J
            if (r0 == 0) goto L_0x0159
            java.lang.Integer r0 = r0.f4005X
            if (r0 == 0) goto L_0x0158
            int r4 = r0.intValue()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r0 = 2131297647(0x7f09056f, float:1.8213245E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r0 = 2131297648(0x7f090570, float:1.8213247E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r11, r12, r13, r14, r15, r16}
            java.util.List r0 = n5.C0876h.S0(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x00fb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            android.view.MenuItem r0 = r2.findItem(r0)
            if (r0 != 0) goto L_0x0112
            goto L_0x00fb
        L_0x0112:
            java.lang.CharSequence r7 = r0.getTitle()
            if (r7 == 0) goto L_0x00fb
            r8 = 0
            r9 = r8
        L_0x011a:
            int r10 = r7.length()
            if (r9 >= r10) goto L_0x0136
            char r10 = r7.charAt(r9)
            boolean r11 = java.lang.Character.isWhitespace(r10)
            if (r11 != 0) goto L_0x0133
            boolean r10 = java.lang.Character.isSpaceChar(r10)
            if (r10 == 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            r9 = r8
            goto L_0x0137
        L_0x0133:
            int r9 = r9 + 1
            goto L_0x011a
        L_0x0136:
            r9 = r6
        L_0x0137:
            r9 = r9 ^ r6
            if (r9 != r6) goto L_0x00fb
            android.text.SpannableString r9 = new android.text.SpannableString     // Catch:{ Exception -> 0x0151 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x0151 }
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x0151 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x0151 }
            int r10 = r9.length()     // Catch:{ Exception -> 0x0151 }
            r11 = 33
            r9.setSpan(r7, r8, r10, r11)     // Catch:{ Exception -> 0x0151 }
            r0.setTitle(r9)     // Catch:{ Exception -> 0x0151 }
            goto L_0x00fb
        L_0x0151:
            r0 = move-exception
            java.lang.String r7 = "Failed to update menu item color"
            android.util.Log.w(r3, r7, r0)
            goto L_0x00fb
        L_0x0158:
            return r6
        L_0x0159:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x015d:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x0161:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x0165:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x0169:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        L_0x016d:
            kotlin.jvm.internal.j.g(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        j.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.crop_image_menu_crop) {
            p();
            return true;
        } else if (itemId == R.id.ic_rotate_left_24) {
            w wVar = this.f5848J;
            if (wVar != null) {
                int i2 = -wVar.f4023k0;
                CropImageView cropImageView = this.f5849K;
                if (cropImageView == null) {
                    return true;
                }
                cropImageView.e(i2);
                return true;
            }
            j.g("cropImageOptions");
            throw null;
        } else if (itemId == R.id.ic_rotate_right_24) {
            w wVar2 = this.f5848J;
            if (wVar2 != null) {
                int i5 = wVar2.f4023k0;
                CropImageView cropImageView2 = this.f5849K;
                if (cropImageView2 == null) {
                    return true;
                }
                cropImageView2.e(i5);
                return true;
            }
            j.g("cropImageOptions");
            throw null;
        } else if (itemId == R.id.ic_flip_24_horizontally) {
            CropImageView cropImageView3 = this.f5849K;
            if (cropImageView3 == null) {
                return true;
            }
            cropImageView3.f5885u = !cropImageView3.f5885u;
            cropImageView3.a((float) cropImageView3.getWidth(), (float) cropImageView3.getHeight(), true, false);
            return true;
        } else if (itemId == R.id.ic_flip_24_vertically) {
            CropImageView cropImageView4 = this.f5849K;
            if (cropImageView4 == null) {
                return true;
            }
            cropImageView4.f5886v = !cropImageView4.f5886v;
            cropImageView4.a((float) cropImageView4.getWidth(), (float) cropImageView4.getHeight(), true, false);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            r();
            return true;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        j.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("bundle_key_tmp_uri", String.valueOf(this.f5851M));
    }

    public final void onStart() {
        super.onStart();
        CropImageView cropImageView = this.f5849K;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.f5849K;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    public final void onStop() {
        super.onStop();
        CropImageView cropImageView = this.f5849K;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener((F) null);
        }
        CropImageView cropImageView2 = this.f5849K;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener((B) null);
        }
    }

    public final void p() {
        C0233e eVar;
        Pair pair;
        int i2;
        int i5;
        w wVar = this.f5848J;
        if (wVar == null) {
            j.g("cropImageOptions");
            throw null;
        } else if (wVar.f4016e0) {
            q((Uri) null, (Exception) null, 1);
        } else {
            CropImageView cropImageView = this.f5849K;
            if (cropImageView != null) {
                Bitmap.CompressFormat compressFormat = wVar.f4007Z;
                j.e(compressFormat, "saveCompressFormat");
                G g = wVar.f4014d0;
                j.e(g, "options");
                if (cropImageView.f5863K != null) {
                    Bitmap bitmap = cropImageView.f5882r;
                    if (bitmap != null) {
                        WeakReference weakReference = cropImageView.f5873U;
                        if (weakReference != null) {
                            eVar = (C0233e) weakReference.get();
                        } else {
                            eVar = null;
                        }
                        if (eVar != null) {
                            eVar.f3925C.cancel((CancellationException) null);
                        }
                        if (cropImageView.f5865M > 1 || g == G.f3877b) {
                            pair = new Pair(Integer.valueOf(bitmap.getWidth() * cropImageView.f5865M), Integer.valueOf(bitmap.getHeight() * cropImageView.f5865M));
                        } else {
                            pair = new Pair(0, 0);
                        }
                        Integer num = (Integer) pair.first;
                        Integer num2 = (Integer) pair.second;
                        Context context = cropImageView.getContext();
                        j.d(context, "getContext(...)");
                        WeakReference weakReference2 = new WeakReference(cropImageView);
                        Uri uri = cropImageView.f5864L;
                        float[] cropPoints = cropImageView.getCropPoints();
                        int i6 = cropImageView.f5884t;
                        j.b(num);
                        int intValue = num.intValue();
                        j.b(num2);
                        int intValue2 = num2.intValue();
                        CropOverlayView cropOverlayView = cropImageView.f5876b;
                        j.b(cropOverlayView);
                        boolean z3 = cropOverlayView.f5898I;
                        int aspectRatioX = cropOverlayView.getAspectRatioX();
                        int aspectRatioY = cropOverlayView.getAspectRatioY();
                        G g5 = G.f3876a;
                        if (g != g5) {
                            i2 = wVar.f4011b0;
                        } else {
                            i2 = 0;
                        }
                        if (g != g5) {
                            i5 = wVar.f4013c0;
                        } else {
                            i5 = 0;
                        }
                        boolean z4 = cropImageView.f5885u;
                        boolean z5 = cropImageView.f5886v;
                        Uri uri2 = wVar.f4006Y;
                        if (uri2 == null) {
                            uri2 = cropImageView.f5874V;
                        }
                        int i7 = wVar.f4009a0;
                        boolean z6 = z5;
                        boolean z7 = z4;
                        Context context2 = context;
                        WeakReference weakReference3 = weakReference2;
                        Uri uri3 = uri;
                        float[] fArr = cropPoints;
                        int i8 = i6;
                        C0233e eVar2 = r5;
                        CropImageView cropImageView2 = cropImageView;
                        int i9 = intValue2;
                        G g6 = g;
                        C0233e eVar3 = new C0233e(context2, weakReference3, uri3, bitmap, fArr, i8, intValue, i9, z3, aspectRatioX, aspectRatioY, i2, i5, z7, z6, g6, compressFormat, i7, uri2);
                        WeakReference weakReference4 = new WeakReference(eVar2);
                        CropImageView cropImageView3 = cropImageView2;
                        cropImageView3.f5873U = weakReference4;
                        Object obj = weakReference4.get();
                        j.b(obj);
                        C0233e eVar4 = (C0233e) obj;
                        eVar4.f3925C = G5.F.q(eVar4, N.f877a, new C0232d(eVar4, (d) null), 2);
                        cropImageView3.h();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
            }
        }
    }

    public final void q(Uri uri, Exception exc, int i2) {
        int i5;
        Uri uri2;
        float[] fArr;
        Rect rect;
        int i6;
        Rect rect2;
        if (exc != null) {
            i5 = 204;
        } else {
            i5 = -1;
        }
        CropImageView cropImageView = this.f5849K;
        if (cropImageView != null) {
            uri2 = cropImageView.getImageUri();
        } else {
            uri2 = null;
        }
        CropImageView cropImageView2 = this.f5849K;
        if (cropImageView2 != null) {
            fArr = cropImageView2.getCropPoints();
        } else {
            fArr = null;
        }
        CropImageView cropImageView3 = this.f5849K;
        if (cropImageView3 != null) {
            rect = cropImageView3.getCropRect();
        } else {
            rect = null;
        }
        CropImageView cropImageView4 = this.f5849K;
        if (cropImageView4 != null) {
            i6 = cropImageView4.getRotatedDegrees();
        } else {
            i6 = 0;
        }
        int i7 = i6;
        CropImageView cropImageView5 = this.f5849K;
        if (cropImageView5 != null) {
            rect2 = cropImageView5.getWholeImageRect();
        } else {
            rect2 = null;
        }
        j.b(fArr);
        y yVar = new y(uri2, uri, exc, fArr, rect, rect2, i7, i2);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", yVar);
        setResult(i5, intent);
        finish();
    }

    public final void r() {
        setResult(0);
        finish();
    }
}
