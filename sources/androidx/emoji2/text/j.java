package androidx.emoji2.text;

import H.a;
import T1.B;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.f;

public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f4932j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile j f4933k;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f4934a;

    /* renamed from: b  reason: collision with root package name */
    public final f f4935b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f4936c = 3;
    public final Handler d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4937e;

    /* renamed from: f  reason: collision with root package name */
    public final i f4938f;
    public final B g;
    public final int h;

    /* renamed from: i  reason: collision with root package name */
    public final d f4939i;

    public j(p pVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4934a = reentrantReadWriteLock;
        i iVar = (i) pVar.f4930b;
        this.f4938f = iVar;
        int i2 = pVar.f4929a;
        this.h = i2;
        this.f4939i = (d) pVar.f4931c;
        this.d = new Handler(Looper.getMainLooper());
        this.f4935b = new f(0);
        this.g = new B(29);
        f fVar = new f(this);
        this.f4937e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f4936c = 0;
            } catch (Throwable th) {
                this.f4934a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.a(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        boolean z3;
        synchronized (f4932j) {
            try {
                jVar = f4933k;
                if (jVar != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public final int b() {
        this.f4934a.readLock().lock();
        try {
            return this.f4936c;
        } finally {
            this.f4934a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z3;
        if (this.h == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        } else if (b() != 1) {
            this.f4934a.writeLock().lock();
            try {
                if (this.f4936c != 0) {
                    this.f4936c = 0;
                    this.f4934a.writeLock().unlock();
                    f fVar = this.f4937e;
                    j jVar = (j) fVar.f4927b;
                    try {
                        jVar.f4938f.a(new e(fVar));
                    } catch (Throwable th) {
                        jVar.d(th);
                    }
                }
            } finally {
                this.f4934a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4934a.writeLock().lock();
        try {
            this.f4936c = 2;
            arrayList.addAll(this.f4935b);
            this.f4935b.clear();
            this.f4934a.writeLock().unlock();
            this.d.post(new a((List) arrayList, this.f4936c, th));
        } catch (Throwable th2) {
            this.f4934a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.emoji2.text.x, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009e A[Catch:{ all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c0 A[Catch:{ all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r10.b()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000a
            r0 = r2
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            if (r0 == 0) goto L_0x0110
            if (r12 < 0) goto L_0x0108
            if (r13 < 0) goto L_0x0100
            if (r12 > r13) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            java.lang.String r3 = "start should be <= than end"
            com.bumptech.glide.c.b(r3, r0)
            r0 = 0
            if (r11 != 0) goto L_0x001f
            return r0
        L_0x001f:
            int r3 = r11.length()
            if (r12 > r3) goto L_0x0027
            r3 = r2
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            java.lang.String r4 = "start should be < than charSequence length"
            com.bumptech.glide.c.b(r4, r3)
            int r3 = r11.length()
            if (r13 > r3) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = r1
        L_0x0035:
            java.lang.String r3 = "end should be < than charSequence length"
            com.bumptech.glide.c.b(r3, r2)
            int r2 = r11.length()
            if (r2 == 0) goto L_0x00ff
            if (r12 != r13) goto L_0x0044
            goto L_0x00ff
        L_0x0044:
            androidx.emoji2.text.f r2 = r10.f4937e
            java.lang.Object r2 = r2.f4926a
            r3 = r2
            B0.h r3 = (B0.C0009h) r3
            r3.getClass()
            boolean r2 = r11 instanceof androidx.emoji2.text.s
            if (r2 == 0) goto L_0x0058
            r4 = r11
            androidx.emoji2.text.s r4 = (androidx.emoji2.text.s) r4
            r4.a()
        L_0x0058:
            java.lang.Class<androidx.emoji2.text.u> r4 = androidx.emoji2.text.u.class
            if (r2 != 0) goto L_0x0084
            boolean r5 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x0061
            goto L_0x0084
        L_0x0061:
            boolean r5 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x0081 }
            if (r5 == 0) goto L_0x008c
            r5 = r11
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x0081 }
            int r6 = r12 + -1
            int r7 = r13 + 1
            int r5 = r5.nextSpanTransition(r6, r7, r4)     // Catch:{ all -> 0x0081 }
            if (r5 > r13) goto L_0x008c
            androidx.emoji2.text.x r0 = new androidx.emoji2.text.x     // Catch:{ all -> 0x0081 }
            r0.<init>()     // Catch:{ all -> 0x0081 }
            r0.f4969a = r1     // Catch:{ all -> 0x0081 }
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch:{ all -> 0x0081 }
            r5.<init>(r11)     // Catch:{ all -> 0x0081 }
            r0.f4970b = r5     // Catch:{ all -> 0x0081 }
            goto L_0x008c
        L_0x0081:
            r12 = move-exception
            goto L_0x00f7
        L_0x0084:
            androidx.emoji2.text.x r0 = new androidx.emoji2.text.x     // Catch:{ all -> 0x0081 }
            r5 = r11
            android.text.Spannable r5 = (android.text.Spannable) r5     // Catch:{ all -> 0x0081 }
            r0.<init>(r5)     // Catch:{ all -> 0x0081 }
        L_0x008c:
            if (r0 == 0) goto L_0x00bc
            android.text.Spannable r5 = r0.f4970b     // Catch:{ all -> 0x0081 }
            java.lang.Object[] r4 = r5.getSpans(r12, r13, r4)     // Catch:{ all -> 0x0081 }
            androidx.emoji2.text.u[] r4 = (androidx.emoji2.text.u[]) r4     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x00bc
            int r5 = r4.length     // Catch:{ all -> 0x0081 }
            if (r5 <= 0) goto L_0x00bc
            int r5 = r4.length     // Catch:{ all -> 0x0081 }
        L_0x009c:
            if (r1 >= r5) goto L_0x00bc
            r6 = r4[r1]     // Catch:{ all -> 0x0081 }
            android.text.Spannable r7 = r0.f4970b     // Catch:{ all -> 0x0081 }
            int r7 = r7.getSpanStart(r6)     // Catch:{ all -> 0x0081 }
            android.text.Spannable r8 = r0.f4970b     // Catch:{ all -> 0x0081 }
            int r8 = r8.getSpanEnd(r6)     // Catch:{ all -> 0x0081 }
            if (r7 == r13) goto L_0x00b1
            r0.removeSpan(r6)     // Catch:{ all -> 0x0081 }
        L_0x00b1:
            int r12 = java.lang.Math.min(r7, r12)     // Catch:{ all -> 0x0081 }
            int r13 = java.lang.Math.max(r8, r13)     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00bc:
            r5 = r12
            r6 = r13
            if (r5 == r6) goto L_0x00f3
            int r12 = r11.length()     // Catch:{ all -> 0x0081 }
            if (r5 < r12) goto L_0x00c7
            goto L_0x00f3
        L_0x00c7:
            X4.d r9 = new X4.d     // Catch:{ all -> 0x0081 }
            java.lang.Object r12 = r3.f228b     // Catch:{ all -> 0x0081 }
            T1.B r12 = (T1.B) r12     // Catch:{ all -> 0x0081 }
            r13 = 1
            r1 = 0
            r9.<init>(r0, r12, r13, r1)     // Catch:{ all -> 0x0081 }
            r8 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            r4 = r11
            java.lang.Object r12 = r3.B(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0081 }
            androidx.emoji2.text.x r12 = (androidx.emoji2.text.x) r12     // Catch:{ all -> 0x0081 }
            if (r12 == 0) goto L_0x00ea
            android.text.Spannable r12 = r12.f4970b     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x00e8
            androidx.emoji2.text.s r11 = (androidx.emoji2.text.s) r11
            r11.b()
        L_0x00e8:
            r11 = r12
            goto L_0x00f6
        L_0x00ea:
            if (r2 == 0) goto L_0x00f6
        L_0x00ec:
            r12 = r11
            androidx.emoji2.text.s r12 = (androidx.emoji2.text.s) r12
            r12.b()
            goto L_0x00f6
        L_0x00f3:
            if (r2 == 0) goto L_0x00f6
            goto L_0x00ec
        L_0x00f6:
            return r11
        L_0x00f7:
            if (r2 == 0) goto L_0x00fe
            androidx.emoji2.text.s r11 = (androidx.emoji2.text.s) r11
            r11.b()
        L_0x00fe:
            throw r12
        L_0x00ff:
            return r11
        L_0x0100:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "end cannot be negative"
            r11.<init>(r12)
            throw r11
        L_0x0108:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "start cannot be negative"
            r11.<init>(r12)
            throw r11
        L_0x0110:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not initialized yet"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(h hVar) {
        c.e(hVar, "initCallback cannot be null");
        this.f4934a.writeLock().lock();
        try {
            if (this.f4936c != 1) {
                if (this.f4936c != 2) {
                    this.f4935b.add(hVar);
                }
            }
            this.d.post(new a(Arrays.asList(new h[]{hVar}), this.f4936c, (Throwable) null));
        } finally {
            this.f4934a.writeLock().unlock();
        }
    }
}
