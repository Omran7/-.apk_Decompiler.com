package k;

import D.g;
import I3.h;
import S3.t;
import W.b;
import W.e;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.j;
import c1.i;
import com.bumptech.glide.c;
import e.C0476a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: k.C  reason: case insensitive filesystem */
public class C0654C {
    public static final int[] d = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9144a = 2;

    /* renamed from: b  reason: collision with root package name */
    public View f9145b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9146c;

    public /* synthetic */ C0654C() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((h) ((t) this.f9146c).f2700b).getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new e(keyListener);
    }

    /* JADX INFO: finally extract failed */
    public void b(AttributeSet attributeSet, int i2) {
        switch (this.f9144a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f9145b;
                i A6 = i.A(absSeekBar.getContext(), attributeSet, d, i2);
                Drawable o6 = A6.o(0);
                if (o6 != null) {
                    if (o6 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) o6;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i5 = 0; i5 < numberOfFrames; i5++) {
                            Drawable e6 = e(animationDrawable.getFrame(i5), true);
                            e6.setLevel(10000);
                            animationDrawable2.addFrame(e6, animationDrawable.getDuration(i5));
                        }
                        animationDrawable2.setLevel(10000);
                        o6 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(o6);
                }
                Drawable o7 = A6.o(1);
                if (o7 != null) {
                    absSeekBar.setProgressDrawable(e(o7, false));
                }
                A6.G();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f9145b).getContext().obtainStyledAttributes(attributeSet, C0476a.f7537i, i2, 0);
                try {
                    boolean z3 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z3 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z3);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public b c(InputConnection inputConnection, EditorInfo editorInfo) {
        t tVar = (t) this.f9146c;
        if (inputConnection == null) {
            tVar.getClass();
            inputConnection = null;
        } else {
            h hVar = (h) tVar.f2700b;
            hVar.getClass();
            if (!(inputConnection instanceof b)) {
                inputConnection = new b((EditText) hVar.f1179b, inputConnection, editorInfo);
            }
        }
        return (b) inputConnection;
    }

    public void d(boolean z3) {
        W.i iVar = (W.i) ((h) ((t) this.f9146c).f2700b).f1180c;
        if (iVar.f3871c != z3) {
            if (iVar.f3870b != null) {
                j a6 = j.a();
                W.h hVar = iVar.f3870b;
                a6.getClass();
                c.e(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a6.f4934a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a6.f4935b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f3871c = z3;
            if (z3) {
                W.i.a(j.a().b(), iVar.f3869a);
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z3) {
        boolean z4;
        if (drawable instanceof g) {
            ((D.h) ((g) drawable)).getClass();
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                int id = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                if (id == 16908301 || id == 16908303) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                drawableArr[i2] = e(drawable2, z4);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i5 = 0; i5 < numberOfLayers; i5++) {
                layerDrawable2.setId(i5, layerDrawable.getId(i5));
                layerDrawable2.setLayerGravity(i5, layerDrawable.getLayerGravity(i5));
                layerDrawable2.setLayerWidth(i5, layerDrawable.getLayerWidth(i5));
                layerDrawable2.setLayerHeight(i5, layerDrawable.getLayerHeight(i5));
                layerDrawable2.setLayerInsetLeft(i5, layerDrawable.getLayerInsetLeft(i5));
                layerDrawable2.setLayerInsetRight(i5, layerDrawable.getLayerInsetRight(i5));
                layerDrawable2.setLayerInsetTop(i5, layerDrawable.getLayerInsetTop(i5));
                layerDrawable2.setLayerInsetBottom(i5, layerDrawable.getLayerInsetBottom(i5));
                layerDrawable2.setLayerInsetStart(i5, layerDrawable.getLayerInsetStart(i5));
                layerDrawable2.setLayerInsetEnd(i5, layerDrawable.getLayerInsetEnd(i5));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f9146c) == null) {
                this.f9146c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z3) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public C0654C(AbsSeekBar absSeekBar) {
        this.f9145b = absSeekBar;
    }

    public C0654C(EditText editText) {
        this.f9145b = editText;
        this.f9146c = new t(editText);
    }
}
