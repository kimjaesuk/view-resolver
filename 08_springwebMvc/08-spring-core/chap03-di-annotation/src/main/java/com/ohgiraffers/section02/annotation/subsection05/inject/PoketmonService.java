package com.ohgiraffers.section02.annotation.subsection05.inject;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

@Service("poketmonServiceInject")
public class PoketmonService {

    @Inject // 의존성을 주입해줄때 쓴다.
    @Named("pikachu")
    private Poketmon poketmon;

    public void poketmonAttack(){
        poketmon.attack();
    }

}