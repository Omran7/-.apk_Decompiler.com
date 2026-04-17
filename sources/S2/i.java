package s2;

import I1.b;

public final class i extends b {
    public final void G(u uVar, float f6, float f7) {
        uVar.d(f7 * f6, 180.0f, 90.0f);
        float f8 = f7 * 2.0f * f6;
        q qVar = new q(0.0f, 0.0f, f8, f8);
        qVar.f11511f = 180.0f;
        qVar.g = 90.0f;
        uVar.f11521f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.g.add(oVar);
        uVar.d = 270.0f;
        float f9 = (0.0f + f8) * 0.5f;
        float f10 = (f8 - 0.0f) / 2.0f;
        double d = (double) 270.0f;
        uVar.f11518b = (((float) Math.cos(Math.toRadians(d))) * f10) + f9;
        uVar.f11519c = (f10 * ((float) Math.sin(Math.toRadians(d)))) + f9;
    }
}
