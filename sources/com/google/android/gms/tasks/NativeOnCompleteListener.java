package com.google.android.gms.tasks;

public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j6) {
        this.zza = j6;
    }

    public static void createAndAddCallback(Task<Object> task, long j6) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j6));
    }

    public native void nativeOnComplete(long j6, Object obj, boolean z3, boolean z4, String str);

    public void onComplete(Task<Object> task) {
        String str;
        Object obj;
        Exception exception;
        if (task.isSuccessful()) {
            obj = task.getResult();
            str = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            obj = null;
            str = null;
        } else {
            str = exception.getMessage();
            obj = null;
        }
        nativeOnComplete(this.zza, obj, task.isSuccessful(), task.isCanceled(), str);
    }
}
