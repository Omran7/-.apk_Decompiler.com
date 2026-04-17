package androidx.fragment.app;

import Z.d;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
public final class C0269a implements G {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5069a;

    /* renamed from: b  reason: collision with root package name */
    public int f5070b;

    /* renamed from: c  reason: collision with root package name */
    public int f5071c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f5072e;

    /* renamed from: f  reason: collision with root package name */
    public int f5073f;
    public boolean g;
    public boolean h;

    /* renamed from: i  reason: collision with root package name */
    public String f5074i;

    /* renamed from: j  reason: collision with root package name */
    public int f5075j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f5076k;

    /* renamed from: l  reason: collision with root package name */
    public int f5077l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f5078m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f5079n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f5080o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5081p;

    /* renamed from: q  reason: collision with root package name */
    public final I f5082q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5083r;

    /* renamed from: s  reason: collision with root package name */
    public int f5084s;

    public C0269a(I i2) {
        i2.C();
        C0288u uVar = i2.f5014t;
        if (uVar != null) {
            uVar.f5193q.getClassLoader();
        }
        this.f5069a = new ArrayList();
        this.h = true;
        this.f5081p = false;
        this.f5084s = -1;
        this.f5082q = i2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        I i2 = this.f5082q;
        if (i2.d == null) {
            i2.d = new ArrayList();
        }
        i2.d.add(this);
        return true;
    }

    public final void b(P p6) {
        this.f5069a.add(p6);
        p6.d = this.f5070b;
        p6.f5053e = this.f5071c;
        p6.f5054f = this.d;
        p6.g = this.f5072e;
    }

    public final void c() {
        if (this.h) {
            this.g = true;
            this.f5074i = null;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void d(int i2) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.f5069a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                P p6 = (P) arrayList.get(i5);
                C0286s sVar = p6.f5051b;
                if (sVar != null) {
                    sVar.f5189z += i2;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p6.f5051b + " to " + p6.f5051b.f5189z);
                    }
                }
            }
        }
    }

    public final int e(boolean z3) {
        if (!this.f5083r) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new S());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.f5083r = true;
            boolean z4 = this.g;
            I i2 = this.f5082q;
            if (z4) {
                this.f5084s = i2.f5003i.getAndIncrement();
            } else {
                this.f5084s = -1;
            }
            i2.v(this, z3);
            return this.f5084s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void f(int i2, C0286s sVar, String str, int i5) {
        String str2 = sVar.f5165T;
        if (str2 != null) {
            d.c(sVar, str2);
        }
        Class<?> cls = sVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = sVar.f5152G;
            if (str3 == null || str.equals(str3)) {
                sVar.f5152G = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + sVar + ": was " + sVar.f5152G + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i6 = sVar.f5151E;
                if (i6 == 0 || i6 == i2) {
                    sVar.f5151E = i2;
                    sVar.F = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + sVar + ": was " + sVar.f5151E + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + sVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new P(i5, sVar));
        sVar.f5147A = this.f5082q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5074i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5084s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5083r);
            if (this.f5073f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5073f));
            }
            if (!(this.f5070b == 0 && this.f5071c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5070b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5071c));
            }
            if (!(this.d == 0 && this.f5072e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5072e));
            }
            if (!(this.f5075j == 0 && this.f5076k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5075j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5076k);
            }
            if (!(this.f5077l == 0 && this.f5078m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5077l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5078m);
            }
        }
        ArrayList arrayList = this.f5069a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p6 = (P) arrayList.get(i2);
                switch (p6.f5050a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case zzaky.zzf.zzf /*6*/:
                        str2 = "DETACH";
                        break;
                    case zzaky.zzf.zzg /*7*/:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + p6.f5050a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(p6.f5051b);
                if (z3) {
                    if (!(p6.d == 0 && p6.f5053e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(p6.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(p6.f5053e));
                    }
                    if (p6.f5054f != 0 || p6.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(p6.f5054f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(p6.g));
                    }
                }
            }
        }
    }

    public final void h(C0286s sVar) {
        I i2 = sVar.f5147A;
        if (i2 == null || i2 == this.f5082q) {
            b(new P(3, sVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + sVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void i(int i2, C0286s sVar) {
        if (i2 != 0) {
            f(i2, sVar, (String) null, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5084s >= 0) {
            sb.append(" #");
            sb.append(this.f5084s);
        }
        if (this.f5074i != null) {
            sb.append(" ");
            sb.append(this.f5074i);
        }
        sb.append("}");
        return sb.toString();
    }
}
