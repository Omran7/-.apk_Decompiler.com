package B;

import A2.f;
import C.d;
import F3.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.C1106a;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f138a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f139b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f140c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e  reason: collision with root package name */
    public static final Object f141e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static Method f142f;
    public static boolean g;

    public static f b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        f fVar;
        if (c(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i5 = typedValue.type;
            if (i5 >= 28 && i5 <= 31) {
                return new f((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                fVar = f.h(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e6) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e6);
                fVar = null;
            }
            if (fVar != null) {
                return fVar;
            }
        }
        return new f((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int d(float f6) {
        float f7;
        boolean z3;
        float f8;
        if (f6 < 1.0f) {
            return -16777216;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f9 = (f6 + 16.0f) / 116.0f;
        if (f6 > 8.0f) {
            f7 = f9 * f9 * f9;
        } else {
            f7 = f6 / 903.2963f;
        }
        float f10 = f9 * f9 * f9;
        if (f10 > 0.008856452f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f8 = f10;
        } else {
            f8 = ((f9 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z3) {
            f10 = ((f9 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f140c;
        return d.a((double) (f8 * fArr[0]), (double) (f7 * fArr[1]), (double) (f10 * fArr[2]));
    }

    public static float e(int i2) {
        float pow;
        float f6 = ((float) i2) / 255.0f;
        if (f6 <= 0.04045f) {
            pow = f6 / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f6 + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static e i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        boolean z3;
        int i5;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C1106a.f12609b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C1106a.f12610c);
                                int i6 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i6 = 1;
                                }
                                int i7 = obtainAttributes2.getInt(i6, 400);
                                if (obtainAttributes2.hasValue(6)) {
                                    i2 = 6;
                                } else {
                                    i2 = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i2, 0)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                int i8 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i8 = 3;
                                }
                                int i9 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i9 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i9);
                                int i10 = obtainAttributes2.getInt(i8, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i5 = 5;
                                } else {
                                    i5 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                                String string6 = obtainAttributes2.getString(i5);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    k(xmlResourceParser);
                                }
                                arrayList.add(new g(string6, i7, z3, string5, i10, resourceId2));
                            } else {
                                k(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new f((g[]) arrayList.toArray(new g[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        k(xmlResourceParser);
                    }
                    return new h(new k(string, string2, string3, j(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                k(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List j(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (d.a(obtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i2) {
        new Handler(Looper.getMainLooper()).post(new n(this, i2, 0));
    }

    public abstract void g(int i2);

    public abstract void h(Typeface typeface);
}
