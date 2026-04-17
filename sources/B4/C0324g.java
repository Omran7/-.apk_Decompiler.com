package b4;

/* renamed from: b4.g  reason: case insensitive filesystem */
public abstract class C0324g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5528a;

    static {
        int i2;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i2 = Integer.parseInt(split[0]);
            if (i2 == 1 && split.length > 1) {
                i2 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i2 = -1;
        }
        if (i2 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i5 = 0; i5 < property.length(); i5++) {
                    char charAt = property.charAt(i5);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i2 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = 6;
        }
        f5528a = i2;
    }
}
