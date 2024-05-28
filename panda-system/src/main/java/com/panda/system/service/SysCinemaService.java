package com.panda.system.service;

import com.panda.system.domain.SysCinema;


public interface SysCinemaService {

    SysCinema findCinema();

    int updateCinema(SysCinema sysCinema);

    SysCinema findCinemaById(Long id);

}
