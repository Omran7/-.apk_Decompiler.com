package i4;

import com.mtma.criminal.city.app.MyApplication;
import o3.d;

/* renamed from: i4.a  reason: case insensitive filesystem */
public abstract class C0596a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8295a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f8296b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f8297c;

    static {
        String f6 = d.f(MyApplication.f7090a.getApplicationContext().getFilesDir().getAbsolutePath(), "/thumbnail");
        f8295a = d.f(f6, "/profile_pic");
        f8296b = d.f(f6, "/private_domain_pic");
        f8297c = d.f(f6, "/gang_pic");
    }
}
