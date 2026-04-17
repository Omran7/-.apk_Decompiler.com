package k0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f9451a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9452b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9453c;
    public final long d;

    public g(int i2, int i5, long j6, long j7) {
        this.f9451a = i2;
        this.f9452b = i5;
        this.f9453c = j6;
        this.d = j7;
    }

    public static g a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f9451a);
            dataOutputStream.writeInt(this.f9452b);
            dataOutputStream.writeLong(this.f9453c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f9452b == gVar.f9452b && this.f9453c == gVar.f9453c && this.f9451a == gVar.f9451a && this.d == gVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f9452b), Long.valueOf(this.f9453c), Integer.valueOf(this.f9451a), Long.valueOf(this.d)});
    }
}
