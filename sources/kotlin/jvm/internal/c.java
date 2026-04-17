package kotlin.jvm.internal;

import D5.b;
import D5.d;
import D5.g;
import D5.h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

public abstract class c implements b, Serializable {
    public static final Object NO_RECEIVER = b.f9650a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z3;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public b compute() {
        b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public d getOwner() {
        d eVar;
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            n.f9657a.getClass();
            eVar = new l(cls);
        } else {
            n.f9657a.getClass();
            eVar = new e(cls);
        }
        return eVar;
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract b getReflected();

    public g getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public h getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
