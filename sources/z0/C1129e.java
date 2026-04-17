package z0;

import C0.g;
import I0.y;
import U0.c;
import android.support.v4.media.session.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import h0.C0552a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import n3.C0866g;
import v3.i;
import v3.j;
import v3.k;
import v3.p;
import v3.s;
import v3.w;

/* renamed from: z0.e  reason: case insensitive filesystem */
public abstract class C1129e {
    public static int a(ArrayList arrayList, InputStream inputStream, g gVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                int b6 = ((C1128d) arrayList.get(i2)).b(inputStream, gVar);
                if (b6 != -1) {
                    return b6;
                }
                i2++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser$ImageType b(ArrayList arrayList, InputStream inputStream, g gVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, gVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                ImageHeaderParser$ImageType d = ((C1128d) arrayList.get(i2)).d(inputStream);
                inputStream.reset();
                if (d != ImageHeaderParser$ImageType.UNKNOWN) {
                    return d;
                }
                i2++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser$ImageType c(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                ImageHeaderParser$ImageType a6 = ((C1128d) arrayList.get(i2)).a(byteBuffer);
                AtomicReference atomicReference = c.f3676a;
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
                if (a6 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a6;
                }
                i2++;
            } catch (Throwable th) {
                AtomicReference atomicReference2 = c.f3676a;
                ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(0);
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean d(s sVar) {
        if (!sVar.c().isEmpty() || (!sVar.isEmpty() && !(sVar instanceof j) && !(sVar instanceof w) && !(sVar instanceof i))) {
            return false;
        }
        return true;
    }

    public static s e(C0866g gVar, Object obj) {
        String str;
        k kVar = k.f12295e;
        s a6 = a.a(obj, kVar);
        if (a6 instanceof p) {
            a6 = new j(Double.valueOf((double) ((p) a6).f12302c), kVar);
        }
        if (d(a6)) {
            return a6;
        }
        StringBuilder sb = new StringBuilder();
        if (gVar != null) {
            str = "Path '" + gVar + "'";
        } else {
            str = "Node";
        }
        throw new RuntimeException(C0552a.r(sb, str, " contains invalid priority: Must be a string, double, ServerValue, or null"));
    }
}
