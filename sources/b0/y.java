package B0;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o3.d;
import z0.C1130f;

public final class y extends Exception {

    /* renamed from: f  reason: collision with root package name */
    public static final StackTraceElement[] f333f = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    public final List f334a;

    /* renamed from: b  reason: collision with root package name */
    public C1130f f335b;

    /* renamed from: c  reason: collision with root package name */
    public int f336c;
    public Class d;

    /* renamed from: e  reason: collision with root package name */
    public final String f337e;

    public y(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof y) {
            for (Throwable a6 : ((y) th).f334a) {
                a(a6, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, x xVar) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            xVar.append((CharSequence) "Cause (");
            int i5 = i2 + 1;
            xVar.append((CharSequence) String.valueOf(i5));
            xVar.append(" of ");
            xVar.append(String.valueOf(size));
            xVar.append("): ");
            Throwable th = (Throwable) list.get(i2);
            if (th instanceof y) {
                ((y) th).e(xVar);
            } else {
                c(th, xVar);
            }
            i2 = i5;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i5 = i2 + 1;
            sb.append(i5);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i2));
            i2 = i5;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f334a, new x(appendable));
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f337e);
        String str3 = "";
        if (this.d != null) {
            str = ", " + this.d;
        } else {
            str = str3;
        }
        sb.append(str);
        int i2 = this.f336c;
        if (i2 != 0) {
            str2 = ", ".concat(d.m(i2));
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.f335b != null) {
            str3 = ", " + this.f335b;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Throwable th = (Throwable) it2.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        e(System.err);
    }

    public y(String str, List list) {
        this.f337e = str;
        setStackTrace(f333f);
        this.f334a = list;
    }

    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    public final Throwable fillInStackTrace() {
        return this;
    }
}
