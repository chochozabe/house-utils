package com.whykk.houseutils.service;

import com.whykk.houseutils.exception.ErrorCode;
import com.whykk.houseutils.exception.HouseUtilsException;
import com.whykk.houseutils.repository.ApartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    @Transactional
    public Long getPriceOrThrow(Long apartmentId) {
        return apartmentRepository.findById(apartmentId).orElseThrow(() -> new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUND)).getPrice();
    }
}
