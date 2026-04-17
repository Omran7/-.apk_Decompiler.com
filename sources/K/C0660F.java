package k;

import K.C0064d;
import K.O;
import U3.c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: k.F  reason: case insensitive filesystem */
public abstract class C0660F {
    /* JADX INFO: finally extract failed */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new c(clipData, 3);
            } else {
                C0064d dVar = new C0064d();
                dVar.f1377b = clipData;
                dVar.f1378c = 3;
                cVar = dVar;
            }
            O.h(textView, cVar.a());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new c(clipData, 3);
        } else {
            C0064d dVar = new C0064d();
            dVar.f1377b = clipData;
            dVar.f1378c = 3;
            cVar = dVar;
        }
        O.h(view, cVar.a());
        return true;
    }
}
