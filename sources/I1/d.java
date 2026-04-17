package i1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.support.v4.media.session.a;
import android.util.Base64;
import android.util.Log;
import c1.j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import j1.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import m1.C0834a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8252a;

    /* renamed from: b  reason: collision with root package name */
    public final j1.d f8253b;

    /* renamed from: c  reason: collision with root package name */
    public final C0583b f8254c;

    public d(Context context, j1.d dVar, C0583b bVar) {
        this.f8252a = context;
        this.f8253b = dVar;
        this.f8254c = bVar;
    }

    /* JADX INFO: finally extract failed */
    public final void a(j jVar, int i2, boolean z3) {
        Long l6;
        j jVar2 = jVar;
        int i5 = i2;
        Context context = this.f8252a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(jVar2.f5607a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        Z0.d dVar = jVar2.f5609c;
        adler32.update(allocate.putInt(C0834a.a(dVar)).array());
        byte[] bArr = jVar2.f5608b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it2 = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                JobInfo next = it2.next();
                int i6 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i6 >= i5) {
                        a.o(jVar2, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase c3 = ((g) this.f8253b).c();
        String valueOf = String.valueOf(C0834a.a(dVar));
        String str = jVar2.f5607a;
        Cursor rawQuery = c3.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            if (rawQuery.moveToNext()) {
                l6 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l6 = 0L;
            }
            rawQuery.close();
            long longValue = l6.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C0583b bVar = this.f8254c;
            builder.setMinimumLatency(bVar.a(dVar, longValue, i5));
            Set set = ((C0584c) bVar.f8248b.get(dVar)).f8251c;
            if (set.contains(e.f8255a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.f8257c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.f8256b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i5);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", C0834a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, longValue, i5)), l6, Integer.valueOf(i2)};
            String f02 = a.f0("JobInfoScheduler");
            if (Log.isLoggable(f02, 3)) {
                Log.d(f02, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
