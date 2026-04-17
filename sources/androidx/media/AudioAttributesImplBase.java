package androidx.media;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f5298a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f5299b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f5300c = 0;
    public int d = -1;

    public final boolean equals(Object obj) {
        int i2;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f5299b == audioAttributesImplBase.f5299b) {
            int i5 = this.f5300c;
            int i6 = audioAttributesImplBase.f5300c;
            int i7 = audioAttributesImplBase.d;
            if (i7 == -1) {
                int i8 = audioAttributesImplBase.f5298a;
                int i9 = AudioAttributesCompat.f5294b;
                if ((i6 & 1) != 1) {
                    if ((i6 & 4) != 4) {
                        switch (i8) {
                            case 2:
                                i2 = 0;
                                break;
                            case 3:
                                i2 = 8;
                                break;
                            case 4:
                                i2 = 4;
                                break;
                            case 5:
                            case zzaky.zzf.zzg /*7*/:
                            case 8:
                            case 9:
                            case 10:
                                i2 = 5;
                                break;
                            case zzaky.zzf.zzf /*6*/:
                                i2 = 2;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /*11*/:
                                i2 = 10;
                                break;
                            case 13:
                                i2 = 1;
                                break;
                            default:
                                i2 = 3;
                                break;
                        }
                    } else {
                        i2 = 6;
                    }
                } else {
                    i2 = 7;
                }
            } else {
                i2 = i7;
            }
            if (i2 == 6) {
                i6 |= 4;
            } else if (i2 == 7) {
                i6 |= 1;
            }
            if (i5 == (i6 & 273) && this.f5298a == audioAttributesImplBase.f5298a && this.d == i7) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5299b), Integer.valueOf(this.f5300c), Integer.valueOf(this.f5298a), Integer.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i2 = this.f5298a;
        int i5 = AudioAttributesCompat.f5294b;
        switch (i2) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case zzaky.zzf.zzf /*6*/:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case zzaky.zzf.zzg /*7*/:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = a.f(i2, "unknown usage ");
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f5299b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f5300c).toUpperCase());
        return sb.toString();
    }
}
