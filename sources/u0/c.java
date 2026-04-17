package U0;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f3676a = new AtomicReference();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.nio.channels.spi.AbstractInterruptibleChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|11|12|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048 A[SYNTHETIC, Splitter:B:24:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d A[SYNTHETIC, Splitter:B:28:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.MappedByteBuffer a(java.io.File r8) {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0033 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x003e
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0036
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0031 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0031 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0031 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0031 }
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r7.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r8
        L_0x0031:
            r8 = move-exception
            goto L_0x0046
        L_0x0033:
            r8 = move-exception
            r7 = r0
            goto L_0x0046
        L_0x0036:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r8     // Catch:{ all -> 0x0033 }
        L_0x003e:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r8     // Catch:{ all -> 0x0033 }
        L_0x0046:
            if (r0 == 0) goto L_0x004b
            r0.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            if (r7 == 0) goto L_0x0050
            r7.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.c.a(java.io.File):java.nio.MappedByteBuffer");
    }

    public static ByteBuffer b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference atomicReference = f3676a;
        byte[] bArr = (byte[]) atomicReference.getAndSet((Object) null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                atomicReference.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.nio.ByteBuffer r3, java.io.File r4) {
        /*
            c(r3)
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0025 }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x0023 }
            r0.write(r3)     // Catch:{ all -> 0x0023 }
            r3 = 0
            r0.force(r3)     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ all -> 0x0023 }
            r0.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r1.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            return
        L_0x0023:
            r3 = move-exception
            goto L_0x0027
        L_0x0025:
            r3 = move-exception
            r1 = r0
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.c.d(java.nio.ByteBuffer, java.io.File):void");
    }
}
