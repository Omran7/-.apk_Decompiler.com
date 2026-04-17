package X4;

import B0.C0009h;
import B0.H;
import G.c;
import J2.o;
import K.B;
import K.O;
import K.X;
import R2.b;
import S3.z;
import T1.A;
import Y4.C0248e;
import Y4.n;
import Z4.a;
import android.animation.Animator;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.emoji2.text.m;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.emoji2.text.x;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.C0289v;
import androidx.fragment.app.D;
import androidx.fragment.app.I;
import androidx.fragment.app.U;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import androidx.lifecycle.y;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0423c;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.utils.C0444n;
import com.mtma.criminal.city.utils.C0454y;
import com.mtma.criminal.city.utils.k0;
import com.mtma.criminal.city.utils.v0;
import d0.C0456a;
import d0.C0457b;
import d1.C0461d;
import d1.e;
import d1.f;
import e1.C0483b;
import e1.C0484c;
import f.C0518i;
import f.r;
import f3.w;
import i.C0571a;
import i.C0575e;
import i3.C0585a;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.q;
import j.k;
import j1.C0605a;
import j1.i;
import j3.g;
import j4.C0615b0;
import j4.C0645v;
import j4.M0;
import j4.Z;
import j4.p0;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l3.t;
import l5.C0797a;
import n.j;
import n3.C0859D;
import w3.C1083d;
import w3.C1084e;

