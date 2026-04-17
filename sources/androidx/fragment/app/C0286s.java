package androidx.fragment.app;

import A.h;
import I1.b;
import S3.t;
import W0.u;
import X4.d;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0298i;
import androidx.lifecycle.C0303n;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.y;
import c.C0327b;
import c.C0328c;
import c0.C0337c;
import com.bumptech.glide.manager.o;
import com.mtma.criminal.city.R;
import h0.C0552a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.C0738t;
import kotlin.jvm.internal.j;
import n0.C0853c;

/* renamed from: androidx.fragment.app.s  reason: case insensitive filesystem */
public abstract class C0286s implements ComponentCallbacks, View.OnCreateContextMenuListener, C0307s, U, C0298i, C0853c {

    /* renamed from: c0  reason: collision with root package name */
    public static final Object f5146c0 = new Object();

    /* renamed from: A  reason: collision with root package name */
    public I f5147A;

    /* renamed from: B  reason: collision with root package name */
    public C0288u f5148B;

    /* renamed from: C  reason: collision with root package name */
    public I f5149C = new I();

    /* renamed from: D  reason: collision with root package name */
    public C0286s f5150D;

    /* renamed from: E  reason: collision with root package name */
    public int f5151E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public String f5152G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f5153H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f5154I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f5155J;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f5156K = true;

    /* renamed from: L  reason: collision with root package name */
    public boolean f5157L;

    /* renamed from: M  reason: collision with root package name */
    public ViewGroup f5158M;

    /* renamed from: N  reason: collision with root package name */
    public View f5159N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f5160O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f5161P = true;

    /* renamed from: Q  reason: collision with root package name */
    public C0285q f5162Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f5163R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f5164S;

    /* renamed from: T  reason: collision with root package name */
    public String f5165T;

    /* renamed from: U  reason: collision with root package name */
    public C0303n f5166U = C0303n.f5271e;

    /* renamed from: V  reason: collision with root package name */
    public C0309u f5167V;

    /* renamed from: W  reason: collision with root package name */
    public Q f5168W;

    /* renamed from: X  reason: collision with root package name */
    public final y f5169X = new y();

    /* renamed from: Y  reason: collision with root package name */
    public o f5170Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicInteger f5171Z = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public int f5172a = -1;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList f5173a0 = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public Bundle f5174b;

    /* renamed from: b0  reason: collision with root package name */
    public final C0282n f5175b0 = new C0282n(this);

    /* renamed from: c  reason: collision with root package name */
    public SparseArray f5176c;
    public Bundle d;

    /* renamed from: e  reason: collision with root package name */
    public String f5177e = UUID.randomUUID().toString();

    /* renamed from: f  reason: collision with root package name */
    public Bundle f5178f;

    /* renamed from: p  reason: collision with root package name */
    public C0286s f5179p;

    /* renamed from: q  reason: collision with root package name */
    public String f5180q = null;

    /* renamed from: r  reason: collision with root package name */
    public int f5181r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f5182s = null;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5183t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5184u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5185v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5186w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5187x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5188y;

    /* renamed from: z  reason: collision with root package name */
    public int f5189z;

    public C0286s() {
        t();
    }

    public void A(C0289v vVar) {
        C0289v vVar2;
        this.f5157L = true;
        C0288u uVar = this.f5148B;
        if (uVar == null) {
            vVar2 = null;
        } else {
            vVar2 = uVar.f5192p;
        }
        if (vVar2 != null) {
            this.f5157L = true;
        }
    }

