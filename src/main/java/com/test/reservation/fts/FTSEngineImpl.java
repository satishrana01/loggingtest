package com.test.reservation.fts;

import com.test.model.FTSModel;

import org.springframework.stereotype.Service;

@Service
public class FTSEngineImpl implements FTSEngine{

    @Override
    public FTSModel makeReservation(FTSModel request) {
        return new FTSModel();
    }

    @Override
    public FTSModel removeReservation(FTSModel request) {
        return null;
    }
}
