package B0;

public final class x implements Appendable {

    /* renamed from: a  reason: collision with root package name */
    public final Appendable f331a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f332b = true;

    public x(Appendable appendable) {
        this.f331a = appendable;
    }

    public final Appendable append(char c3) {
        boolean z3 = this.f332b;
        Appendable appendable = this.f331a;
        boolean z4 = false;
        if (z3) {
            this.f332b = false;
            appendable.append("  ");
        }
        if (c3 == 10) {
            z4 = true;
        }
        this.f332b = z4;
        appendable.append(c3);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i2, int i5) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z3 = this.f332b;
        Appendable appendable = this.f331a;
        boolean z4 = false;
        if (z3) {
            this.f332b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i5 - 1) == 10) {
            z4 = true;
        }
        this.f332b = z4;
        appendable.append(charSequence, i2, i5);
        return this;
    }
}
