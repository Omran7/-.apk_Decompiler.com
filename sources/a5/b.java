package A5;

import P2.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;

public final class b extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f129a;

    public /* synthetic */ b(int i2) {
        this.f129a = i2;
    }

    public final Object initialValue() {
        switch (this.f129a) {
            case 0:
                return new Random();
            case 1:
                try {
                    return (Cipher) j.f2176b.f2178a.b("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException(e6);
                }
            case 2:
                try {
                    return (Cipher) j.f2176b.f2178a.b("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 3:
                return 0L;
            case 4:
                try {
                    return (Cipher) j.f2176b.f2178a.b("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 5:
                try {
                    return (Cipher) j.f2176b.f2178a.b("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case zzaky.zzf.zzf /*6*/:
                try {
                    return (Cipher) j.f2176b.f2178a.b("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case zzaky.zzf.zzg /*7*/:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 8:
                return Boolean.FALSE;
            case 9:
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                newDecoder.onMalformedInput(codingErrorAction);
                newDecoder.onUnmappableCharacter(codingErrorAction);
                return newDecoder;
            default:
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
                newEncoder.onMalformedInput(codingErrorAction2);
                newEncoder.onUnmappableCharacter(codingErrorAction2);
                return newEncoder;
        }
    }
}
