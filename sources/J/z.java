package j;

import E.a;
import E2.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import n.j;

public class z extends f implements Menu {

    /* renamed from: c  reason: collision with root package name */
    public final k f8791c;

    public z(Context context, k kVar) {
        super(context);
        if (kVar != null) {
            this.f8791c = kVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return j(this.f8791c.a(0, 0, 0, charSequence));
    }

    public final int addIntentOptions(int i2, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f8791c.addIntentOptions(i2, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr3[i8] = j(menuItemArr2[i8]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f8791c.addSubMenu(0, 0, 0, charSequence);
    }

    public final void clear() {
        j jVar = (j) this.f621b;
        if (jVar != null) {
            jVar.clear();
        }
        this.f8791c.clear();
    }

    public final void close() {
        this.f8791c.close();
    }

    public final MenuItem findItem(int i2) {
        return j(this.f8791c.findItem(i2));
    }

    public final MenuItem getItem(int i2) {
        return j(this.f8791c.getItem(i2));
    }

    public final boolean hasVisibleItems() {
        return this.f8791c.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f8791c.isShortcutKey(i2, keyEvent);
    }

    public final boolean performIdentifierAction(int i2, int i5) {
        return this.f8791c.performIdentifierAction(i2, i5);
    }

    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i5) {
        return this.f8791c.performShortcut(i2, keyEvent, i5);
    }

    public final void removeGroup(int i2) {
        if (((j) this.f621b) != null) {
            int i5 = 0;
            while (true) {
                j jVar = (j) this.f621b;
                if (i5 >= jVar.f10226c) {
                    break;
                }
                if (((a) jVar.f(i5)).getGroupId() == i2) {
                    ((j) this.f621b).h(i5);
                    i5--;
                }
                i5++;
            }
        }
        this.f8791c.removeGroup(i2);
    }

    public final void removeItem(int i2) {
        if (((j) this.f621b) != null) {
            int i5 = 0;
            while (true) {
                j jVar = (j) this.f621b;
                if (i5 >= jVar.f10226c) {
                    break;
                } else if (((a) jVar.f(i5)).getItemId() == i2) {
                    ((j) this.f621b).h(i5);
                    break;
                } else {
                    i5++;
                }
            }
        }
        this.f8791c.removeItem(i2);
    }

    public final void setGroupCheckable(int i2, boolean z3, boolean z4) {
        this.f8791c.setGroupCheckable(i2, z3, z4);
    }

    public final void setGroupEnabled(int i2, boolean z3) {
        this.f8791c.setGroupEnabled(i2, z3);
    }

    public final void setGroupVisible(int i2, boolean z3) {
        this.f8791c.setGroupVisible(i2, z3);
    }

    public final void setQwertyMode(boolean z3) {
        this.f8791c.setQwertyMode(z3);
    }

    public final int size() {
        return this.f8791c.size();
    }

    public final SubMenu addSubMenu(int i2) {
        return this.f8791c.addSubMenu(i2);
    }

    public final MenuItem add(int i2) {
        return j(this.f8791c.add(i2));
    }

    public final SubMenu addSubMenu(int i2, int i5, int i6, CharSequence charSequence) {
        return this.f8791c.addSubMenu(i2, i5, i6, charSequence);
    }

    public final MenuItem add(int i2, int i5, int i6, CharSequence charSequence) {
        return j(this.f8791c.a(i2, i5, i6, charSequence));
    }

    public final SubMenu addSubMenu(int i2, int i5, int i6, int i7) {
        return this.f8791c.addSubMenu(i2, i5, i6, i7);
    }

    public final MenuItem add(int i2, int i5, int i6, int i7) {
        return j(this.f8791c.add(i2, i5, i6, i7));
    }
}
