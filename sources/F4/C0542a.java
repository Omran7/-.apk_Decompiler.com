package f4;

import Z3.p;
import c4.C0341a;
import h0.C0552a;
import h4.C0566a;
import h4.C0567b;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: f4.a  reason: case insensitive filesystem */
public final class C0542a extends p {

    /* renamed from: c  reason: collision with root package name */
    public static final C0341a f7971c = new C0341a(4);
    public static final C0341a d = new C0341a(5);

    /* renamed from: e  reason: collision with root package name */
    public static final C0341a f7972e = new C0341a(6);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7973a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7974b;

    public C0542a(int i2) {
        this.f7973a = i2;
        switch (i2) {
            case 1:
                this.f7974b = new SimpleDateFormat("hh:mm:ss a");
                return;
            default:
                this.f7974b = new SimpleDateFormat("MMM d, yyyy");
                return;
        }
    }

    public final Object a(C0566a aVar) {
        Date parse;
        Time time;
        switch (this.f7973a) {
            case 0:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                String A6 = aVar.A();
                try {
                    synchronized (this) {
                        parse = ((SimpleDateFormat) this.f7974b).parse(A6);
                    }
                    return new java.sql.Date(parse.getTime());
                } catch (ParseException e6) {
                    StringBuilder t6 = C0552a.t("Failed parsing '", A6, "' as SQL Date; at path ");
                    t6.append(aVar.o(true));
                    throw new RuntimeException(t6.toString(), e6);
                }
            case 1:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                String A7 = aVar.A();
                try {
                    synchronized (this) {
                        time = new Time(((SimpleDateFormat) this.f7974b).parse(A7).getTime());
                    }
                    return time;
                } catch (ParseException e7) {
                    StringBuilder t7 = C0552a.t("Failed parsing '", A7, "' as SQL Time; at path ");
                    t7.append(aVar.o(true));
                    throw new RuntimeException(t7.toString(), e7);
                }
            default:
                Date date = (Date) ((p) this.f7974b).a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
        }
    }

    public final void b(C0567b bVar, Object obj) {
        String format;
        String format2;
        switch (this.f7973a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    bVar.p();
                    return;
                }
                synchronized (this) {
                    format = ((SimpleDateFormat) this.f7974b).format(date);
                }
                bVar.v(format);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    bVar.p();
                    return;
                }
                synchronized (this) {
                    format2 = ((SimpleDateFormat) this.f7974b).format(time);
                }
                bVar.v(format2);
                return;
            default:
                ((p) this.f7974b).b(bVar, (Timestamp) obj);
                return;
        }
    }

    public C0542a(p pVar) {
        this.f7973a = 2;
        this.f7974b = pVar;
    }
}
