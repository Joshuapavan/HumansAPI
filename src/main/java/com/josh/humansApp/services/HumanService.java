package com.josh.humansApp.services;

import com.josh.humansApp.dtos.HumanDto;

import java.util.List;

public interface HumanService {

    List<HumanDto> getAllHumans();

    HumanDto getHuman(Long id);

    HumanDto createHuman(HumanDto humanDto);

    HumanDto updateHuman(Long id, HumanDto humanDto);

    String deleteHuman(Long id);

}
