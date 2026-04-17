package I5;

import D5.b;
import D5.f;
import G5.F;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.n;
import x5.a;

public final /* synthetic */ class j extends c implements f, a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1265a = false;

    public j(k kVar) {
        super(kVar, F.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }

    public final b compute() {
        if (this.f1265a) {
            return this;
        }
        return super.compute();
    }

    public final b computeReflected() {
        n.f9657a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (!getOwner().equals(jVar.getOwner()) || !getName().equals(jVar.getName()) || !getSignature().equals(jVar.getSignature()) || !kotlin.jvm.internal.j.a(getBoundReceiver(), jVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof f) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public final b getReflected() {
        if (!this.f1265a) {
            b compute = compute();
            if (compute != this) {
                return (f) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    public final Object invoke() {
        return this.receiver.getClass().getSimpleName();
    }

    public final String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
