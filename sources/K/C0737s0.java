package k;

import A4.c;
import K.O;
import K1.e;
import T1.C0166e1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.billingclient.api.Purchase;
import com.bumptech.glide.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.c0;
import e5.C0505b;
import h0.C0552a;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import k5.C0773j;
import k5.r;
import k5.t;
import k5.u;
import l3.o;
import l4.g;
import l4.h;
import l4.i;
import m0.C0801C;
import m0.C0810b;
import m0.C0811c;
import m0.C0814f;
import m0.C0815g;
import m0.C0816h;
import m0.C0819k;
import m0.T;
import m0.a0;
import m4.C0840b;
import n3.C0857B;
import n3.C0861b;
import n3.C0862c;
import n3.C0864e;
import n3.C0866g;
import n3.E;
import n3.j;
import n3.k;
import n3.m;
import n3.n;
import n3.y;
import org.json.JSONArray;
import org.json.JSONObject;
import p3.C0917a;
import q3.b;
import q4.C0938b;
import u3.C1031a;
import v3.C1048c;
import v3.s;
import v4.C1052a;
import w0.C1054a;
import w0.C1056c;
import w0.C1063j;
import w0.C1073t;
import w3.C1083d;
import w3.C1084e;
import y4.C1118e;

/* renamed from: k.s0  reason: case insensitive filesystem */
public final class C0737s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9371a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9372b;

    public /* synthetic */ C0737s0(Object obj, int i2) {
        this.f9371a = i2;
        this.f9372b = obj;
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.Object, k.e1] */
    /* JADX WARNING: type inference failed for: r4v72, types: [w3.e, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r3v49, types: [w3.e, java.lang.RuntimeException] */
    public final void run() {
        C0718j jVar;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        long j6;
        long j7;
        String str;
        switch (this.f9371a) {
            case 0:
                C0739t0 t0Var = (C0739t0) this.f9372b;
                t0Var.f9388u = null;
                t0Var.drawableStateChanged();
                return;
            case 1:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f9372b;
                if (searchView$SearchAutoComplete.f4788f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f4788f = false;
                    return;
                }
                return;
            case 2:
                ActionMenuView actionMenuView = ((Toolbar) this.f9372b).f4812a;
                if (actionMenuView != null && (jVar = actionMenuView.f4768C) != null) {
                    jVar.l();
                    return;
                }
                return;
            case 3:
                C0166e1 e1Var = (C0166e1) this.f9372b;
                C0773j jVar2 = (C0773j) e1Var.f3287e;
                int i5 = jVar2.f9523M0;
                VelocityTracker velocityTracker = jVar2.f9561o0;
                u uVar = (u) e1Var.f3286c;
                if (velocityTracker != null && i5 != -1) {
                    velocityTracker.computeCurrentVelocity(1000, (float) jVar2.f9518J0);
                    float f6 = -velocityTracker.getXVelocity(i5);
                    if (Math.abs(f6) >= ((float) ((C0773j) e1Var.f3287e).f9516I0)) {
                        t tVar = uVar.f9645b;
                        int i6 = tVar.f9633c - tVar.f9631a;
                        t tVar2 = uVar.f9646c;
                        int i7 = tVar2.f9633c - tVar2.f9631a;
                        if (!uVar.d() && Math.signum(f6) == Math.signum((float) i6) && Math.signum(0.0f) == Math.signum((float) i7)) {
                            ((C0773j) e1Var.f3287e).postDelayed(this, 40);
                            return;
                        }
                    }
                    e1Var.a();
                    C0773j jVar3 = (C0773j) e1Var.f3287e;
                    jVar3.f9558l0 = 3;
                    jVar3.getClass();
                    return;
                }
                return;
            case 4:
                o oVar = (o) this.f9372b;
                oVar.f9704D = null;
                oVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (!oVar.d() || currentTimeMillis <= oVar.f9705E + 60000) {
                    oVar.b();
                    return;
                } else {
                    oVar.c("connection_idle");
                    return;
                }
            case 5:
                if (i.f9779f1) {
                    i iVar = (i) this.f9372b;
                    long j8 = iVar.f9796S0;
                    if (j8 != -100) {
                        if (j8 == 0) {
                            iVar.f9796S0 = 120;
                            d.m1(0, 0, true, new h(iVar, 0));
                        } else {
                            iVar.f9796S0 = j8 - 1;
                        }
                        iVar.f9817o0.setText(e.L("mm:ss", iVar.f9796S0));
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    long j9 = iVar.f9797T0;
                    if (j9 != -100) {
                        if (j9 == 0) {
                            iVar.f9797T0 = 120;
                            d.m1(1, 0, true, new g(iVar, 1));
                        } else {
                            iVar.f9797T0 = j9 - 1;
                        }
                        iVar.f9821t0.setText(e.L("mm:ss", iVar.f9797T0));
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    long j10 = iVar.f9798U0;
                    if (j10 != -100) {
                        if (j10 == 0) {
                            iVar.f9798U0 = 300;
                            d.m1(2, 0, true, new h(iVar, 1));
                        } else {
                            iVar.f9798U0 = j10 - 1;
                        }
                        iVar.f9826y0.setText(e.L("mm:ss", iVar.f9798U0));
                        z4 = true;
                    }
                    double d = iVar.f9799V0;
                    if (d != -100.0d) {
                        if (d == 0.0d) {
                            iVar.f9799V0 = 120.0d;
                            z6 = true;
                            d.m1(3, 0, true, new g(iVar, 2));
                        } else {
                            z6 = true;
                            iVar.f9799V0 = d - 1.0d;
                        }
                        iVar.f9784E0.setText(e.K(iVar.f9799V0));
                        z5 = z6;
                    } else {
                        z5 = z4;
                    }
                    iVar.f9807e0.invalidate();
                    iVar.f9807e0.requestLayout();
                    if (z5) {
                        i.f9777d1.postDelayed(i.f9778e1, 1000);
                        return;
                    } else {
                        iVar.c0();
                        return;
                    }
                } else {
                    return;
                }
            case zzaky.zzf.zzf:
                C0819k kVar = (C0819k) this.f9372b;
                int i8 = kVar.f9989A;
                ValueAnimator valueAnimator = kVar.f10013z;
                if (i8 != 1) {
                    i2 = 2;
                    if (i8 != 2) {
                        return;
                    }
                } else {
                    i2 = 2;
                    valueAnimator.cancel();
                }
                kVar.f9989A = 3;
                float[] fArr = new float[i2];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration((long) 500);
                valueAnimator.start();
                return;
            case zzaky.zzf.zzg:
                RecyclerView recyclerView = (RecyclerView) this.f9372b;
                C0801C c3 = recyclerView.f5342Q;
                if (c3 != null) {
                    C0816h hVar = (C0816h) c3;
                    ArrayList arrayList = hVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = hVar.f9975j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = hVar.f9976k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = hVar.f9974i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            long j11 = hVar.d;
                            if (hasNext) {
                                T t6 = (T) it2.next();
                                View view = t6.f9893a;
                                ViewPropertyAnimator animate = view.animate();
                                hVar.f9982q.add(t6);
                                animate.setDuration(j11).alpha(0.0f).setListener(new C0811c(hVar, t6, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    hVar.f9978m.add(arrayList5);
                                    arrayList2.clear();
                                    C0810b bVar = new C0810b(hVar, arrayList5, 0);
                                    if (!isEmpty) {
                                        View view2 = ((C0815g) arrayList5.get(0)).f9969a.f9893a;
                                        WeakHashMap weakHashMap = O.f1352a;
                                        view2.postOnAnimationDelayed(bVar, j11);
                                    } else {
                                        bVar.run();
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    hVar.f9979n.add(arrayList6);
                                    arrayList3.clear();
                                    C0810b bVar2 = new C0810b(hVar, arrayList6, 1);
                                    if (!isEmpty) {
                                        View view3 = ((C0814f) arrayList6.get(0)).f9961a.f9893a;
                                        WeakHashMap weakHashMap2 = O.f1352a;
                                        view3.postOnAnimationDelayed(bVar2, j11);
                                    } else {
                                        bVar2.run();
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    hVar.f9977l.add(arrayList7);
                                    arrayList4.clear();
                                    C0810b bVar3 = new C0810b(hVar, arrayList7, 2);
                                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                                        if (isEmpty) {
                                            j11 = 0;
                                        }
                                        if (!isEmpty2) {
                                            j6 = hVar.f9844e;
                                        } else {
                                            j6 = 0;
                                        }
                                        if (!isEmpty3) {
                                            j7 = hVar.f9845f;
                                        } else {
                                            j7 = 0;
                                        }
                                        long max = Math.max(j6, j7) + j11;
                                        View view4 = ((T) arrayList7.get(0)).f9893a;
                                        WeakHashMap weakHashMap3 = O.f1352a;
                                        view4.postOnAnimationDelayed(bVar3, max);
                                    } else {
                                        bVar3.run();
                                    }
                                }
                            }
                        }
                    }
                    z7 = false;
                } else {
                    z7 = false;
                }
                recyclerView.f5374r0 = z7;
                return;
            case 8:
                ((StaggeredGridLayoutManager) this.f9372b).B0();
                return;
            case 9:
                C0840b bVar4 = (C0840b) this.f9372b;
                if (bVar4.f10173k0.isShown()) {
                    bVar4.V();
                    return;
                }
                return;
            case 10:
                m mVar = (m) this.f9372b;
                n nVar = mVar.f10299a;
                com.bumptech.glide.manager.o oVar2 = new com.bumptech.glide.manager.o(nVar.f10311a, nVar.f10313c, nVar.f10312b);
                C0864e eVar = mVar.h;
                X4.d c6 = eVar.c();
                C1031a aVar = eVar.f10265a;
                c cVar = new c((Object) eVar.f10267c, (Object) eVar.a(), 10);
                c cVar2 = new c((Object) eVar.d, (Object) eVar.a(), 10);
                b a6 = eVar.a();
                String str2 = eVar.g;
                R2.i iVar2 = eVar.f10270i;
                iVar2.b();
                String str3 = iVar2.f2492c.f2501b;
                String absolutePath = ((Context) eVar.c().f4209b).getApplicationContext().getDir("sslcache", 0).getAbsolutePath();
                ? obj = new Object();
                obj.d = aVar;
                obj.f9291b = cVar;
                obj.f9292c = cVar2;
                obj.f9290a = a6;
                obj.f9293e = str2;
                obj.f9294f = str3;
                obj.f9295p = absolutePath;
                c6.getClass();
                o oVar3 = new o(obj, oVar2, mVar);
                ((R2.i) c6.f4210c).a(new j3.h(oVar3));
                mVar.f10301c = oVar3;
                eVar.f10267c.a((b) eVar.f10268e.f5605b, new k(mVar));
                eVar.d.a((b) eVar.f10268e.f5605b, new j(mVar));
                mVar.f10301c.n();
                C0917a aVar2 = new C0917a();
                C0724m mVar2 = new C0724m(7);
                mVar2.f9345b = v3.k.f12295e;
                mVar.d = mVar2;
                mVar.f10302e = new v(23);
                mVar.f10303f = new c1.i((Object) null, (Object) null, (Object) new q3.j(), 14);
                mVar.f10308m = new y(eVar, new C0917a(), new k(mVar));
                mVar.f10309n = new y(eVar, aVar2, new j(mVar));
                List<C0857B> emptyList = Collections.emptyList();
                HashMap A6 = R2.b.A(mVar.f10300b);
                long j12 = Long.MIN_VALUE;
                for (C0857B b6 : emptyList) {
                    a0 a0Var = new a0(mVar, b6, 6, false);
                    long j13 = b6.f10239a;
                    if (j12 < j13) {
                        mVar.f10307l = j13 + 1;
                        boolean c7 = b6.c();
                        c1.i iVar3 = mVar.f10304i;
                        long j14 = b6.f10239a;
                        C0866g gVar = b6.f10240b;
                        if (c7) {
                            if (iVar3.y()) {
                                iVar3.d(C0552a.m("Restoring overwrite with id ", j14), (Throwable) null, new Object[0]);
                            }
                            mVar.f10301c.e("p", gVar.k(), b6.b().o(true), (String) null, a0Var);
                            s I02 = R2.b.I0(b6.b(), new E(mVar.f10309n, gVar), A6);
                            mVar.f10309n.g(b6.f10240b, b6.b(), I02, b6.f10239a, true, false);
                        } else {
                            if (iVar3.y()) {
                                iVar3.d(C0552a.m("Restoring merge with id ", j14), (Throwable) null, new Object[0]);
                            }
                            mVar.f10301c.e("m", gVar.k(), b6.a().A(), (String) null, a0Var);
                            C0861b H02 = R2.b.H0(b6.a(), mVar.f10309n, gVar, A6);
                            y yVar = mVar.f10309n;
                            C0861b a7 = b6.a();
                            yVar.getClass();
                            List list = (List) yVar.f10351f.a(new n3.u(yVar, false, b6.f10240b, a7, b6.f10239a, H02));
                        }
                        j12 = j13;
                    } else {
                        throw new IllegalStateException("Write ids were not in order.");
                    }
                }
                C1048c cVar3 = C0862c.f10261c;
                Boolean bool = Boolean.FALSE;
                mVar.q(cVar3, bool);
                mVar.q(C0862c.d, bool);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                a.k(MyApplication.f7090a, R.string.pending_purchase_process, ((C0938b) this.f9372b).f11104a.f11109d0);
                return;
            case 12:
                a0 a0Var2 = (a0) this.f9372b;
                Purchase purchase = (Purchase) a0Var2.f9925b;
                purchase.getClass();
                ArrayList arrayList8 = new ArrayList();
                JSONObject jSONObject = purchase.f5723c;
                if (jSONObject.has("productIds")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
                    if (optJSONArray != null) {
                        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                            arrayList8.add(optJSONArray.optString(i9));
                        }
                    }
                } else if (jSONObject.has("productId")) {
                    arrayList8.add(jSONObject.optString("productId"));
                }
                String str4 = (String) arrayList8.get(0);
                Purchase purchase2 = (Purchase) a0Var2.f9925b;
                String optString = purchase2.f5723c.optString("orderId");
                if (TextUtils.isEmpty(optString)) {
                    str = null;
                } else {
                    str = optString;
                }
                JSONObject jSONObject2 = purchase2.f5723c;
                android.support.v4.media.session.a.i0(new c0(str4, str, jSONObject2.optString("token", jSONObject2.optString("purchaseToken")), purchase2.f5723c.optLong("purchaseTime"), new C0724m(this, 11)));
                return;
            case 13:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f9372b).f6545c.f12206p;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 14:
                C1052a.V((C1052a) this.f9372b);
                return;
            case 15:
                C1063j jVar4 = (C1063j) this.f9372b;
                C1054a aVar3 = jVar4.f12379b;
                aVar3.m(0);
                C1056c cVar4 = C1073t.f12399j;
                aVar3.t(24, 6, cVar4);
                jVar4.a(cVar4);
                return;
            case 16:
                C1083d dVar = (C1083d) this.f9372b;
                dVar.getClass();
                try {
                    Socket d6 = dVar.d();
                    synchronized (dVar) {
                        dVar.f12424b = d6;
                        if (dVar.f12423a == 5) {
                            dVar.f12424b.close();
                            dVar.f12424b = null;
                        } else {
                            DataInputStream dataInputStream = new DataInputStream(d6.getInputStream());
                            OutputStream outputStream = d6.getOutputStream();
                            outputStream.write(dVar.h.q());
                            byte[] bArr = new byte[1000];
                            ArrayList arrayList9 = new ArrayList();
                            boolean z8 = false;
                            int i10 = 0;
                            while (!z8) {
                                int read = dataInputStream.read();
                                if (read != -1) {
                                    byte b7 = (byte) read;
                                    bArr[i10] = b7;
                                    int i11 = i10 + 1;
                                    if (b7 == 10 && bArr[i10 - 1] == 13) {
                                        String str5 = new String(bArr, C1083d.f12420m);
                                        if (str5.trim().equals("")) {
                                            z8 = true;
                                        } else {
                                            arrayList9.add(str5.trim());
                                        }
                                        bArr = new byte[1000];
                                        i10 = 0;
                                    } else if (i11 != 1000) {
                                        i10 = i11;
                                    } else {
                                        throw new RuntimeException("Unexpected long line in handshake: " + new String(bArr, C1083d.f12420m));
                                    }
                                } else {
                                    throw new RuntimeException("Connection closed before handshake was complete");
                                }
                            }
                            dVar.h.getClass();
                            c1.i.P((String) arrayList9.get(0));
                            arrayList9.remove(0);
                            HashMap hashMap = new HashMap();
                            Iterator it3 = arrayList9.iterator();
                            while (it3.hasNext()) {
                                String[] split = ((String) it3.next()).split(": ", 2);
                                String str6 = split[0];
                                Locale locale = Locale.US;
                                hashMap.put(str6.toLowerCase(locale), split[1].toLowerCase(locale));
                            }
                            dVar.h.getClass();
                            c1.i.O(hashMap);
                            w3.g gVar2 = dVar.g;
                            gVar2.getClass();
                            gVar2.f12440f = Channels.newChannel(outputStream);
                            dVar.f12427f.f12431a = dataInputStream;
                            dVar.f12423a = 3;
                            dVar.g.g.start();
                            X4.d dVar2 = dVar.f12425c;
                            ((l3.t) dVar2.f4210c).f9742i.execute(new l3.s(dVar2, 0));
                            dVar.f12427f.c();
                        }
                    }
                } catch (IOException e6) {
                    throw new RuntimeException(e6);
                } catch (C1084e e7) {
                    dVar.f12425c.K(e7);
                } catch (Throwable th) {
                    try {
                        dVar.f12425c.K(new RuntimeException("error while connecting: " + th.getMessage(), th));
                    } finally {
                        dVar.a();
                    }
                }
                return;
            case 17:
                w3.g gVar3 = (w3.g) this.f9372b;
                gVar3.getClass();
                while (!gVar3.f12438c && !Thread.interrupted()) {
                    try {
                        gVar3.f12440f.write((ByteBuffer) gVar3.f12436a.take());
                    } catch (IOException e8) {
                        ? runtimeException = new RuntimeException("IO Exception", e8);
                        C1083d dVar3 = gVar3.f12439e;
                        dVar3.f12425c.K(runtimeException);
                        if (dVar3.f12423a == 3) {
                            dVar3.a();
                        }
                        dVar3.b();
                        return;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < gVar3.f12436a.size(); i12++) {
                    gVar3.f12440f.write((ByteBuffer) gVar3.f12436a.take());
                }
                return;
            case 18:
                if (((TaskCompletionSource) this.f9372b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                r rVar = (r) this.f9372b;
                C1118e eVar2 = (C1118e) rVar.d;
                eVar2.getClass();
                C0505b bVar5 = new C0505b(eVar2.f12723d0, R.layout.dialog_ok_cancle);
                RelativeLayout relativeLayout = (RelativeLayout) bVar5.findViewById(R.id.dialog_ok_cancel_ok_button);
                ((TextView) bVar5.findViewById(R.id.dialog_ok_cancel_text)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.prize_from_lucky_wheel, new Object[]{eVar2.f12740v0.get(rVar.f9622c)}));
                relativeLayout.setVisibility(0);
                relativeLayout.setOnClickListener(new com.mtma.criminal.city.activities.m(relativeLayout, bVar5, 12));
                bVar5.show();
                C1118e eVar3 = (C1118e) rVar.d;
                C1118e.V(eVar3);
                eVar3.f12733n0.notifyDataSetChanged();
                eVar3.f12729j0.setSelection(eVar3.f12741w0.size() - 1);
                return;
        }
    }
}
