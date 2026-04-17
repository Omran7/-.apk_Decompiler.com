package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

public final class c implements Iterator, Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public int f10210a;

    /* renamed from: b  reason: collision with root package name */
    public int f10211b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10212c;
    public final /* synthetic */ e d;

    public c(e eVar) {
        this.d = eVar;
        this.f10210a = eVar.f10226c - 1;
    }

    public final boolean equals(Object obj) {
        if (!this.f10212c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i2 = this.f10211b;
            e eVar = this.d;
            if (!j.a(key, eVar.f(i2)) || !j.a(entry.getValue(), eVar.j(this.f10211b))) {
                return false;
            }
            return true;
        }
    }

    public final Object getKey() {
        if (this.f10212c) {
            return this.d.f(this.f10211b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f10212c) {
            return this.d.j(this.f10211b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        if (this.f10211b < this.f10210a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        if (this.f10212c) {
            int i5 = this.f10211b;
            e eVar = this.d;
            Object f6 = eVar.f(i5);
            Object j6 = eVar.j(this.f10211b);
            int i6 = 0;
            if (f6 == null) {
                i2 = 0;
            } else {
                i2 = f6.hashCode();
            }
            if (j6 != null) {
                i6 = j6.hashCode();
            }
            return i2 ^ i6;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (hasNext()) {
            this.f10211b++;
            this.f10212c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f10212c) {
            this.d.h(this.f10211b);
            this.f10211b--;
            this.f10210a--;
            this.f10212c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f10212c) {
            return this.d.i(this.f10211b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
