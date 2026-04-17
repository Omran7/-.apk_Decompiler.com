package C;

import B.f;
import B.g;
import H.h;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.d;
import java.io.IOException;
import java.io.InputStream;

public final class p extends d {
    public static Font t1(FontFamily fontFamily, int i2) {
        int i5;
        int i6;
        if ((i2 & 1) != 0) {
            i5 = 700;
        } else {
            i5 = 400;
        }
        if ((i2 & 2) != 0) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        FontStyle fontStyle = new FontStyle(i5, i6);
        Font font = fontFamily.getFont(0);
        int u12 = u1(fontStyle, font.getStyle());
        for (int i7 = 1; i7 < fontFamily.getSize(); i7++) {
            Font font2 = fontFamily.getFont(i7);
            int u13 = u1(fontStyle, font2.getStyle());
            if (u13 < u12) {
                font = font2;
                u12 = u13;
            }
        }
        return font;
    }

    public static int u1(FontStyle fontStyle, FontStyle fontStyle2) {
        int i2;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        return abs + i2;
    }

    public final h X(h[] hVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface k(Context context, f fVar, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (g gVar : fVar.f144a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f149f).setWeight(gVar.f146b).setSlant(gVar.f147c ? 1 : 0).setTtcIndex(gVar.f148e).setFontVariationSettings(gVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(t1(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface l(Context context, h[] hVarArr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (h hVar : hVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(hVar.f979a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(hVar.f981c).setSlant(hVar.d ? 1 : 0).setTtcIndex(hVar.f980b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(t1(build2, i2).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface m(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface n(Context context, Resources resources, int i2, String str, int i5) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
