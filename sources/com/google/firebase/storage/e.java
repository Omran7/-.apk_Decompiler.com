package com.google.firebase.storage;

import R2.k;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;

public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Exception f6921a;

    public e(int i2, Exception exc, int i5) {
        super(c(i2));
        this.f6921a = exc;
        Log.e("StorageException", "StorageException has occurred.\n" + c(i2) + "\n Code: " + i2 + " HttpResult: " + i5);
        if (exc != null) {
            Log.e("StorageException", exc.getMessage(), exc);
        }
    }

    public static e a(Status status) {
        int i2;
        I.b(!status.v());
        if (status.f6007a == 16) {
            i2 = -13040;
        } else if (status.equals(Status.f6005q)) {
            i2 = -13030;
        } else {
            i2 = -13000;
        }
        return new e(i2, (Exception) null, 0);
    }

    public static e b(Exception exc, int i2) {
        int i5;
        if (exc instanceof e) {
            return (e) exc;
        }
        if ((i2 == 0 || (i2 >= 200 && i2 < 300)) && exc == null) {
            return null;
        }
        if (i2 == -2) {
            i5 = -13030;
        } else if (i2 == 401) {
            i5 = -13020;
        } else if (i2 == 409) {
            i5 = -13031;
        } else if (i2 == 403) {
            i5 = -13021;
        } else if (i2 != 404) {
            i5 = -13000;
        } else {
            i5 = -13010;
        }
        return new e(i5, exc, i2);
    }

    public static String c(int i2) {
        if (i2 == -13040) {
            return "The operation was cancelled.";
        }
        if (i2 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i2 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i2 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i2 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i2) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    public final synchronized Throwable getCause() {
        Exception exc = this.f6921a;
        if (exc == this) {
            return null;
        }
        return exc;
    }
}
