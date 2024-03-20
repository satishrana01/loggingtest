package com.test.reservation.fnd;

import com.test.model.FNDModel;
import com.test.reservation.CommonEngineService;

public interface FNDEngine extends CommonEngineService {

    FNDModel deleteReservation(FNDModel request);
}
