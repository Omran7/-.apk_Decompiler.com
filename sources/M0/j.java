package M0;

import B0.D;
import C0.g;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import z0.C1129e;
import z0.i;
import z0.k;

public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1816a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1817b;

    /* renamed from: c  reason: collision with root package name */
    public final g f1818c;

    public j(ArrayList arrayList, a aVar, g gVar) {
        this.f1816a = arrayList;
        this.f1817b = aVar;
        this.f1818c = gVar;
    }

    public final D a(Object obj, int i2, int i5, i iVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e6) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e6);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f1817b.a(ByteBuffer.wrap(bArr), i2, i5, iVar);
    }

    public final boolean b(Object obj, i iVar) {
        InputStream inputStream = (InputStream) obj;
        if (((Boolean) iVar.c(i.f1815b)).booleanValue() || C1129e.b(this.f1816a, inputStream, this.f1818c) != ImageHeaderParser$ImageType.GIF) {
            return false;
        }
        return true;
    }
}
