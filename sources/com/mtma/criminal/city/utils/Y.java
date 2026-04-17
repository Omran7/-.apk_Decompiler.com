package com.mtma.criminal.city.utils;

import java.util.concurrent.Callable;

public final class Y implements Callable {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r4 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0024, all -> 0x001a }
            java.lang.String r2 = "https://www.google.com/"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0024, all -> 0x001a }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x0024, all -> 0x001a }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x0024, all -> 0x001a }
            int r0 = r1.getResponseCode()     // Catch:{ Exception -> 0x0018, all -> 0x0016 }
            r1.disconnect()
            goto L_0x002b
        L_0x0016:
            r0 = move-exception
            goto L_0x001e
        L_0x0018:
            r0 = r1
            goto L_0x0024
        L_0x001a:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            r1.disconnect()
        L_0x0023:
            throw r0
        L_0x0024:
            if (r0 == 0) goto L_0x0029
            r0.disconnect()
        L_0x0029:
            r0 = 404(0x194, float:5.66E-43)
        L_0x002b:
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.utils.Y.call():java.lang.Object");
    }
}
