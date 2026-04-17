package m0;

import B0.H;
import K.C0075o;
import K.C0076p;
import K.t0;
import K.v0;
import S3.r;
import a1.C0256a;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.v;
import androidx.fragment.app.D;
import c1.p;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0442l;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.u0;
import i3.C0588d;
import j4.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k.C0724m;
import k.C0737s0;
import l3.C0782a;
import l3.q;
import m2.k;
import n3.C0857B;
import n3.C0861b;
import n3.C0863d;
import n3.C0864e;
import n3.C0865f;
import n3.C0866g;
import n3.G;
import n3.j;
import n3.m;
import q.C0927d;
import q.C0928e;
import q.C0929f;
import q3.b;
import q3.l;
import q4.e;
import s3.C0964b;
import s3.C0967e;
import s3.C0969g;
import v3.C1048c;
import v3.C1051f;
import v3.g;
import v3.h;
import v3.n;
import v3.o;
import v3.s;
import w0.C1055b;
import w0.C1056c;
import w0.C1072s;
import y1.d;

public class a0 implements C0076p, q, u0, C1072s, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9924a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9925b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9926c;

    public /* synthetic */ a0(int i2) {
        this.f9924a = i2;
    }

    public static void t(s sVar, h hVar) {
        if (sVar.h()) {
            hVar.c();
            hVar.f12290c = hVar.d;
            hVar.f12288a.append(((o) sVar).g(2));
            hVar.f12291e = true;
            C0442l lVar = hVar.h;
            lVar.getClass();
            if (((long) hVar.f12288a.length()) <= lVar.f7431a) {
                return;
            }
            if (hVar.a(hVar.d).isEmpty() || !hVar.a(hVar.d).y().equals(C1048c.d)) {
                hVar.b();
            }
        } else if (sVar.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        } else if (sVar instanceof C1051f) {
            ((C1051f) sVar).t(new g(hVar), true);
        } else {
            throw new IllegalStateException("Expected children node, but got: " + sVar);
        }
    }

    public void A(zzlq zzlq) {
        try {
            zzli zzc = zzlk.zzc();
            zzc.zzo((zzku) this.f9925b);
            zzc.zzp(zzlq);
            ((H) this.f9926c).h((zzlk) zzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    public void a() {
        Z4.q qVar = (Z4.q) this.f9925b;
        boolean equals = qVar.type.equals("gold");
        C0724m mVar = (C0724m) this.f9926c;
        if (equals) {
            c.s0(((e) ((a0) ((C0737s0) mVar.f9345b).f9372b).f9926c).f11109d0, MyApplication.f7090a.getApplicationContext().getString(R.string.purchase_gold_successfully_with_first_purchase_gifts, new Object[]{U.a(qVar.value)}), (String) null);
        } else {
            c.s0(((e) ((a0) ((C0737s0) mVar.f9345b).f9372b).f9926c).f11109d0, MyApplication.f7090a.getApplicationContext().getString(R.string.purchase_cash_successfully_with_first_purchase_gifts, new Object[]{U.a(qVar.value)}), (String) null);
        }
    }

    public v0 b(View view, v0 v0Var) {
        boolean z3;
        int i2;
        int i5;
        View view2 = view;
        v0 v0Var2 = v0Var;
        D0.h hVar = (D0.h) this.f9926c;
        int i6 = hVar.f499a;
        H h = (H) this.f9925b;
        t0 t0Var = v0Var2.f1432a;
        C.g f6 = t0Var.f(7);
        C.g f7 = t0Var.f(32);
        int i7 = f6.f375b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) h.f201c;
        bottomSheetBehavior.f6337w = i7;
        boolean e6 = k.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f6329o;
        if (z4) {
            int a6 = v0Var.a();
            bottomSheetBehavior.f6336v = a6;
            paddingBottom = a6 + hVar.f501c;
        }
        int i8 = hVar.f500b;
        boolean z5 = bottomSheetBehavior.f6330p;
        int i9 = f6.f374a;
        if (z5) {
            if (e6) {
                i5 = i8;
            } else {
                i5 = i6;
            }
            paddingLeft = i5 + i9;
        }
        boolean z6 = bottomSheetBehavior.f6331q;
        int i10 = f6.f376c;
        if (z6) {
            if (!e6) {
                i6 = i8;
            }
            paddingRight = i6 + i10;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f6333s || marginLayoutParams.leftMargin == i9) {
            z3 = false;
        } else {
            marginLayoutParams.leftMargin = i9;
            z3 = true;
        }
        if (bottomSheetBehavior.f6334t && marginLayoutParams.rightMargin != i10) {
            marginLayoutParams.rightMargin = i10;
            z3 = true;
        }
        if (!bottomSheetBehavior.f6335u || marginLayoutParams.topMargin == (i2 = f6.f375b)) {
            z7 = z3;
        } else {
            marginLayoutParams.topMargin = i2;
        }
        if (z7) {
            view2.setLayoutParams(marginLayoutParams);
        }
        view2.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z8 = h.f200b;
        if (z8) {
            bottomSheetBehavior.f6327m = f7.d;
        }
        if (z4 || z8) {
            bottomSheetBehavior.I();
        }
        return v0Var2;
    }

    public void c(String str, String str2) {
        C0588d dVar;
        C0588d dVar2;
        switch (this.f9924a) {
            case 5:
                if (str != null) {
                    dVar = C0588d.b(str, str2);
                } else {
                    dVar = null;
                }
                ((j) this.f9926c).f10286a.k(((G) this.f9925b).c(dVar));
                return;
            default:
                if (str != null) {
                    dVar2 = C0588d.b(str, str2);
                } else {
                    dVar2 = null;
                }
                C0857B b6 = (C0857B) this.f9925b;
                C0866g gVar = b6.f10240b;
                m mVar = (m) this.f9926c;
                m.c(mVar, "Persisted write", gVar, dVar2);
                m.d(mVar, b6.f10239a, b6.f10240b, dVar2);
                return;
        }
    }

    public void d(T t6, C0075o oVar) {
        n.j jVar = (n.j) this.f9925b;
        f0 f0Var = (f0) jVar.get(t6);
        if (f0Var == null) {
            f0Var = f0.a();
            jVar.put(t6, f0Var);
        }
        f0Var.f9968c = oVar;
        f0Var.f9966a |= 8;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [S3.r, java.lang.Object] */
    public r e() {
        boolean z3;
        boolean z4;
        zzco zzco;
        ArrayList arrayList = (ArrayList) this.f9926c;
        boolean z5 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            ((ArrayList) this.f9926c).forEach(new Object());
            ? obj = new Object();
            if (!z3 || ((C1055b) ((ArrayList) this.f9926c).get(0)).f12356a.d().isEmpty()) {
                z4 = false;
            } else {
                z4 = true;
            }
            obj.f2693a = z4;
            ((v) this.f9925b).getClass();
            if (TextUtils.isEmpty((CharSequence) null) && TextUtils.isEmpty((CharSequence) null)) {
                z5 = false;
            }
            boolean isEmpty = TextUtils.isEmpty((CharSequence) null);
            if (!z5 || isEmpty) {
                obj.f2694b = new D(27);
                obj.d = new ArrayList();
                ArrayList arrayList2 = (ArrayList) this.f9926c;
                if (arrayList2 != null) {
                    zzco = zzco.zzk(arrayList2);
                } else {
                    zzco = zzco.zzl();
                }
                obj.f2695c = zzco;
                return obj;
            }
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        throw new IllegalArgumentException("Details of the products must be provided.");
    }

    public s f(C1048c cVar, C c3) {
        G g = (G) this.f9926c;
        g.getClass();
        C0866g v6 = ((C0866g) this.f9925b).v(cVar);
        s z3 = ((C0861b) g.f10250a).z(v6);
        if (z3 != null) {
            return z3;
        }
        if (c3.a(cVar)) {
            return ((C0861b) g.f10250a).x(v6).v(((v3.m) c3.f8851c).f12296a.l(cVar));
        }
        return null;
    }

    public s g(s sVar) {
        G g = (G) this.f9926c;
        g.getClass();
        s sVar2 = v3.k.f12295e;
        C0866g gVar = (C0866g) this.f9925b;
        s<v3.q> z3 = ((C0861b) g.f10250a).z(gVar);
        if (z3 == null) {
            C0861b x6 = ((C0861b) g.f10250a).x(gVar);
            Iterator it2 = sVar.iterator();
            while (it2.hasNext()) {
                v3.q qVar = (v3.q) it2.next();
                sVar2 = sVar2.r(qVar.f12304a, x6.x(new C0866g(qVar.f12304a)).v(qVar.f12305b));
            }
            ArrayList arrayList = new ArrayList();
            q3.e eVar = x6.f10258a;
            Object obj = eVar.f11088a;
            if (obj != null) {
                for (v3.q qVar2 : (s) obj) {
                    arrayList.add(new v3.q(qVar2.f12304a, qVar2.f12305b));
                }
            } else {
                for (Map.Entry entry : eVar.f11089b) {
                    q3.e eVar2 = (q3.e) entry.getValue();
                    if (eVar2.f11088a != null) {
                        arrayList.add(new v3.q((C1048c) entry.getKey(), (s) eVar2.f11088a));
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                v3.q qVar3 = (v3.q) it3.next();
                sVar2 = sVar2.r(qVar3.f12304a, qVar3.f12305b);
            }
        } else if (!z3.h()) {
            for (v3.q qVar4 : z3) {
                sVar2 = sVar2.r(qVar4.f12304a, qVar4.f12305b);
            }
        }
        return sVar2;
    }

    public s h(C0866g gVar, s sVar, s sVar2) {
        boolean z3;
        G g = (G) this.f9926c;
        g.getClass();
        if (sVar == null && sVar2 == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        l.b("Either existingEventSnap or existingServerSnap must exist", z3);
        C0866g t6 = ((C0866g) this.f9925b).t(gVar);
        if (((C0861b) g.f10250a).z(t6) != null) {
            return null;
        }
        C0861b x6 = ((C0861b) g.f10250a).x(t6);
        if (x6.f10258a.isEmpty()) {
            return sVar2.f(gVar);
        }
        return x6.v(sVar2.f(gVar));
    }

    public void i(int i2) {
        int[] iArr = (int[]) this.f9925b;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
            this.f9925b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f9925b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f9925b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View j(int i2, int i5, int i6, int i7) {
        int i8;
        e0 e0Var = (e0) this.f9925b;
        int v6 = e0Var.v();
        int h = e0Var.h();
        if (i5 > i2) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        View view = null;
        while (i2 != i5) {
            View t6 = e0Var.t(i2);
            int l6 = e0Var.l(t6);
            int x6 = e0Var.x(t6);
            d0 d0Var = (d0) this.f9926c;
            d0Var.f9954b = v6;
            d0Var.f9955c = h;
            d0Var.d = l6;
            d0Var.f9956e = x6;
            if (i6 != 0) {
                d0Var.f9953a = i6;
                if (d0Var.a()) {
                    return t6;
                }
            }
            if (i7 != 0) {
                d0Var.f9953a = i7;
                if (d0Var.a()) {
                    view = t6;
                }
            }
            i2 += i8;
        }
        return view;
    }

    public void k(ArrayList arrayList, int i2, ArrayList arrayList2, List list, v3.m mVar) {
        C0964b bVar;
        C1048c cVar;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C0964b bVar2 = (C0964b) it2.next();
            if (C0928e.a(bVar2.f11525a, i2)) {
                arrayList3.add(bVar2);
            }
        }
        Collections.sort(arrayList3, new C0967e(this));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C0964b bVar3 = (C0964b) it3.next();
            Iterator it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    C0865f fVar = (C0865f) it4.next();
                    if (fVar.g(i2)) {
                        if (C0928e.a(bVar3.f11525a, 5) || C0928e.a(bVar3.f11525a, 1)) {
                            bVar = bVar3;
                        } else {
                            s sVar = bVar3.f11526b.f12296a;
                            n nVar = n.f12299a;
                            v3.l lVar = mVar.f12298c;
                            if (lVar.equals(nVar) || lVar.equals((v3.l) this.f9926c)) {
                                mVar.k();
                                boolean j6 = I.j(mVar.f12297b, v3.m.d);
                                C1048c cVar2 = bVar3.d;
                                if (j6) {
                                    cVar = mVar.f12296a.p(cVar2);
                                } else {
                                    k3.e eVar = mVar.f12297b;
                                    v3.q qVar = (v3.q) eVar.f9468a.y(new v3.q(cVar2, sVar));
                                    if (qVar != null) {
                                        cVar = qVar.f12304a;
                                    } else {
                                        cVar = null;
                                    }
                                }
                                bVar = new C0964b(bVar3.f11525a, bVar3.f11526b, bVar3.d, cVar, bVar3.f11527c);
                            } else {
                                throw new IllegalArgumentException("Index not available in IndexedNode!");
                            }
                        }
                        arrayList.add(fVar.b(bVar, (C0969g) this.f9925b));
                    }
                }
            }
        }
    }

    public s l() {
        C c3 = (C) this.f9926c;
        if (c3.f8849a) {
            return ((v3.m) c3.f8851c).f12296a;
        }
        return null;
    }

    public boolean m(View view) {
        e0 e0Var = (e0) this.f9925b;
        int v6 = e0Var.v();
        int h = e0Var.h();
        int l6 = e0Var.l(view);
        int x6 = e0Var.x(view);
        d0 d0Var = (d0) this.f9926c;
        d0Var.f9954b = v6;
        d0Var.f9955c = h;
        d0Var.d = l6;
        d0Var.f9956e = x6;
        d0Var.f9953a = 24579;
        return d0Var.a();
    }

    public void n(int i2, int i5) {
        int[] iArr = (int[]) this.f9925b;
        if (iArr != null && i2 < iArr.length) {
            int i6 = i2 + i5;
            i(i6);
            int[] iArr2 = (int[]) this.f9925b;
            System.arraycopy(iArr2, i2, iArr2, i6, (iArr2.length - i2) - i5);
            Arrays.fill((int[]) this.f9925b, i2, i6, -1);
            ArrayList arrayList = (ArrayList) this.f9926c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Z z3 = (Z) ((ArrayList) this.f9926c).get(size);
                    int i7 = z3.f9918a;
                    if (i7 >= i2) {
                        z3.f9918a = i7 + i5;
                    }
                }
            }
        }
    }

    public void o(int i2, int i5) {
        int[] iArr = (int[]) this.f9925b;
        if (iArr != null && i2 < iArr.length) {
            int i6 = i2 + i5;
            i(i6);
            int[] iArr2 = (int[]) this.f9925b;
            System.arraycopy(iArr2, i6, iArr2, i2, (iArr2.length - i2) - i5);
            int[] iArr3 = (int[]) this.f9925b;
            Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.f9926c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Z z3 = (Z) ((ArrayList) this.f9926c).get(size);
                    int i7 = z3.f9918a;
                    if (i7 >= i2) {
                        if (i7 < i6) {
                            ((ArrayList) this.f9926c).remove(size);
                        } else {
                            z3.f9918a = i7 - i5;
                        }
                    }
                }
            }
        }
    }

    public void p(C1056c cVar) {
        if (cVar.f12358a == 0) {
            new Handler(Looper.getMainLooper()).post(new C0737s0(this, 12));
        }
    }

    public void q(String str) {
        ((b) this.f9925b).execute(new C0863d((C0782a) this.f9926c, str, 0));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x022f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (r7 == false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        if (r7 == true) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        if (r7 == true) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bb, code lost:
        if (r7 == true) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        r0.f12136c.put(java.lang.Integer.valueOf(r9.f12042a), r9);
        r9 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            r13 = this;
            v.n r0 = new v.n
            r0.<init>()
            int r1 = r15.getAttributeCount()
            r2 = 0
            r3 = r2
        L_0x000b:
            if (r3 >= r1) goto L_0x0248
            java.lang.String r4 = r15.getAttributeName(r3)
            java.lang.String r5 = r15.getAttributeValue(r3)
            if (r4 == 0) goto L_0x0244
            if (r5 != 0) goto L_0x001b
            goto L_0x0244
        L_0x001b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0244
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = 1
            r4 = -1
            if (r1 == 0) goto L_0x0045
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r3
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r14.getResources()
            java.lang.String r8 = r14.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L_0x0046
        L_0x0045:
            r1 = r4
        L_0x0046:
            if (r1 != r4) goto L_0x005e
            int r6 = r5.length()
            if (r6 <= r3) goto L_0x0057
            java.lang.String r1 = r5.substring(r3)
            int r1 = java.lang.Integer.parseInt(r1)
            goto L_0x005e
        L_0x0057:
            java.lang.String r5 = "ConstraintLayoutStates"
            java.lang.String r6 = "error in parsing id"
            android.util.Log.e(r5, r6)
        L_0x005e:
            java.lang.String r5 = "Error parsing XML resource"
            java.lang.String r6 = "ConstraintSet"
            int r7 = r15.getEventType()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r8 = 0
            r9 = r8
        L_0x0068:
            if (r7 == r3) goto L_0x023c
            if (r7 == 0) goto L_0x022c
            r10 = 3
            r11 = 2
            if (r7 == r11) goto L_0x00cd
            if (r7 == r10) goto L_0x0074
            goto L_0x022f
        L_0x0074:
            java.lang.String r7 = r15.getName()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.util.Locale r12 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r7 = r7.toLowerCase(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r12 = r7.hashCode()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            switch(r12) {
                case -2075718416: goto L_0x00aa;
                case -190376483: goto L_0x00a0;
                case 426575017: goto L_0x0096;
                case 2146106725: goto L_0x0086;
                default: goto L_0x0085;
            }     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x0085:
            goto L_0x00b4
        L_0x0086:
            java.lang.String r12 = "constraintset"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x00b4
            r7 = r2
            goto L_0x00b5
        L_0x0090:
            r14 = move-exception
            goto L_0x0235
        L_0x0093:
            r14 = move-exception
            goto L_0x0239
        L_0x0096:
            java.lang.String r12 = "constraintoverride"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x00b4
            r7 = r11
            goto L_0x00b5
        L_0x00a0:
            java.lang.String r12 = "constraint"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x00b4
            r7 = r3
            goto L_0x00b5
        L_0x00aa:
            java.lang.String r12 = "guideline"
            boolean r7 = r7.equals(r12)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x00b4
            r7 = r10
            goto L_0x00b5
        L_0x00b4:
            r7 = r4
        L_0x00b5:
            if (r7 == 0) goto L_0x023c
            if (r7 == r3) goto L_0x00bf
            if (r7 == r11) goto L_0x00bf
            if (r7 == r10) goto L_0x00bf
            goto L_0x022f
        L_0x00bf:
            java.util.HashMap r7 = r0.f12136c     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r10 = r9.f12042a     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.put(r10, r9)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r9 = r8
            goto L_0x022f
        L_0x00cd:
            java.lang.String r7 = r15.getName()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r12 = r7.hashCode()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            switch(r12) {
                case -2025855158: goto L_0x0136;
                case -1984451626: goto L_0x012c;
                case -1962203927: goto L_0x0122;
                case -1269513683: goto L_0x0118;
                case -1238332596: goto L_0x010e;
                case -71750448: goto L_0x0104;
                case 366511058: goto L_0x00f9;
                case 1331510167: goto L_0x00f0;
                case 1791837707: goto L_0x00e5;
                case 1803088381: goto L_0x00da;
                default: goto L_0x00d8;
            }     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x00d8:
            goto L_0x0140
        L_0x00da:
            java.lang.String r10 = "Constraint"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = r2
            goto L_0x0141
        L_0x00e5:
            java.lang.String r10 = "CustomAttribute"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = 8
            goto L_0x0141
        L_0x00f0:
            java.lang.String r11 = "Barrier"
            boolean r7 = r7.equals(r11)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            goto L_0x0141
        L_0x00f9:
            java.lang.String r10 = "CustomMethod"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = 9
            goto L_0x0141
        L_0x0104:
            java.lang.String r10 = "Guideline"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = r11
            goto L_0x0141
        L_0x010e:
            java.lang.String r10 = "Transform"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = 5
            goto L_0x0141
        L_0x0118:
            java.lang.String r10 = "PropertySet"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = 4
            goto L_0x0141
        L_0x0122:
            java.lang.String r10 = "ConstraintOverride"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = r3
            goto L_0x0141
        L_0x012c:
            java.lang.String r10 = "Motion"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = 7
            goto L_0x0141
        L_0x0136:
            java.lang.String r10 = "Layout"
            boolean r7 = r7.equals(r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            if (r7 == 0) goto L_0x0140
            r10 = 6
            goto L_0x0141
        L_0x0140:
            r10 = r4
        L_0x0141:
            java.lang.String r7 = "XML parser error must be within a Constraint "
            switch(r10) {
                case 0: goto L_0x0223;
                case 1: goto L_0x021a;
                case 2: goto L_0x020d;
                case 3: goto L_0x0200;
                case 4: goto L_0x01db;
                case 5: goto L_0x01b6;
                case 6: goto L_0x0190;
                case 7: goto L_0x016a;
                case 8: goto L_0x0148;
                case 9: goto L_0x0148;
                default: goto L_0x0146;
            }
        L_0x0146:
            goto L_0x022f
        L_0x0148:
            if (r9 == 0) goto L_0x0151
            java.util.HashMap r7 = r9.f12046f     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            v.C1036b.a(r14, r15, r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x0151:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x016a:
            if (r9 == 0) goto L_0x0177
            v.k r7 = r9.f12044c     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x0177:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x0190:
            if (r9 == 0) goto L_0x019d
            v.j r7 = r9.d     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x019d:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x01b6:
            if (r9 == 0) goto L_0x01c2
            v.m r7 = r9.f12045e     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x01c2:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x01db:
            if (r9 == 0) goto L_0x01e7
            v.l r7 = r9.f12043b     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.a(r14, r10)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x01e7:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r7)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            int r15 = r15.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r2.append(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            java.lang.String r15 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r14.<init>(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            throw r14     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x0200:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            v.i r9 = v.n.d(r14, r7, r2)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            v.j r7 = r9.d     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.f12085h0 = r3     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x020d:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            v.i r9 = v.n.d(r14, r7, r2)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            v.j r7 = r9.d     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            r7.f12073a = r3     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x021a:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            v.i r9 = v.n.d(r14, r7, r3)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x0223:
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r15)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            v.i r9 = v.n.d(r14, r7, r2)     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x022f
        L_0x022c:
            r15.getName()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
        L_0x022f:
            int r7 = r15.next()     // Catch:{ XmlPullParserException -> 0x0093, IOException -> 0x0090 }
            goto L_0x0068
        L_0x0235:
            android.util.Log.e(r6, r5, r14)
            goto L_0x023c
        L_0x0239:
            android.util.Log.e(r6, r5, r14)
        L_0x023c:
            java.lang.Object r14 = r13.f9926c
            android.util.SparseArray r14 = (android.util.SparseArray) r14
            r14.put(r1, r0)
            goto L_0x0248
        L_0x0244:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0248:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a0.r(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public C0075o s(T t6, int i2) {
        f0 f0Var;
        C0075o oVar;
        n.j jVar = (n.j) this.f9925b;
        int d = jVar.d(t6);
        if (d >= 0 && (f0Var = (f0) jVar.j(d)) != null) {
            int i5 = f0Var.f9966a;
            if ((i5 & i2) != 0) {
                int i6 = i5 & (~i2);
                f0Var.f9966a = i6;
                if (i2 == 4) {
                    oVar = f0Var.f9967b;
                } else if (i2 == 8) {
                    oVar = f0Var.f9968c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i6 & 12) == 0) {
                    jVar.h(d);
                    f0Var.f9966a = 0;
                    f0Var.f9967b = null;
                    f0Var.f9968c = null;
                    f0.d.c(f0Var);
                }
                return oVar;
            }
        }
        return null;
    }

    public Object then(Task task) {
        Bundle bundle;
        y1.b bVar = (y1.b) this.f9925b;
        bVar.getClass();
        if (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) {
            return bVar.b((Bundle) this.f9926c).onSuccessTask(y1.h.f12663c, d.d);
        }
        return task;
    }

    public String toString() {
        switch (this.f9924a) {
            case 8:
                String str = "[ ";
                if (((C0929f) this.f9925b) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((C0929f) this.f9925b).f11069q[i2] + " ";
                    }
                }
                StringBuilder b6 = C0928e.b(str, "] ");
                b6.append((C0929f) this.f9925b);
                return b6.toString();
            default:
                return super.toString();
        }
    }

    public void u(T t6) {
        f0 f0Var = (f0) ((n.j) this.f9925b).get(t6);
        if (f0Var != null) {
            f0Var.f9966a &= -2;
        }
    }

    public void v(T t6) {
        n.g gVar = (n.g) this.f9926c;
        int e6 = gVar.e() - 1;
        while (true) {
            if (e6 < 0) {
                break;
            } else if (t6 == gVar.f(e6)) {
                Object[] objArr = gVar.f10221c;
                Object obj = objArr[e6];
                Object obj2 = n.h.f10222a;
                if (obj != obj2) {
                    objArr[e6] = obj2;
                    gVar.f10219a = true;
                }
            } else {
                e6--;
            }
        }
        f0 f0Var = (f0) ((n.j) this.f9925b).remove(t6);
        if (f0Var != null) {
            f0Var.f9966a = 0;
            f0Var.f9967b = null;
            f0Var.f9968c = null;
            f0.d.c(f0Var);
        }
    }

    public s w(C0866g gVar) {
        return ((C0861b) ((G) this.f9926c).f10250a).z(((C0866g) this.f9925b).t(gVar));
    }

    public a0 x(v3.m mVar, boolean z3, boolean z4) {
        return new a0(new C(mVar, z3, z4), (C) this.f9926c, 14);
    }

    public void y(zzjz zzjz) {
        if (zzjz != null) {
            try {
                zzli zzc = zzlk.zzc();
                zzc.zzo((zzku) this.f9925b);
                zzc.zza(zzjz);
                ((H) this.f9926c).h((zzlk) zzc.zzf());
            } catch (Throwable th) {
                zze.zzm("BillingLogger", "Unable to log.", th);
            }
        }
    }

    public void z(zzkd zzkd) {
        if (zzkd != null) {
            try {
                zzli zzc = zzlk.zzc();
                zzc.zzo((zzku) this.f9925b);
                zzc.zzm(zzkd);
                ((H) this.f9926c).h((zzlk) zzc.zzf());
            } catch (Throwable th) {
                zze.zzm("BillingLogger", "Unable to log.", th);
            }
        }
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i2) {
        this.f9924a = i2;
        this.f9925b = obj;
        this.f9926c = obj2;
    }

    public /* synthetic */ a0(Object obj, Object obj2, int i2, boolean z3) {
        this.f9924a = i2;
        this.f9926c = obj;
        this.f9925b = obj2;
    }

    public a0(Context context, zzku zzku) {
        this.f9924a = 19;
        H h = new H(9);
        try {
            p.b(context);
            h.f201c = p.a().c(C0256a.f4542e).a("PLAY_BILLING_LIBRARY", new Z0.c("proto"), new D(29));
        } catch (Throwable unused) {
            h.f200b = true;
        }
        this.f9926c = h;
        this.f9925b = zzku;
    }

    public a0(IBinder iBinder) {
        this.f9924a = 22;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f9925b = new Messenger(iBinder);
            this.f9926c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f9926c = new y1.g(iBinder);
            this.f9925b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public a0(List list, List list2) {
        this.f9924a = 16;
        if (list.size() == list2.size() - 1) {
            this.f9925b = list;
            this.f9926c = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public a0(C0969g gVar) {
        this.f9924a = 12;
        this.f9925b = gVar;
        this.f9926c = gVar.f11539b.g;
    }

    public a0() {
        this.f9924a = 2;
        this.f9925b = new n.j(0);
        this.f9926c = new n.g();
    }

    public a0(C0864e eVar) {
        this.f9924a = 13;
        this.f9925b = eVar.f10266b;
        this.f9926c = eVar.b("EventRaiser");
    }

    public a0(C0927d dVar) {
        this.f9924a = 8;
        this.f9926c = dVar;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [m0.d0, java.lang.Object] */
    public a0(e0 e0Var) {
        this.f9924a = 1;
        this.f9925b = e0Var;
        ? obj = new Object();
        obj.f9953a = 0;
        this.f9926c = obj;
    }
}
