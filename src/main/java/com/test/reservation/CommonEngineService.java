package com.test.reservation;

import com.test.model.FNDModel;
import com.test.model.FTSModel;

public interface CommonEngineService {

    default FTSModel makeReservation(FTSModel request){
        return null;
    }

    default FNDModel createReservation(FNDModel request){
        return null;
    }

}
