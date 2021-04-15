package ru.ncedu.implement;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ncedu.repository.CompareAutoRepository;
import ru.ncedu.service.DeleteListCompareAutoService;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeleteListCompareAutoServiceImp implements DeleteListCompareAutoService {

    private final CompareAutoRepository compareAutoRepository;

    @Override
    public void clearListCompareAuto(){
        compareAutoRepository.deleteAll();
    }
}
