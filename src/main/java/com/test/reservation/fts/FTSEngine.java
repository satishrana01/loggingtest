package com.test.reservation.fts;

import com.test.model.FTSModel;
import com.test.reservation.CommonEngineService;

public interface FTSEngine extends CommonEngineService {

    FTSModel removeReservation(FTSModel request);
}
