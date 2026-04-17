package E4;

import B4.f;
import Y4.C0246c;
import Y4.D;
import android.content.Context;
import android.support.v4.media.session.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import j4.C0614b;
import j4.C0640p;
import j4.C0646w;
import java.util.ArrayList;

public final class e extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f645d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f646e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f647f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f648g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f649h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f650i0;

    /* renamed from: j0  reason: collision with root package name */
    public ListView f651j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f652k0;

    public e(Context context) {
        this.f645d0 = 0;
        this.f646e0 = context;
        this.f647f0 = 0;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        ArrayList y6;
        int i5;
        C0640p pVar;
        int i6;
        ArrayList arrayList;
        int i7;
        D s6;
        int i8;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        switch (this.f645d0) {
            case 0:
                View inflate = layoutInflater2.inflate(R.layout.fragment_basic, viewGroup2, false);
                this.f649h0 = inflate;
                this.f650i0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
                this.f651j0 = (ListView) this.f649h0.findViewById(R.id.fragment_basic_list_view);
                this.f652k0 = (RelativeLayout) this.f649h0.findViewById(R.id.fragment_basic_back_button);
                TextView textView = this.f650i0;
                int i9 = this.f648g0;
                int i10 = this.f647f0;
                if (i10 == 0) {
                    i2 = R.string.rank_title;
                } else {
                    i2 = ((C0246c) a.x().get(i9)).f4333a;
                }
                textView.setText(i2);
                if (i10 == 0) {
                    y6 = a.x();
                } else {
                    y6 = a.y(i9);
                }
                ArrayList arrayList2 = y6;
                if (i10 == 0) {
                    i5 = 7;
                } else {
                    i5 = 8;
                }
                int i11 = i5;
                Context context = this.f646e0;
                if (i10 == 0) {
                    pVar = new C0640p(context, arrayList2, i11, 0, (byte) 0);
                } else {
                    pVar = new C0640p(context, arrayList2, i11, i9, 0);
                }
                this.f651j0.setAdapter(pVar);
                RelativeLayout relativeLayout = this.f652k0;
                relativeLayout.setOnClickListener(new f(this, relativeLayout, 4));
                return this.f649h0;
            default:
                View inflate2 = layoutInflater2.inflate(R.layout.fragment_basic, viewGroup2, false);
                this.f649h0 = inflate2;
                this.f650i0 = (TextView) inflate2.findViewById(R.id.fragment_basic_title);
                this.f651j0 = (ListView) this.f649h0.findViewById(R.id.fragment_basic_list_view);
                this.f652k0 = (RelativeLayout) this.f649h0.findViewById(R.id.fragment_basic_back_button);
                TextView textView2 = this.f650i0;
                int i12 = this.f648g0;
                int i13 = this.f647f0;
                if (i13 == 0) {
                    if (i12 == 0) {
                        i6 = R.string.gun_type_white;
                    } else if (i12 == 1) {
                        i6 = R.string.gun_type_handguns;
                    } else if (i12 == 2) {
                        i6 = R.string.gun_type_sub_machine_guns;
                    } else if (i12 == 3) {
                        i6 = R.string.gun_type_shotguns;
                    } else if (i12 == 4) {
                        i6 = R.string.gun_type_rifles;
                    } else if (i12 == 5) {
                        i6 = R.string.gun_type_sniper_rifles;
                    } else if (i12 == 6) {
                        i6 = R.string.gun_type_machine_guns;
                    } else {
                        if (i12 == 7) {
                            i6 = R.string.gun_type_heavy_guns;
                        }
                        i6 = -1;
                    }
                } else if (i13 == 1) {
                    i6 = R.string.market_armors;
                } else if (i13 == 2) {
                    if (i12 == 0) {
                        i6 = R.string.special_equipments_type_bags;
                    } else if (i12 == 1) {
                        i6 = R.string.special_equipments_type_cars;
                    } else {
                        if (i12 == 2) {
                            i6 = R.string.special_equipments_type_planes;
                        }
                        i6 = -1;
                    }
                } else if (i13 == 3) {
                    i6 = R.string.market_herbs;
                } else if (i13 == 4) {
                    i6 = R.string.market_pharmacy;
                } else if (i13 == 5) {
                    i6 = R.string.market_upgrade;
                } else if (i13 == 6) {
                    if (i12 == 0) {
                        i6 = R.string.flower_type_flower;
                    } else {
                        if (i12 == 1) {
                            i6 = R.string.flower_type_crystal;
                        }
                        i6 = -1;
                    }
                } else if (i13 == 7) {
                    if (i12 == 0) {
                        i6 = R.string.food_type_component;
                    } else {
                        if (i12 == 1) {
                            i6 = R.string.food_type_dishes;
                        }
                        i6 = -1;
                    }
                } else if (i13 == 8) {
                    i6 = R.string.market_pieces;
                } else if (i13 == 9) {
                    i6 = R.string.market_gym_cards;
                } else if (i13 == 10) {
                    if (i12 == 0) {
                        i6 = R.string.city_name_dubai;
                    } else if (i12 == 1) {
                        i6 = R.string.city_name_gaza;
                    } else if (i12 == 2) {
                        i6 = R.string.city_name_riyadh;
                    } else if (i12 == 3) {
                        i6 = R.string.city_name_sanaa;
                    } else if (i12 == 4) {
                        i6 = R.string.city_name_cairo;
                    } else if (i12 == 5) {
                        i6 = R.string.city_name_doha;
                    } else if (i12 == 6) {
                        i6 = R.string.city_name_tehran;
                    } else if (i12 == 7) {
                        i6 = R.string.city_name_tripoli;
                    } else if (i12 == 8) {
                        i6 = R.string.city_name_idlib;
                    } else {
                        if (i12 == 9) {
                            i6 = R.string.city_name_rabat;
                        }
                        i6 = -1;
                    }
                } else if (i13 == 11) {
                    i6 = R.string.market_vip;
                } else if (i13 == 12) {
                    i6 = R.string.market_crime_tools;
                } else if (i13 == 13) {
                    i6 = R.string.market_work;
                } else if (i13 == 14) {
                    i6 = R.string.market_boxes;
                } else {
                    if (i13 == 15) {
                        i6 = R.string.market_others;
                    }
                    i6 = -1;
                }
                textView2.setText(i6);
                if (i13 != 0) {
                    i7 = 0;
                    if (i13 == 1) {
                        arrayList = new ArrayList();
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(20015, 0, 1), 20014, 0, 1);
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(20011, 0, 1), 20012, 0, 1);
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(20010, 0, 1), 20007, 0, 1);
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(20005, 0, 1), 20008, 0, 1);
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(20003, 0, 1), 20004, 0, 1);
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(20006, 0, 1), 20009, 0, 1);
                        s6 = D.s(20002, 0, 1);
                        i8 = 20001;
                    } else if (i13 != 2) {
                        if (i13 == 3) {
                            arrayList = new ArrayList();
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(610, 0, 1), 608, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(605, 0, 1), 603, 0, 1);
                            arrayList.add(D.s(607, 0, 1));
                        } else if (i13 == 4) {
                            arrayList = new ArrayList();
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(203, 0, 1), 202, 0, 1);
                            arrayList.add(D.s(201, 0, 1));
                        } else if (i13 == 5) {
                            arrayList = new ArrayList();
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(3001, 0, 1), 3005, 0, 1);
                            s6 = D.s(3004, 0, 1);
                            i8 = 3003;
                        } else if (i13 == 6) {
                            if (i12 == 0) {
                                arrayList = new ArrayList();
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(301, 0, 1), 303, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(305, 0, 1), 307, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(309, 0, 1), 311, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(313, 0, 1), 315, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(317, 0, 1), 319, 0, 1);
                                arrayList.add(D.s(321, 0, 1));
                            } else {
                                if (i12 == 1) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(302, 0, 1), 304, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(306, 0, 1), 308, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(310, 0, 1), 312, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(314, 0, 1), 316, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(318, 0, 1), 320, 0, 1);
                                    arrayList.add(D.s(322, 0, 1));
                                }
                                arrayList = null;
                            }
                        } else if (i13 != 7) {
                            i7 = 0;
                            if (i13 == 8) {
                                arrayList = new ArrayList();
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(4001, 0, 1), 4002, 0, 1);
                                arrayList.add(D.s(4003, 0, 1));
                            } else if (i13 == 9) {
                                arrayList = new ArrayList();
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(703, 0, 1), 701, 0, 1);
                                s6 = D.s(702, 0, 1);
                                i8 = 704;
                            } else if (i13 == 10) {
                                if (i12 == 0) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(501, 0, 1), 502, 0, 1);
                                    arrayList.add(D.s(503, 0, 1));
                                } else if (i12 == 1) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(504, 0, 1), 505, 0, 1);
                                    arrayList.add(D.s(506, 0, 1));
                                } else if (i12 == 2) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(507, 0, 1), 508, 0, 1);
                                    arrayList.add(D.s(509, 0, 1));
                                } else if (i12 == 3) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(510, 0, 1), 511, 0, 1);
                                    arrayList.add(D.s(512, 0, 1));
                                } else if (i12 == 4) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(513, 0, 1), 514, 0, 1);
                                    arrayList.add(D.s(515, 0, 1));
                                } else if (i12 == 5) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(516, 0, 1), 517, 0, 1);
                                    arrayList.add(D.s(518, 0, 1));
                                } else if (i12 == 6) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(519, 0, 1), 520, 0, 1);
                                    arrayList.add(D.s(521, 0, 1));
                                } else if (i12 == 7) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(522, 0, 1), 523, 0, 1);
                                    arrayList.add(D.s(524, 0, 1));
                                } else if (i12 == 8) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(525, 0, 1), 526, 0, 1);
                                    arrayList.add(D.s(527, 0, 1));
                                } else {
                                    if (i12 == 9) {
                                        arrayList = new ArrayList();
                                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(528, 0, 1), 529, 0, 1);
                                        arrayList.add(D.s(530, 0, 1));
                                    }
                                    arrayList = null;
                                }
                            } else if (i13 == 11) {
                                arrayList = new ArrayList();
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2029, 0, 1), 2028, 0, 1);
                                s6 = D.s(2027, 0, 1);
                                i8 = 2026;
                            } else if (i13 == 12) {
                                ArrayList arrayList3 = new ArrayList();
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(12, 0, 1), 13, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(14, 0, 1), 15, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(16, 0, 1), 17, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(18, 0, 1), 19, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(20, 0, 1), 21, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(22, 0, 1), 23, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(24, 0, 1), 25, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(26, 0, 1), 27, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(28, 0, 1), 29, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(30, 0, 1), 31, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList3, D.s(32, 0, 1), 33, 0, 1);
                                arrayList3.add(D.s(34, 0, 1));
                                arrayList = arrayList3;
                            } else if (i13 == 13) {
                                arrayList = new ArrayList();
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(102, 0, 1), 103, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(104, 0, 1), 105, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(106, 0, 1), 107, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(109, 0, 1), 110, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(112, 0, 1), 113, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(114, 0, 1), 115, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(116, 0, 1), 117, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(118, 0, 1), 119, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(120, 0, 1), 101, 0, 1);
                                s6 = D.s(108, 0, 1);
                                i8 = 111;
                            } else if (i13 == 14) {
                                arrayList = new ArrayList();
                            } else {
                                if (i13 == 15 && i12 == 0) {
                                    arrayList = new ArrayList();
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(1012, 0, 1), 1011, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(1010, 0, 1), 1013, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(1014, 0, 1), 1015, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(1004, 0, 1), 1005, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(1003, 0, 1), 1007, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(1006, 0, 1), 1009, 0, 1);
                                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(1008, 0, 1), 1002, 0, 1);
                                    arrayList.add(D.s(1001, 0, 1));
                                }
                                arrayList = null;
                            }
                        } else if (i12 == 0) {
                            arrayList = new ArrayList();
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(401, 0, 1), 402, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(403, 0, 1), 404, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(405, 0, 1), 406, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(407, 0, 1), 408, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(409, 0, 1), 410, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(411, 0, 1), 412, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(413, 0, 1), 414, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(415, 0, 1), 416, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(417, 0, 1), 418, 0, 1);
                            arrayList.add(D.s(419, 0, 1));
                        } else {
                            if (i12 == 1) {
                                arrayList = new ArrayList();
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(5001, 0, 1), 5002, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(5003, 0, 1), 5004, 0, 1);
                                arrayList.add(D.s(5005, 0, 1));
                            }
                            arrayList = null;
                        }
                        this.f651j0.setAdapter(new C0614b(this.f646e0, arrayList, 3));
                        RelativeLayout relativeLayout2 = this.f652k0;
                        relativeLayout2.setOnClickListener(new C0646w(this, relativeLayout2, 14));
                        return this.f649h0;
                    } else if (i12 == 0) {
                        arrayList = new ArrayList();
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(30017, 0, 1), 30005, 0, 1);
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(30004, 0, 1), 30003, 0, 1);
                        s6 = D.s(30002, 0, 1);
                        i8 = 30001;
                    } else {
                        if (i12 == 1) {
                            arrayList = new ArrayList();
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(30016, 0, 1), 30009, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(30008, 0, 1), 30007, 0, 1);
                            arrayList.add(D.s(30006, 0, 1));
                        } else {
                            if (i12 == 2) {
                                arrayList = new ArrayList();
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(30018, 0, 1), 30015, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(30014, 0, 1), 30013, 0, 1);
                                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(30012, 0, 1), 30011, 0, 1);
                                arrayList.add(D.s(30010, 0, 1));
                            }
                            arrayList = null;
                        }
                        this.f651j0.setAdapter(new C0614b(this.f646e0, arrayList, 3));
                        RelativeLayout relativeLayout22 = this.f652k0;
                        relativeLayout22.setOnClickListener(new C0646w(this, relativeLayout22, 14));
                        return this.f649h0;
                    }
                } else if (i12 == 0) {
                    arrayList = new ArrayList();
                    i7 = 0;
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10055, 0, 1), 10054, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10017, 0, 1), 10050, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10043, 0, 1), 10042, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10031, 0, 1), 10030, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10022, 0, 1), 10035, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10034, 0, 1), 10014, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10013, 0, 1), 10027, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10026, 0, 1), 10047, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10046, 0, 1), 10019, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10018, 0, 1), 10039, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10038, 0, 1), 10006, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10005, 0, 1), 10003, 0, 1);
                    com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10002, 0, 1), 10023, 0, 1);
                    s6 = D.s(10004, 0, 1);
                    i8 = 10001;
                } else {
                    i7 = 0;
                    if (i12 == 1) {
                        arrayList = new ArrayList();
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10057, 0, 1), 10040, 0, 1);
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10012, 0, 1), 10011, 0, 1);
                        com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10010, 0, 1), 10009, 0, 1);
                        s6 = D.s(10008, 0, 1);
                        i8 = 10007;
                    } else {
                        if (i12 == 2) {
                            arrayList = new ArrayList();
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10029, 0, 1), 10028, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10049, 0, 1), 10048, 0, 1);
                            arrayList.add(D.s(10021, 0, 1));
                        } else if (i12 == 3) {
                            arrayList = new ArrayList();
                            s6 = D.s(10041, 0, 1);
                            i8 = 10020;
                        } else if (i12 == 4) {
                            arrayList = new ArrayList();
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10032, 0, 1), 10025, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10024, 0, 1), 10037, 0, 1);
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10036, 0, 1), 10016, 0, 1);
                            arrayList.add(D.s(10015, 0, 1));
                        } else if (i12 == 5) {
                            arrayList = new ArrayList();
                            com.google.android.gms.internal.measurement.a.s(arrayList, D.s(10053, 0, 1), 10045, 0, 1);
                            s6 = D.s(10044, 0, 1);
                            i8 = 10033;
                        } else if (i12 == 6) {
                            arrayList = new ArrayList();
                            arrayList.add(D.s(10051, 0, 1));
                        } else {
                            if (i12 == 7) {
                                arrayList = new ArrayList();
                                arrayList.add(D.s(10052, 0, 1));
                            }
                            arrayList = null;
                        }
                        this.f651j0.setAdapter(new C0614b(this.f646e0, arrayList, 3));
                        RelativeLayout relativeLayout222 = this.f652k0;
                        relativeLayout222.setOnClickListener(new C0646w(this, relativeLayout222, 14));
                        return this.f649h0;
                    }
                }
                com.google.android.gms.internal.measurement.a.s(arrayList, s6, i8, i7, 1);
                this.f651j0.setAdapter(new C0614b(this.f646e0, arrayList, 3));
                RelativeLayout relativeLayout2222 = this.f652k0;
                relativeLayout2222.setOnClickListener(new C0646w(this, relativeLayout2222, 14));
                return this.f649h0;
        }
    }

    public e(int i2, int i5, Context context) {
        this.f645d0 = 1;
        this.f646e0 = context;
        this.f647f0 = i2;
        this.f648g0 = i5;
    }

    public e(Context context, int i2, int i5, byte b6) {
        this.f645d0 = i5;
        switch (i5) {
            case 1:
                this.f648g0 = -1;
                this.f646e0 = context;
                this.f647f0 = i2;
                return;
            default:
                this.f646e0 = context;
                this.f647f0 = 1;
                this.f648g0 = i2;
                return;
        }
    }
}
