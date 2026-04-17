package com.bumptech.glide.load.data;

import C0.g;
import I0.y;
import J0.a;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;

public final class h implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f5812c = new a(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5813a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5814b;

    public h() {
        this.f5813a = 0;
        this.f5814b = new HashMap();
    }

    public void c() {
        switch (this.f5813a) {
            case 1:
            case 2:
                return;
            default:
                ((y) this.f5814b).d();
                return;
        }
    }

    public Object d() {
        switch (this.f5813a) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f5814b).rewind();
            case 2:
                return this.f5814b;
            default:
                y yVar = (y) this.f5814b;
                yVar.reset();
                return yVar;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f5814b).rewind();
    }

    public h(InputStream inputStream, g gVar) {
        this.f5813a = 3;
        y yVar = new y(inputStream, gVar);
        this.f5814b = yVar;
        yVar.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5813a = 1;
        this.f5814b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.f5813a = 2;
        this.f5814b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }
}
