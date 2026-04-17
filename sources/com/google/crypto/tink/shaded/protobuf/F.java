package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class F extends C0397b implements G, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6755b;

    static {
        new F(10).f6788a = false;
    }

    public F(int i2) {
        this(new ArrayList(i2));
    }

    public final A a(int i2) {
        ArrayList arrayList = this.f6755b;
        if (i2 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i2);
            arrayList2.addAll(arrayList);
            return new F(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i2, Object obj) {
        k();
        this.f6755b.add(i2, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        return addAll(this.f6755b.size(), collection);
    }

    public final void clear() {
        k();
        this.f6755b.clear();
        this.modCount++;
    }

    public final void e(C0404i iVar) {
        k();
        this.f6755b.add(iVar);
        this.modCount++;
    }

    public final Object get(int i2) {
        String str;
        ArrayList arrayList = this.f6755b;
        Object obj = arrayList.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0404i) {
            C0404i iVar = (C0404i) obj;
            iVar.getClass();
            Charset charset = B.f6742a;
            if (iVar.size() == 0) {
                str = "";
            } else {
                C0403h hVar = (C0403h) iVar;
                str = new String(hVar.d, hVar.y(), hVar.size(), charset);
            }
            C0403h hVar2 = (C0403h) iVar;
            int y6 = hVar2.y();
            if (s0.f6855a.q0(hVar2.d, y6, hVar2.size() + y6) == 0) {
                arrayList.set(i2, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, B.f6742a);
            a aVar = s0.f6855a;
            if (s0.f6855a.q0(bArr, 0, bArr.length) == 0) {
                arrayList.set(i2, str);
            }
        }
        return str;
    }

    public final G j() {
        if (this.f6788a) {
            return new k0(this);
        }
        return this;
    }

    public final Object m(int i2) {
        return this.f6755b.get(i2);
    }

    public final List n() {
        return Collections.unmodifiableList(this.f6755b);
    }

    public final Object remove(int i2) {
        k();
        Object remove = this.f6755b.remove(i2);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof C0404i)) {
            return new String((byte[]) remove, B.f6742a);
        }
        C0404i iVar = (C0404i) remove;
        iVar.getClass();
        Charset charset = B.f6742a;
        if (iVar.size() == 0) {
            return "";
        }
        C0403h hVar = (C0403h) iVar;
        return new String(hVar.d, hVar.y(), hVar.size(), charset);
    }

    public final Object set(int i2, Object obj) {
        k();
        Object obj2 = this.f6755b.set(i2, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C0404i)) {
            return new String((byte[]) obj2, B.f6742a);
        }
        C0404i iVar = (C0404i) obj2;
        iVar.getClass();
        Charset charset = B.f6742a;
        if (iVar.size() == 0) {
            return "";
        }
        C0403h hVar = (C0403h) iVar;
        return new String(hVar.d, hVar.y(), hVar.size(), charset);
    }

    public final int size() {
        return this.f6755b.size();
    }

    public F(ArrayList arrayList) {
        this.f6755b = arrayList;
    }

    public final boolean addAll(int i2, Collection collection) {
        k();
        if (collection instanceof G) {
            collection = ((G) collection).n();
        }
        boolean addAll = this.f6755b.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }
}
