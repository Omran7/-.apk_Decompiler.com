package C;

import android.graphics.Path;
import android.util.Log;
import com.bumptech.glide.c;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public char f378a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f379b;

    public j(char c3, float[] fArr) {
        this.f378a = c3;
        this.f379b = fArr;
    }

    public static void a(Path path, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z3, boolean z4) {
        double d;
        double d6;
        float f13 = f6;
        float f14 = f8;
        float f15 = f10;
        boolean z5 = z4;
        double radians = Math.toRadians((double) f12);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d7 = (double) f13;
        double d8 = (double) f7;
        double d9 = (d8 * sin) + (d7 * cos);
        double d10 = d7;
        double d11 = (double) f15;
        double d12 = d9 / d11;
        double d13 = radians;
        double d14 = (double) f11;
        double d15 = ((d8 * cos) + (((double) (-f13)) * sin)) / d14;
        double d16 = d8;
        double d17 = (double) f9;
        double d18 = ((d17 * sin) + (((double) f14) * cos)) / d11;
        double d19 = ((d17 * cos) + (((double) (-f14)) * sin)) / d14;
        double d20 = d12 - d18;
        double d21 = d15 - d19;
        double d22 = (d12 + d18) / 2.0d;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = sin;
        double d25 = (d21 * d21) + (d20 * d20);
        if (d25 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d25);
            float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
            a(path, f6, f7, f8, f9, f15 * sqrt, f11 * sqrt, f12, z3, z4);
            return;
        }
        double sqrt2 = Math.sqrt(d26);
        double d27 = d20 * sqrt2;
        double d28 = sqrt2 * d21;
        if (z3 == z5) {
            d6 = d22 - d28;
            d = d23 + d27;
        } else {
            d6 = d22 + d28;
            d = d23 - d27;
        }
        double atan2 = Math.atan2(d15 - d, d12 - d6);
        double atan22 = Math.atan2(d19 - d, d18 - d6) - atan2;
        int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z5 != (i2 >= 0)) {
            atan22 = i2 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d29 = d6 * d11;
        double d30 = d * d14;
        double d31 = (d29 * cos) - (d30 * d24);
        double d32 = (d30 * cos) + (d29 * d24);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d13);
        double sin2 = Math.sin(d13);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d33 = -d11;
        double d34 = d33 * cos2;
        double d35 = d14 * sin2;
        double d36 = (d34 * sin3) - (d35 * cos3);
        double d37 = d33 * sin2;
        double d38 = d14 * cos2;
        double d39 = (cos3 * d38) + (sin3 * d37);
        double d40 = d38;
        double d41 = atan22 / ((double) ceil);
        int i5 = 0;
        while (i5 < ceil) {
            double d42 = atan2 + d41;
            double sin4 = Math.sin(d42);
            double cos4 = Math.cos(d42);
            double d43 = d41;
            double d44 = (((d11 * cos2) * cos4) + d31) - (d35 * sin4);
            double d45 = d40;
            double d46 = d31;
            double d47 = (d45 * sin4) + (d11 * sin2 * cos4) + d32;
            double d48 = (d34 * sin4) - (d35 * cos4);
            double d49 = (cos4 * d45) + (sin4 * d37);
            double d50 = d42 - atan2;
            double tan = Math.tan(d50 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d50)) / 3.0d;
            double d51 = d42;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d36 * sqrt3) + d10), (float) ((d39 * sqrt3) + d16), (float) (d44 - (sqrt3 * d48)), (float) (d47 - (sqrt3 * d49)), (float) d44, (float) d47);
            i5++;
            atan2 = d51;
            d37 = d37;
            cos2 = cos2;
            ceil = ceil;
            d39 = d49;
            d11 = d11;
            d36 = d48;
            d10 = d44;
            d16 = d47;
            d31 = d46;
            d41 = d43;
            d40 = d45;
        }
    }

    public static void b(j[] jVarArr, Path path) {
        int i2;
        int i5;
        int i6;
        char c3;
        int i7;
        j jVar;
        int i8;
        char c6;
        int i9;
        int i10;
        j jVar2;
        boolean z3;
        boolean z4;
        float f6;
        float f7;
        int i11;
        char c7;
        int i12;
        int i13;
        float f8;
        float f9;
        boolean z5;
        boolean z6;
        int i14;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        j[] jVarArr2 = jVarArr;
        Path path2 = path;
        int i15 = 6;
        float[] fArr = new float[6];
        int length = jVarArr2.length;
        int i16 = 0;
        char c8 = 'm';
        while (i16 < length) {
            j jVar3 = jVarArr2[i16];
            char c9 = jVar3.f378a;
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr[2];
            float f23 = fArr[3];
            float f24 = fArr[4];
            float f25 = fArr[5];
            switch (c9) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = i15;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f24, f25);
                    f20 = f24;
                    f22 = f20;
                    f21 = f25;
                    f23 = f21;
                    break;
            }
            i2 = 2;
            float f26 = f24;
            float f27 = f25;
            float f28 = f20;
            float f29 = f21;
            int i17 = 0;
            while (true) {
                float[] fArr2 = jVar3.f379b;
                if (i17 < fArr2.length) {
                    if (c9 != 'A') {
                        if (c9 != 'C') {
                            if (c9 == 'H') {
                                float[] fArr3 = fArr2;
                                i5 = i17;
                                c3 = c9;
                                i6 = i16;
                                i7 = length;
                                jVar = jVar3;
                                path2.lineTo(fArr3[i5], f29);
                                f28 = fArr3[i5];
                            } else if (c9 == 'Q') {
                                float[] fArr4 = fArr2;
                                i11 = i17;
                                c7 = c9;
                                i12 = i16;
                                i13 = length;
                                jVar = jVar3;
                                int i18 = i11 + 1;
                                int i19 = i11 + 2;
                                int i20 = i11 + 3;
                                path2.quadTo(fArr4[i11], fArr4[i18], fArr4[i19], fArr4[i20]);
                                f8 = fArr4[i11];
                                f9 = fArr4[i18];
                                f28 = fArr4[i19];
                                f29 = fArr4[i20];
                            } else if (c9 == 'V') {
                                float[] fArr5 = fArr2;
                                i5 = i17;
                                c3 = c9;
                                i6 = i16;
                                i7 = length;
                                jVar = jVar3;
                                path2.lineTo(f28, fArr5[i5]);
                                f29 = fArr5[i5];
                            } else if (c9 != 'a') {
                                if (c9 != 'c') {
                                    if (c9 == 'h') {
                                        float[] fArr6 = fArr2;
                                        i5 = i17;
                                        float f30 = f29;
                                        path2.rLineTo(fArr6[i5], 0.0f);
                                        f28 += fArr6[i5];
                                    } else if (c9 == 'q') {
                                        float[] fArr7 = fArr2;
                                        i5 = i17;
                                        float f31 = f29;
                                        float f32 = f28;
                                        int i21 = i5 + 1;
                                        int i22 = i5 + 2;
                                        int i23 = i5 + 3;
                                        path2.rQuadTo(fArr7[i5], fArr7[i21], fArr7[i22], fArr7[i23]);
                                        float f33 = f32 + fArr7[i5];
                                        float f34 = f32 + fArr7[i22];
                                        f29 = f31 + fArr7[i23];
                                        f23 = fArr7[i21] + f31;
                                        f22 = f33;
                                        c3 = c9;
                                        i6 = i16;
                                        i7 = length;
                                        f28 = f34;
                                    } else if (c9 == 'v') {
                                        float[] fArr8 = fArr2;
                                        i5 = i17;
                                        float f35 = f28;
                                        path2.rLineTo(0.0f, fArr8[i5]);
                                        f29 += fArr8[i5];
                                    } else if (c9 != 'L') {
                                        if (c9 == 'M') {
                                            float[] fArr9 = fArr2;
                                            i5 = i17;
                                            f28 = fArr9[i5];
                                            f29 = fArr9[i5 + 1];
                                            if (i5 > 0) {
                                                path2.lineTo(f28, f29);
                                            } else {
                                                path2.moveTo(f28, f29);
                                            }
                                        } else if (c9 != 'S') {
                                            if (c9 == 'T') {
                                                float[] fArr10 = fArr2;
                                                i14 = i17;
                                                float f36 = f29;
                                                float f37 = f28;
                                                if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                                    f10 = (f37 * 2.0f) - f22;
                                                    f11 = (f36 * 2.0f) - f23;
                                                } else {
                                                    f10 = f37;
                                                    f11 = f36;
                                                }
                                                int i24 = i14 + 1;
                                                path2.quadTo(f10, f11, fArr10[i14], fArr10[i24]);
                                                f12 = fArr10[i14];
                                                f13 = fArr10[i24];
                                            } else if (c9 == 'l') {
                                                float[] fArr11 = fArr2;
                                                i5 = i17;
                                                int i25 = i5 + 1;
                                                path2.rLineTo(fArr11[i5], fArr11[i25]);
                                                f28 += fArr11[i5];
                                                f29 += fArr11[i25];
                                            } else if (c9 == 'm') {
                                                float[] fArr12 = fArr2;
                                                i5 = i17;
                                                float f38 = fArr12[i5];
                                                f28 += f38;
                                                float f39 = fArr12[i5 + 1];
                                                f29 += f39;
                                                if (i5 > 0) {
                                                    path2.rLineTo(f38, f39);
                                                } else {
                                                    path2.rMoveTo(f38, f39);
                                                }
                                            } else if (c9 == 's') {
                                                if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                                    float f40 = f28 - f22;
                                                    f17 = f29 - f23;
                                                    f16 = f40;
                                                } else {
                                                    f17 = 0.0f;
                                                    f16 = 0.0f;
                                                }
                                                float f41 = fArr2[i17];
                                                int i26 = i17 + 1;
                                                int i27 = i17 + 2;
                                                int i28 = i17 + 3;
                                                float[] fArr13 = fArr2;
                                                i14 = i17;
                                                float f42 = f17;
                                                float f43 = f41;
                                                float f44 = fArr2[i26];
                                                float f45 = f29;
                                                float f46 = f28;
                                                path.rCubicTo(f16, f42, f43, f44, fArr2[i27], fArr2[i28]);
                                                f10 = f46 + fArr13[i14];
                                                f11 = f45 + fArr13[i26];
                                                f12 = f46 + fArr13[i27];
                                                f13 = fArr13[i28] + f45;
                                            } else if (c9 != 't') {
                                                i5 = i17;
                                            } else {
                                                if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                                    f18 = f28 - f22;
                                                    f19 = f29 - f23;
                                                } else {
                                                    f19 = 0;
                                                    f18 = 0;
                                                }
                                                int i29 = i17 + 1;
                                                path2.rQuadTo(f18, f19, fArr2[i17], fArr2[i29]);
                                                float f47 = f18 + f28;
                                                float f48 = f19 + f29;
                                                f28 += fArr2[i17];
                                                f29 += fArr2[i29];
                                                f23 = f48;
                                                i5 = i17;
                                                c3 = c9;
                                                i6 = i16;
                                                i7 = length;
                                                f22 = f47;
                                            }
                                            f23 = f11;
                                            f22 = f10;
                                            c3 = c9;
                                            i6 = i16;
                                            i7 = length;
                                            f28 = f12;
                                            f29 = f13;
                                        } else {
                                            float[] fArr14 = fArr2;
                                            i5 = i17;
                                            float f49 = f29;
                                            float f50 = f28;
                                            if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                                f14 = (f49 * 2.0f) - f23;
                                                f15 = (f50 * 2.0f) - f22;
                                            } else {
                                                f15 = f50;
                                                f14 = f49;
                                            }
                                            int i30 = i5 + 1;
                                            int i31 = i5 + 2;
                                            int i32 = i5 + 3;
                                            path.cubicTo(f15, f14, fArr14[i5], fArr14[i30], fArr14[i31], fArr14[i32]);
                                            float f51 = fArr14[i5];
                                            float f52 = fArr14[i30];
                                            f28 = fArr14[i31];
                                            f29 = fArr14[i32];
                                            f23 = f52;
                                            f22 = f51;
                                        }
                                        f27 = f29;
                                        f26 = f28;
                                    } else {
                                        float[] fArr15 = fArr2;
                                        i5 = i17;
                                        int i33 = i5 + 1;
                                        path2.lineTo(fArr15[i5], fArr15[i33]);
                                        f28 = fArr15[i5];
                                        f29 = fArr15[i33];
                                    }
                                    c3 = c9;
                                    i6 = i16;
                                    i7 = length;
                                } else {
                                    float[] fArr16 = fArr2;
                                    i14 = i17;
                                    float f53 = f29;
                                    float f54 = f28;
                                    int i34 = i14 + 2;
                                    int i35 = i14 + 3;
                                    int i36 = i14 + 4;
                                    int i37 = i14 + 5;
                                    path.rCubicTo(fArr16[i14], fArr16[i14 + 1], fArr16[i34], fArr16[i35], fArr16[i36], fArr16[i37]);
                                    f10 = f54 + fArr16[i34];
                                    f11 = f53 + fArr16[i35];
                                    f12 = f54 + fArr16[i36];
                                    f13 = fArr16[i37] + f53;
                                    f23 = f11;
                                    f22 = f10;
                                    c3 = c9;
                                    i6 = i16;
                                    i7 = length;
                                    f28 = f12;
                                    f29 = f13;
                                }
                                jVar = jVar3;
                            } else {
                                float[] fArr17 = fArr2;
                                i8 = i17;
                                float f55 = f29;
                                float f56 = f28;
                                int i38 = i8 + 5;
                                float f57 = fArr17[i38] + f56;
                                int i39 = i8 + 6;
                                float f58 = fArr17[i39] + f55;
                                float f59 = fArr17[i8];
                                float f60 = fArr17[i8 + 1];
                                float f61 = fArr17[i8 + 2];
                                if (fArr17[i8 + 3] != 0.0f) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (fArr17[i8 + 4] != 0.0f) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                c6 = c9;
                                float f62 = f61;
                                i10 = length;
                                jVar2 = jVar3;
                                i9 = i16;
                                a(path, f56, f55, f57, f58, f59, f60, f62, z5, z6);
                                f6 = f56 + fArr17[i38];
                                f7 = f55 + fArr17[i39];
                            }
                            i17 = i5 + i2;
                            j[] jVarArr3 = jVarArr;
                            jVar3 = jVar;
                            length = i7;
                            c8 = c3;
                            c9 = c8;
                            i16 = i6;
                        } else {
                            float[] fArr18 = fArr2;
                            i11 = i17;
                            c7 = c9;
                            i12 = i16;
                            i13 = length;
                            jVar = jVar3;
                            int i40 = i11 + 2;
                            int i41 = i11 + 3;
                            int i42 = i11 + 4;
                            int i43 = i11 + 5;
                            path.cubicTo(fArr18[i11], fArr18[i11 + 1], fArr18[i40], fArr18[i41], fArr18[i42], fArr18[i43]);
                            f28 = fArr18[i42];
                            f29 = fArr18[i43];
                            f8 = fArr18[i40];
                            f9 = fArr18[i41];
                        }
                        f22 = f8;
                        f23 = f9;
                        i17 = i5 + i2;
                        j[] jVarArr32 = jVarArr;
                        jVar3 = jVar;
                        length = i7;
                        c8 = c3;
                        c9 = c8;
                        i16 = i6;
                    } else {
                        float[] fArr19 = fArr2;
                        i8 = i17;
                        float f63 = f29;
                        float f64 = f28;
                        c6 = c9;
                        i9 = i16;
                        i10 = length;
                        jVar2 = jVar3;
                        int i44 = i8 + 5;
                        float f65 = fArr19[i44];
                        int i45 = i8 + 6;
                        float f66 = fArr19[i45];
                        float f67 = fArr19[i8];
                        float f68 = fArr19[i8 + 1];
                        float f69 = fArr19[i8 + 2];
                        if (fArr19[i8 + 3] != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fArr19[i8 + 4] != 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        a(path, f64, f63, f65, f66, f67, f68, f69, z3, z4);
                        f6 = fArr19[i44];
                        f7 = fArr19[i45];
                    }
                    f23 = f29;
                    f22 = f28;
                    i17 = i5 + i2;
                    j[] jVarArr322 = jVarArr;
                    jVar3 = jVar;
                    length = i7;
                    c8 = c3;
                    c9 = c8;
                    i16 = i6;
                } else {
                    fArr[0] = f28;
                    fArr[1] = f29;
                    fArr[2] = f22;
                    fArr[3] = f23;
                    fArr[4] = f26;
                    fArr[5] = f27;
                    c8 = jVar3.f378a;
                    i16++;
                    jVarArr2 = jVarArr;
                    length = length;
                    i15 = 6;
                }
            }
        }
    }

    public j(j jVar) {
        this.f378a = jVar.f378a;
        float[] fArr = jVar.f379b;
        this.f379b = c.j(fArr, fArr.length);
    }
}
