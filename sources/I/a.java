package I;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f1074e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f1075a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1076b;

    /* renamed from: c  reason: collision with root package name */
    public int f1077c;
    public char d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f1074e[i2] = Character.getDirectionality(i2);
        }
    }

    public a(CharSequence charSequence) {
        this.f1075a = charSequence;
        this.f1076b = charSequence.length();
    }

    public final byte a() {
        CharSequence charSequence = this.f1075a;
        char charAt = charSequence.charAt(this.f1077c - 1);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f1077c);
            this.f1077c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1077c--;
        char c3 = this.d;
        if (c3 < 1792) {
            return f1074e[c3];
        }
        return Character.getDirectionality(c3);
    }
}
