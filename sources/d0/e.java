package D0;

import F0.C0012b;
import F0.C0017g;
import F0.o;
import F0.s;
import F0.t;
import F0.y;
import I4.f;
import R2.b;
import S3.C0147h;
import S3.z;
import X4.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Process;
import androidx.emoji2.text.a;
import androidx.emoji2.text.i;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.D;
import c1.k;
import c1.m;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.o0;
import d5.j;
import e1.C0482a;
import e1.C0484c;
import f.C0518i;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.C0797a;
import x4.C1105h;
import y2.h;

public final class e implements t, C0017g, i, q, o0, h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f493a;

    /* renamed from: b  reason: collision with root package name */
    public Context f494b;

    public /* synthetic */ e() {
        this.f493a = 7;
    }

    public void B(C0588d dVar) {
        int i2 = this.f493a;
    }

    public Object a() {
        return this.f494b;
    }

    public Class b() {
        switch (this.f493a) {
            case 1:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [c1.k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, k.e1] */
    public k c() {
        Context context = this.f494b;
        if (context != null) {
            ? obj = new Object();
            obj.f5610a = C0482a.a(m.f5617a);
            C0484c cVar = new C0484c(context);
            obj.f5611b = cVar;
            obj.f5612c = C0482a.a(new d(cVar, new d1.e(cVar, 0), 16, false));
            C0484c cVar2 = obj.f5611b;
            obj.d = new d1.e(cVar2, 1);
            C0797a a6 = C0482a.a(new d(obj.d, C0482a.a(new I(cVar2, 25)), 20, false));
            obj.f5613e = a6;
            D d = new D(17);
            C0484c cVar3 = obj.f5611b;
            c1.i iVar = new c1.i((Object) cVar3, (Object) a6, (Object) d, 9);
            C0797a aVar = obj.f5610a;
            C0797a aVar2 = obj.f5612c;
            F3.k kVar = new F3.k(aVar, aVar2, iVar, a6, a6);
            ? obj2 = new Object();
            obj2.f9290a = cVar3;
            obj2.f9291b = aVar2;
            obj2.f9292c = a6;
            obj2.d = iVar;
            obj2.f9293e = aVar;
            obj2.f9294f = a6;
            obj2.f9295p = a6;
            obj.f5614f = C0482a.a(new c1.i((Object) kVar, (Object) obj2, (Object) new z(aVar, a6, iVar, a6, 15), 1));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public void d(int i2, boolean z3) {
        switch (this.f493a) {
            case 9:
                if (z3) {
                    com.bumptech.glide.d.U0(0, new K(this, 0));
                    return;
                }
                b.w(false);
                c.s0(this.f494b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
                return;
            case 10:
                if (z3) {
                    com.bumptech.glide.d.U0(1, new K(this, 1));
                    return;
                }
                b.w(false);
                c.s0(this.f494b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                if (z3) {
                    com.bumptech.glide.d.U0(2, new K(this, 2));
                    return;
                }
                b.w(false);
                c.s0(this.f494b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
                return;
            default:
                if (z3) {
                    K1.e.t0(1, new K(this, 3));
                    return;
                }
                b.w(false);
                c.s0(this.f494b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
                return;
        }
    }

    public s e(y yVar) {
        switch (this.f493a) {
            case 1:
                return new C0012b(this.f494b, (C0017g) this);
            case 2:
                return new C0012b(this.f494b, (C0017g) this);
            case 3:
                return new C0012b(this.f494b, yVar.a(Integer.class, InputStream.class));
            default:
                return new o(this.f494b, 1);
        }
    }

    public Object f(Resources resources, int i2, Resources.Theme theme) {
        switch (this.f493a) {
            case 1:
                return resources.openRawResourceFd(i2);
            default:
                return resources.openRawResource(i2);
        }
    }

    public void g(Object obj) {
        switch (this.f493a) {
            case 1:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public ApplicationInfo h(int i2, String str) {
        return this.f494b.getPackageManager().getApplicationInfo(str, i2);
    }

    public PackageInfo i(int i2, String str) {
        return this.f494b.getPackageManager().getPackageInfo(str, i2);
    }

    public boolean j() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f494b;
        if (callingUid == myUid) {
            return I1.b.o0(context);
        }
        if (!G1.c.d() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public void u(C0587c cVar) {
        boolean z3;
        boolean z4;
        C0286s sVar;
        int i2;
        switch (this.f493a) {
            case 8:
                j jVar = (j) cVar.f(j.class);
                if (jVar != null) {
                    d5.o.setLocationObject(jVar);
                    if (d5.o.getLocationObject().getCurrentPlace() != 0) {
                        Context context = this.f494b;
                        C0518i iVar = (C0518i) context;
                        Iterator it2 = iVar.l().f5000c.v().iterator();
                        boolean z5 = false;
                        boolean z6 = false;
                        boolean z7 = false;
                        while (true) {
                            boolean z8 = true;
                            if (it2.hasNext()) {
                                C0286s sVar2 = (C0286s) it2.next();
                                if (sVar2 instanceof C1105h) {
                                    z5 = true;
                                } else if (sVar2 instanceof f) {
                                    z6 = true;
                                } else if (sVar2 instanceof n4.f) {
                                    z7 = true;
                                }
                            } else {
                                if (z5 || d5.o.getLocationObject().getCurrentPlace() != 1) {
                                    if (!z6 && d5.o.getLocationObject().getCurrentPlace() == 2) {
                                        z3 = false;
                                        z4 = true;
                                    } else if (z7 || d5.o.getLocationObject().getCurrentPlace() != 3) {
                                        z4 = false;
                                        z3 = false;
                                    } else {
                                        z4 = false;
                                        z3 = true;
                                        z8 = false;
                                    }
                                    z8 = z3;
                                } else {
                                    z4 = false;
                                    z3 = false;
                                }
                                if (z8 || z4 || z3) {
                                    if (z8) {
                                        sVar = new C1105h(context);
                                    } else if (z4) {
                                        sVar = new f(context);
                                    } else {
                                        sVar = new n4.f(context);
                                    }
                                    androidx.fragment.app.I l6 = iVar.l();
                                    l6.getClass();
                                    C0269a aVar = new C0269a(l6);
                                    aVar.i(R.id.activity_main_body_frame_layout, sVar);
                                    aVar.c();
                                    aVar.e(false);
                                    b.N0();
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                try {
                    i2 = ((Integer) cVar.f(Integer.class)).intValue();
                } catch (Exception unused) {
                    i2 = 0;
                }
                U.g(d5.o.getAccountObject().getId(), "gold", -((((long) i2) * 100) + 100), new K(this, 13));
                return;
        }
    }

    public /* synthetic */ e(Context context, int i2) {
        this.f493a = i2;
        this.f494b = context;
    }

    public void a(b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new C0147h((Object) this, (Object) bVar, (Object) threadPoolExecutor, 1));
    }

    public e(Context context) {
        this.f493a = 6;
        this.f494b = context.getApplicationContext();
    }

    private final void k(C0588d dVar) {
    }

    private final void l(C0588d dVar) {
    }
}
