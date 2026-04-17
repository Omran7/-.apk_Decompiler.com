package e5;

import android.text.InputFilter;

/* renamed from: e5.a  reason: case insensitive filesystem */
public final class C0504a implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7670a;

    public /* synthetic */ C0504a(int i2) {
        this.f7670a = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 <= 'Z') goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r4 < 'a') goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r4 > 'z') goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r4 == '_') goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r4 != '-') goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r2 >= r3) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r4 = r1.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (java.lang.Character.isLetterOrDigit(r4) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (java.lang.Character.isLetter(r4) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        if (r4 < 'A') goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r2 >= r3) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        if (r4 <= 'Z') goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        if (r4 < 'a') goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        if (r4 > 'z') goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005e, code lost:
        if (r4 == '@') goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0062, code lost:
        if (r4 == '.') goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r4 = r1.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
        if (r4 == '_') goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:
        if (r4 != '-') goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0073, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (java.lang.Character.isLetterOrDigit(r4) == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (java.lang.Character.isLetter(r4) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r4 < 'A') goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence filter(java.lang.CharSequence r1, int r2, int r3, android.text.Spanned r4, int r5, int r6) {
        /*
            r0 = this;
            int r4 = r0.f7670a
            switch(r4) {
                case 0: goto L_0x0039;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 >= r3) goto L_0x0037
            char r4 = r1.charAt(r2)
            boolean r5 = java.lang.Character.isLetterOrDigit(r4)
            if (r5 == 0) goto L_0x0028
            boolean r5 = java.lang.Character.isLetter(r4)
            if (r5 == 0) goto L_0x0034
            r5 = 65
            if (r4 < r5) goto L_0x001f
            r5 = 90
            if (r4 <= r5) goto L_0x0034
        L_0x001f:
            r5 = 97
            if (r4 < r5) goto L_0x0031
            r5 = 122(0x7a, float:1.71E-43)
            if (r4 > r5) goto L_0x0031
            goto L_0x0034
        L_0x0028:
            r5 = 95
            if (r4 == r5) goto L_0x0034
            r5 = 45
            if (r4 != r5) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            java.lang.String r1 = ""
            goto L_0x0038
        L_0x0034:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0037:
            r1 = 0
        L_0x0038:
            return r1
        L_0x0039:
            if (r2 >= r3) goto L_0x0073
            char r4 = r1.charAt(r2)
            boolean r5 = java.lang.Character.isLetterOrDigit(r4)
            if (r5 == 0) goto L_0x005c
            boolean r5 = java.lang.Character.isLetter(r4)
            if (r5 == 0) goto L_0x0070
            r5 = 65
            if (r4 < r5) goto L_0x0053
            r5 = 90
            if (r4 <= r5) goto L_0x0070
        L_0x0053:
            r5 = 97
            if (r4 < r5) goto L_0x006d
            r5 = 122(0x7a, float:1.71E-43)
            if (r4 > r5) goto L_0x006d
            goto L_0x0070
        L_0x005c:
            r5 = 64
            if (r4 == r5) goto L_0x0070
            r5 = 46
            if (r4 == r5) goto L_0x0070
            r5 = 95
            if (r4 == r5) goto L_0x0070
            r5 = 45
            if (r4 != r5) goto L_0x006d
            goto L_0x0070
        L_0x006d:
            java.lang.String r1 = ""
            goto L_0x0074
        L_0x0070:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0073:
            r1 = 0
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.C0504a.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
