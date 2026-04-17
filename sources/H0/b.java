package H0;

import I0.o;
import I0.q;
import I0.w;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import z0.C1125a;
import z0.h;
import z0.i;
import z0.j;

public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final w f987a = w.a();

    /* renamed from: b  reason: collision with root package name */
    public final int f988b;

    /* renamed from: c  reason: collision with root package name */
    public final int f989c;
    public final C1125a d;

    /* renamed from: e  reason: collision with root package name */
    public final o f990e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f991f;
    public final j g;

    public b(int i2, int i5, i iVar) {
        boolean z3;
        this.f988b = i2;
        this.f989c = i5;
        this.d = (C1125a) iVar.c(q.f1126f);
        this.f990e = (o) iVar.c(o.g);
        h hVar = q.f1127i;
        if (iVar.c(hVar) == null || !((Boolean) iVar.c(hVar)).booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f991f = z3;
        this.g = (j) iVar.c(q.g);
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.Object, H0.a] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        if (this.f987a.c(this.f988b, this.f989c, this.f991f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == C1125a.f12786b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new Object());
        Size o6 = imageInfo.getSize();
        int i2 = this.f988b;
        if (i2 == Integer.MIN_VALUE) {
            i2 = o6.getWidth();
        }
        int i5 = this.f989c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = o6.getHeight();
        }
        float b6 = this.f990e.b(o6.getWidth(), o6.getHeight(), i2, i5);
        int round = Math.round(((float) o6.getWidth()) * b6);
        int round2 = Math.round(((float) o6.getHeight()) * b6);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + o6.getWidth() + "x" + o6.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b6);
        }
        imageDecoder.setTargetSize(round, round2);
        j jVar = this.g;
        if (jVar != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                if (jVar != j.f12795a || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) {
                    named = ColorSpace.Named.SRGB;
                } else {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i6 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
