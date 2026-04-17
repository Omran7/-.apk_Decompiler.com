package androidx.core.graphics.drawable;

import D.c;
import D.e;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f4880k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f4881a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4882b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4883c;
    public Parcelable d;

    /* renamed from: e  reason: collision with root package name */
    public int f4884e;

    /* renamed from: f  reason: collision with root package name */
    public int f4885f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    /* renamed from: i  reason: collision with root package name */
    public String f4886i;

    /* renamed from: j  reason: collision with root package name */
    public String f4887j;

    public IconCompat() {
        this.f4881a = -1;
        this.f4883c = null;
        this.d = null;
        this.f4884e = 0;
        this.f4885f = 0;
        this.g = null;
        this.h = f4880k;
        this.f4886i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z3) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f6 = (float) min;
        float f7 = 0.5f * f6;
        float f8 = 0.9166667f * f7;
        if (z3) {
            float f9 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f9, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.setShadowLayer(f9, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f7, f7, f8, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(int i2) {
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f4884e = i2;
            iconCompat.f4882b = "";
            iconCompat.f4887j = "";
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i2 = this.f4881a;
        if (i2 == -1) {
            int i5 = Build.VERSION.SDK_INT;
            Object obj = this.f4882b;
            if (i5 >= 28) {
                return e.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            } catch (InvocationTargetException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            }
        } else if (i2 == 2) {
            return this.f4884e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public final int d() {
        int i2 = this.f4881a;
        if (i2 != -1) {
            return i2;
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = this.f4882b;
        if (i5 >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", (Class[]) null).invoke(obj, (Object[]) null)).intValue();
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e6);
            return -1;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e8);
            return -1;
        }
    }

    public final Uri e() {
        int i2 = this.f4881a;
        if (i2 == -1) {
            return c.a(this.f4882b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f4882b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f4881a == -1) {
            return String.valueOf(this.f4882b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4881a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case zzaky.zzf.zzf /*6*/:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f4881a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f4882b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f4882b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4887j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(c())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4884e);
                if (this.f4885f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4885f);
                    break;
                }
                break;
            case 4:
            case zzaky.zzf.zzf /*6*/:
                sb.append(" uri=");
                sb.append(this.f4882b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != f4880k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i2) {
        this.f4883c = null;
        this.d = null;
        this.f4884e = 0;
        this.f4885f = 0;
        this.g = null;
        this.h = f4880k;
        this.f4886i = null;
        this.f4881a = i2;
    }
}
