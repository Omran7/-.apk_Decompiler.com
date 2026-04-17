package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.bumptech.glide.c;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class s extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final Class f4958a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4959b = new ArrayList();

    public s(Class cls, CharSequence charSequence) {
        super(charSequence);
        c.e(cls, "watcherClass cannot be null");
        this.f4958a = cls;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4959b;
            if (i2 < arrayList.size()) {
                ((r) arrayList.get(i2)).f4957b.incrementAndGet();
                i2++;
            } else {
                return;
            }
        }
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4959b;
            if (i2 < arrayList.size()) {
                ((r) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
                i2++;
            } else {
                return;
            }
        }
    }

    public final r c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4959b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            r rVar = (r) arrayList.get(i2);
            if (rVar.f4956a == obj) {
                return rVar;
            }
            i2++;
        }
    }

    public final boolean d(Object obj) {
        if (obj == null || this.f4958a != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final Editable delete(int i2, int i5) {
        super.delete(i2, i5);
        return this;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4959b;
            if (i2 < arrayList.size()) {
                ((r) arrayList.get(i2)).f4957b.decrementAndGet();
                i2++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        r c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        r c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        r c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i2, int i5, Class cls) {
        if (this.f4958a != cls) {
            return super.getSpans(i2, i5, cls);
        }
        r[] rVarArr = (r[]) super.getSpans(i2, i5, r.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, rVarArr.length);
        for (int i6 = 0; i6 < rVarArr.length; i6++) {
            objArr[i6] = rVarArr[i6].f4956a;
        }
        return objArr;
    }

    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    public final int nextSpanTransition(int i2, int i5, Class<r> cls) {
        if (cls == null || this.f4958a == cls) {
            cls = r.class;
        }
        return super.nextSpanTransition(i2, i5, cls);
    }

    public final void removeSpan(Object obj) {
        r rVar;
        if (d(obj)) {
            rVar = c(obj);
            if (rVar != null) {
                obj = rVar;
            }
        } else {
            rVar = null;
        }
        super.removeSpan(obj);
        if (rVar != null) {
            this.f4959b.remove(rVar);
        }
    }

    public final void setSpan(Object obj, int i2, int i5, int i6) {
        if (d(obj)) {
            r rVar = new r(obj);
            this.f4959b.add(rVar);
            obj = rVar;
        }
        super.setSpan(obj, i2, i5, i6);
    }

    public final CharSequence subSequence(int i2, int i5) {
        return new s(this.f4958a, this, i2, i5);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m1append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m6delete(int i2, int i5) {
        super.delete(i2, i5);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m7insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m4append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final Editable insert(int i2, CharSequence charSequence, int i5, int i6) {
        super.insert(i2, charSequence, i5, i6);
        return this;
    }

    public final SpannableStringBuilder replace(int i2, int i5, CharSequence charSequence) {
        a();
        super.replace(i2, i5, charSequence);
        e();
        return this;
    }

    public final Editable append(char c3) {
        super.append(c3);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m8insert(int i2, CharSequence charSequence, int i5, int i6) {
        super.insert(i2, charSequence, i5, i6);
        return this;
    }

    public s(Class cls, s sVar, int i2, int i5) {
        super(sVar, i2, i5);
        c.e(cls, "watcherClass cannot be null");
        this.f4958a = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m0append(char c3) {
        super.append(c3);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m3append(char c3) {
        super.append(c3);
        return this;
    }

    public final SpannableStringBuilder replace(int i2, int i5, CharSequence charSequence, int i6, int i7) {
        a();
        super.replace(i2, i5, charSequence, i6, i7);
        e();
        return this;
    }

    public final Editable append(CharSequence charSequence, int i2, int i5) {
        super.append(charSequence, i2, i5);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m2append(CharSequence charSequence, int i2, int i5) {
        super.append(charSequence, i2, i5);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m5append(CharSequence charSequence, int i2, int i5) {
        super.append(charSequence, i2, i5);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
