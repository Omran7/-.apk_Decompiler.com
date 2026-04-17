package F0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

public final class n implements e {
    public static final String[] d = {"_data"};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f697a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f698b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f699c;

    public /* synthetic */ n(Object obj, Object obj2, int i2) {
        this.f697a = i2;
        this.f698b = obj;
        this.f699c = obj2;
    }

    public final Class b() {
        switch (this.f697a) {
            case 0:
                return File.class;
            default:
                return ((C) this.f699c).b();
        }
    }

    public final void c() {
        int i2 = this.f697a;
    }

    public final void cancel() {
        int i2 = this.f697a;
    }

    public final int e() {
        switch (this.f697a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public final void f(f fVar, d dVar) {
        Object obj;
        switch (this.f697a) {
            case 0:
                Cursor query = ((Context) this.f698b).getContentResolver().query((Uri) this.f699c, d, (String) null, (String[]) null, (String) null);
                String str = null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_data"));
                        }
                    } finally {
                        query.close();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    dVar.a(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f699c)));
                    return;
                }
                dVar.d(new File(str));
                return;
            default:
                byte[] bArr = (byte[]) this.f698b;
                switch (((C) this.f699c).f666a) {
                    case 1:
                        obj = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        obj = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.d(obj);
                return;
        }
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
