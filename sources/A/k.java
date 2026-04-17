package A;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o3.d;
import org.xmlpull.v1.XmlPullParserException;

public abstract class k extends ContentProvider {
    public static final String[] d = {"_display_name", "_size"};

    /* renamed from: e  reason: collision with root package name */
    public static final File f4e = new File("/");

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f5f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Object f6a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public String f7b;

    /* renamed from: c  reason: collision with root package name */
    public j f8c;

    public static String a(String str) {
        if (str.length() <= 0 || str.charAt(str.length() - 1) != '/') {
            return str;
        }
        return str.substring(0, str.length() - 1);
    }

    public static j c(Context context, String str) {
        j jVar;
        HashMap hashMap = f5f;
        synchronized (hashMap) {
            try {
                jVar = (j) hashMap.get(str);
                if (jVar == null) {
                    jVar = e(context, str);
                    hashMap.put(str, jVar);
                }
            } catch (IOException e6) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e6);
            } catch (XmlPullParserException e7) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static Uri d(Context context, String str, File file) {
        String str2;
        j c3 = c(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c3.f3b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (j.a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    str2 = canonicalPath.substring(path2.length());
                } else {
                    str2 = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(c3.f2a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(str2, "/")).build();
            }
            throw new IllegalArgumentException(d.i("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static j e(Context context, String str) {
        j jVar = new j(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return jVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue((String) null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, "path");
                        if ("root-path".equals(name)) {
                            file = f4e;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = h.getExternalFilesDirs(context, (String) null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = h.getExternalCacheDirs(context);
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] a6 = i.a(context);
                            if (a6.length > 0) {
                                file = a6[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str2 = new String[]{attributeValue2}[0];
                            if (str2 != null) {
                                file = new File(file, str2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    jVar.f3b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e6) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e6);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException(d.i("Couldn't find meta-data for provider with authority ", str));
        }
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            synchronized (this.f6a) {
                this.f7b = str;
            }
            HashMap hashMap = f5f;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public final j b() {
        j jVar;
        synchronized (this.f6a) {
            try {
                if (this.f7b != null) {
                    if (this.f8c == null) {
                        this.f8c = c(getContext(), this.f7b);
                    }
                    jVar = this.f8c;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    public final String getType(Uri uri) {
        String mimeTypeFromExtension;
        File b6 = b().b(uri);
        int lastIndexOf = b6.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b6.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final boolean onCreate() {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i2;
        File b6 = b().b(uri);
        if ("r".equals(str)) {
            i2 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i2 = 738197504;
        } else if ("wa".equals(str)) {
            i2 = 704643072;
        } else if ("rw".equals(str)) {
            i2 = 939524096;
        } else if ("rwt".equals(str)) {
            i2 = 1006632960;
        } else {
            throw new IllegalArgumentException(d.i("Invalid mode: ", str));
        }
        return ParcelFileDescriptor.open(b6, i2);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        String str3;
        File b6 = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i5 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i5] = "_display_name";
                i2 = i5 + 1;
                if (queryParameter == null) {
                    str3 = b6.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i5] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i5] = "_size";
                i2 = i5 + 1;
                objArr[i5] = Long.valueOf(b6.length());
            }
            i5 = i2;
        }
        String[] strArr4 = new String[i5];
        System.arraycopy(strArr3, 0, strArr4, 0, i5);
        Object[] objArr2 = new Object[i5];
        System.arraycopy(objArr, 0, objArr2, 0, i5);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
