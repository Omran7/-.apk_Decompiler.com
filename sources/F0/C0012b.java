package F0;

import B0.C0009h;
import K0.d;
import T0.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import z0.C1130f;
import z0.i;

/* renamed from: F0.b  reason: case insensitive filesystem */
public final class C0012b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f675a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f676b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f677c;

    public /* synthetic */ C0012b(Object obj, Object obj2, int i2) {
        this.f675a = i2;
        this.f677c = obj;
        this.f676b = obj2;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, F0.a] */
    /* JADX WARNING: type inference failed for: r2v0, types: [F0.g, java.lang.Object] */
    public final r a(Object obj, int i2, int i5, i iVar) {
        Resources resources;
        r a6;
        Uri uri;
        switch (this.f675a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new r(new b(uri2), this.f676b.l((AssetManager) this.f677c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) iVar.c(d.f1446b);
                if (theme != null) {
                    resources = theme.getResources();
                } else {
                    resources = ((Context) this.f677c).getResources();
                }
                return new r(new b(num), new C0016f(theme, resources, this.f676b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f677c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                C1130f fVar = null;
                for (int i6 = 0; i6 < size; i6++) {
                    s sVar = (s) arrayList.get(i6);
                    if (sVar.b(obj) && (a6 = sVar.a(obj, i2, i5, iVar)) != null) {
                        arrayList2.add(a6.f706c);
                        fVar = a6.f704a;
                    }
                }
                if (arrayList2.isEmpty() || fVar == null) {
                    return null;
                }
                return new r(fVar, new w(arrayList2, (C0009h) this.f676b));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources2 = (Resources) this.f676b;
                try {
                    uri = Uri.parse("android.resource://" + resources2.getResourcePackageName(num2.intValue()) + '/' + resources2.getResourceTypeName(num2.intValue()) + '/' + resources2.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e6) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e6);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((s) this.f677c).a(uri, i2, i5, iVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                s sVar2 = (s) this.f676b;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            return sVar2.a(Integer.valueOf(parseInt), i2, i5, iVar);
                        }
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        return null;
                    } catch (NumberFormatException e7) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e7);
                        return null;
                    }
                } else if (pathSegments.size() == 2) {
                    List<String> pathSegments2 = uri3.getPathSegments();
                    String str = pathSegments2.get(1);
                    Context context = (Context) this.f677c;
                    int identifier = context.getResources().getIdentifier(str, pathSegments2.get(0), context.getPackageName());
                    if (identifier != 0) {
                        return sVar2.a(Integer.valueOf(identifier), i2, i5, iVar);
                    }
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                    return null;
                } else if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                } else {
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
        }
    }

    public final boolean b(Object obj) {
        switch (this.f675a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                    return false;
                }
                return true;
            case 1:
                Integer num = (Integer) obj;
                return true;
            case 2:
                Iterator it2 = ((ArrayList) this.f677c).iterator();
                while (it2.hasNext()) {
                    if (((s) it2.next()).b(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                Integer num2 = (Integer) obj;
                return true;
            default:
                Uri uri2 = (Uri) obj;
                if (!"android.resource".equals(uri2.getScheme()) || !((Context) this.f677c).getPackageName().equals(uri2.getAuthority())) {
                    return false;
                }
                return true;
        }
    }

    public String toString() {
        switch (this.f675a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f677c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0012b(Resources resources, s sVar) {
        this.f675a = 3;
        this.f676b = resources;
        this.f677c = sVar;
    }

    public C0012b(Context context, C0017g gVar) {
        this.f675a = 1;
        this.f677c = context.getApplicationContext();
        this.f676b = gVar;
    }

    public C0012b(Context context, s sVar) {
        this.f675a = 4;
        this.f677c = context.getApplicationContext();
        this.f676b = sVar;
    }
}
