package Q;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class q implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f2333a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f2334b;

    /* renamed from: c  reason: collision with root package name */
    public Class f2335c;
    public Method d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2336e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2337f = false;

    public q(ActionMode.Callback callback, TextView textView) {
        this.f2333a = callback;
        this.f2334b = textView;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f2333a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f2333a.onCreateActionMode(actionMode, menu);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f2333a.onDestroyActionMode(actionMode);
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method method;
        boolean z3;
        TextView textView = this.f2334b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f2337f) {
            this.f2337f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f2335c = cls;
                this.d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                this.f2336e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f2335c = null;
                this.d = null;
                this.f2336e = false;
            }
        }
        try {
            if (!this.f2336e || !this.f2335c.isInstance(menu)) {
                method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
            } else {
                method = this.d;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    method.invoke(menu, new Object[]{Integer.valueOf(size)});
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo next : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(next.activityInfo.packageName)) {
                        ActivityInfo activityInfo = next.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (!(str == null || context.checkSelfPermission(str) == 0)) {
                            }
                        }
                    }
                    arrayList.add(next);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i2);
                MenuItem add = menu.add(0, 0, i2 + 100, resolveInfo.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z3);
                ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f2333a.onPrepareActionMode(actionMode, menu);
    }
}
