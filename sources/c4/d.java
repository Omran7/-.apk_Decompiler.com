package c4;

import Z3.p;
import b4.C0324g;
import d4.a;
import h0.C0552a;
import h4.C0566a;
import h4.C0567b;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public final class d extends p {

    /* renamed from: b  reason: collision with root package name */
    public static final C0341a f5633b = new C0341a(1);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5634a;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f5634a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C0324g.f5528a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    public final Object a(C0566a aVar) {
        if (aVar.C() == 9) {
            aVar.y();
            return null;
        }
        String A6 = aVar.A();
        synchronized (this.f5634a) {
            try {
                Iterator it2 = this.f5634a.iterator();
                while (it2.hasNext()) {
                    try {
                        Date parse = ((DateFormat) it2.next()).parse(A6);
                        return parse;
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return a.b(A6, new ParsePosition(0));
                } catch (ParseException e6) {
                    StringBuilder t6 = C0552a.t("Failed parsing '", A6, "' as Date; at path ");
                    t6.append(aVar.o(true));
                    throw new RuntimeException(t6.toString(), e6);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void b(C0567b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.p();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f5634a.get(0);
        synchronized (this.f5634a) {
            format = dateFormat.format(date);
        }
        bVar.v(format);
    }
}
