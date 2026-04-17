package j;

import A.h;
import K.Q;
import K.T;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class k implements Menu {

    /* renamed from: H  reason: collision with root package name */
    public static final int[] f8719H = {1, 4, 5, 3, 2, 0};

    /* renamed from: A  reason: collision with root package name */
    public boolean f8720A = false;

    /* renamed from: B  reason: collision with root package name */
    public boolean f8721B = false;

    /* renamed from: C  reason: collision with root package name */
    public final ArrayList f8722C = new ArrayList();

    /* renamed from: D  reason: collision with root package name */
    public final CopyOnWriteArrayList f8723D = new CopyOnWriteArrayList();

    /* renamed from: E  reason: collision with root package name */
    public m f8724E;
    public boolean F = false;

    /* renamed from: G  reason: collision with root package name */
    public boolean f8725G;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8726a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f8727b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8728c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public i f8729e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f8730f;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f8731p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8732q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f8733r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f8734s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8735t;

    /* renamed from: u  reason: collision with root package name */
    public int f8736u = 0;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f8737v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f8738w;

    /* renamed from: x  reason: collision with root package name */
    public View f8739x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8740y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8741z = false;

    public k(Context context) {
        boolean z3;
        boolean z4 = false;
        this.f8726a = context;
        Resources resources = context.getResources();
        this.f8727b = resources;
        this.f8730f = new ArrayList();
        this.f8731p = new ArrayList();
        this.f8732q = true;
        this.f8733r = new ArrayList();
        this.f8734s = new ArrayList();
        this.f8735t = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = T.f1357a;
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = Q.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            if (z3) {
                z4 = true;
            }
        }
        this.d = z4;
    }

    public final m a(int i2, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = (-65536 & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (f8719H[i8] << 16) | (65535 & i6);
        m mVar = new m(this, i2, i5, i6, i9, charSequence, this.f8736u);
        ArrayList arrayList = this.f8730f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            } else if (((m) arrayList.get(size)).d <= i9) {
                i7 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i7, mVar);
        p(true);
        return mVar;
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f8726a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            j.m r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f8761p = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.k.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(w wVar, Context context) {
        this.f8723D.add(new WeakReference(wVar));
        wVar.g(context, this);
        this.f8735t = true;
    }

    public final void c(boolean z3) {
        if (!this.f8721B) {
            this.f8721B = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8723D;
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                w wVar = (w) weakReference.get();
                if (wVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    wVar.a(this, z3);
                }
            }
            this.f8721B = false;
        }
    }

    public final void clear() {
        m mVar = this.f8724E;
        if (mVar != null) {
            d(mVar);
        }
        this.f8730f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f8738w = null;
        this.f8737v = null;
        this.f8739x = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8723D;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f8724E == mVar) {
            w();
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                w wVar = (w) weakReference.get();
                if (wVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = wVar.i(mVar);
                    if (z3) {
                        break;
                    }
                }
            }
            v();
            if (z3) {
                this.f8724E = null;
            }
        }
        return z3;
    }

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.f8729e;
        if (iVar == null || !iVar.s(kVar, menuItem)) {
            return false;
        }
        return true;
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8723D;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            w wVar = (w) weakReference.get();
            if (wVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = wVar.d(mVar);
                if (z3) {
                    break;
                }
            }
        }
        v();
        if (z3) {
            this.f8724E = mVar;
        }
        return z3;
    }

    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f8730f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            m mVar = (m) arrayList.get(i5);
            if (mVar.f8756a == i2) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (findItem = mVar.f8769x.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final m g(int i2, KeyEvent keyEvent) {
        char c3;
        ArrayList arrayList = this.f8722C;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (m) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i5 = 0; i5 < size; i5++) {
            m mVar = (m) arrayList.get(i5);
            if (n2) {
                c3 = mVar.f8764s;
            } else {
                c3 = mVar.f8762q;
            }
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (n2 && c3 == 8 && i2 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f8730f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        char c3;
        int i5;
        ArrayList arrayList2 = arrayList;
        int i6 = i2;
        KeyEvent keyEvent2 = keyEvent;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent2.getKeyData(keyData) || i6 == 67) {
            ArrayList arrayList3 = this.f8730f;
            int size = arrayList3.size();
            for (int i7 = 0; i7 < size; i7++) {
                m mVar = (m) arrayList3.get(i7);
                if (mVar.hasSubMenu()) {
                    mVar.f8769x.h(arrayList2, i6, keyEvent2);
                }
                if (n2) {
                    c3 = mVar.f8764s;
                } else {
                    c3 = mVar.f8762q;
                }
                if (n2) {
                    i5 = mVar.f8765t;
                } else {
                    i5 = mVar.f8763r;
                }
                if ((modifiers & 69647) == (i5 & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if (c3 != cArr[0] && c3 != cArr[2]) {
                        if (n2 && c3 == 8) {
                            if (i6 != 67) {
                            }
                        }
                    }
                    if (mVar.isEnabled()) {
                        arrayList2.add(mVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f8725G) {
            return true;
        }
        ArrayList arrayList = this.f8730f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((m) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l6 = l();
        if (this.f8735t) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8723D;
            Iterator it2 = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                w wVar = (w) weakReference.get();
                if (wVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= wVar.h();
                }
            }
            ArrayList arrayList = this.f8733r;
            ArrayList arrayList2 = this.f8734s;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = l6.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m mVar = (m) l6.get(i2);
                    if (mVar.f()) {
                        arrayList.add(mVar);
                    } else {
                        arrayList2.add(mVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f8735t = false;
        }
    }

    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        if (g(i2, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z3 = this.f8732q;
        ArrayList arrayList = this.f8731p;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f8730f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) arrayList2.get(i2);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.f8732q = false;
        this.f8735t = true;
        return arrayList;
    }

    public boolean m() {
        return this.F;
    }

    public boolean n() {
        return this.f8728c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z3) {
        if (!this.f8740y) {
            if (z3) {
                this.f8732q = true;
                this.f8735t = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8723D;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    WeakReference weakReference = (WeakReference) it2.next();
                    w wVar = (w) weakReference.get();
                    if (wVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        wVar.e();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f8741z = true;
        if (z3) {
            this.f8720A = true;
        }
    }

    public final boolean performIdentifierAction(int i2, int i5) {
        return q(findItem(i2), (w) null, i5);
    }

    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i5) {
        boolean z3;
        m g = g(i2, keyEvent);
        if (g != null) {
            z3 = q(g, (w) null, i5);
        } else {
            z3 = false;
        }
        if ((i5 & 2) != 0) {
            c(true);
        }
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, j.w r8, int r9) {
        /*
            r6 = this;
            j.m r7 = (j.m) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d7
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f8770y
            r2 = 1
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r1 = r2
            goto L_0x0043
        L_0x001a:
            j.k r1 = r7.f8768w
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            android.content.Intent r3 = r7.f8761p
            if (r3 == 0) goto L_0x0035
            android.content.Context r1 = r1.f8726a     // Catch:{ ActivityNotFoundException -> 0x002d }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002d }
            goto L_0x0018
        L_0x002d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0035:
            j.n r1 = r7.f8753J
            if (r1 == 0) goto L_0x0042
            android.view.ActionProvider r1 = r1.f8773b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0042
            goto L_0x0018
        L_0x0042:
            r1 = r0
        L_0x0043:
            j.n r3 = r7.f8753J
            if (r3 == 0) goto L_0x0051
            android.view.ActionProvider r4 = r3.f8773b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0051
            r4 = r2
            goto L_0x0052
        L_0x0051:
            r4 = r0
        L_0x0052:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x0064
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d6
            r6.c(r2)
            goto L_0x00d6
        L_0x0064:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0075
            if (r4 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d6
            r6.c(r2)
            goto L_0x00d6
        L_0x0075:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007c
            r6.c(r0)
        L_0x007c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0090
            j.C r9 = new j.C
            android.content.Context r5 = r6.f8726a
            r9.<init>(r5, r6, r7)
            r7.f8769x = r9
            java.lang.CharSequence r5 = r7.f8759e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0090:
            j.C r7 = r7.f8769x
            if (r4 == 0) goto L_0x009e
            j.r r9 = r3.f8774c
            r9.getClass()
            android.view.ActionProvider r9 = r3.f8773b
            r9.onPrepareSubMenu(r7)
        L_0x009e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f8723D
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x00a7
            goto L_0x00d0
        L_0x00a7:
            if (r8 == 0) goto L_0x00ad
            boolean r0 = r8.k(r7)
        L_0x00ad:
            java.util.Iterator r8 = r9.iterator()
        L_0x00b1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00d0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            j.w r4 = (j.w) r4
            if (r4 != 0) goto L_0x00c9
            r9.remove(r3)
            goto L_0x00b1
        L_0x00c9:
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r4.k(r7)
            goto L_0x00b1
        L_0x00d0:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d6
            r6.c(r2)
        L_0x00d6:
            return r1
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.k.q(android.view.MenuItem, j.w, int):boolean");
    }

    public final void r(w wVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8723D;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            w wVar2 = (w) weakReference.get();
            if (wVar2 == null || wVar2 == wVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f8730f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((m) arrayList.get(i6)).f8757b == i2) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((m) arrayList.get(i6)).f8757b != i2) {
                    p(true);
                } else {
                    if (i6 >= 0) {
                        ArrayList arrayList2 = this.f8730f;
                        if (i6 < arrayList2.size()) {
                            arrayList2.remove(i6);
                        }
                    }
                    i5 = i7;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i2) {
        ArrayList arrayList = this.f8730f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((m) arrayList.get(i5)).f8756a == i2) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            ArrayList arrayList2 = this.f8730f;
            if (i5 < arrayList2.size()) {
                arrayList2.remove(i5);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f8730f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0600C) item.getSubMenu()).s(bundle);
                }
            }
            int i5 = bundle.getInt("android:menu:expandedactionview");
            if (i5 > 0 && (findItem = findItem(i5)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i2, boolean z3, boolean z4) {
        int i5;
        ArrayList arrayList = this.f8730f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            m mVar = (m) arrayList.get(i6);
            if (mVar.f8757b == i2) {
                int i7 = mVar.f8750G & -5;
                if (z4) {
                    i5 = 4;
                } else {
                    i5 = 0;
                }
                mVar.f8750G = i7 | i5;
                mVar.setCheckable(z3);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z3) {
        this.F = z3;
    }

    public final void setGroupEnabled(int i2, boolean z3) {
        ArrayList arrayList = this.f8730f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            m mVar = (m) arrayList.get(i5);
            if (mVar.f8757b == i2) {
                mVar.setEnabled(z3);
            }
        }
    }

    public final void setGroupVisible(int i2, boolean z3) {
        int i5;
        ArrayList arrayList = this.f8730f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            m mVar = (m) arrayList.get(i6);
            if (mVar.f8757b == i2) {
                int i7 = mVar.f8750G;
                int i8 = i7 & -9;
                if (z3) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                int i9 = i8 | i5;
                mVar.f8750G = i9;
                if (i7 != i9) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z3) {
        this.f8728c = z3;
        p(false);
    }

    public final int size() {
        return this.f8730f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f8730f.size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0600C) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i5, Drawable drawable, View view) {
        if (view != null) {
            this.f8739x = view;
            this.f8737v = null;
            this.f8738w = null;
        } else {
            if (i2 > 0) {
                this.f8737v = this.f8727b.getText(i2);
            } else if (charSequence != null) {
                this.f8737v = charSequence;
            }
            if (i5 > 0) {
                this.f8738w = h.getDrawable(this.f8726a, i5);
            } else if (drawable != null) {
                this.f8738w = drawable;
            }
            this.f8739x = null;
        }
        p(false);
    }

    public final void v() {
        this.f8740y = false;
        if (this.f8741z) {
            this.f8741z = false;
            p(this.f8720A);
        }
    }

    public final void w() {
        if (!this.f8740y) {
            this.f8740y = true;
            this.f8741z = false;
            this.f8720A = false;
        }
    }

    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f8727b.getString(i2));
    }

    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f8727b.getString(i2));
    }

    public final MenuItem add(int i2, int i5, int i6, CharSequence charSequence) {
        return a(i2, i5, i6, charSequence);
    }

    public final SubMenu addSubMenu(int i2, int i5, int i6, CharSequence charSequence) {
        m a6 = a(i2, i5, i6, charSequence);
        C0600C c3 = new C0600C(this.f8726a, this, a6);
        a6.f8769x = c3;
        c3.setHeaderTitle(a6.f8759e);
        return c3;
    }

    public final MenuItem add(int i2, int i5, int i6, int i7) {
        return a(i2, i5, i6, this.f8727b.getString(i7));
    }

    public final SubMenu addSubMenu(int i2, int i5, int i6, int i7) {
        return addSubMenu(i2, i5, i6, (CharSequence) this.f8727b.getString(i7));
    }

    public k k() {
        return this;
    }
}
