package androidx.emoji2.text;

import S3.z;
import V.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import com.bumptech.glide.c;
import java.nio.ByteBuffer;

public final class u extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f4963a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final t f4964b;

    /* renamed from: c  reason: collision with root package name */
    public short f4965c = -1;
    public float d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public TextPaint f4966e;

    public u(t tVar) {
        c.e(tVar, "rasterizer cannot be null");
        this.f4964b = tVar;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i5, float f6, int i6, int i7, int i8, Paint paint) {
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = paint;
        TextPaint textPaint2 = null;
        if (charSequence2 instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence2).getSpans(i2, i5, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint3 = this.f4966e;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.f4966e = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(textPaint);
                    for (CharacterStyle updateDrawState : characterStyleArr) {
                        updateDrawState.updateDrawState(textPaint2);
                    }
                }
            }
            if (textPaint instanceof TextPaint) {
                textPaint2 = (TextPaint) textPaint;
            }
        } else if (textPaint instanceof TextPaint) {
            textPaint2 = (TextPaint) textPaint;
        }
        if (!(textPaint2 == null || textPaint2.bgColor == 0)) {
            int color = textPaint2.getColor();
            Paint.Style style = textPaint2.getStyle();
            textPaint2.setColor(textPaint2.bgColor);
            textPaint2.setStyle(Paint.Style.FILL);
            canvas.drawRect(f6, (float) i6, f6 + ((float) this.f4965c), (float) i8, textPaint2);
            textPaint2.setStyle(style);
            textPaint2.setColor(color);
        }
        j.a().getClass();
        float f7 = (float) i7;
        if (textPaint2 != null) {
            textPaint = textPaint2;
        }
        t tVar = this.f4964b;
        z zVar = tVar.f4961b;
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface((Typeface) zVar.f2713e);
        canvas.drawText((char[]) zVar.f2712c, tVar.f4960a * 2, 2, f6, f7, textPaint);
        textPaint.setTypeface(typeface);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i5, Paint.FontMetricsInt fontMetricsInt) {
        short s6;
        Paint.FontMetricsInt fontMetricsInt2 = this.f4963a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        t tVar = this.f4964b;
        a c3 = tVar.c();
        int a6 = c3.a(14);
        short s7 = 0;
        if (a6 != 0) {
            s6 = ((ByteBuffer) c3.d).getShort(a6 + c3.f1342a);
        } else {
            s6 = 0;
        }
        this.d = abs / ((float) s6);
        a c6 = tVar.c();
        int a7 = c6.a(14);
        if (a7 != 0) {
            ((ByteBuffer) c6.d).getShort(a7 + c6.f1342a);
        }
        a c7 = tVar.c();
        int a8 = c7.a(12);
        if (a8 != 0) {
            s7 = ((ByteBuffer) c7.d).getShort(a8 + c7.f1342a);
        }
        short s8 = (short) ((int) (((float) s7) * this.d));
        this.f4965c = s8;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s8;
    }
}
