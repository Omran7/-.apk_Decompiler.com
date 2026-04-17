package D2;

import B0.C0009h;
import E3.a;
import J2.o;
import K2.f;
import K2.k;
import O2.B;
import O2.C0112b;
import O2.C0133x;
import O2.J;
import O2.Q;
import O2.r;
import O2.r0;
import O2.u0;
import R2.b;
import S3.u;
import S3.z;
import U3.c;
import Z0.e;
import a5.C0264a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.D;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.storage.n;
import com.google.firebase.storage.p;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.utils.H;
import g3.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.j;
import x1.i;

public final /* synthetic */ class l implements Continuation, d, a, e, SuccessContinuation, n, H, K3.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f539a;

    public /* synthetic */ l(int i2) {
        this.f539a = i2;
    }

    public void a(C0264a aVar) {
        int i2 = MainActivity.L0;
        b.w(false);
    }

    public Object apply(Object obj) {
        T3.e eVar = (T3.e) obj;
        eVar.getClass();
        C0009h hVar = u.f2701a;
        hVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            hVar.t(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void b(Object obj, p pVar) {
        obj.getClass();
        throw new ClassCastException();
    }

    public C2.b c(o oVar) {
        j jVar;
        j jVar2;
        switch (this.f539a) {
            case 0:
                C2.o oVar2 = C2.o.f453a;
                if (((String) oVar.f1317a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        r F = r.F((C0404i) oVar.f1319c, C0411p.a());
                        if (F.D() == 0) {
                            j jVar3 = j.f523e;
                            int size = F.B().size();
                            if (!(size == 16 || size == 24)) {
                                if (size != 32) {
                                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(size)}));
                                }
                            }
                            int A6 = F.C().A();
                            if (A6 != 12) {
                                if (A6 != 16) {
                                    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(A6)}));
                                }
                            }
                            r0 r0Var = (r0) oVar.f1320e;
                            int ordinal = r0Var.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.e());
                                        }
                                    }
                                }
                                jVar3 = j.d;
                            } else {
                                jVar3 = j.f522c;
                            }
                            k kVar = new k(size, A6, 16, jVar3);
                            C0009h hVar = new C0009h(5);
                            hVar.f229c = null;
                            hVar.d = null;
                            hVar.f228b = kVar;
                            hVar.f229c = i.t(F.B().x(), oVar2);
                            hVar.d = (Integer) oVar.f1321f;
                            return hVar.k();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (D unused) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
            case 1:
                C2.o oVar3 = C2.o.f453a;
                if (((String) oVar.f1317a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        C0133x D4 = C0133x.D((C0404i) oVar.f1319c, C0411p.a());
                        if (D4.B() == 0) {
                            j jVar4 = j.h;
                            int size2 = D4.A().size();
                            if (!(size2 == 16 || size2 == 24)) {
                                if (size2 != 32) {
                                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(size2)}));
                                }
                            }
                            r0 r0Var2 = (r0) oVar.f1320e;
                            int ordinal2 = r0Var2.ordinal();
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 3) {
                                        if (ordinal2 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var2.e());
                                        }
                                    }
                                }
                                jVar4 = j.g;
                            } else {
                                jVar4 = j.f524f;
                            }
                            o oVar4 = new o(size2, 12, 16, jVar4);
                            C0009h hVar2 = new C0009h(6);
                            hVar2.f229c = null;
                            hVar2.d = null;
                            hVar2.f228b = oVar4;
                            hVar2.f229c = i.t(D4.A().x(), oVar3);
                            hVar2.d = (Integer) oVar.f1321f;
                            return hVar2.l();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (D unused2) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
            case 2:
                C2.o oVar5 = C2.o.f453a;
                if (((String) oVar.f1317a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        B D6 = B.D((C0404i) oVar.f1319c, C0411p.a());
                        if (D6.B() == 0) {
                            j jVar5 = j.f527k;
                            int size3 = D6.A().size();
                            if (size3 != 16) {
                                if (size3 != 32) {
                                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(size3)}));
                                }
                            }
                            r0 r0Var3 = (r0) oVar.f1320e;
                            int ordinal3 = r0Var3.ordinal();
                            if (ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    if (ordinal3 != 3) {
                                        if (ordinal3 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var3.e());
                                        }
                                    }
                                }
                                jVar5 = j.f526j;
                            } else {
                                jVar5 = j.f525i;
                            }
                            r rVar = new r(size3, jVar5);
                            C0009h hVar3 = new C0009h(7);
                            hVar3.f229c = null;
                            hVar3.d = null;
                            hVar3.f228b = rVar;
                            hVar3.f229c = i.t(D6.A().x(), oVar5);
                            hVar3.d = (Integer) oVar.f1321f;
                            return hVar3.m();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (D unused3) {
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
            case 3:
                C2.o oVar6 = C2.o.f453a;
                if (((String) oVar.f1317a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        J D7 = J.D((C0404i) oVar.f1319c, C0411p.a());
                        if (D7.B() == 0) {
                            r0 r0Var4 = (r0) oVar.f1320e;
                            int ordinal4 = r0Var4.ordinal();
                            if (ordinal4 != 1) {
                                if (ordinal4 != 2) {
                                    if (ordinal4 == 3) {
                                        jVar = j.f530n;
                                    } else if (ordinal4 != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var4.e());
                                    }
                                }
                                jVar = j.f529m;
                            } else {
                                jVar = j.f528l;
                            }
                            return t.b(jVar, i.t(D7.A().x(), oVar6), (Integer) oVar.f1321f);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (D unused4) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
            case 4:
                C2.o oVar7 = C2.o.f453a;
                if (((String) oVar.f1317a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        u0 D8 = u0.D((C0404i) oVar.f1319c, C0411p.a());
                        if (D8.B() == 0) {
                            r0 r0Var5 = (r0) oVar.f1320e;
                            int ordinal5 = r0Var5.ordinal();
                            if (ordinal5 != 1) {
                                if (ordinal5 != 2) {
                                    if (ordinal5 == 3) {
                                        jVar2 = j.f533q;
                                    } else if (ordinal5 != 4) {
                                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var5.e());
                                    }
                                }
                                jVar2 = j.f532p;
                            } else {
                                jVar2 = j.f531o;
                            }
                            return x.b(jVar2, i.t(D8.A().x(), oVar7), (Integer) oVar.f1321f);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (D unused5) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
            case 9:
                C2.o oVar8 = C2.o.f453a;
                if (((String) oVar.f1317a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        C0112b F6 = C0112b.F((C0404i) oVar.f1319c, C0411p.a());
                        if (F6.D() == 0) {
                            C0009h hVar4 = new C0009h(15);
                            hVar4.f228b = null;
                            hVar4.f229c = null;
                            hVar4.d = K2.d.f1471f;
                            hVar4.E(F6.B().size());
                            int A7 = F6.C().A();
                            if (A7 < 10 || 16 < A7) {
                                throw new GeneralSecurityException(com.google.android.gms.internal.measurement.a.f(A7, "Invalid tag size for AesCmacParameters: "));
                            }
                            hVar4.f229c = Integer.valueOf(A7);
                            hVar4.d = f.a((r0) oVar.f1320e);
                            K2.e o6 = hVar4.o();
                            C0009h hVar5 = new C0009h(14);
                            hVar5.f229c = null;
                            hVar5.d = null;
                            hVar5.f228b = o6;
                            hVar5.f229c = i.t(F6.B().x(), oVar8);
                            hVar5.d = (Integer) oVar.f1321f;
                            return hVar5.n();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (D | IllegalArgumentException unused6) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                }
            default:
                C2.o oVar9 = C2.o.f453a;
                if (((String) oVar.f1317a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        Q G6 = Q.G((C0404i) oVar.f1319c, C0411p.a());
                        if (G6.E() == 0) {
                            z zVar = new z(5, false);
                            zVar.f2711b = null;
                            zVar.f2712c = null;
                            zVar.d = null;
                            zVar.f2713e = K2.d.f1478o;
                            zVar.f2711b = Integer.valueOf(G6.C().size());
                            zVar.f2712c = Integer.valueOf(G6.D().C());
                            zVar.d = K2.l.a(G6.D().B());
                            zVar.f2713e = K2.l.b((r0) oVar.f1320e);
                            k h = zVar.h();
                            C0009h hVar6 = new C0009h(16);
                            hVar6.f229c = null;
                            hVar6.d = null;
                            hVar6.f228b = h;
                            hVar6.f229c = i.t(G6.C().x(), oVar9);
                            hVar6.d = (Integer) oVar.f1321f;
                            return hVar6.p();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (D | IllegalArgumentException unused7) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                } else {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
        }
    }

    public Object f(o oVar) {
        switch (this.f539a) {
            case 12:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(oVar);
            case 21:
                Set d = oVar.d(g3.p.a(U3.a.class));
                c cVar = c.f3711c;
                if (cVar == null) {
                    synchronized (c.class) {
                        try {
                            cVar = c.f3711c;
                            if (cVar == null) {
                                cVar = new c(0);
                                c.f3711c = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return new U3.b(d, cVar);
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6886a.get();
        }
    }

    public void g(K3.b bVar) {
    }

    public Task then(Object obj) {
        Z2.a aVar = (Z2.a) obj;
        switch (this.f539a) {
            case 22:
                return Tasks.forResult(Z2.b.a(aVar));
            default:
                return Tasks.forResult(Z2.b.a(aVar));
        }
    }

    public Object then(Task task) {
        switch (this.f539a) {
            case 5:
                j.e(task, "task");
                if (task.isSuccessful()) {
                    return ((e3.n) task.getResult()).f7649a;
                }
                Exception exception = task.getException();
                if (exception instanceof Q3.a) {
                    return null;
                }
                j.b(exception);
                throw exception;
            case 17:
                return 403;
            case 18:
                return -1;
            default:
                if (task.isSuccessful()) {
                    return Tasks.forResult(Z2.c.a((Z2.b) task.getResult()));
                }
                return Tasks.forResult(new Z2.c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new R2.k(task.getException().getMessage(), task.getException())));
        }
    }
}