public final class d implements q, m, c, C0585a, Continuation, C0483b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4208a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4209b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4210c;

    public /* synthetic */ d(Object obj, int i2) {
        this.f4208a = i2;
        this.f4209b = obj;
        this.f4210c = null;
    }

    public static int A(int i2, int i5) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            i6++;
            if (i6 == i5) {
                i7++;
                i6 = 0;
            } else if (i6 > i5) {
                i7++;
                i6 = 1;
            }
        }
        if (i6 + 1 > i5) {
            return i7 + 1;
        }
        return i7;
    }

    public static String e(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public void B(C0588d dVar) {
        switch (this.f4208a) {
            case 0:
                return;
            case 12:
                ((C0454y) this.f4210c).f(false, true, false, true, false);
                return;
            case 13:
                return;
            case 19:
                ((q) this.f4209b).B(dVar);
                return;
            default:
                return;
        }
    }

    public String C(String str) {
        Resources resources = (Resources) this.f4210c;
        int identifier = resources.getIdentifier(str, "string", (String) this.f4209b);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void D() {
        ((SparseIntArray) this.f4209b).clear();
    }

    public void I(a aVar) {
        switch (this.f4208a) {
            case 23:
                boolean z3 = aVar.isAllProcessSuccess;
                C0645v vVar = (C0645v) this.f4210c;
                if (z3) {
                    vVar.remove((C0248e) this.f4209b);
                    vVar.notifyDataSetChanged();
                    b.w(false);
                    v0.e(vVar.f9109a, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                    b.M0(R.raw.add_new_item);
                    return;
                }
                b.w(false);
                if (!aVar.isPlayerHasRequirements) {
                    if (!aVar.hasRequiredLevel) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.level_lower_requirements, vVar.f9109a, (String) null);
                        return;
                    } else if (aVar.isCurrentlyInGang) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.already_in_gang, vVar.f9109a, (String) null);
                        return;
                    } else if (!aVar.isTimeAllowToJoinNewGang) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_wait_two_hours_before_creating_new_gang, vVar.f9109a, (String) null);
                        return;
                    } else {
                        return;
                    }
                } else if (!aVar.isGangMembersNumberAllowed) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_gang_reach_maximum_members_number, vVar.f9109a, (String) null);
                    return;
                } else if (!aVar.isGangObjectUpdated) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.already_in_gang, vVar.f9109a, (String) null);
                    return;
                } else {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error, vVar.f9109a, (String) null);
                    return;
                }
            default:
                boolean z4 = aVar.isAllProcessSuccess;
                C0615b0 b0Var = (C0615b0) this.f4210c;
                if (z4) {
                    n nVar = (n) this.f4209b;
                    b0Var.remove(nVar);
                    b0Var.notifyDataSetChanged();
                    b.w(false);
                    String string = MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully);
                    Context context = b0Var.f8978b;
                    v0.e(context, string);
                    b.M0(R.raw.add_new_item);
                    for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
                        if (sVar instanceof C0429i) {
                            ((C0429i) sVar).X(1, nVar.f4401a);
                        }
                    }
                    return;
                }
                b.w(false);
                if (!aVar.isPlayerHasRequirements) {
                    if (!aVar.hasRequiredLevel) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_player_level_lower_requirements, b0Var.f8978b, (String) null);
                        return;
                    } else if (aVar.isCurrentlyInGang) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_player_already_in_gang, b0Var.f8978b, (String) null);
                        return;
                    } else if (!aVar.isTimeAllowToJoinNewGang) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_player_must_spent_two_hours_from_last_gang_he_leave_to_join_new_gang, b0Var.f8978b, (String) null);
                        return;
                    } else {
                        return;
                    }
                } else if (!aVar.isGangMembersNumberAllowed) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_gang_reach_maximum_members_number, b0Var.f8978b, (String) null);
                    return;
                } else if (!aVar.isGangObjectUpdated) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_player_already_in_gang, b0Var.f8978b, (String) null);
                    return;
                } else {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error, b0Var.f8978b, (String) null);
                    return;
                }
        }
    }

    public void J(C0571a aVar) {
        z zVar = (z) this.f4209b;
        ((ActionMode.Callback) zVar.f2711b).onDestroyActionMode(zVar.s(aVar));
        f.z zVar2 = (f.z) this.f4210c;
        if (zVar2.F != null) {
            zVar2.f7868u.getDecorView().removeCallbacks(zVar2.f7830G);
        }
        if (zVar2.f7829E != null) {
            X x6 = zVar2.f7831H;
            if (x6 != null) {
                x6.b();
            }
            X a6 = O.a(zVar2.f7829E);
            a6.a(0.0f);
            zVar2.f7831H = a6;
            a6.d(new r(this, 2));
        }
        zVar2.f7828D = null;
        ViewGroup viewGroup = zVar2.f7833J;
        WeakHashMap weakHashMap = O.f1352a;
        B.c(viewGroup);
        zVar2.H();
    }

    public void K(C1084e eVar) {
        ((t) this.f4210c).f9742i.execute(new g((Object) this, (Object) eVar, 2, false));
    }

    public boolean L(C0571a aVar, k kVar) {
        ViewGroup viewGroup = ((f.z) this.f4210c).f7833J;
        WeakHashMap weakHashMap = O.f1352a;
        B.c(viewGroup);
        z zVar = (z) this.f4209b;
        C0575e s6 = zVar.s(aVar);
        j jVar = (j) zVar.f2713e;
        Menu menu = (Menu) jVar.get(kVar);
        if (menu == null) {
            menu = new j.z((Context) zVar.f2712c, kVar);
            jVar.put(kVar, menu);
        }
        return ((ActionMode.Callback) zVar.f2711b).onPrepareActionMode(s6, menu);
    }

    public void M(String str) {
        C1083d dVar = (C1083d) this.f4209b;
        synchronized (dVar) {
            dVar.e((byte) 1, str.getBytes(C1083d.f12420m));
        }
    }

    public Object a() {
        return (x) this.f4209b;
    }

    public boolean b(CharSequence charSequence, int i2, int i5, androidx.emoji2.text.t tVar) {
        Spannable spannable;
        if ((tVar.f4962c & 4) > 0) {
            return true;
        }
        if (((x) this.f4209b) == null) {
            if (charSequence instanceof Spannable) {
                spannable = (Spannable) charSequence;
            } else {
                spannable = new SpannableString(charSequence);
            }
            this.f4209b = new x(spannable);
        }
        ((T1.B) this.f4210c).getClass();
        ((x) this.f4209b).setSpan(new u(tVar), i2, i5, 33);
        return true;
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.f4209b).add(o3.d.g(str, "=", String.valueOf(obj)));
    }

    public void d() {
        ((Animator) this.f4209b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f4210c) + " has been canceled.");
        }
    }

    public void f(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.f(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void g(boolean z3) {
        I i2 = (I) this.f4210c;
        C0289v vVar = i2.f5014t.f5193q;
        C0286s sVar = i2.f5016v;
        if (sVar != null) {
            sVar.p().f5006l.g(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public Object get() {
        switch (this.f4208a) {
            case 16:
                return new f((Context) ((C0484c) this.f4209b).f7573a, (C0461d) ((e) this.f4210c).get());
            default:
                return new j1.g(new D(21), new v(21), C0605a.f8795f, (i) ((e) this.f4209b).get(), (C0797a) this.f4210c);
        }
    }

    public void h(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.h(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void j(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.j(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void k(C0587c cVar) {
        Class<Integer> cls = Integer.class;
        int i2 = (Integer) ((C0587c) this.f4209b).f(cls);
        if (i2 == null) {
            i2 = 0;
        }
        Integer num = (Integer) cVar.f(cls);
        if (num != null && !num.equals(i2)) {
            new Handler().postDelayed(new com.mtma.criminal.city.activities.k(this, com.bumptech.glide.c.v0(((com.mtma.criminal.city.activities.e) this.f4210c).f7055b.f6979I), 1), 10000);
        }
    }

    public void l(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.l(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void m(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.m(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void n(boolean z3) {
        I i2 = (I) this.f4210c;
        C0289v vVar = i2.f5014t.f5193q;
        C0286s sVar = i2.f5016v;
        if (sVar != null) {
            sVar.p().f5006l.n(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void o(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.o(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void p(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.p(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void q(C0587c cVar) {
        new Handler().postDelayed(new com.mtma.criminal.city.activities.k(this, com.bumptech.glide.c.v0(((com.mtma.criminal.city.activities.e) this.f4210c).f7055b.f6979I), 0), 10000);
    }

    public void r(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.r(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void s(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.s(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void t(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.t(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public Object then(Task task) {
        String str;
        switch (this.f4208a) {
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                if (!task.isSuccessful()) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error, ((C0423c) ((A) this.f4210c).f2796b).f7162d0, (String) null);
                }
                return ((com.google.firebase.storage.f) this.f4209b).e();
            case 18:
                if (!task.isSuccessful()) {
                    Exception exception = task.getException();
                    com.google.android.gms.common.internal.I.g(exception);
                    String message = exception.getMessage();
                    com.google.android.gms.common.internal.I.g(message);
                    return Tasks.forException(new Exception(message));
                }
                zzahk zzahk = (zzahk) task.getResult();
                String zza = zzahk.zza();
                if (zzae.zzc(zza)) {
                    return Tasks.forException(new Exception(o3.d.i("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.f4209b)));
                }
                List<String> zza2 = zzv.zza('/').zza((CharSequence) zza);
                if (zza2.size() != 4) {
                    str = null;
                } else {
                    str = zza2.get(3);
                }
                if (TextUtils.isEmpty(str)) {
                    return Tasks.forException(new Exception(o3.d.i("Invalid siteKey format ", zza)));
                }
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.f4209b));
                }
                o oVar = (o) this.f4210c;
                R2.i iVar = (R2.i) oVar.d;
                iVar.b();
                ((w) oVar.f1321f).getClass();
                Task<RecaptchaTasksClient> fetchTaskClient = Recaptcha.fetchTaskClient((Application) iVar.f2490a, str);
                o oVar2 = (o) this.f4210c;
                String str2 = (String) this.f4209b;
                synchronized (oVar2.f1317a) {
                    oVar2.f1319c = zzahk;
                    ((HashMap) oVar2.f1318b).put(str2, fetchTaskClient);
                }
                return fetchTaskClient;
            default:
                if (!task.isSuccessful()) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.unknown_error, ((l4.i) this.f4210c).f9806d0, (String) null);
                }
                return ((com.google.firebase.storage.f) this.f4209b).e();
        }
    }

    public String toString() {
        switch (this.f4208a) {
            case 5:
                return ((Map) this.f4209b).toString();
            case zzaky.zzf.zzg /*7*/:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f4210c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f4209b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case 14:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                android.support.v4.media.session.a.c(sb2, (C0307s) this.f4209b);
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(C0587c cVar) {
        int i2;
        int i5;
        String str = null;
        Class<Integer> cls = Integer.class;
        boolean z3 = true;
        switch (this.f4208a) {
            case 0:
                if (cVar.g()) {
                    FirebaseAuth.getInstance().a((String) this.f4209b).addOnCompleteListener(new H4.d((Object) this, 11));
                    return;
                }
                P4.d dVar = (P4.d) this.f4210c;
                dVar.f2196h0 = false;
                ((LinearLayout) dVar.f2199k0).setVisibility(8);
                ((EditText) dVar.f2198j0).setError(dVar.r(R.string.email_not_exist));
                ((EditText) dVar.f2198j0).requestFocus();
                return;
            case 12:
                try {
                    i2 = ((Integer) cVar.f(cls)).intValue();
                } catch (Exception unused) {
                    i2 = 0;
                }
                C0454y yVar = (C0454y) this.f4210c;
                if (i2 < 25) {
                    yVar.f(false, false, false, false, false);
                    return;
                } else if (!d5.o.getGangObject().getId().equals("not_in_gang")) {
                    yVar.f(false, true, true, false, false);
                    return;
                } else {
                    if (d5.o.getGangObject().getLeaveGangTimeInSeconds() + 7200 >= com.bumptech.glide.c.f5744o) {
                        z3 = false;
                    }
                    if (!z3) {
                        yVar.f(false, true, false, false, false);
                        return;
                    } else {
                        C0592h.b().e().E(b.Z()).E("gangs").E("gangRequests").E((String) this.f4209b).E(d5.o.getAccountObject().getId()).d(new S3.t(this, 27));
                        return;
                    }
                }
            case 13:
                com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players").E((String) this.f4209b).E("stockObject").E("itemsInStock").d(new k0(this, ((Integer) cVar.f(cls)).intValue()));
                return;
            case 19:
                S3.r rVar = (S3.r) this.f4210c;
                rVar.v(new C0859D((n3.m) rVar.f2694b, this, rVar.l()));
                ((q) this.f4209b).u(cVar);
                return;
            case 25:
                try {
                    i5 = ((Integer) cVar.f(cls)).intValue();
                } catch (Exception e6) {
                    int i6 = Z.g;
                    com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "Z", " in startBuyPackageProcess method.", e6, "Z");
                    i5 = -1;
                }
                if (i5 != -1) {
                    Y4.D d = (Y4.D) this.f4209b;
                    int V5 = I1.b.V(d.f4293a);
                    Z z4 = (Z) this.f4210c;
                    if (i5 < V5) {
                        b.w(false);
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.level_below_package_required_level, z4.f8965b, (String) null);
                        return;
                    }
                    String id = d5.o.getAccountObject().getId();
                    int i7 = z4.d;
                    if (i7 == 0) {
                        str = "gold";
                    } else if (i7 == 1) {
                        str = "check";
                    }
                    com.mtma.criminal.city.utils.U.g(id, str, -d.f4290B, new p0(this, 1));
                    return;
                }
                return;
            default:
                d5.j jVar = (d5.j) cVar.a("locationObject").f(d5.j.class);
                if (jVar != null) {
                    d5.j jVar2 = (d5.j) this.f4209b;
                    int currentCity = jVar2.getCurrentCity();
                    A2.f fVar = (A2.f) this.f4210c;
                    if (currentCity != 0 && jVar2.getCurrentCity() != jVar.getCurrentCity()) {
                        b.w(false);
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_material_to_player_not_in_same_city, ((M0) fVar.d).f8919a, (String) null);
                        return;
                    } else if (jVar2.getCurrentCity() == 0 || jVar.getCurrentPlace() != 3) {
                        if (jVar2.getCurrentCity() == 0) {
                            z3 = false;
                        }
                        String str2 = ((M0) fVar.d).d;
                        C0444n nVar = new C0444n(this, fVar.f29b, jVar2, (Y4.D) fVar.f30c);
                        if (!z3) {
                            android.support.v4.media.session.a.P(str2, nVar);
                            return;
                        } else {
                            android.support.v4.media.session.a.N(str2, nVar);
                            return;
                        }
                    } else {
                        b.w(false);
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_material_to_player_in_plane, ((M0) fVar.d).f8919a, (String) null);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public void v(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.v(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void w(boolean z3) {
        C0286s sVar = ((I) this.f4210c).f5016v;
        if (sVar != null) {
            sVar.p().f5006l.w(true);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f4209b).iterator();
        if (!it2.hasNext()) {
            return;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        } else if (z3) {
            throw null;
        } else {
            throw null;
        }
    }

    public void x(String str, PrintWriter printWriter) {
        boolean z3;
        C0457b bVar = (C0457b) this.f4210c;
        if (bVar.d.h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < bVar.d.h(); i2++) {
                C0456a aVar = (C0456a) bVar.d.i(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.d.f(i2));
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                Object obj = null;
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(aVar.f7497l);
                x1.d dVar = aVar.f7497l;
                String str3 = str2 + "  ";
                dVar.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(dVar.f12539a);
                if (dVar.f12540b || dVar.f12542e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(dVar.f12540b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(dVar.f12542e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (dVar.f12541c || dVar.d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(dVar.f12541c);
                    printWriter.print(" mReset=");
                    printWriter.println(dVar.d);
                }
                if (dVar.g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(dVar.g);
                    printWriter.print(" waiting=");
                    dVar.g.getClass();
                    printWriter.println(false);
                }
                if (dVar.h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(dVar.h);
                    printWriter.print(" waiting=");
                    dVar.h.getClass();
                    printWriter.println(false);
                }
                if (aVar.f7499n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aVar.f7499n);
                    H h = aVar.f7499n;
                    h.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(h.f200b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                x1.d dVar2 = aVar.f7497l;
                Object obj2 = aVar.f5290e;
                if (obj2 != y.f5286k) {
                    obj = obj2;
                }
                dVar2.getClass();
                StringBuilder sb = new StringBuilder(64);
                android.support.v4.media.session.a.c(sb, obj);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (aVar.f5289c > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                printWriter.println(z3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b4.m y(g4.C0551a r12) {
        /*
            r11 = this;
            r0 = 5
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 18
            r5 = 2
            java.lang.Object r6 = r11.f4209b
            java.util.Map r6 = (java.util.Map) r6
            java.lang.reflect.Type r7 = r12.f8045b
            java.lang.Object r8 = r6.get(r7)
            if (r8 != 0) goto L_0x013f
            java.lang.Class r12 = r12.f8044a
            java.lang.Object r6 = r6.get(r12)
            if (r6 != 0) goto L_0x0139
            java.lang.Class<java.util.EnumSet> r6 = java.util.EnumSet.class
            boolean r6 = r6.isAssignableFrom(r12)
            r8 = 0
            if (r6 == 0) goto L_0x002a
            S3.t r6 = new S3.t
            r6.<init>(r7, r4)
            goto L_0x0035
        L_0x002a:
            java.lang.Class<java.util.EnumMap> r6 = java.util.EnumMap.class
            if (r12 != r6) goto L_0x0034
            T1.A r6 = new T1.A
            r6.<init>((java.lang.Object) r7, (int) r4)
            goto L_0x0035
        L_0x0034:
            r6 = r8
        L_0x0035:
            if (r6 == 0) goto L_0x0038
            return r6
        L_0x0038:
            java.lang.Object r4 = r11.f4210c
            java.util.List r4 = (java.util.List) r4
            b4.C0321d.e(r4)
            int r4 = r12.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)
            if (r4 == 0) goto L_0x004b
        L_0x0049:
            r4 = r8
            goto L_0x0085
        L_0x004b:
            java.lang.reflect.Constructor r4 = r12.getDeclaredConstructor(r8)     // Catch:{ NoSuchMethodException -> 0x0049 }
            com.bumptech.glide.c r6 = e4.C0503c.f7669a
            r4.setAccessible(r3)     // Catch:{ Exception -> 0x0056 }
            r6 = r8
            goto L_0x0075
        L_0x0056:
            r6 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed making constructor '"
            r9.<init>(r10)
            java.lang.String r10 = e4.C0503c.b(r4)
            r9.append(r10)
            java.lang.String r10 = "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            r9.append(r10)
            java.lang.String r6 = r6.getMessage()
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x0075:
            if (r6 == 0) goto L_0x007d
            a3.a r4 = new a3.a
            r4.<init>((java.lang.String) r6, (int) r5)
            goto L_0x0085
        L_0x007d:
            T1.A r6 = new T1.A
            r9 = 19
            r6.<init>((java.lang.Object) r4, (int) r9)
            r4 = r6
        L_0x0085:
            if (r4 == 0) goto L_0x0088
            return r4
        L_0x0088:
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            boolean r4 = r4.isAssignableFrom(r12)
            if (r4 == 0) goto L_0x00c2
            java.lang.Class<java.util.SortedSet> r0 = java.util.SortedSet.class
            boolean r0 = r0.isAssignableFrom(r12)
            if (r0 == 0) goto L_0x009f
            androidx.fragment.app.D r8 = new androidx.fragment.app.D
            r8.<init>((int) r3)
            goto L_0x0122
        L_0x009f:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r12)
            if (r0 == 0) goto L_0x00ae
            androidx.emoji2.text.v r8 = new androidx.emoji2.text.v
            r8.<init>((int) r5)
            goto L_0x0122
        L_0x00ae:
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            boolean r0 = r0.isAssignableFrom(r12)
            if (r0 == 0) goto L_0x00bc
            androidx.fragment.app.D r8 = new androidx.fragment.app.D
            r8.<init>((int) r5)
            goto L_0x0122
        L_0x00bc:
            androidx.emoji2.text.v r8 = new androidx.emoji2.text.v
            r8.<init>((int) r2)
            goto L_0x0122
        L_0x00c2:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r12)
            if (r3 == 0) goto L_0x0122
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r3 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r3 = r3.isAssignableFrom(r12)
            if (r3 == 0) goto L_0x00d8
            androidx.fragment.app.D r8 = new androidx.fragment.app.D
            r8.<init>((int) r2)
            goto L_0x0122
        L_0x00d8:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r2 = java.util.concurrent.ConcurrentMap.class
            boolean r2 = r2.isAssignableFrom(r12)
            if (r2 == 0) goto L_0x00e6
            androidx.emoji2.text.v r8 = new androidx.emoji2.text.v
            r8.<init>((int) r1)
            goto L_0x0122
        L_0x00e6:
            java.lang.Class<java.util.SortedMap> r2 = java.util.SortedMap.class
            boolean r2 = r2.isAssignableFrom(r12)
            if (r2 == 0) goto L_0x00f4
            androidx.fragment.app.D r8 = new androidx.fragment.app.D
            r8.<init>((int) r1)
            goto L_0x0122
        L_0x00f4:
            boolean r1 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x011d
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type[] r1 = r7.getActualTypeArguments()
            r2 = 0
            r1 = r1[r2]
            java.util.Objects.requireNonNull(r1)
            java.lang.reflect.Type r1 = b4.C0321d.a(r1)
            java.lang.Class r2 = b4.C0321d.g(r1)
            r1.hashCode()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L_0x011d
            androidx.emoji2.text.v r8 = new androidx.emoji2.text.v
            r8.<init>((int) r0)
            goto L_0x0122
        L_0x011d:
            androidx.fragment.app.D r8 = new androidx.fragment.app.D
            r8.<init>((int) r0)
        L_0x0122:
            if (r8 == 0) goto L_0x0125
            return r8
        L_0x0125:
            java.lang.String r0 = e(r12)
            if (r0 == 0) goto L_0x0131
            I5.u r12 = new I5.u
            r12.<init>(r0, r5)
            return r12
        L_0x0131:
            S3.t r0 = new S3.t
            r1 = 17
            r0.<init>(r12, r1)
            return r0
        L_0x0139:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L_0x013f:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.d.y(g4.a):b4.m");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.cct.CctBackendFactory z(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "."
            java.lang.String r1 = "Could not instantiate "
            java.lang.Object r2 = r13.f4210c
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            java.lang.String r4 = "BackendRegistry"
            if (r2 != 0) goto L_0x009a
            java.lang.Object r2 = r13.f4209b
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r5 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0036 }
            if (r5 != 0) goto L_0x001e
            java.lang.String r2 = "Context has no PackageManager."
            android.util.Log.w(r4, r2)     // Catch:{ NameNotFoundException -> 0x0036 }
        L_0x001c:
            r2 = r3
            goto L_0x003c
        L_0x001e:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0036 }
            java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r7 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
            r6.<init>(r2, r7)     // Catch:{ NameNotFoundException -> 0x0036 }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r2 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x0036 }
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = "TransportBackendDiscovery has no service info."
            android.util.Log.w(r4, r2)     // Catch:{ NameNotFoundException -> 0x0036 }
            goto L_0x001c
        L_0x0033:
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0036 }
            goto L_0x003c
        L_0x0036:
            java.lang.String r2 = "Application info not found."
            android.util.Log.w(r4, r2)
            goto L_0x001c
        L_0x003c:
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = "Could not retrieve metadata, returning empty list of transport backends."
            android.util.Log.w(r4, r2)
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x0098
        L_0x0048:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r6 = r2.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0055:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.get(r7)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L_0x0055
            java.lang.String r9 = "backend:"
            boolean r9 = r7.startsWith(r9)
            if (r9 == 0) goto L_0x0055
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = ","
            r10 = -1
            java.lang.String[] r8 = r8.split(r9, r10)
            int r9 = r8.length
            r10 = 0
        L_0x007c:
            if (r10 >= r9) goto L_0x0055
            r11 = r8[r10]
            java.lang.String r11 = r11.trim()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x008b
            goto L_0x0094
        L_0x008b:
            r12 = 8
            java.lang.String r12 = r7.substring(r12)
            r5.put(r11, r12)
        L_0x0094:
            int r10 = r10 + 1
            goto L_0x007c
        L_0x0097:
            r2 = r5
        L_0x0098:
            r13.f4210c = r2
        L_0x009a:
            java.lang.Object r2 = r13.f4210c
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r14 = r2.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L_0x00a7
            return r3
        L_0x00a7:
            java.lang.Class r2 = java.lang.Class.forName(r14)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            java.lang.Class<com.google.android.datatransport.cct.CctBackendFactory> r5 = com.google.android.datatransport.cct.CctBackendFactory.class
            java.lang.Class r2 = r2.asSubclass(r5)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            com.google.android.datatransport.cct.CctBackendFactory r2 = (com.google.android.datatransport.cct.CctBackendFactory) r2     // Catch:{ ClassNotFoundException -> 0x00c4, IllegalAccessException -> 0x00c2, InstantiationException -> 0x00c0, NoSuchMethodException -> 0x00be, InvocationTargetException -> 0x00bc }
            return r2
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c6
        L_0x00be:
            r0 = move-exception
            goto L_0x00ce
        L_0x00c0:
            r2 = move-exception
            goto L_0x00d6
        L_0x00c2:
            r2 = move-exception
            goto L_0x00e9
        L_0x00c4:
            r0 = move-exception
            goto L_0x00fc
        L_0x00c6:
            java.lang.String r14 = r1.concat(r14)
            android.util.Log.w(r4, r14, r0)
            goto L_0x0112
        L_0x00ce:
            java.lang.String r14 = r1.concat(r14)
            android.util.Log.w(r4, r14, r0)
            goto L_0x0112
        L_0x00d6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r14)
            r5.append(r0)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r4, r14, r2)
            goto L_0x0112
        L_0x00e9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r14)
            r5.append(r0)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r4, r14, r2)
            goto L_0x0112
        L_0x00fc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r14 = " is not found."
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            android.util.Log.w(r4, r14, r0)
        L_0x0112:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.d.z(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public /* synthetic */ d(Object obj, Object obj2, int i2) {
        this.f4208a = i2;
        this.f4210c = obj;
        this.f4209b = obj2;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i2, boolean z3) {
        this.f4208a = i2;
        this.f4209b = obj;
        this.f4210c = obj2;
    }

    public d(Context context) {
        this.f4208a = 8;
        com.google.android.gms.common.internal.I.g(context);
        Resources resources = context.getResources();
        this.f4210c = resources;
        this.f4209b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ d(Object obj) {
        this.f4208a = 7;
        this.f4210c = obj;
        this.f4209b = new ArrayList();
    }

    public d(int i2) {
        this.f4208a = i2;
        switch (i2) {
            case 29:
                this.f4209b = new SparseIntArray();
                this.f4210c = new SparseIntArray();
                return;
            default:
                z1.e eVar = z1.e.d;
                this.f4209b = new SparseIntArray();
                this.f4210c = eVar;
                return;
        }
    }

    public d(v vVar) {
        this.f4208a = 6;
        this.f4209b = new HashMap();
        this.f4210c = vVar;
    }

    public d(C0307s sVar, T t6) {
        this.f4208a = 14;
        this.f4209b = sVar;
        C0009h hVar = new C0009h(t6, (S) C0457b.f7500f);
        Class<C0457b> cls = C0457b.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            this.f4210c = (C0457b) hVar.v(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public d(R2.i iVar) {
        this.f4208a = 21;
        new HashSet();
        this.f4210c = iVar;
        if (iVar != null) {
            iVar.b();
            this.f4209b = iVar.f2490a;
            return;
        }
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Log.e("FirebaseDatabase", "ERROR: You must call FirebaseApp.initializeApp() before using Firebase Database.");
        Log.e("FirebaseDatabase", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        throw new RuntimeException("You need to call FirebaseApp.initializeApp() before using Firebase Database.");
    }

    public d(I i2) {
        this.f4208a = 4;
        this.f4209b = new CopyOnWriteArrayList();
        this.f4210c = i2;
    }

    public d(t tVar, C1083d dVar) {
        this.f4208a = 27;
        this.f4210c = tVar;
        this.f4209b = dVar;
        dVar.f12425c = this;
    }

    private final void E(C0588d dVar) {
    }

    private final void F(C0588d dVar) {
    }

    private final void G(C0588d dVar) {
    }

    private final void H(C0588d dVar) {
    }

    public void i(C0587c cVar) {
    }

    public d(Animator animator) {
        this.f4208a = 3;
        this.f4209b = null;
        this.f4210c = animator;
    }
}
