package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;

class JdkWithJettyBootPlatform extends Platform {

    /* renamed from: c  reason: collision with root package name */
    public final Method f10921c;
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f10922e;

    /* renamed from: f  reason: collision with root package name */
    public final Class f10923f;
    public final Class g;

    public static class JettyNegoProvider implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f10924a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10925b;

        /* renamed from: c  reason: collision with root package name */
        public String f10926c;

        public JettyNegoProvider(ArrayList arrayList) {
            this.f10924a = arrayList;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.f10684b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (!name.equals("unsupported") || Void.TYPE != returnType) {
                boolean equals = name.equals("protocols");
                ArrayList arrayList = this.f10924a;
                if (equals && objArr.length == 0) {
                    return arrayList;
                }
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (arrayList.contains(list.get(i2))) {
                                String str = (String) list.get(i2);
                                this.f10926c = str;
                                return str;
                            }
                        }
                        String str2 = (String) arrayList.get(0);
                        this.f10926c = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f10926c = (String) objArr[0];
                return null;
            }
            this.f10925b = true;
            return null;
        }
    }

    public JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f10921c = method;
        this.d = method2;
        this.f10922e = method3;
        this.f10923f = cls;
        this.g = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.f10922e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw Util.a("unable to remove alpn", e6);
        }
    }

    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f10921c.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f10923f, this.g}, new JettyNegoProvider(Platform.b(list)))});
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw Util.a("unable to set alpn", e6);
        }
    }

    public final String i(SSLSocket sSLSocket) {
        try {
            JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.d.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z3 = jettyNegoProvider.f10925b;
            if (!z3 && jettyNegoProvider.f10926c == null) {
                Platform.f10930a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z3) {
                return null;
            } else {
                return jettyNegoProvider.f10926c;
            }
        } catch (InvocationTargetException e6) {
            e = e6;
            throw Util.a("unable to get selected protocol", e);
        } catch (IllegalAccessException e7) {
            e = e7;
            throw Util.a("unable to get selected protocol", e);
        }
    }
}
