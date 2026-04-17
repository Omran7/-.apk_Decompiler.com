package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import e.C0476a;
import j.k;
import j.n;
import java.io.IOException;
import k.C0725m0;
import org.xmlpull.v1.XmlPullParserException;

public final class h extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f8224e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f8225f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f8226a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f8227b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f8228c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f8224e = clsArr;
        f8225f = clsArr;
    }

    public h(Context context) {
        super(context);
        this.f8228c = context;
        Object[] objArr = {context};
        this.f8226a = objArr;
        this.f8227b = objArr;
    }

    public static Object a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        boolean z3;
        int i2;
        boolean z4;
        char c3;
        char c6;
        boolean z5;
        ColorStateList colorStateList;
        int resourceId;
        AttributeSet attributeSet2 = attributeSet;
        C0577g gVar = new C0577g(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            z3 = true;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlResourceParser xmlResourceParser2 = xmlResourceParser;
            }
        }
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        while (!z6) {
            if (eventType != z3) {
                if (eventType != i2) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z7 && name2.equals(str)) {
                            XmlResourceParser xmlResourceParser3 = xmlResourceParser;
                            z4 = z3;
                            z7 = false;
                            str = null;
                            eventType = xmlResourceParser.next();
                            z3 = z4;
                            i2 = 2;
                        } else if (name2.equals("group")) {
                            gVar.f8202b = 0;
                            gVar.f8203c = 0;
                            gVar.d = 0;
                            gVar.f8204e = 0;
                            gVar.f8205f = z3;
                            gVar.g = z3;
                        } else if (name2.equals("item")) {
                            if (!gVar.h) {
                                n nVar = gVar.f8223z;
                                if (nVar == null || !nVar.f8773b.hasSubMenu()) {
                                    gVar.h = z3;
                                    gVar.b(gVar.f8201a.add(gVar.f8202b, gVar.f8206i, gVar.f8207j, gVar.f8208k));
                                } else {
                                    gVar.h = z3;
                                    gVar.b(gVar.f8201a.addSubMenu(gVar.f8202b, gVar.f8206i, gVar.f8207j, gVar.f8208k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlResourceParser xmlResourceParser4 = xmlResourceParser;
                            z4 = z3;
                            z6 = z4;
                            eventType = xmlResourceParser.next();
                            z3 = z4;
                            i2 = 2;
                        }
                    }
                } else if (!z7) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    h hVar = gVar.f8200E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = hVar.f8228c.obtainStyledAttributes(attributeSet2, C0476a.f7544p);
                        gVar.f8202b = obtainStyledAttributes.getResourceId(z3 ? 1 : 0, 0);
                        gVar.f8203c = obtainStyledAttributes.getInt(3, 0);
                        gVar.d = obtainStyledAttributes.getInt(4, 0);
                        gVar.f8204e = obtainStyledAttributes.getInt(5, 0);
                        gVar.f8205f = obtainStyledAttributes.getBoolean(2, z3);
                        gVar.g = obtainStyledAttributes.getBoolean(0, z3);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = hVar.f8228c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, C0476a.f7545q);
                            gVar.f8206i = obtainStyledAttributes2.getResourceId(2, 0);
                            gVar.f8207j = (obtainStyledAttributes2.getInt(5, gVar.f8203c) & -65536) | (obtainStyledAttributes2.getInt(6, gVar.d) & 65535);
                            gVar.f8208k = obtainStyledAttributes2.getText(7);
                            gVar.f8209l = obtainStyledAttributes2.getText(8);
                            gVar.f8210m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            if (string == null) {
                                c3 = 0;
                            } else {
                                c3 = string.charAt(0);
                            }
                            gVar.f8211n = c3;
                            gVar.f8212o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            if (string2 == null) {
                                c6 = 0;
                            } else {
                                c6 = string2.charAt(0);
                            }
                            gVar.f8213p = c6;
                            gVar.f8214q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                gVar.f8215r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                gVar.f8215r = gVar.f8204e;
                            }
                            gVar.f8216s = obtainStyledAttributes2.getBoolean(3, false);
                            gVar.f8217t = obtainStyledAttributes2.getBoolean(4, gVar.f8205f);
                            gVar.f8218u = obtainStyledAttributes2.getBoolean(1, gVar.g);
                            gVar.f8219v = obtainStyledAttributes2.getInt(21, -1);
                            gVar.f8222y = obtainStyledAttributes2.getString(12);
                            gVar.f8220w = obtainStyledAttributes2.getResourceId(13, 0);
                            gVar.f8221x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            if (string3 != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5 && gVar.f8220w == 0 && gVar.f8221x == null) {
                                gVar.f8223z = (n) gVar.a(string3, f8225f, hVar.f8227b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                gVar.f8223z = null;
                            }
                            gVar.f8196A = obtainStyledAttributes2.getText(17);
                            gVar.f8197B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                gVar.f8199D = C0725m0.b(obtainStyledAttributes2.getInt(19, -1), gVar.f8199D);
                            } else {
                                gVar.f8199D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = A.h.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                gVar.f8198C = colorStateList;
                            } else {
                                gVar.f8198C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            gVar.h = false;
                            XmlResourceParser xmlResourceParser5 = xmlResourceParser;
                            z4 = true;
                        } else if (name3.equals("menu")) {
                            z4 = true;
                            gVar.h = true;
                            SubMenu addSubMenu = gVar.f8201a.addSubMenu(gVar.f8202b, gVar.f8206i, gVar.f8207j, gVar.f8208k);
                            gVar.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet2, addSubMenu);
                        } else {
                            XmlResourceParser xmlResourceParser6 = xmlResourceParser;
                            z4 = true;
                            str = name3;
                            z7 = true;
                        }
                        eventType = xmlResourceParser.next();
                        z3 = z4;
                        i2 = 2;
                    }
                }
                XmlResourceParser xmlResourceParser7 = xmlResourceParser;
                z4 = z3;
                eventType = xmlResourceParser.next();
                z3 = z4;
                i2 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof k)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z3 = false;
        try {
            XmlResourceParser layout = this.f8228c.getResources().getLayout(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof k) {
                k kVar = (k) menu;
                if (!kVar.f8740y) {
                    kVar.w();
                    z3 = true;
                }
            }
            b(layout, asAttributeSet, menu);
            if (z3) {
                ((k) menu).v();
            }
            layout.close();
        } catch (XmlPullParserException e6) {
            throw new InflateException("Error inflating menu XML", e6);
        } catch (IOException e7) {
            throw new InflateException("Error inflating menu XML", e7);
        } catch (Throwable th) {
            if (0 != 0) {
                ((k) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
