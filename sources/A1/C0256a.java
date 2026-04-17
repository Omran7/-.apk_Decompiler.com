package a1;

import Z0.c;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: a1.a  reason: case insensitive filesystem */
public final class C0256a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f4541c;
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c[]{new c("proto"), new c("json")})));

    /* renamed from: e  reason: collision with root package name */
    public static final C0256a f4542e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0256a f4543f;

    /* renamed from: a  reason: collision with root package name */
    public final String f4544a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4545b;

    static {
        String e02 = com.bumptech.glide.c.e0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4541c = e02;
        String e03 = com.bumptech.glide.c.e0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String e04 = com.bumptech.glide.c.e0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4542e = new C0256a(e02, (String) null);
        f4543f = new C0256a(e03, e04);
    }

    public C0256a(String str, String str2) {
        this.f4544a = str;
        this.f4545b = str2;
    }

    public static C0256a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C0256a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