    public void B(Bundle bundle) {
        Parcelable parcelable;
        this.f5157L = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.f5149C.Q(parcelable);
            I i2 = this.f5149C;
            i2.f4990E = false;
            i2.F = false;
            i2.f4996L.f5031i = false;
            i2.t(1);
        }
        I i5 = this.f5149C;
        if (i5.f5013s < 1) {
            i5.f4990E = false;
            i5.F = false;
            i5.f4996L.f5031i = false;
            i5.t(1);
        }
    }

    public View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void D() {
        this.f5157L = true;
    }

    public void E() {
        this.f5157L = true;
    }

    public void F() {
        this.f5157L = true;
    }

    public LayoutInflater G(Bundle bundle) {
        C0288u uVar = this.f5148B;
        if (uVar != null) {
            C0289v vVar = uVar.f5196t;
            LayoutInflater cloneInContext = vVar.getLayoutInflater().cloneInContext(vVar);
            cloneInContext.setFactory2(this.f5149C.f5002f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void H() {
        this.f5157L = true;
    }

    public void I() {
        this.f5157L = true;
    }

    public void J(Bundle bundle) {
    }

    public void K() {
        this.f5157L = true;
    }

    public void L() {
        this.f5157L = true;
    }

    public void M(Bundle bundle) {
        this.f5157L = true;
    }

    public void N(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5149C.K();
        this.f5188y = true;
        this.f5168W = new Q(this, e());
        View C6 = C(layoutInflater, viewGroup);
        this.f5159N = C6;
        if (C6 != null) {
            this.f5168W.d();
            View view = this.f5159N;
            Q q6 = this.f5168W;
            j.e(view, "<this>");
            view.setTag(R.id.view_tree_lifecycle_owner, q6);
            View view2 = this.f5159N;
            Q q7 = this.f5168W;
            j.e(view2, "<this>");
            view2.setTag(R.id.view_tree_view_model_store_owner, q7);
            View view3 = this.f5159N;
            Q q8 = this.f5168W;
            j.e(view3, "<this>");
            view3.setTag(R.id.view_tree_saved_state_registry_owner, q8);
            this.f5169X.i(this.f5168W);
        } else if (this.f5168W.f5058c == null) {
            this.f5168W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final C0328c O(a aVar, C0327b bVar) {
        t tVar = new t(this, 15);
        if (this.f5172a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            C0284p pVar = new C0284p(this, tVar, atomicReference, (u) aVar, bVar);
            if (this.f5172a >= 0) {
                pVar.a();
            } else {
                this.f5173a0.add(pVar);
            }
            return new C0281m(atomicReference);
        }
        throw new IllegalStateException(C0552a.n("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public final C0289v P() {
        C0289v l6 = l();
        if (l6 != null) {
            return l6;
        }
        throw new IllegalStateException(C0552a.n("Fragment ", this, " not attached to an activity."));
    }

    public final Context Q() {
        Context n2 = n();
        if (n2 != null) {
            return n2;
        }
        throw new IllegalStateException(C0552a.n("Fragment ", this, " not attached to a context."));
    }

    public final View R() {
        View view = this.f5159N;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0552a.n("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void S(int i2, int i5, int i6, int i7) {
        if (this.f5162Q != null || i2 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
            k().f5139b = i2;
            k().f5140c = i5;
            k().d = i6;
            k().f5141e = i7;
        }
    }

    public final void T(Bundle bundle) {
        I i2 = this.f5147A;
        if (i2 == null || (!i2.f4990E && !i2.F)) {
            this.f5178f = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final void U(Intent intent) {
        C0288u uVar = this.f5148B;
        if (uVar != null) {
            h.startActivity(uVar.f5193q, intent, (Bundle) null);
            return;
        }
        throw new IllegalStateException(C0552a.n("Fragment ", this, " not attached to Activity"));
    }

    public final C0738t a() {
        return (C0738t) this.f5170Y.d;
    }

    public final C0337c c() {
        Application application;
        Context applicationContext = Q().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + Q().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0337c cVar = new C0337c(0);
        LinkedHashMap linkedHashMap = cVar.f5577a;
        if (application != null) {
            linkedHashMap.put(P.f5248a, application);
        }
        linkedHashMap.put(J.f5229a, this);
        linkedHashMap.put(J.f5230b, this);
        Bundle bundle = this.f5178f;
        if (bundle != null) {
            linkedHashMap.put(J.f5231c, bundle);
        }
        return cVar;
    }

    public final T e() {
        if (this.f5147A == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (o() != 1) {
            HashMap hashMap = this.f5147A.f4996L.f5030f;
            T t6 = (T) hashMap.get(this.f5177e);
            if (t6 != null) {
                return t6;
            }
            T t7 = new T();
            hashMap.put(this.f5177e, t7);
            return t7;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public Activity g() {
        return l();
    }

    public final C0309u h() {
        return this.f5167V;
    }

    public b i() {
        return new C0283o(this);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z3;
        int i2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f5151E));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mTag=");
        printWriter.println(this.f5152G);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f5172a);
        printWriter.print(" mWho=");
        printWriter.print(this.f5177e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f5189z);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f5183t);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f5184u);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f5185v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f5186w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f5153H);
        printWriter.print(" mDetached=");
        printWriter.print(this.f5154I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f5156K);
        printWriter.print(" mHasMenu=");
        int i11 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f5155J);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f5161P);
        if (this.f5147A != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f5147A);
        }
        if (this.f5148B != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f5148B);
        }
        if (this.f5150D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f5150D);
        }
        if (this.f5178f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f5178f);
        }
        if (this.f5174b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f5174b);
        }
        if (this.f5176c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f5176c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        C0286s sVar = this.f5179p;
        if (sVar == null) {
            I i12 = this.f5147A;
            if (i12 == null || (str2 = this.f5180q) == null) {
                sVar = null;
            } else {
                sVar = i12.f5000c.q(str2);
            }
        }
        if (sVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(sVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f5181r);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C0285q qVar = this.f5162Q;
        if (qVar == null) {
            z3 = false;
        } else {
            z3 = qVar.f5138a;
        }
        printWriter.println(z3);
        C0285q qVar2 = this.f5162Q;
        if (qVar2 == null) {
            i2 = 0;
        } else {
            i2 = qVar2.f5139b;
        }
        if (i2 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C0285q qVar3 = this.f5162Q;
            if (qVar3 == null) {
                i10 = 0;
            } else {
                i10 = qVar3.f5139b;
            }
            printWriter.println(i10);
        }
        C0285q qVar4 = this.f5162Q;
        if (qVar4 == null) {
            i5 = 0;
        } else {
            i5 = qVar4.f5140c;
        }
        if (i5 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C0285q qVar5 = this.f5162Q;
            if (qVar5 == null) {
                i9 = 0;
            } else {
                i9 = qVar5.f5140c;
            }
            printWriter.println(i9);
        }
        C0285q qVar6 = this.f5162Q;
        if (qVar6 == null) {
            i6 = 0;
        } else {
            i6 = qVar6.d;
        }
        if (i6 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C0285q qVar7 = this.f5162Q;
            if (qVar7 == null) {
                i8 = 0;
            } else {
                i8 = qVar7.d;
            }
            printWriter.println(i8);
        }
        C0285q qVar8 = this.f5162Q;
        if (qVar8 == null) {
            i7 = 0;
        } else {
            i7 = qVar8.f5141e;
        }
        if (i7 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C0285q qVar9 = this.f5162Q;
            if (qVar9 != null) {
                i11 = qVar9.f5141e;
            }
            printWriter.println(i11);
        }
        if (this.f5158M != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f5158M);
        }
        if (this.f5159N != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f5159N);
        }
        if (n() != null) {
            new d((C0307s) this, e()).x(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f5149C + ":");
        this.f5149C.u(o3.d.f(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.fragment.app.q, java.lang.Object] */
    public final C0285q k() {
        if (this.f5162Q == null) {
            ? obj = new Object();
            Object obj2 = f5146c0;
            obj.g = obj2;
            obj.h = obj2;
            obj.f5143i = obj2;
            obj.f5144j = 1.0f;
            obj.f5145k = null;
            this.f5162Q = obj;
        }
        return this.f5162Q;
    }

    public final C0289v l() {
        C0288u uVar = this.f5148B;
        if (uVar == null) {
            return null;
        }
        return uVar.f5192p;
    }

    public final I m() {
        if (this.f5148B != null) {
            return this.f5149C;
        }
        throw new IllegalStateException(C0552a.n("Fragment ", this, " has not been attached yet."));
    }

    public final Context n() {
        C0288u uVar = this.f5148B;
        if (uVar == null) {
            return null;
        }
        return uVar.f5193q;
    }

    public final int o() {
        C0303n nVar = this.f5166U;
        if (nVar == C0303n.f5269b || this.f5150D == null) {
            return nVar.ordinal();
        }
        return Math.min(nVar.ordinal(), this.f5150D.o());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        this.f5157L = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        P().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onLowMemory() {
        this.f5157L = true;
    }

    public final I p() {
        I i2 = this.f5147A;
        if (i2 != null) {
            return i2;
        }
        throw new IllegalStateException(C0552a.n("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources q() {
        return Q().getResources();
    }

    public final String r(int i2) {
        return q().getString(i2);
    }

    public final String s(int i2, Object... objArr) {
        return q().getString(i2, objArr);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, androidx.fragment.app.F] */
    public final void startActivityForResult(Intent intent, int i2) {
        if (this.f5148B != null) {
            I p6 = p();
            if (p6.f5020z != null) {
                String str = this.f5177e;
                ? obj = new Object();
                obj.f4978a = str;
                obj.f4979b = i2;
                p6.f4988C.addLast(obj);
                p6.f5020z.a(intent);
                return;
            }
            C0288u uVar = p6.f5014t;
            if (i2 == -1) {
                h.startActivity(uVar.f5193q, intent, (Bundle) null);
            } else {
                uVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        } else {
            throw new IllegalStateException(C0552a.n("Fragment ", this, " not attached to Activity"));
        }
    }

    public final void t() {
        this.f5167V = new C0309u(this);
        this.f5170Y = new o((C0853c) this);
        ArrayList arrayList = this.f5173a0;
        C0282n nVar = this.f5175b0;
        if (arrayList.contains(nVar)) {
            return;
        }
        if (this.f5172a >= 0) {
            nVar.a();
        } else {
            arrayList.add(nVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f5177e);
        if (this.f5151E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5151E));
        }
        if (this.f5152G != null) {
            sb.append(" tag=");
            sb.append(this.f5152G);
        }
        sb.append(")");
        return sb.toString();
    }

    public final void u() {
        t();
        this.f5165T = this.f5177e;
        this.f5177e = UUID.randomUUID().toString();
        this.f5183t = false;
        this.f5184u = false;
        this.f5185v = false;
        this.f5186w = false;
        this.f5187x = false;
        this.f5189z = 0;
        this.f5147A = null;
        this.f5149C = new I();
        this.f5148B = null;
        this.f5151E = 0;
        this.F = 0;
        this.f5152G = null;
        this.f5153H = false;
        this.f5154I = false;
    }

    public final boolean v() {
        if (this.f5148B == null || !this.f5183t) {
            return false;
        }
        return true;
    }

    public final boolean w() {
        boolean z3;
        if (!this.f5153H) {
            I i2 = this.f5147A;
            if (i2 == null) {
                return false;
            }
            C0286s sVar = this.f5150D;
            i2.getClass();
            if (sVar == null) {
                z3 = false;
            } else {
                z3 = sVar.w();
            }
            if (z3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean x() {
        if (this.f5189z > 0) {
            return true;
        }
        return false;
    }

    public void y() {
        this.f5157L = true;
    }

    public void z(int i2, int i5, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i5 + " data: " + intent);
        }
    }
}
