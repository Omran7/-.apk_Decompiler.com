package d4;

import java.util.TimeZone;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f7531a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i2, char c3) {
        if (i2 >= str.length() || str.charAt(i2) != c3) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            r1 = r18
            r2 = r19
            int r0 = r19.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            int r3 = r0 + 4
            int r4 = c(r0, r3, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r5 = 45
            boolean r6 = a(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r7 = 5
            if (r6 == 0) goto L_0x0019
            int r3 = r0 + 5
        L_0x0019:
            int r0 = r3 + 2
            int r6 = c(r3, r0, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            boolean r8 = a(r1, r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r8 == 0) goto L_0x0027
            int r0 = r3 + 3
        L_0x0027:
            int r3 = r0 + 2
            int r8 = c(r0, r3, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r9 = 84
            boolean r9 = a(r1, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r10 = 1
            r11 = 0
            if (r9 != 0) goto L_0x004e
            int r12 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r12 > r3) goto L_0x004e
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            int r6 = r6 - r10
            r0.<init>(r4, r6, r8)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r0.setLenient(r11)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.util.Date r0 = r0.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            return r0
        L_0x004e:
            r12 = 2
            r13 = 43
            r14 = 90
            if (r9 == 0) goto L_0x00f3
            int r3 = r0 + 3
            int r9 = r0 + 5
            int r3 = c(r3, r9, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r15 = 58
            boolean r16 = a(r1, r9, r15)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r16 == 0) goto L_0x0067
            int r9 = r0 + 6
        L_0x0067:
            int r0 = r9 + 2
            int r16 = c(r9, r0, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            boolean r15 = a(r1, r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r15 == 0) goto L_0x0076
            int r9 = r9 + 3
            r0 = r9
        L_0x0076:
            int r9 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r9 <= r0) goto L_0x00e9
            char r9 = r1.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r9 == r14) goto L_0x00e9
            if (r9 == r13) goto L_0x00e9
            if (r9 == r5) goto L_0x00e9
            int r9 = r0 + 2
            int r15 = c(r0, r9, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r11 = 59
            if (r15 <= r11) goto L_0x0096
            r11 = 63
            if (r15 >= r11) goto L_0x0096
            r15 = 59
        L_0x0096:
            r11 = 46
            boolean r11 = a(r1, r9, r11)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r11 == 0) goto L_0x00e3
            int r9 = r0 + 3
            int r11 = r0 + 4
        L_0x00a2:
            int r7 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r11 >= r7) goto L_0x00bc
            char r7 = r1.charAt(r11)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r5 = 48
            if (r7 < r5) goto L_0x00ba
            r5 = 57
            if (r7 <= r5) goto L_0x00b5
            goto L_0x00ba
        L_0x00b5:
            int r11 = r11 + 1
            r5 = 45
            goto L_0x00a2
        L_0x00ba:
            r5 = r11
            goto L_0x00c0
        L_0x00bc:
            int r5 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
        L_0x00c0:
            int r0 = r0 + 6
            int r0 = java.lang.Math.min(r5, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            int r7 = c(r9, r0, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            int r0 = r0 - r9
            if (r0 == r10) goto L_0x00d3
            if (r0 == r12) goto L_0x00d0
            goto L_0x00d5
        L_0x00d0:
            int r7 = r7 * 10
            goto L_0x00d5
        L_0x00d3:
            int r7 = r7 * 100
        L_0x00d5:
            r0 = r3
            r3 = r5
            r5 = r16
            goto L_0x00f7
        L_0x00da:
            r0 = move-exception
            goto L_0x01e8
        L_0x00dd:
            r0 = move-exception
            goto L_0x01e8
        L_0x00e0:
            r0 = move-exception
            goto L_0x01e8
        L_0x00e3:
            r0 = r3
            r3 = r9
            r5 = r16
            r7 = 0
            goto L_0x00f7
        L_0x00e9:
            r5 = r16
            r7 = 0
            r15 = 0
            r17 = r3
            r3 = r0
            r0 = r17
            goto L_0x00f7
        L_0x00f3:
            r0 = 0
            r5 = 0
            r7 = 0
            r15 = 0
        L_0x00f7:
            int r9 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r9 <= r3) goto L_0x01e0
            char r9 = r1.charAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.util.TimeZone r11 = f7531a
            if (r9 != r14) goto L_0x0108
            int r3 = r3 + r10
            goto L_0x01af
        L_0x0108:
            if (r9 == r13) goto L_0x012b
            r13 = 45
            if (r9 != r13) goto L_0x010f
            goto L_0x012b
        L_0x010f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r3.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
        L_0x012b:
            java.lang.String r9 = r1.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            int r13 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r14 = 5
            if (r13 < r14) goto L_0x0137
            goto L_0x0148
        L_0x0137:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r13.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r13.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r9 = "00"
            r13.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r9 = r13.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
        L_0x0148:
            int r13 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            int r3 = r3 + r13
            java.lang.String r13 = "+0000"
            boolean r13 = r13.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r13 != 0) goto L_0x01af
            java.lang.String r13 = "+00:00"
            boolean r13 = r13.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r13 == 0) goto L_0x015e
            goto L_0x01af
        L_0x015e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r11.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r13 = "GMT"
            r11.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r11.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r9 = r11.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r13 = r11.getID()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            boolean r14 = r13.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r14 != 0) goto L_0x01af
            java.lang.String r14 = ":"
            java.lang.String r12 = ""
            java.lang.String r12 = r13.replace(r14, r12)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            boolean r12 = r12.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            if (r12 == 0) goto L_0x018c
            goto L_0x01af
        L_0x018c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r3.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r4 = r11.getID()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
        L_0x01af:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r9.<init>(r11)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r11 = 0
            r9.setLenient(r11)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r9.set(r10, r4)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            int r6 = r6 - r10
            r4 = 2
            r9.set(r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r4 = 5
            r9.set(r4, r8)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r4 = 11
            r9.set(r4, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r0 = 12
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r0 = 13
            r9.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r0 = 14
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            r2.setIndex(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            return r0
        L_0x01e0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, IllegalArgumentException -> 0x00da }
        L_0x01e8:
            if (r1 != 0) goto L_0x01ec
            r1 = 0
            goto L_0x01ff
        L_0x01ec:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01ff:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x020b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0226
        L_0x020b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0226:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.String r5 = "Failed to parse date ["
            java.lang.String r6 = "]: "
            java.lang.String r1 = h0.C0552a.p(r5, r1, r6, r3)
            int r2 = r19.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i2, int i5, String str) {
        int i6;
        int i7;
        if (i2 < 0 || i5 > str.length() || i2 > i5) {
            throw new NumberFormatException(str);
        }
        if (i2 < i5) {
            i7 = i2 + 1;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit >= 0) {
                i6 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i5));
            }
        } else {
            i6 = 0;
            i7 = i2;
        }
        while (i7 < i5) {
            int i8 = i7 + 1;
            int digit2 = Character.digit(str.charAt(i7), 10);
            if (digit2 >= 0) {
                i6 = (i6 * 10) - digit2;
                i7 = i8;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i5));
            }
        }
        return -i6;
    }
}
