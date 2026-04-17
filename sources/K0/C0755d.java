package k0;

import android.content.pm.PackageInfo;
import androidx.emoji2.text.v;
import com.google.android.gms.internal.measurement.a;
import h0.C0552a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: k0.d  reason: case insensitive filesystem */
public abstract class C0755d {

    /* renamed from: a  reason: collision with root package name */
    public static final v f9442a = new v(19);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9443b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f9444c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f9445e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f9446f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f9447i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f9448j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static byte[] b(C0753b[] bVarArr, byte[] bArr) {
        int i2 = 0;
        int i5 = 0;
        for (C0753b bVar : bVarArr) {
            i5 += ((((bVar.g * 2) + 7) & -8) / 8) + (bVar.f9439e * 2) + d(bVar.f9436a, bVar.f9437b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f9440f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        if (Arrays.equals(bArr, f9446f)) {
            int length = bVarArr.length;
            while (i2 < length) {
                C0753b bVar2 = bVarArr[i2];
                q(byteArrayOutputStream, bVar2, d(bVar2.f9436a, bVar2.f9437b, bArr));
                p(byteArrayOutputStream, bVar2);
                i2++;
            }
        } else {
            for (C0753b bVar3 : bVarArr) {
                q(byteArrayOutputStream, bVar3, d(bVar3.f9436a, bVar3.f9437b, bArr));
            }
            int length2 = bVarArr.length;
            while (i2 < length2) {
                p(byteArrayOutputStream, bVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i5) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i5);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z3 = true;
            for (File c3 : listFiles) {
                if (!c(c3) || !z3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            return z3;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        String str4 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            str3 = str4;
        } else {
            str3 = ":";
        }
        if (str.length() <= 0) {
            if (str4.equals(str3)) {
                return str2.replace(":", str4);
            }
            if (":".equals(str3)) {
                return str2.replace(str4, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str4) || str2.contains(":")) {
                if (str4.equals(str3)) {
                    return str2.replace(":", str4);
                }
                if (":".equals(str3)) {
                    return str2.replace(str4, ":");
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str4 = ":";
                }
                return C0552a.r(sb, str4, str2);
            }
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i5 = 0;
        while (i5 < i2) {
            int read = inputStream.read(bArr, i5, i2 - i5);
            if (read >= 0) {
                i5 += read;
            } else {
                throw new IllegalStateException(a.f(i2, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 += (int) m(byteArrayInputStream, 2);
            iArr[i6] = i5;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i2, int i5) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i5];
            byte[] bArr2 = new byte[2048];
            int i6 = 0;
            int i7 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i6 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i7 += inflater.inflate(bArr, i7, i5 - i7);
                    i6 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
            }
            if (i6 != i2) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i6);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e6) {
            throw new IllegalStateException(e6.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static C0753b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0753b[] bVarArr) {
        byte[] bArr3 = f9447i;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(d, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int m6 = (int) m(fileInputStream, 1);
                byte[] h6 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h6);
                    try {
                        C0753b[] j6 = j(byteArrayInputStream, m6, bVarArr);
                        byteArrayInputStream.close();
                        return j6;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, f9448j)) {
            int m7 = (int) m(fileInputStream, 2);
            byte[] h7 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h7);
                try {
                    C0753b[] k6 = k(byteArrayInputStream2, bArr2, m7, bVarArr);
                    byteArrayInputStream2.close();
                    return k6;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static C0753b[] j(ByteArrayInputStream byteArrayInputStream, int i2, C0753b[] bVarArr) {
        int i5 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new C0753b[0];
        }
        if (i2 == bVarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i6 = 0; i6 < i2; i6++) {
                iArr[i6] = (int) m(byteArrayInputStream, 2);
                strArr[i6] = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            while (i5 < i2) {
                C0753b bVar = bVarArr[i5];
                if (bVar.f9437b.equals(strArr[i5])) {
                    int i7 = iArr[i5];
                    bVar.f9439e = i7;
                    bVar.h = g(byteArrayInputStream, i7);
                    i5++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C0753b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0753b[] bVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new C0753b[0];
        }
        if (i2 == bVarArr.length) {
            int i5 = 0;
            while (i5 < i2) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m6 = m(byteArrayInputStream, 4);
                int m7 = (int) m(byteArrayInputStream, 2);
                C0753b bVar = null;
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i6 = 0;
                    while (true) {
                        if (i6 >= bVarArr.length) {
                            break;
                        } else if (bVarArr[i6].f9437b.equals(str)) {
                            bVar = bVarArr[i6];
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                if (bVar != null) {
                    bVar.d = m6;
                    int[] g5 = g(byteArrayInputStream, m7);
                    if (Arrays.equals(bArr, h)) {
                        bVar.f9439e = m7;
                        bVar.h = g5;
                    }
                    i5++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static C0753b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f9445e)) {
            int m6 = (int) m(fileInputStream, 1);
            byte[] h6 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h6);
                try {
                    C0753b[] n2 = n(byteArrayInputStream, str, m6);
                    byteArrayInputStream.close();
                    return n2;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static long m(InputStream inputStream, int i2) {
        byte[] f6 = f(inputStream, i2);
        long j6 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j6 += ((long) (f6[i5] & 255)) << (i5 * 8);
        }
        return j6;
    }

    public static C0753b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        int i5;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i6 = i2;
        if (byteArrayInputStream.available() == 0) {
            return new C0753b[0];
        }
        C0753b[] bVarArr = new C0753b[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int m6 = (int) m(byteArrayInputStream2, 2);
            long m7 = m(byteArrayInputStream2, 4);
            String str2 = str;
            bVarArr[i7] = new C0753b(str2, new String(f(byteArrayInputStream2, (int) m(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream2, 4), m6, (int) m7, (int) m(byteArrayInputStream2, 4), new int[m6], new TreeMap());
        }
        int i8 = 0;
        while (i8 < i6) {
            C0753b bVar = bVarArr[i8];
            int available = byteArrayInputStream.available() - bVar.f9440f;
            int i9 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f9441i;
                if (available2 <= available) {
                    break;
                }
                i9 += (int) m(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                for (int m8 = (int) m(byteArrayInputStream2, 2); m8 > 0; m8--) {
                    m(byteArrayInputStream2, 2);
                    int m9 = (int) m(byteArrayInputStream2, 1);
                    if (!(m9 == 6 || m9 == 7)) {
                        while (m9 > 0) {
                            m(byteArrayInputStream2, 1);
                            for (int m10 = (int) m(byteArrayInputStream2, 1); m10 > 0; m10--) {
                                m(byteArrayInputStream2, 2);
                            }
                            m9--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bVar.h = g(byteArrayInputStream2, bVar.f9439e);
                int i10 = bVar.g;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream2, (((i10 * 2) + 7) & -8) / 8));
                for (int i11 = 0; i11 < i10; i11++) {
                    if (valueOf.get(i11)) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    if (valueOf.get(i11 + i10)) {
                        i5 |= 4;
                    }
                    if (i5 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i11));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i11), Integer.valueOf(i5 | num.intValue()));
                    }
                }
                i8++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0753b[] bVarArr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j6;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        C0753b[] bVarArr2 = bVarArr;
        byte[] bArr3 = d;
        int i2 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                v(byteArrayOutputStream5, bVarArr2.length);
                int i5 = 2;
                int i6 = 2;
                for (C0753b bVar : bVarArr2) {
                    u(byteArrayOutputStream5, bVar.f9438c, 4);
                    u(byteArrayOutputStream5, bVar.d, 4);
                    u(byteArrayOutputStream5, (long) bVar.g, 4);
                    String d6 = d(bVar.f9436a, bVar.f9437b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d6.getBytes(charset).length;
                    v(byteArrayOutputStream5, length2);
                    i6 = i6 + 14 + length2;
                    byteArrayOutputStream5.write(d6.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i6 == byteArray.length) {
                    i iVar = new i(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(iVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < bVarArr2.length) {
                        try {
                            C0753b bVar2 = bVarArr2[i7];
                            v(byteArrayOutputStream6, i7);
                            v(byteArrayOutputStream6, bVar2.f9439e);
                            i8 = i8 + 4 + (bVar2.f9439e * 2);
                            int[] iArr = bVar2.h;
                            int length3 = iArr.length;
                            int i9 = i2;
                            while (i2 < length3) {
                                int i10 = iArr[i2];
                                v(byteArrayOutputStream6, i10 - i9);
                                i2++;
                                i9 = i10;
                            }
                            i7++;
                            i2 = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i8 == byteArray2.length) {
                        i iVar2 = new i(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(iVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < bVarArr2.length) {
                            try {
                                C0753b bVar3 = bVarArr2[i11];
                                int i13 = 0;
                                for (Map.Entry value : bVar3.f9441i.entrySet()) {
                                    i13 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream2, i13, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                s(byteArrayOutputStream3, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                v(byteArrayOutputStream7, i11);
                                int length4 = byteArray3.length + i5 + byteArray4.length;
                                int i14 = i12 + 6;
                                ArrayList arrayList4 = arrayList3;
                                u(byteArrayOutputStream7, (long) length4, 4);
                                v(byteArrayOutputStream7, i13);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i12 = i14 + length4;
                                i11++;
                                arrayList3 = arrayList4;
                                i5 = 2;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i12 == byteArray5.length) {
                            i iVar3 = new i(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(iVar3);
                            long j7 = (long) 4;
                            long size = j7 + j7 + 4 + ((long) (arrayList2.size() * 16));
                            u(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i15 = 0;
                            while (i15 < arrayList2.size()) {
                                i iVar4 = (i) arrayList2.get(i15);
                                int i16 = iVar4.f9457a;
                                if (i16 == 1) {
                                    j6 = 0;
                                } else if (i16 == 2) {
                                    j6 = 1;
                                } else if (i16 == 3) {
                                    j6 = 2;
                                } else if (i16 == 4) {
                                    j6 = 3;
                                } else if (i16 == 5) {
                                    j6 = 4;
                                } else {
                                    throw null;
                                }
                                u(byteArrayOutputStream4, j6, 4);
                                u(byteArrayOutputStream4, size, 4);
                                byte[] bArr4 = iVar4.f9458b;
                                if (iVar4.f9459c) {
                                    long length5 = (long) bArr4.length;
                                    byte[] a6 = a(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(a6);
                                    u(byteArrayOutputStream4, (long) a6.length, 4);
                                    u(byteArrayOutputStream4, length5, 4);
                                    length = a6.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    u(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    u(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i15++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i17));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = f9445e;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] b6 = b(bVarArr2, bArr5);
                u(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                u(byteArrayOutputStream4, (long) b6.length, 4);
                byte[] a7 = a(b6);
                u(byteArrayOutputStream4, (long) a7.length, 4);
                byteArrayOutputStream4.write(a7);
                return true;
            }
            byte[] bArr6 = g;
            if (Arrays.equals(bArr2, bArr6)) {
                u(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                for (C0753b bVar4 : bVarArr2) {
                    String d7 = d(bVar4.f9436a, bVar4.f9437b, bArr6);
                    Charset charset2 = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream4, d7.getBytes(charset2).length);
                    v(byteArrayOutputStream4, bVar4.h.length);
                    u(byteArrayOutputStream4, (long) (bVar4.f9441i.size() * 4), 4);
                    u(byteArrayOutputStream4, bVar4.f9438c, 4);
                    byteArrayOutputStream4.write(d7.getBytes(charset2));
                    for (Integer intValue : bVar4.f9441i.keySet()) {
                        v(byteArrayOutputStream4, intValue.intValue());
                        v(byteArrayOutputStream4, 0);
                    }
                    for (int v6 : bVar4.h) {
                        v(byteArrayOutputStream4, v6);
                    }
                }
                return true;
            }
            byte[] bArr7 = f9446f;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] b7 = b(bVarArr2, bArr7);
                u(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                u(byteArrayOutputStream4, (long) b7.length, 4);
                byte[] a8 = a(b7);
                u(byteArrayOutputStream4, (long) a8.length, 4);
                byteArrayOutputStream4.write(a8);
                return true;
            }
            byte[] bArr8 = h;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            v(byteArrayOutputStream4, bVarArr2.length);
            for (C0753b bVar5 : bVarArr2) {
                String d8 = d(bVar5.f9436a, bVar5.f9437b, bArr8);
                Charset charset3 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream4, d8.getBytes(charset3).length);
                TreeMap treeMap = bVar5.f9441i;
                v(byteArrayOutputStream4, treeMap.size());
                v(byteArrayOutputStream4, bVar5.h.length);
                u(byteArrayOutputStream4, bVar5.f9438c, 4);
                byteArrayOutputStream4.write(d8.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    v(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int v7 : bVar5.h) {
                    v(byteArrayOutputStream4, v7);
                }
            }
            return true;
        }
        throw th2;
        throw th;
        throw th4;
        throw th5;
        throw th3;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, C0753b bVar) {
        s(byteArrayOutputStream, bVar);
        int[] iArr = bVar.h;
        int length = iArr.length;
        int i2 = 0;
        int i5 = 0;
        while (i2 < length) {
            int i6 = iArr[i2];
            v(byteArrayOutputStream, i6 - i5);
            i2++;
            i5 = i6;
        }
        int i7 = bVar.g;
        byte[] bArr = new byte[((((i7 * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : bVar.f9441i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i8 = intValue / 8;
                bArr[i8] = (byte) (bArr[i8] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i9 = intValue + i7;
                int i10 = i9 / 8;
                bArr[i10] = (byte) ((1 << (i9 % 8)) | bArr[i10]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, C0753b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, bVar.f9439e);
        u(byteArrayOutputStream, (long) bVar.f9440f, 4);
        u(byteArrayOutputStream, bVar.f9438c, 4);
        u(byteArrayOutputStream, (long) bVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i2, C0753b bVar) {
        int bitCount = Integer.bitCount(i2 & -2);
        int i5 = bVar.g;
        byte[] bArr = new byte[((((bitCount * i5) + 7) & -8) / 8)];
        for (Map.Entry entry : bVar.f9441i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i6 = 0;
            for (int i7 = 1; i7 <= 4; i7 <<= 1) {
                if (!(i7 == 1 || (i7 & i2) == 0)) {
                    if ((i7 & intValue2) == i7) {
                        int i8 = (i6 * i5) + intValue;
                        int i9 = i8 / 8;
                        bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
                    }
                    i6++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, C0753b bVar) {
        int i2 = 0;
        for (Map.Entry entry : bVar.f9441i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i2);
                v(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01cb, code lost:
        if (r7 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0280, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0283, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0286, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x029f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r6.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x02ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x02bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:198:0x0262, B:227:0x029b] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:200:0x0265, B:237:0x02aa] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:202:0x0268, B:246:0x02b7] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0180 A[SYNTHETIC, Splitter:B:108:0x0180] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01b5 A[Catch:{ all -> 0x01a2, all -> 0x01af, FileNotFoundException -> 0x01a0, IOException -> 0x019d, IllegalStateException -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x029b A[SYNTHETIC, Splitter:B:227:0x029b] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x02aa A[SYNTHETIC, Splitter:B:237:0x02aa] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x02f8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b A[SYNTHETIC, Splitter:B:58:0x010b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, k0.C0754c r20, boolean r21) {
        /*
            r1 = r18
            r8 = r20
            android.content.Context r0 = r18.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r18.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x0301 }
            java.io.File r13 = r18.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r14 = 0
            r15 = 1
            if (r21 != 0) goto L_0x008b
            java.io.File r0 = new java.io.File
            java.lang.String r4 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r4)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0041
        L_0x003f:
            r0 = r11
            goto L_0x006e
        L_0x0041:
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x003f }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x003f }
            r4.<init>(r5)     // Catch:{ IOException -> 0x003f }
            long r16 = r4.readLong()     // Catch:{ all -> 0x0062 }
            r4.close()     // Catch:{ IOException -> 0x003f }
            long r4 = r12.lastUpdateTime
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r0 = r15
            goto L_0x005b
        L_0x005a:
            r0 = r11
        L_0x005b:
            if (r0 == 0) goto L_0x006e
            r4 = 2
            r8.d(r4, r14)
            goto L_0x006e
        L_0x0062:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006d
        L_0x0068:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x003f }
        L_0x006d:
            throw r5     // Catch:{ IOException -> 0x003f }
        L_0x006e:
            if (r0 != 0) goto L_0x0071
            goto L_0x008b
        L_0x0071:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r18.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            k0.h.c(r1, r11)
            goto L_0x0300
        L_0x008b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Installing profile for "
            r0.<init>(r4)
            java.lang.String r4 = r18.getPackageName()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            java.io.File r0 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r0.<init>(r3, r2)
            k0.a r7 = new k0.a
            java.lang.String r5 = "dexopt/baseline.prof"
            r2 = r7
            r3 = r9
            r4 = r19
            r11 = r5
            r5 = r20
            r10 = r7
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r2 = r10.f9433c
            if (r2 != 0) goto L_0x00cf
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r10.b(r2, r0)
        L_0x00cc:
            r8 = r15
            goto L_0x02f5
        L_0x00cf:
            boolean r3 = r0.exists()
            r4 = 4
            if (r3 == 0) goto L_0x00e0
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L_0x00ed
            r10.b(r4, r14)
            goto L_0x00cc
        L_0x00e0:
            boolean r0 = r0.createNewFile()     // Catch:{ IOException -> 0x00ea }
            if (r0 != 0) goto L_0x00ed
            r10.b(r4, r14)     // Catch:{ IOException -> 0x00ea }
            goto L_0x00cc
        L_0x00ea:
            r8 = r15
            goto L_0x02f2
        L_0x00ed:
            r10.f9435f = r15
            byte[] r3 = f9443b
            r5 = 6
            java.io.FileInputStream r0 = r10.a(r9, r11)     // Catch:{ FileNotFoundException -> 0x00ff, IOException -> 0x00f8 }
            r6 = r0
            goto L_0x0105
        L_0x00f8:
            r0 = move-exception
            r6 = r0
            r7 = 7
            r8.d(r7, r6)
            goto L_0x0104
        L_0x00ff:
            r0 = move-exception
            r6 = r0
            r8.d(r5, r6)
        L_0x0104:
            r6 = r14
        L_0x0105:
            java.lang.String r7 = "Invalid magic"
            r11 = 8
            if (r6 == 0) goto L_0x0164
            byte[] r0 = f(r6, r4)     // Catch:{ IOException -> 0x0132, IllegalStateException -> 0x0130 }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ IOException -> 0x0132, IllegalStateException -> 0x0130 }
            if (r0 == 0) goto L_0x0134
            byte[] r0 = f(r6, r4)     // Catch:{ IOException -> 0x0132, IllegalStateException -> 0x0130 }
            java.lang.String r5 = r10.f9434e     // Catch:{ IOException -> 0x0132, IllegalStateException -> 0x0130 }
            k0.b[] r5 = l(r6, r0, r5)     // Catch:{ IOException -> 0x0132, IllegalStateException -> 0x0130 }
            r6.close()     // Catch:{ IOException -> 0x0123 }
            goto L_0x0156
        L_0x0123:
            r0 = move-exception
            r6 = r0
            r15 = 7
            r8.d(r15, r6)
            goto L_0x0156
        L_0x012a:
            r1 = r0
            goto L_0x0159
        L_0x012c:
            r15 = 7
            goto L_0x014b
        L_0x012e:
            r0 = move-exception
            goto L_0x012a
        L_0x0130:
            r0 = move-exception
            goto L_0x013a
        L_0x0132:
            r0 = move-exception
            goto L_0x012c
        L_0x0134:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0132, IllegalStateException -> 0x0130 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0132, IllegalStateException -> 0x0130 }
            throw r0     // Catch:{ IOException -> 0x0132, IllegalStateException -> 0x0130 }
        L_0x013a:
            r8.d(r11, r0)     // Catch:{ all -> 0x0148 }
            r6.close()     // Catch:{ IOException -> 0x0141 }
            goto L_0x0155
        L_0x0141:
            r0 = move-exception
            r5 = r0
            r15 = 7
        L_0x0144:
            r8.d(r15, r5)
            goto L_0x0155
        L_0x0148:
            r0 = move-exception
            r15 = 7
            goto L_0x012a
        L_0x014b:
            r8.d(r15, r0)     // Catch:{ all -> 0x012e }
            r6.close()     // Catch:{ IOException -> 0x0152 }
            goto L_0x0155
        L_0x0152:
            r0 = move-exception
            r5 = r0
            goto L_0x0144
        L_0x0155:
            r5 = r14
        L_0x0156:
            r10.g = r5
            goto L_0x0164
        L_0x0159:
            r6.close()     // Catch:{ IOException -> 0x015d }
            goto L_0x0163
        L_0x015d:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.d(r3, r2)
        L_0x0163:
            throw r1
        L_0x0164:
            k0.b[] r0 = r10.g
            if (r0 == 0) goto L_0x01ce
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 31
            if (r5 < r6) goto L_0x016f
            goto L_0x0178
        L_0x016f:
            r6 = 24
            if (r5 == r6) goto L_0x0178
            r6 = 25
            if (r5 == r6) goto L_0x0178
            goto L_0x01ce
        L_0x0178:
            java.lang.String r5 = "dexopt/baseline.profm"
            java.io.FileInputStream r5 = r10.a(r9, r5)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x019d, IllegalStateException -> 0x019b }
            if (r5 == 0) goto L_0x01b5
            byte[] r6 = f9444c     // Catch:{ all -> 0x01a2 }
            byte[] r9 = f(r5, r4)     // Catch:{ all -> 0x01a2 }
            boolean r6 = java.util.Arrays.equals(r6, r9)     // Catch:{ all -> 0x01a2 }
            if (r6 == 0) goto L_0x01a5
            byte[] r4 = f(r5, r4)     // Catch:{ all -> 0x01a2 }
            k0.b[] r0 = i(r5, r4, r2, r0)     // Catch:{ all -> 0x01a2 }
            r10.g = r0     // Catch:{ all -> 0x01a2 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x019d, IllegalStateException -> 0x019b }
            r7 = r10
            goto L_0x01cb
        L_0x019b:
            r0 = move-exception
            goto L_0x01bb
        L_0x019d:
            r0 = move-exception
            r2 = 7
            goto L_0x01c1
        L_0x01a0:
            r0 = move-exception
            goto L_0x01c5
        L_0x01a2:
            r0 = move-exception
            r2 = r0
            goto L_0x01ab
        L_0x01a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01a2 }
            r0.<init>(r7)     // Catch:{ all -> 0x01a2 }
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x01ab:
            r5.close()     // Catch:{ all -> 0x01af }
            goto L_0x01b4
        L_0x01af:
            r0 = move-exception
            r4 = r0
            r2.addSuppressed(r4)     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x019d, IllegalStateException -> 0x019b }
        L_0x01b4:
            throw r2     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x019d, IllegalStateException -> 0x019b }
        L_0x01b5:
            if (r5 == 0) goto L_0x01ca
            r5.close()     // Catch:{ FileNotFoundException -> 0x01a0, IOException -> 0x019d, IllegalStateException -> 0x019b }
            goto L_0x01ca
        L_0x01bb:
            r10.g = r14
            r8.d(r11, r0)
            goto L_0x01ca
        L_0x01c1:
            r8.d(r2, r0)
            goto L_0x01ca
        L_0x01c5:
            r2 = 9
            r8.d(r2, r0)
        L_0x01ca:
            r7 = r14
        L_0x01cb:
            if (r7 == 0) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r7 = r10
        L_0x01cf:
            k0.c r2 = r7.f9432b
            k0.b[] r0 = r7.g
            java.lang.String r4 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0227
            byte[] r5 = r7.f9433c
            if (r5 != 0) goto L_0x01dc
            goto L_0x0227
        L_0x01dc:
            boolean r6 = r7.f9435f
            if (r6 == 0) goto L_0x0221
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01fd, IllegalStateException -> 0x01fb }
            r6.<init>()     // Catch:{ IOException -> 0x01fd, IllegalStateException -> 0x01fb }
            r6.write(r3)     // Catch:{ all -> 0x0200 }
            r6.write(r5)     // Catch:{ all -> 0x0200 }
            boolean r0 = o(r6, r5, r0)     // Catch:{ all -> 0x0200 }
            if (r0 != 0) goto L_0x0203
            r0 = 5
            r2.d(r0, r14)     // Catch:{ all -> 0x0200 }
            r7.g = r14     // Catch:{ all -> 0x0200 }
            r6.close()     // Catch:{ IOException -> 0x01fd, IllegalStateException -> 0x01fb }
            goto L_0x0227
        L_0x01fb:
            r0 = move-exception
            goto L_0x0217
        L_0x01fd:
            r0 = move-exception
            r3 = 7
            goto L_0x021b
        L_0x0200:
            r0 = move-exception
            r3 = r0
            goto L_0x020d
        L_0x0203:
            byte[] r0 = r6.toByteArray()     // Catch:{ all -> 0x0200 }
            r7.h = r0     // Catch:{ all -> 0x0200 }
            r6.close()     // Catch:{ IOException -> 0x01fd, IllegalStateException -> 0x01fb }
            goto L_0x021e
        L_0x020d:
            r6.close()     // Catch:{ all -> 0x0211 }
            goto L_0x0216
        L_0x0211:
            r0 = move-exception
            r5 = r0
            r3.addSuppressed(r5)     // Catch:{ IOException -> 0x01fd, IllegalStateException -> 0x01fb }
        L_0x0216:
            throw r3     // Catch:{ IOException -> 0x01fd, IllegalStateException -> 0x01fb }
        L_0x0217:
            r2.d(r11, r0)
            goto L_0x021e
        L_0x021b:
            r2.d(r3, r0)
        L_0x021e:
            r7.g = r14
            goto L_0x0227
        L_0x0221:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0227:
            byte[] r0 = r7.h
            if (r0 != 0) goto L_0x022f
            r0 = 0
            r8 = 1
            goto L_0x02e1
        L_0x022f:
            boolean r2 = r7.f9435f
            if (r2 == 0) goto L_0x02ec
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x02d1, IOException -> 0x02ce }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x02d1, IOException -> 0x02ce }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x02c1 }
            java.io.File r0 = r7.d     // Catch:{ all -> 0x02c1 }
            r3.<init>(r0)     // Catch:{ all -> 0x02c1 }
            java.nio.channels.FileChannel r4 = r3.getChannel()     // Catch:{ all -> 0x02b4 }
            java.nio.channels.FileLock r5 = r4.tryLock()     // Catch:{ all -> 0x02a5 }
            if (r5 == 0) goto L_0x028c
            boolean r0 = r5.isValid()     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x028c
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x028e }
        L_0x0253:
            int r6 = r2.read(r0)     // Catch:{ all -> 0x028e }
            if (r6 <= 0) goto L_0x025e
            r8 = 0
            r3.write(r0, r8, r6)     // Catch:{ all -> 0x028e }
            goto L_0x0253
        L_0x025e:
            r8 = 1
            r7.b(r8, r14)     // Catch:{ all -> 0x0289 }
            r5.close()     // Catch:{ all -> 0x0286 }
            r4.close()     // Catch:{ all -> 0x0283 }
            r3.close()     // Catch:{ all -> 0x0280 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x027c, IOException -> 0x0278 }
            r7.h = r14
            r7.g = r14
            r0 = r8
            goto L_0x02e1
        L_0x0275:
            r0 = move-exception
            goto L_0x02e7
        L_0x0278:
            r0 = move-exception
        L_0x0279:
            r2 = 7
            goto L_0x02d4
        L_0x027c:
            r0 = move-exception
        L_0x027d:
            r2 = 6
            goto L_0x02dc
        L_0x0280:
            r0 = move-exception
        L_0x0281:
            r3 = r0
            goto L_0x02c4
        L_0x0283:
            r0 = move-exception
        L_0x0284:
            r4 = r0
            goto L_0x02b7
        L_0x0286:
            r0 = move-exception
        L_0x0287:
            r5 = r0
            goto L_0x02a8
        L_0x0289:
            r0 = move-exception
        L_0x028a:
            r6 = r0
            goto L_0x0299
        L_0x028c:
            r8 = 1
            goto L_0x0291
        L_0x028e:
            r0 = move-exception
            r8 = 1
            goto L_0x028a
        L_0x0291:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0289 }
            java.lang.String r6 = "Unable to acquire a lock on the underlying file channel."
            r0.<init>(r6)     // Catch:{ all -> 0x0289 }
            throw r0     // Catch:{ all -> 0x0289 }
        L_0x0299:
            if (r5 == 0) goto L_0x02a4
            r5.close()     // Catch:{ all -> 0x029f }
            goto L_0x02a4
        L_0x029f:
            r0 = move-exception
            r5 = r0
            r6.addSuppressed(r5)     // Catch:{ all -> 0x0286 }
        L_0x02a4:
            throw r6     // Catch:{ all -> 0x0286 }
        L_0x02a5:
            r0 = move-exception
            r8 = 1
            goto L_0x0287
        L_0x02a8:
            if (r4 == 0) goto L_0x02b3
            r4.close()     // Catch:{ all -> 0x02ae }
            goto L_0x02b3
        L_0x02ae:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ all -> 0x0283 }
        L_0x02b3:
            throw r5     // Catch:{ all -> 0x0283 }
        L_0x02b4:
            r0 = move-exception
            r8 = 1
            goto L_0x0284
        L_0x02b7:
            r3.close()     // Catch:{ all -> 0x02bb }
            goto L_0x02c0
        L_0x02bb:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ all -> 0x0280 }
        L_0x02c0:
            throw r4     // Catch:{ all -> 0x0280 }
        L_0x02c1:
            r0 = move-exception
            r8 = 1
            goto L_0x0281
        L_0x02c4:
            r2.close()     // Catch:{ all -> 0x02c8 }
            goto L_0x02cd
        L_0x02c8:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x027c, IOException -> 0x0278 }
        L_0x02cd:
            throw r3     // Catch:{ FileNotFoundException -> 0x027c, IOException -> 0x0278 }
        L_0x02ce:
            r0 = move-exception
            r8 = 1
            goto L_0x0279
        L_0x02d1:
            r0 = move-exception
            r8 = 1
            goto L_0x027d
        L_0x02d4:
            r7.b(r2, r0)     // Catch:{ all -> 0x0275 }
        L_0x02d7:
            r7.h = r14
            r7.g = r14
            goto L_0x02e0
        L_0x02dc:
            r7.b(r2, r0)     // Catch:{ all -> 0x0275 }
            goto L_0x02d7
        L_0x02e0:
            r0 = 0
        L_0x02e1:
            if (r0 == 0) goto L_0x02f6
            e(r12, r13)
            goto L_0x02f6
        L_0x02e7:
            r7.h = r14
            r7.g = r14
            throw r0
        L_0x02ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x02f2:
            r10.b(r4, r14)
        L_0x02f5:
            r0 = 0
        L_0x02f6:
            if (r0 == 0) goto L_0x02fc
            if (r21 == 0) goto L_0x02fc
            r11 = r8
            goto L_0x02fd
        L_0x02fc:
            r11 = 0
        L_0x02fd:
            k0.h.c(r1, r11)
        L_0x0300:
            return
        L_0x0301:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.d(r3, r2)
            r2 = 0
            k0.h.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C0755d.t(android.content.Context, java.util.concurrent.Executor, k0.c, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j6, int i2) {
        byte[] bArr = new byte[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr[i5] = (byte) ((int) ((j6 >> (i5 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        u(byteArrayOutputStream, (long) i2, 2);
    }
}
