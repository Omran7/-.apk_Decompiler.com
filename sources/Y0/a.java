package Y0;

import android.app.NotificationChannel;

public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2) {
        return new NotificationChannel(str, str2, 4);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void j() {
        /*
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.a.j():void");
    }
}
