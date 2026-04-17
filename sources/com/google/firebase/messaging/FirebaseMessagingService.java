package com.google.firebase.messaging;

import S3.C0148i;
import S3.x;
import java.util.ArrayDeque;
import y1.b;

public class FirebaseMessagingService extends C0148i {

    /* renamed from: p  reason: collision with root package name */
    public static final ArrayDeque f6911p = new ArrayDeque(10);

    /* renamed from: f  reason: collision with root package name */
    public b f6912f;

    /* JADX WARNING: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Intent r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 3
            r2 = 0
            java.lang.String r3 = r11.getAction()
            java.lang.String r4 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "FirebaseMessaging"
            if (r4 != 0) goto L_0x0043
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x001a
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "token"
            r11.getStringExtra(r0)
            r10.d()
            goto L_0x01b7
        L_0x002c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown intent action: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getAction()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            android.util.Log.d(r5, r11)
            goto L_0x01b7
        L_0x0043:
            java.lang.String r3 = "google.message_id"
            java.lang.String r4 = r11.getStringExtra(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r7 = "message_id"
            if (r6 == 0) goto L_0x0052
            goto L_0x0081
        L_0x0052:
            java.util.ArrayDeque r6 = f6911p
            boolean r8 = r6.contains(r4)
            if (r8 == 0) goto L_0x0073
            boolean r6 = android.util.Log.isLoggable(r5, r1)
            if (r6 == 0) goto L_0x014b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Received duplicate message: "
            r6.<init>(r8)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r5, r4)
            goto L_0x014b
        L_0x0073:
            int r8 = r6.size()
            r9 = 10
            if (r8 < r9) goto L_0x007e
            r6.remove()
        L_0x007e:
            r6.add(r4)
        L_0x0081:
            java.lang.String r4 = "message_type"
            java.lang.String r4 = r11.getStringExtra(r4)
            if (r4 != 0) goto L_0x008b
            java.lang.String r4 = "gcm"
        L_0x008b:
            r6 = -1
            int r8 = r4.hashCode()
            switch(r8) {
                case -2062414158: goto L_0x00b5;
                case 102161: goto L_0x00aa;
                case 814694033: goto L_0x009f;
                case 814800675: goto L_0x0094;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x00bf
        L_0x0094:
            java.lang.String r8 = "send_event"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x009d
            goto L_0x00bf
        L_0x009d:
            r6 = r1
            goto L_0x00bf
        L_0x009f:
            java.lang.String r8 = "send_error"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00a8
            goto L_0x00bf
        L_0x00a8:
            r6 = 2
            goto L_0x00bf
        L_0x00aa:
            java.lang.String r8 = "gcm"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00b3
            goto L_0x00bf
        L_0x00b3:
            r6 = r0
            goto L_0x00bf
        L_0x00b5:
            java.lang.String r8 = "deleted_messages"
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r6 = r2
        L_0x00bf:
            switch(r6) {
                case 0: goto L_0x014b;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00d2;
                case 3: goto L_0x00cd;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            java.lang.String r6 = "Received message with unknown type: "
            java.lang.String r4 = r6.concat(r4)
            android.util.Log.w(r5, r4)
            goto L_0x014b
        L_0x00cd:
            r11.getStringExtra(r3)
            goto L_0x014b
        L_0x00d2:
            java.lang.String r4 = r11.getStringExtra(r3)
            if (r4 != 0) goto L_0x00db
            r11.getStringExtra(r7)
        L_0x00db:
            S3.y r4 = new S3.y
            java.lang.String r5 = "error"
            java.lang.String r5 = r11.getStringExtra(r5)
            r4.<init>(r5)
            if (r5 != 0) goto L_0x00e9
            goto L_0x014b
        L_0x00e9:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r5.toLowerCase(r4)
            r4.getClass()
            goto L_0x014b
        L_0x00f3:
            com.bumptech.glide.c.c0(r11)
            android.os.Bundle r4 = r11.getExtras()
            if (r4 != 0) goto L_0x0101
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x0101:
            java.lang.String r5 = "androidx.content.wakelockid"
            r4.remove(r5)
            boolean r5 = S3.t.p(r4)
            if (r5 == 0) goto L_0x0143
            S3.t r5 = new S3.t
            r5.<init>((android.os.Bundle) r4)
            H1.a r6 = new H1.a
            java.lang.String r8 = "Firebase-Messaging-Network-Io"
            r6.<init>(r8)
            java.util.concurrent.ExecutorService r6 = java.util.concurrent.Executors.newSingleThreadExecutor(r6)
            B0.h r8 = new B0.h
            r8.<init>((com.google.firebase.messaging.FirebaseMessagingService) r10, (S3.t) r5, (java.util.concurrent.ExecutorService) r6)
            boolean r5 = r8.z()     // Catch:{ all -> 0x013e }
            if (r5 == 0) goto L_0x012b
            r6.shutdown()
            goto L_0x014b
        L_0x012b:
            r6.shutdown()
            boolean r5 = com.bumptech.glide.c.p0(r11)
            if (r5 == 0) goto L_0x0143
            java.lang.String r5 = "_nf"
            android.os.Bundle r6 = r11.getExtras()
            com.bumptech.glide.c.d0(r6, r5)
            goto L_0x0143
        L_0x013e:
            r11 = move-exception
            r6.shutdown()
            throw r11
        L_0x0143:
            S3.x r5 = new S3.x
            r5.<init>(r4)
            r10.c(r5)
        L_0x014b:
            y1.b r4 = r10.f6912f
            if (r4 != 0) goto L_0x015a
            y1.b r4 = new y1.b
            android.content.Context r5 = r10.getApplicationContext()
            r4.<init>(r5)
            r10.f6912f = r4
        L_0x015a:
            y1.b r4 = r10.f6912f
            U0.b r5 = r4.f12653c
            int r5 = r5.b()
            r6 = 233700000(0xdedfaa0, float:1.46665885E-30)
            if (r5 < r6) goto L_0x01ad
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = r11.getStringExtra(r3)
            if (r6 != 0) goto L_0x0176
            java.lang.String r6 = r11.getStringExtra(r7)
        L_0x0176:
            r5.putString(r3, r6)
            java.lang.String r3 = "google.product_id"
            boolean r6 = r11.hasExtra(r3)
            if (r6 == 0) goto L_0x018a
            int r11 = r11.getIntExtra(r3, r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x018b
        L_0x018a:
            r11 = 0
        L_0x018b:
            if (r11 == 0) goto L_0x0194
            int r11 = r11.intValue()
            r5.putInt(r3, r11)
        L_0x0194:
            android.content.Context r11 = r4.f12652b
            y1.l r11 = y1.l.a(r11)
            y1.k r3 = new y1.k
            monitor-enter(r11)
            int r4 = r11.f12677a     // Catch:{ all -> 0x01aa }
            int r0 = r0 + r4
            r11.f12677a = r0     // Catch:{ all -> 0x01aa }
            monitor-exit(r11)
            r3.<init>(r4, r1, r5, r2)
            r11.b(r3)
            goto L_0x01b7
        L_0x01aa:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01aa }
            throw r0
        L_0x01ad:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            r11.<init>(r0)
            com.google.android.gms.tasks.Tasks.forException(r11)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public void d() {
    }

    public void c(x xVar) {
    }
}
