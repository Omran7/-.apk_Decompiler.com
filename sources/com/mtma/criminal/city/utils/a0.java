package com.mtma.criminal.city.utils;

import Q0.f;
import R0.a;
import U0.o;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

public final class a0 extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7389b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f7390c;

    public /* synthetic */ a0(File file, int i2) {
        this.f7389b = i2;
        this.f7390c = file;
    }

    public final void e(f fVar) {
        if (o.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            fVar.n(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648, either provide dimensions in the constructor or call override()");
    }

    public final void i(Object obj) {
        switch (this.f7389b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f7390c);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return;
                } catch (Exception e6) {
                    e6.printStackTrace();
                    return;
                }
            case 1:
                Bitmap bitmap2 = (Bitmap) obj;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.f7390c);
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    return;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
            case 2:
                Bitmap bitmap3 = (Bitmap) obj;
                try {
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f7390c);
                    bitmap3.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream3);
                    fileOutputStream3.flush();
                    fileOutputStream3.close();
                    return;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return;
                }
            default:
                Bitmap bitmap4 = (Bitmap) obj;
                try {
                    FileOutputStream fileOutputStream4 = new FileOutputStream(this.f7390c);
                    bitmap4.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream4);
                    fileOutputStream4.flush();
                    fileOutputStream4.close();
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
        }
    }

    public final void a(f fVar) {
    }
}
