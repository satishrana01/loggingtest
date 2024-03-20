package com.test.reservation.fnd;

import com.test.model.FNDModel;

import org.springframework.stereotype.Service;

@Service
public class FNDEngineImpl implements FNDEngine {

    @Override
    public FNDModel createReservation(FNDModel request) {
        return new FNDModel();
    }

    @Override
    public FNDModel deleteReservation(FNDModel request) {
        return null;
    }
}
