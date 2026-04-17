package F3;

public enum i {
    ;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Enum} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: F3.i} */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r12v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r13v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: type inference failed for: r14v4, types: [java.lang.Enum, F3.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            F3.i r0 = new F3.i
            java.lang.String r1 = "OK"
            r15 = 0
            r0.<init>(r1, r15)
            f753a = r0
            F3.i r1 = new F3.i
            java.lang.String r2 = "CANCELLED"
            r3 = 1
            r1.<init>(r2, r3)
            f754b = r1
            F3.i r2 = new F3.i
            java.lang.String r3 = "UNKNOWN"
            r4 = 2
            r2.<init>(r3, r4)
            f755c = r2
            F3.i r3 = new F3.i
            java.lang.String r4 = "INVALID_ARGUMENT"
            r5 = 3
            r3.<init>(r4, r5)
            d = r3
            F3.i r4 = new F3.i
            java.lang.String r5 = "DEADLINE_EXCEEDED"
            r6 = 4
            r4.<init>(r5, r6)
            f756e = r4
            F3.i r5 = new F3.i
            java.lang.String r6 = "NOT_FOUND"
            r7 = 5
            r5.<init>(r6, r7)
            f757f = r5
            F3.i r6 = new F3.i
            java.lang.String r7 = "ALREADY_EXISTS"
            r8 = 6
            r6.<init>(r7, r8)
            F3.i r7 = new F3.i
            java.lang.String r8 = "PERMISSION_DENIED"
            r9 = 7
            r7.<init>(r8, r9)
            f758p = r7
            F3.i r8 = new F3.i
            java.lang.String r9 = "RESOURCE_EXHAUSTED"
            r10 = 8
            r8.<init>(r9, r10)
            f759q = r8
            F3.i r9 = new F3.i
            java.lang.String r10 = "FAILED_PRECONDITION"
            r11 = 9
            r9.<init>(r10, r11)
            F3.i r10 = new F3.i
            java.lang.String r11 = "ABORTED"
            r12 = 10
            r10.<init>(r11, r12)
            f760r = r10
            F3.i r11 = new F3.i
            java.lang.String r12 = "OUT_OF_RANGE"
            r13 = 11
            r11.<init>(r12, r13)
            F3.i r12 = new F3.i
            java.lang.String r13 = "UNIMPLEMENTED"
            r14 = 12
            r12.<init>(r13, r14)
            f761s = r12
            F3.i r13 = new F3.i
            java.lang.String r14 = "INTERNAL"
            r15 = 13
            r13.<init>(r14, r15)
            f762t = r13
            F3.i r14 = new F3.i
            java.lang.String r15 = "UNAVAILABLE"
            r17 = r13
            r13 = 14
            r14.<init>(r15, r13)
            f763u = r14
            F3.i r15 = new F3.i
            java.lang.String r13 = "DATA_LOSS"
            r18 = r14
            r14 = 15
            r15.<init>(r13, r14)
            F3.i r14 = new F3.i
            java.lang.String r13 = "UNAUTHENTICATED"
            r19 = r15
            r15 = 16
            r14.<init>(r13, r15)
            f764v = r14
            r13 = r17
            r17 = r14
            r14 = r18
            r18 = 0
            r15 = r19
            r16 = r17
            F3.i[] r0 = new F3.i[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            f765w = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            F3.i[] r1 = values()
            int r2 = r1.length
            r15 = r18
        L_0x00cf:
            if (r15 >= r2) goto L_0x010d
            r3 = r1[r15]
            int r4 = r3.ordinal()
            java.lang.Object r4 = r0.get(r4)
            F3.i r4 = (F3.i) r4
            if (r4 != 0) goto L_0x00e9
            int r4 = r3.ordinal()
            r0.put(r4, r3)
            int r15 = r15 + 1
            goto L_0x00cf
        L_0x00e9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Code value duplication between "
            r0.<init>(r1)
            r0.append(r4)
            r1 = 38
            r0.append(r1)
            java.lang.String r1 = r3.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.i.<clinit>():void");
    }
}
