package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import h0.C0552a;
import java.util.Locale;

/* renamed from: K.d  reason: case insensitive filesystem */
public final class C0064d implements C0063c, C0065e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1376a = 0;

    /* renamed from: b  reason: collision with root package name */
    public ClipData f1377b;

    /* renamed from: c  reason: collision with root package name */
    public int f1378c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f1379e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f1380f;

    public /* synthetic */ C0064d() {
    }

    public C0066f a() {
        return new C0066f(new C0064d(this));
    }

    public ClipData b() {
        return this.f1377b;
    }

    public void c(Bundle bundle) {
        this.f1380f = bundle;
    }

    public void d(Uri uri) {
        this.f1379e = uri;
    }

    public void f(int i2) {
        this.d = i2;
    }

    public int n() {
        return this.d;
    }

    public ContentInfo p() {
        return null;
    }

    public int r() {
        return this.f1378c;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        switch (this.f1376a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f1377b.getDescription());
                sb.append(", source=");
                int i2 = this.f1378c;
                if (i2 == 0) {
                    str = "SOURCE_APP";
                } else if (i2 == 1) {
                    str = "SOURCE_CLIPBOARD";
                } else if (i2 == 2) {
                    str = "SOURCE_INPUT_METHOD";
                } else if (i2 == 3) {
                    str = "SOURCE_DRAG_AND_DROP";
                } else if (i2 == 4) {
                    str = "SOURCE_AUTOFILL";
                } else if (i2 != 5) {
                    str = String.valueOf(i2);
                } else {
                    str = "SOURCE_PROCESS_TEXT";
                }
                sb.append(str);
                sb.append(", flags=");
                int i5 = this.d;
                if ((i5 & 1) != 0) {
                    str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    str2 = String.valueOf(i5);
                }
                sb.append(str2);
                String str4 = "";
                Uri uri = this.f1379e;
                if (uri == null) {
                    str3 = str4;
                } else {
                    str3 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str3);
                if (this.f1380f != null) {
                    str4 = ", hasExtras";
                }
                return C0552a.r(sb, str4, "}");
            default:
                return super.toString();
        }
    }

    public C0064d(C0064d dVar) {
        ClipData clipData = dVar.f1377b;
        clipData.getClass();
        this.f1377b = clipData;
        int i2 = dVar.f1378c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i2 <= 5) {
            this.f1378c = i2;
            int i5 = dVar.d;
            if ((i5 & 1) == i5) {
                this.d = i5;
                this.f1379e = dVar.f1379e;
                this.f1380f = dVar.f1380f;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}
