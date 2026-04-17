package k;

import D.a;
import Q.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0299j;
import f.C0516g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.j;
import m.b;
import m.f;
import n0.C0852b;

/* renamed from: k.t  reason: case insensitive filesystem */
public final class C0738t {

    /* renamed from: a  reason: collision with root package name */
    public Parcelable f9373a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9374b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9375c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9376e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f9377f;

    public /* synthetic */ C0738t(TextView textView) {
        this.f9373a = null;
        this.f9374b = null;
        this.f9375c = false;
        this.d = false;
        this.f9377f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f9377f;
        Drawable a6 = c.a(compoundButton);
        if (a6 == null) {
            return;
        }
        if (this.f9375c || this.d) {
            Drawable mutate = a6.mutate();
            if (this.f9375c) {
                a.h(mutate, (ColorStateList) this.f9373a);
            }
            if (this.d) {
                a.i(mutate, (PorterDuff.Mode) this.f9374b);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    public void b() {
        C0736s sVar = (C0736s) this.f9377f;
        Drawable checkMarkDrawable = sVar.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f9375c || this.d) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f9375c) {
                a.h(mutate, (ColorStateList) this.f9373a);
            }
            if (this.d) {
                a.i(mutate, (PorterDuff.Mode) this.f9374b);
            }
            if (mutate.isStateful()) {
                mutate.setState(sVar.getDrawableState());
            }
            sVar.setCheckMarkDrawable(mutate);
        }
    }

    public Bundle c(String str) {
        if (this.d) {
            Bundle bundle = (Bundle) this.f9373a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f9373a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f9373a;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f9373a = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public C0852b d() {
        Map.Entry entry;
        C0852b bVar;
        Iterator it2 = ((f) this.f9377f).iterator();
        do {
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                return null;
            }
            entry = (Map.Entry) bVar2.next();
            j.d(entry, "components");
            bVar = (C0852b) entry.getValue();
        } while (!j.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f9377f
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r3 = e.C0476a.f7541m
            c1.i r7 = c1.i.A(r1, r10, r3, r11)
            java.lang.Object r1 = r7.f5606c
            r8 = r1
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            android.content.Context r2 = r0.getContext()
            java.lang.Object r1 = r7.f5606c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r0
            r4 = r10
            r6 = r11
            K.O.k(r1, r2, r3, r4, r5, r6)
            r10 = 1
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r11 == 0) goto L_0x003e
            int r10 = r8.getResourceId(r10, r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x003e
            android.content.Context r11 = r0.getContext()     // Catch:{ NotFoundException -> 0x003e }
            android.graphics.drawable.Drawable r10 = R2.b.J(r11, r10)     // Catch:{ NotFoundException -> 0x003e }
            r0.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003e }
            goto L_0x0055
        L_0x003c:
            r10 = move-exception
            goto L_0x007b
        L_0x003e:
            boolean r10 = r8.hasValue(r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x0055
            int r10 = r8.getResourceId(r1, r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x0055
            android.content.Context r11 = r0.getContext()     // Catch:{ all -> 0x003c }
            android.graphics.drawable.Drawable r10 = R2.b.J(r11, r10)     // Catch:{ all -> 0x003c }
            r0.setButtonDrawable(r10)     // Catch:{ all -> 0x003c }
        L_0x0055:
            r10 = 2
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            if (r11 == 0) goto L_0x0063
            android.content.res.ColorStateList r10 = r7.m(r10)     // Catch:{ all -> 0x003c }
            Q.b.c(r0, r10)     // Catch:{ all -> 0x003c }
        L_0x0063:
            r10 = 3
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            if (r11 == 0) goto L_0x0077
            r11 = -1
            int r10 = r8.getInt(r10, r11)     // Catch:{ all -> 0x003c }
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = k.C0725m0.b(r10, r11)     // Catch:{ all -> 0x003c }
            Q.b.d(r0, r10)     // Catch:{ all -> 0x003c }
        L_0x0077:
            r7.G()
            return
        L_0x007b:
            r7.G()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0738t.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, C0852b bVar) {
        Object obj;
        j.e(bVar, "provider");
        f fVar = (f) this.f9377f;
        m.c k6 = fVar.k(str);
        if (k6 != null) {
            obj = k6.f9833b;
        } else {
            m.c cVar = new m.c(str, bVar);
            fVar.d++;
            m.c cVar2 = fVar.f9839b;
            if (cVar2 == null) {
                fVar.f9838a = cVar;
                fVar.f9839b = cVar;
            } else {
                cVar2.f9834c = cVar;
                cVar.d = cVar2;
                fVar.f9839b = cVar;
            }
            obj = null;
        }
        if (((C0852b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() {
        Class<C0299j> cls = C0299j.class;
        if (this.f9376e) {
            C0516g gVar = (C0516g) this.f9374b;
            if (gVar == null) {
                gVar = new C0516g(this);
            }
            this.f9374b = gVar;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                C0516g gVar2 = (C0516g) this.f9374b;
                if (gVar2 != null) {
                    ((LinkedHashSet) gVar2.f7783b).add(cls.getName());
                }
            } catch (NoSuchMethodException e6) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public C0738t() {
        this.f9377f = new f();
        this.f9376e = true;
    }
}
