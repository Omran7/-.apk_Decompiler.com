package X;

import android.util.Log;
import h0.C0552a;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class b extends InputStream implements DataInput {

    /* renamed from: a  reason: collision with root package name */
    public final DataInputStream f4125a;

    /* renamed from: b  reason: collision with root package name */
    public int f4126b;

    /* renamed from: c  reason: collision with root package name */
    public ByteOrder f4127c;
    public byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4128e;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f4128e = bArr.length;
    }

    public final int available() {
        return this.f4125a.available();
    }

    public final void c(int i2) {
        int i5 = 0;
        while (i5 < i2) {
            DataInputStream dataInputStream = this.f4125a;
            int i6 = i2 - i5;
            int skip = (int) dataInputStream.skip((long) i6);
            if (skip <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                skip = dataInputStream.read(this.d, 0, Math.min(8192, i6));
                if (skip == -1) {
                    throw new EOFException(C0552a.k(i2, "Reached EOF while skipping ", " bytes."));
                }
            }
            i5 += skip;
        }
        this.f4126b += i5;
    }

    public final void mark(int i2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public final int read() {
        this.f4126b++;
        return this.f4125a.read();
    }

    public final boolean readBoolean() {
        this.f4126b++;
        return this.f4125a.readBoolean();
    }

    public final byte readByte() {
        this.f4126b++;
        int read = this.f4125a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f4126b += 2;
        return this.f4125a.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr, int i2, int i5) {
        this.f4126b += i5;
        this.f4125a.readFully(bArr, i2, i5);
    }

    public final int readInt() {
        this.f4126b += 4;
        DataInputStream dataInputStream = this.f4125a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f4127c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f4127c);
        }
        throw new EOFException();
    }

    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final long readLong() {
        this.f4126b += 8;
        DataInputStream dataInputStream = this.f4125a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f4127c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
            }
            int i2 = read;
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i2) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
            }
            throw new IOException("Invalid byte order: " + this.f4127c);
        }
        throw new EOFException();
    }

    public final short readShort() {
        this.f4126b += 2;
        DataInputStream dataInputStream = this.f4125a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f4127c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f4127c);
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.f4126b += 2;
        return this.f4125a.readUTF();
    }

    public final int readUnsignedByte() {
        this.f4126b++;
        return this.f4125a.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        this.f4126b += 2;
        DataInputStream dataInputStream = this.f4125a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f4127c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f4127c);
        }
        throw new EOFException();
    }

    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int skipBytes(int i2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public final int read(byte[] bArr, int i2, int i5) {
        int read = this.f4125a.read(bArr, i2, i5);
        this.f4126b += read;
        return read;
    }

    public final void readFully(byte[] bArr) {
        this.f4126b += bArr.length;
        this.f4125a.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f4125a = dataInputStream;
        dataInputStream.mark(0);
        this.f4126b = 0;
        this.f4127c = byteOrder;
        this.f4128e = inputStream instanceof b ? ((b) inputStream).f4128e : -1;
    }
}
